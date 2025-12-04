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

    game_def = GAMES[game_name]

    active = game_manager.get_active_player(game_name, game_def)
    if active.name != move.player:
        raise HTTPException(400, "Not this player's turn")

    placement = game_manager.find_tile_placement(game_def, move.row, move.column)
    if placement is None:
        raise HTTPException(400, "Invalid tile coordinates")

    curr_state = game_manager.get_tile_state(game_name, move.row, move.column)

    # 4. Compute next state using the DSL-defined state machine
    # next_state = compute_next_state(placement.tile, curr_state) This will be implemented by xtext / xtend code

    next_state = game_manager.get_active_player(game_name, game_def) # Placeholder until state machine logic is implemented

    if next_state is None:
        raise HTTPException(400, "Illegal move on this tile")

    # 5. Update tile state
    game_manager.set_tile_state(game_name, move.row, move.column, next_state)

    # 6. Advance player turn
    game_manager.advance_turn(game_name, game_def)

    # 7. Return updated game-state
    return get_game_state(game_name)
