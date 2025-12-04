from ast import List
from typing import Tuple

from app.generated.tictactoe import game, TilePlacement, Player, Tile
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
        legal_moves: List[TileResponse] = []

        
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
            legalMoves=legal_moves,
        )

    def make_move(self, move: MoveRequest) -> GameStateResponse:

        active_player = game.activePlayer
        if active_player.name != move.player:
            raise NotPlayersTurnError(active_player)

        placement = self._find_tile_placement(move.row, move.column)

        
        # Check if move is legal
        # if placement.tile not in game.board.legal_moves:
        #     raise IllegalMoveError((move.row, move.column)) 


        # Next state is calculated by effect pipeline
        # next_state = self._compute_next_state(placement, active_player)
        tile_effects: List[Tuple[Tile, str]] = [(placement, "XPlayed" if game.activePlayer.name == "Player1" else "OPlayed")]

        # Update active player
        self._advance_turn()




        if tile_effects.count == 0:
            return self.get_game_state()

            
        for state in tile_effects:
            state[0].updateState(state[1])
             
        return self.get_game_state()

    

    def _compute_next_state(self, placement: TilePlacement, active_player: Player):
        # Placeholder: this should be replaced by the DSL-defined state machine
        return active_player.name

    def _find_tile_placement(self, row: int, column: int) -> Tile:
        for placement in game.board.tiles:
            if placement.row == row and placement.column == column:
                return placement
        raise InvalidTileError((row, column))
    def _advance_turn(self):
        idx = game.players.index(game.activePlayer)
        game.activePlayer = game.players[(idx + 1) % len(game.players)]


game_service = GameService()
