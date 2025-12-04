from fastapi import APIRouter

from app.models.game_state_response import GameStateResponse
from app.services.game_service import game_service

router = APIRouter()


@router.get("/game-state", response_model=GameStateResponse)
def get_game_state():
    return game_service.get_game_state()
