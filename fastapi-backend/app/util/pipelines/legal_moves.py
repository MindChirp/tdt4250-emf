from typing import List
from app.generated.game import Board, Filter, Tile
from app.util.filters.filter_dict import filter_dict

def calculateLegalMoves(board: Board) -> List[Tile]:
    pipeline = board.legalMovesPipeline
    
    # Safety check
    if not pipeline or not pipeline.filters:
        return []

    first_filters = pipeline.filters
    legal_moves: List[Tile] = []

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
            return []

        # 3. Check if there is a next step in the pipeline
        next_filter = getattr(current_filter, 'nextFilter', None)

        if next_filter:
            # Pass the survivors to the next filter
            return recurse(next_filter, survivors)
        else:
            # 4. END OF CHAIN: Only now do we confirm these are valid moves
            # This fixes the "Premature Add" bug
            if (len(survivors) > 0):
                return survivors                   

    # Run the pipeline for every starting filter defined in the pipeline
    for start_filter in first_filters:
        # We loop through board tiles individually because your pattern_filter 
        # implementation currently requires all input tiles to match or it returns empty.
        for tile in board.tiles:
            result = recurse(start_filter, [tile])
            if result:
                is_legal = len(result) > 0
                if is_legal:
                    legal_moves.append(tile)

    return legal_moves
