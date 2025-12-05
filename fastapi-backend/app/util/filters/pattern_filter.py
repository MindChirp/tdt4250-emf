from app.generated.tictactoe import Pattern, Tile, game
from app.util.tile_utils import get_relative_tile
from typing import List

def pattern_filter(tiles: List[Tile], patterns: List[Pattern]):
  all_pattern_match = True

  for anchorTile in tiles:
    for pattern in patterns:
      rel_coords = pattern.relativecoordinates 
      match_mode = pattern.stateSelection # Can either be "StateBased", "OwnTiles", or "OpponentTiles"

      active_player = game.activePlayer
      opponents = [p for p in game.players if p != active_player]

      # The state(s) to match against depends on the match mode. If there are multiple states, we only need
      # all relative coordinates to match at least one of them.

      match_state: str = pattern.matchState if match_mode == "StateBased" else active_player.associatedState if match_mode == "CurrentPlayer" else opponents[0].associatedState


      all_match = True
      for rel_coord in rel_coords:
        target_row = anchorTile.row + rel_coord.y
        target_col = anchorTile.column + rel_coord.x


        # Check if target coordinates are within board bounds
        if target_row < 0 or target_row >= game.board.height or target_col < 0 or target_col >= game.board.width:
          all_match = False
          break

        target_tile = get_relative_tile(anchorTile, rel_coord.x, rel_coord.y)
        print(f"Checking tile at ({target_tile.column}, {target_tile.row}) with state {target_tile.activeState.name}")

        if not target_tile or target_tile.activeState.name != match_state:
          all_pattern_match = False
          break
      
      if all_match:
        continue

      all_pattern_match = False

  print(f"Pattern filter result: {all_pattern_match} for {len(tiles)} tiles")

  return tiles if all_pattern_match else []