from typing import List, Optional
from app.generated.game import (
    Board, Pattern, Tile,
    StateEffectFilter, PatternFilter,
    game
)
from app.util.filters.pattern_filter import pattern_filter as shared_pattern_filter
from app.util.tile_utils import get_relative_tile




def matches_pattern(anchor: Tile, pattern: Pattern) -> bool:
    rel_coords = pattern.relativecoordinates
    match_mode = pattern.stateSelection

    active = game.activePlayer
    opponents = [p for p in game.players if p != active]

    if match_mode == "StateBased":
        match_states = [pattern.matchState]
    elif match_mode == "CurrentPlayer":
        match_states = [active.associatedState]
    else:
        match_states = [opp.associatedState for opp in opponents]

    for rel in rel_coords:
        target = get_relative_tile(anchor, rel.x, rel.y)
        if not target:
            return False

        if target.activeState.name not in match_states:
            return False

    return True


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

win_condition_filter = None

try:
    from app.generated.game import WinConditionFilter
    def win_condition_filter(board: Board, winFilter: WinConditionFilter) -> bool:
        """
        WinConditionFilter ALWAYS checks the entire board, not affected tiles.
        """

        board_tiles = game.board.tiles
        

        for tile in board_tiles:
            for pattern in winFilter.patterns:
                if matches_pattern(tile, pattern):
                    print(f"WINNER: {game.activePlayer.name}")
                    game.winMessage = f"Player {game.activePlayer.name} has won the game!"
                    return True

        return False
except Exception as e:
   print(e) 
