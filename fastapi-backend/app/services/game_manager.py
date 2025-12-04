class GameStateManager:
    def __init__(self):
        self.games = {}
    
    def init_game(self, game_name: str, game):
        board = game.board
        
        placements = board.tileplacement
        
        # Store currentState for each placement
        self.games[game_name] = {
            "tileStates": {     # (row, col) → stateName
                (p.row, p.column): p.tile.initialState.name
                for p in placements
            }
        }

    def get_tile_state(self, game_name, row, col):
        return self.games[game_name]["tileStates"][(row, col)]

    def set_tile_state(self, game_name, row, col, new_state):
        self.games[game_name]["tileStates"][(row, col)] = new_state

    @staticmethod
    def find_tile_placement(game, row: int, column: int):
        for placement in game.board.tileplacement:
            if placement.row == row and placement.column == column:
                return placement
        return None

game_manager = GameStateManager()