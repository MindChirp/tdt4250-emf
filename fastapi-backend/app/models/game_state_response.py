from pydantic import BaseModel
from app.generated.tictactoe import Tile
from typing import List

class TileResponse(BaseModel):
    name: str
    tileType: str
    row: int
    column: int
    defaultHexColor: str
    currentState: str
    currentStateColor: str


class GameStateResponse(BaseModel):
    gameName: str
    players: List[str]
    activePlayer: str
    boardWidth: int
    boardHeight: int
    tiles: List[TileResponse]
    legalMoves: List[TileResponse]
