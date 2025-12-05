from ast import List
from typing import Tuple

from app.generated.tictactoe import game, Player, Tile
from app.util.pipelines.legal_moves import calculateLegalMoves
from app.util.pipelines.effects import calculateEffects
from app.models.game_state_response import GameStateResponse, TileResponse
from app.models.move_request import MoveRequest


class GameServiceError(Exception):
    """Base class for game-related domain errors."""


class NotPlayersTurnError(GameServiceError):
    def __init__(self, expected_player: Player):
        super().__init__(f"Not this player's turn. Expected {expected_player.name}.")
        self.expected_player = expected_player


class InvalidTileError(GameServiceError):
    def __init__(self, coordinates: Tuple[int, int]):
        row, col = coordinates
        super().__init__(f"Invalid tile coordinates ({row}, {col}).")
        self.coordinates = coordinates


class IllegalMoveError(GameServiceError):
    def __init__(self, coordinates: Tuple[int, int]):
        row, col = coordinates
        super().__init__(f"Illegal move on tile ({row}, {col}).")
        self.coordinates = coordinates


class GameService:
    """Application service that encapsulates game logic."""

    def get_game_state(self) -> GameStateResponse:
        board = game.board
        players: List[str] = [p.name for p in game.players] 
        tiles = board.tiles

        # 1 Calculate legal moves
        

        # for filter in game.board.legalMovesPipeline.filter:
        #     if isinstance(filter, LegalMovesPipeline):
        #         # Call the appropriate helper method
        #         legal_moves =  

        # TODO: Replace placeholder once legal moves pipeline is implemented
        # board.legal_moves = []
        legal_moves: List[Tile] = calculateLegalMoves(game.board)
        game.board.legalMoves.clear()
        game.board.legalMoves.extend(legal_moves)

        legal_moves_mapped = [
            TileResponse(
                name=tile.name,
                tileType=tile.tileType,
                row=tile.row,
                column=tile.column,
                defaultHexColor=tile.hexColor,
                currentState=tile.activeState.name,
                currentStateColor=tile.activeState.hexColor,
            )
            for tile in game.board.legalMoves
        ]
        
        # 2 Return entire game state
        actual_tiles: List[TileResponse] = [
            TileResponse(name=tile.name, tileType=tile.tileType, row=tile.row, column=tile.column, defaultHexColor=tile.hexColor, currentState=tile.activeState.name, currentStateColor=tile.activeState.hexColor) for tile in tiles
        ]

        

        return GameStateResponse(
            gameName=game.name,
            players=players,
            activePlayer=game.activePlayer.name,
            boardWidth=board.width,
            boardHeight=board.height,
            tiles=actual_tiles,
            legalMoves=legal_moves_mapped,
        )

    def make_move(self, move: MoveRequest) -> GameStateResponse:

        active_player = game.activePlayer
        if active_player.name != move.player:
            raise NotPlayersTurnError(active_player)

        placement = self._find_tile_placement(move.row, move.column)
       
        legal_moves = game.board.legalMoves

        # Check if a tile in legal_moves has the same row and column as the current placement
        is_legal = False
        for tile in legal_moves:
            if tile.row == placement.row and tile.column == placement.column:
                is_legal = True
                break

        if not is_legal:
            raise IllegalMoveError((move.row, move.column))

        # Next state is calculated by effect pipeline
        # next_state = self._compute_next_state(placement, active_player)

        print("Calculating effects")
        calculateEffects(placement)        
        # tile_effects: List[Tuple[Tile, str]] = [(placement, "BlackPlayed" if game.activePlayer.name == "Player1" else "WhitePlayed")]

        # Update active player
        self._advance_turn()
        return self.get_game_state()
    

    def _find_tile_placement(self, row: int, column: int) -> Tile:
        for placement in game.board.tiles:
            if placement.row == row and placement.column == column:
                return placement
        raise InvalidTileError((row, column))
    def _advance_turn(self):
        idx = game.players.index(game.activePlayer)
        game.activePlayer = game.players[(idx + 1) % len(game.players)]


game_service = GameService()
