from typing import List
from app.generated.tictactoe import Board, Filter, Pattern, Tile, State, game


def get_relative_tile(anchorTile: Tile, rel_x: int, rel_y: int) -> Tile | None:
  target_row = anchorTile.row + rel_y
  target_col = anchorTile.column + rel_x

  # Check if target tile is within board bounds
  if target_row < 0 or target_row >= game.board.height or target_col < 0 or target_col >= game.board.width:
    return None

  return next((t for t in game.board.tiles if t.row == target_row and t.column == target_col), None)



def pattern_filter(anchorTile: Tile, nextFilter: Filter, patterns: List[Pattern]):
  all_pattern_match = True
  for pattern in patterns:
    rel_coords = pattern.relativecoordinates 
    match_mode = pattern.stateSelection # Can either be "StateBased", "OwnTiles", or "OpponentTiles"


    active_player = game.activePlayer
    opponents = [p for p in game.players if p != active_player]

    # The state(s) to match against depends on the match mode. If there are multiple states, we only need
    # all relative coordinates to match at least one of them.
    match_state: list[str] = [pattern.matchState] if match_mode == "StateBased" else [ active_player.associatedState ] if match_mode == "OwnTiles" else [ opp.associatedState for opp in opponents ] 
    print("Match states:", match_state)



    all_match = True
    for rel_coord in rel_coords:
      target_row = anchorTile.row + rel_coord.y
      target_col = anchorTile.column + rel_coord.x


      # Check if target coordinates are within board bounds
      if target_row < 0 or target_row >= game.board.height or target_col < 0 or target_col >= game.board.width:
        all_match = False
        break

      target_tile = get_relative_tile(anchorTile, rel_coord.x, rel_coord.y)
      print(f"Checking tile at ({target_col}, {target_row}): activeState {target_tile.activeState.name if target_tile else 'N/A'} against match states {match_state}")
      if not target_tile or target_tile.activeState.name not in match_state:
        print(f"Tile at ({target_col}, {target_row}) with state {target_tile.activeState.name if target_tile else 'N/A'} did not match any of {match_state}")
        all_match = False
        break
    
    #burde if next filter loopen være en egen helper metode, hvis den gjenbrukes i alle filters?
    if all_match:
      if nextFilter:
        method = method_dict.get(nextFilter.__class__.__name__)
        if method:
          return method(anchorTile, nextFilter.nextFilter, nextFilter.patterns)
        else:
          return True
      else:
        return True
    
    return False



method_dict = {
  "PatternFilter": pattern_filter,
}

def calculateLegalMoves(board: Board):
  pipeline = board.legalMovesPipeline
  first_filter = pipeline.filter

  legal_moves: List[Tile] = []
  
  method = method_dict.get(first_filter.__class__.__name__)
  if method:
    # Loop through all tiles, add the tile to the legal move list if the filter returns true
    for tile in board.tiles:
      if method(tile, first_filter.nextFilter, first_filter.patterns):
        legal_moves.append(tile)
  
  
  return legal_moves

  

   

   
