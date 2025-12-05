# from app.generated.game import game
# class GameStateManager:
#     tileStates = {}

#     def __init__(self):
#         pass
    
#     def init_game(self):
#         board = game.board
#         placements = board.tileplacement
        
#         # Store currentState for each placement
#         self.tileStates = {
#                 (p.row, p.column): p.tile.initialState.name
#                 for p in placements
#         }

#     def get_tile_state(self, row, col):
#         return self.tileStates[(row, col)]

#     def set_tile_state(self, row, col, new_state):
#         self.tileStates[(row, col)] = new_state
        
#     def get_tiles_and_states(self):
#         return self.tileStates

#     @staticmethod
#     def find_tile_placement(row: int, column: int):
#         for placement in game.board.tileplacement:
#             if placement.row == row and placement.column == column:
#                 return placement
#         return None
      
    

# game_manager = GameStateManager()