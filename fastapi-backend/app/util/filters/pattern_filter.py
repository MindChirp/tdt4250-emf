from app.generated.game import Pattern, Tile, game
from app.util.tile_utils import get_relative_tile
from typing import List

def pattern_filter(tiles: List[Tile], patterns: List[Pattern]):
  all_pattern_match = True

  # 1. Apply all patterns to all tiles
  # 2. For each pattern, check all relative coordinates, and ensure they match the provided tile state from pattern
  # 3. If any pattern fails for any tile, return empty list

  # Filter away current player
  opponent_state = game.players[1].associatedState if game.activePlayer == game.players[0] else game.players[0].associatedState

  for tile in tiles:
    for pattern in patterns:
      expected_state = pattern.matchState if pattern.stateSelection == "StateBased" else game.activePlayer.associatedState if pattern.stateSelection == "CurrentPlayer" else opponent_state
      for rel_coord in pattern.relativecoordinates:
        target_tile = get_relative_tile(tile, rel_x=rel_coord.x, rel_y=rel_coord.y)
        if not target_tile:
          all_pattern_match = False
          break

        if target_tile.activeState.name != expected_state:
          all_pattern_match = False
          break
  
  if all_pattern_match:
    return tiles
  return []

      

          
  