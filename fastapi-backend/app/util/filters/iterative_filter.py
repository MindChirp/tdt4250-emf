from typing import List
from app.generated.tictactoe import Tile, Pattern, RelativeCoordinate
from app.util.tile_utils import get_relative_tile
from app.util.filters.pattern_filter import pattern_filter

# This filter works in an iterative/recursive manner, moving in a direction
# defined by the directionVector, and adding each tile it passes to the matched_tiles
# list for each tile the matchRule pattern returns true. It continues until the matchRule
# fails, and then checks if the endRule pattern matches on the last tile reached. If so,
# it returns all the matched tiles; otherwise, it returns an empty list. 

def iterative_filter(tiles: List[Tile], matchRule: Pattern, endRule: Pattern, directionVector: RelativeCoordinate):
  matched_tiles = []
  for tile in tiles:
    current_tile = tile
    current_matched_tiles = []

    while True:
      # Check if the matchRule pattern matches at the current tile
      print("Starting loop")
      if not (len(pattern_filter([current_tile], [matchRule])) > 0):
        break

      print("Match found")

      current_matched_tiles.append(current_tile)

      # Move to the next tile in the specified direction
      next_tile = get_relative_tile(current_tile, directionVector.x, directionVector.y)
      if not next_tile:
        break

      current_tile = next_tile

    # After exiting the loop, check if the endRule pattern matches at the last tile reached
    if len(pattern_filter([current_tile], [endRule])) > 0:
      print(f"Extending with {len(current_matched_tiles)} tiles")
      matched_tiles.extend(current_matched_tiles)

  print(f"Iterative filter matched {len(matched_tiles)} tiles")
  return matched_tiles

    
      

  pass
