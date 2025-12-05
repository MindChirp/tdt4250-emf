from app.generated.game import Tile, game, Filter
from app.util.filters.filter_dict import filter_dict
from typing import List

win_condition_filter = None
WinConditionFilter = None

try:
    from app.util.pipelines.move_effects import WinConditionFilter
    from app.util.pipelines.move_effects import win_condition_filter
except Exception as e:
    print(e)

def calculateEffects(tile: Tile):
    pipeline = game.board.effectPipeline
    
    
    # Safety check
    if not pipeline or not pipeline.filters:
        return []

    first_filters = pipeline.filters

    # Define recursion logic
    def recurse(current_filter: Filter, current_tiles: List[Tile]):
        # 1. DYNAMICALLY look up the adapter for the CURRENT filter type
        # This fixes the "Stale Adapter" bug
        filter_type = current_filter.__class__.__name__
        adapter = filter_dict.get(filter_type)

        
        if not adapter:
            print(f"Warning: No adapter found for filter type {filter_type}")
            return

        # 2. Run the specific logic for this filter step
        survivors = adapter(current_filter, current_tiles)

        # If no tiles survived this step, stop immediately
        if not survivors:
            return

        # 3. Check if there is a next step in the pipeline
        next_filter = getattr(current_filter, 'nextFilter', None)

        if next_filter:
            # Pass the survivors to the next filter
            recurse(next_filter, survivors)
        

    # Run the pipeline for every starting filter defined in the pipeline
    for start_filter in first_filters:
        # We loop through board tiles individually because your pattern_filter 
        # implementation currently requires all input tiles to match or it returns empty.
        recurse(start_filter, [tile])
    for start_filter in first_filters:
        pass
        current = start_filter

        while current:

            if WinConditionFilter and isinstance(current, WinConditionFilter):
                if win_condition_filter and win_condition_filter(game.board, current):
                    return True
            current = current.nextFilter

    return False
    

  