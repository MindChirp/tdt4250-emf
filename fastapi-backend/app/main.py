from fastapi import FastAPI
from app.routers import game_state, moves

from app.services.game_manager import game_manager
from app.generated.games import GAMES

app = FastAPI()

for name, game in GAMES.items():
    game_manager.init_game(name, game)

app.include_router(game_state.router)
app.include_router(moves.router)

@app.get("/")
def root():
    return {"status": "fastapi backend running"}
