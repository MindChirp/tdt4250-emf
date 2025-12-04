#Game instances should be created into this folder!

import pkgutil
import importlib
from app.generated.engine.models import Game

#loads game instances created from DSL, tictactoe.py, connect4.py etc.

def load_games():
    games = {}
    package = __name__

    for module in pkgutil.iter_modules(__path__):
        module_name = module.name
        mod = importlib.import_module(f"{package}.{module_name}")

        if hasattr(mod, "game"):
            games[module_name] = mod.game

    return games


GAMES = load_games()
