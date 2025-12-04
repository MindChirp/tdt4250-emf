from pydantic import BaseModel

class MoveRequest(BaseModel):
    player: str
    row: int
    column: int
