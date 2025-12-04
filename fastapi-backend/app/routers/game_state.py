from fastapi import APIRouter, HTTPException
from app.generated.games import GAMES # imports tictactoe.py, connect4.py etc.
from app.generated.engine.models import Game
from app.models.game_state_response import GameStateResponse, TilePosition
from app.services.game_manager import game_manager

router = APIRouter(prefix="/games")

@router.get("/{game_name}/game-state", response_model=GameStateResponse)
def get_game_state(game_name: str):
    if game_name not in GAMES:
        raise HTTPException(404)

    game: Game = GAMES[game_name] # this is the python object generated from the DSL

    board = game.board
    players = [p.name for p in game.players]
    tile_states = game_manager.get_state(game_name)["tileStates"]

    tile_positions = []
    for p in board.tileplacement:
        stateName = tile_states[(p.row, p.column)]
        tile_positions.append(
            TilePosition(
                row=p.row,
                column=p.column,
                tileName=p.tile.name,
                stateName=stateName
            )
        )

    # Legal moves (placeholder for now)
    legal_moves = tile_positions # add the legal move pipeline created from xtend / xtext later

    return GameStateResponse(
        players=players,
        activePlayer=game.activePlayer.name,
        boardWidth=board.width,
        boardHeight=board.height,
        tiles=tile_positions,
        legalMoves=legal_moves
    )
