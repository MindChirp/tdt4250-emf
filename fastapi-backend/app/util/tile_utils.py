from app.generated.tictactoe import Tile, game

def get_relative_tile(anchorTile: Tile, rel_x: int, rel_y: int) -> Tile | None:
  target_row = anchorTile.row + rel_y
  target_col = anchorTile.column + rel_x

  # Check if target tile is within board bounds
  if target_row < 0 or target_row >= game.board.height or target_col < 0 or target_col >= game.board.width:
    return None

  return next((t for t in game.board.tiles if t.row == target_row and t.column == target_col), None)