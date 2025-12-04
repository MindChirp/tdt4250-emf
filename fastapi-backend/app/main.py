from fastapi import FastAPI
from app.routers import game_state, moves
from fastapi.middleware.cors import CORSMiddleware

# from app.generated.games import GAMES

# for name, game in GAMES.items():
#     game_manager.init_game(name, game)

app = FastAPI()

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],        # DEV: allow all origins
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

app.include_router(game_state.router)
app.include_router(moves.router)

@app.get("/")
def root():
    return {"status": "fastapi backend running"}
