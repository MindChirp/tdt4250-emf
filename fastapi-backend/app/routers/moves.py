from fastapi import APIRouter, HTTPException
from app.models.move_request import MoveRequest
from app.services.game_manager import game_manager
from app.generated.games import GAMES
from app.routers.game_state import get_game_state

router = APIRouter(prefix="/games")

@router.post("/{game_name}/move")
def make_move(game_name: str, move: MoveRequest):
    if game_name not in GAMES:
        raise HTTPException(404, f"Game '{game_name}' not found")

    game = GAMES[game_name] # add game : Game with import Game from the model

    active = game.activePlayer
    if active.name != move.player:
        raise HTTPException(400, "Not this player's turn")

    placement = game_manager.find_tile_placement(game, move.row, move.column)
    if placement is None:
        raise HTTPException(400, "Invalid tile coordinates")

    curr_state = game_manager.get_tile_state(game_name, move.row, move.column)

    # 4. Compute next state using the DSL-defined state machine
    # next_state = compute_next_state(placement.tile, curr_state) This will be implemented by xtext / xtend code

    next_state = game.activePlayer.name  # Placeholder: set to active player's name for testing

    if next_state is None:
        raise HTTPException(400, "Illegal move on this tile")

    game_manager.set_tile_state(game_name, move.row, move.column, next_state) #placeholder until effectPipeline is set up

    idx = game.players.index(game.activePlayer)
    game.activePlayer = game.players[(idx + 1) % len(game.players)]

    return get_game_state(game_name)
