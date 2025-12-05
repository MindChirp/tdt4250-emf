from typing import List, Optional
from app.generated.tictactoe import (
    Board, Filter, Pattern, Tile,
    StateEffectFilter, PatternFilter, WinConditionFilter,
    game
)

def get_relative_tile(anchor: Tile, rel_x: int, rel_y: int) -> Optional[Tile]:
    """Return tile at relative offset from anchor, or None if out of bounds."""
    board = game.board
    target_row = anchor.row + rel_y
    target_col = anchor.column + rel_x

    if not (0 <= target_row < board.height and 0 <= target_col < board.width):
        return None

    return next(
        (t for t in board.tiles if t.row == target_row and t.column == target_col),
        None
    )


def matches_pattern(anchor: Tile, pattern: Pattern) -> bool:
    """Check if pattern matches relative to anchor tile."""
    rel_coords = pattern.relativecoordinates
    match_mode = pattern.stateSelection

    active = game.activePlayer
    opponents = [p for p in game.players if p != active]

    if match_mode == "StateBased":
        match_states = [pattern.matchState]
    elif match_mode == "OwnTiles":
        match_states = [active.associatedState]
    else:
        match_states = [opp.associatedState for opp in opponents]

    for rel in rel_coords:
        target = get_relative_tile(anchor, rel.x, rel.y)
        if not target or target.activeState not in match_states:
            return False

    return True

def pattern_filter(tile_context: List[Tile], filterObj: PatternFilter) -> List[Tile]:
    """
    Evaluates patternFilter on the tiles in tile_context (anchors).
    Returns the same tile_context (no modification).
    """

    resulting_tiles: List[Tile] = []

    for anchorTile in tile_context:
        for pattern in filterObj.patterns:
            if matches_pattern(anchorTile, pattern):
                resulting_tiles.append(anchorTile)
                break

    return resulting_tiles


def state_effect_filter(tile_context: List[Tile], filterObj: StateEffectFilter) -> List[Tile]:
    """
    Applies state transitions to all tiles in tile_context.
    """

    active = game.activePlayer
    opponents = [p for p in game.players if p != active]
    match_state: Optional[str] = None

    if filterObj.stateSelection == "StateBased":
        match_state = filterObj.targetState
    elif filterObj.stateSelection == "CurrentPlayer":
        match_state = active.associatedState
    else:
        match_state = opponents[0].associatedState

    for tile in tile_context:
        tile.updateState(match_state)
 
    return tile_context

# def win_condition_filter(board: Board, winFilter: WinConditionFilter) -> bool:
#     """
#     WinConditionFilter ALWAYS checks the entire board, not affected tiles.
#     """

#     board_tiles = board.tiles

#     for tile in board_tiles:
#         for patternFilter in winFilter.patternFilters:
#             for pattern in patternFilter.patterns:
#                 if matches_pattern(tile, pattern):
#                     print(f"WINNER: {game.activePlayer.name}")
#                     return True

#     return False

LOCAL_FILTERS = {
    "StateEffectFilter": state_effect_filter,
    "PatternFilter": pattern_filter,
}

# GLOBAL_FILTERS = {
#     "WinConditionFilter": win_condition_filter,
# }


# def calculateEffects(board: Board, affected_tiles: List[Tile]):
#     """
#     Runs local effect filters first, then global win-condition filters.
#     """

#     pipeline = board.effectPipeline
#     current = pipeline.filter
#     tile_context = affected_tiles

#     while current:
#         cls_name = current.__class__.__name__
#         if cls_name in LOCAL_FILTERS:
#             handler = LOCAL_FILTERS[cls_name]
#             tile_context = handler(tile_context, current)
#         current = current.nextFilter
        
#     current = pipeline.filter
#     while current:
#         cls_name = current.__class__.__name__
#         if cls_name in GLOBAL_FILTERS:
#             handler = GLOBAL_FILTERS[cls_name]
#             if handler(board, current):
#                 return True
#         current = current.nextFilter

#     return False
