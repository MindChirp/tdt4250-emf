from pydantic import BaseModel
from typing import List

class TilePosition(BaseModel):
    row: int
    column: int
    tileName: str
    stateName: str

class GameStateResponse(BaseModel):
    players: List[str]
    activePlayer: str
    boardWidth: int
    boardHeight: int
    tiles: List[TilePosition]
    legalMoves: List[TilePosition]
