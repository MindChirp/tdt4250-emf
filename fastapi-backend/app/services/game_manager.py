class GameStateManager:
    def __init__(self):
        self.games = {}
    
    def init_game(self, game_name: str, game_def):
        board = game_def.board
        
        placements = board.tileplacement
        
        # Store currentState for each placement
        self.games[game_name] = {
            "activePlayerIndex": 0,
            "tileStates": {     # (row, col) → stateName
                (p.row, p.column): p.tile.initialState.name
                for p in placements
            }
        }

    def get_tile_state(self, game_name, row, col):
        return self.games[game_name]["tileStates"][(row, col)]

    def set_tile_state(self, game_name, row, col, new_state):
        self.games[game_name]["tileStates"][(row, col)] = new_state

    def get_active_player(self, game_name, game_def):
        idx = self.games[game_name]["activePlayerIndex"]
        return game_def.players[idx]

    def advance_turn(self, game_name, game_def):
        num_players = len(game_def.players)
        idx = self.games[game_name]["activePlayerIndex"]
        self.games[game_name]["activePlayerIndex"] = (idx + 1) % num_players

    def find_tile_placement(game_def, row: int, column: int):
      for placement in game_def.board.tileplacement:
          if placement.row == row and placement.column == column:
              return placement
      return None

game_manager = GameStateManager()