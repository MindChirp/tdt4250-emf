from fastapi import APIRouter, HTTPException

from app.models.move_request import MoveRequest
from app.models.game_state_response import GameStateResponse
from app.services.game_service import (
    game_service,
    IllegalMoveError,
    InvalidTileError,
    NotPlayersTurnError,
)

router = APIRouter()


@router.post("/move")
def make_move(move: MoveRequest):
    try:
        return game_service.make_move(move)
    except NotPlayersTurnError as exc:
        print(exc)
        raise HTTPException(400, str(exc))
    except InvalidTileError as exc:
        print(exc)
        raise HTTPException(400, str(exc))
    except IllegalMoveError as exc:
        print(exc)
        raise HTTPException(400, str(exc))
    except Exception as e:
        # Avoid leaking internals; log properly once logging is added
        raise HTTPException(500, "Unexpected error while processing move")
