from app.util.filters.pattern_filter import pattern_filter
from app.util.filters.iterative_filter import iterative_filter
from app.util.pipelines.move_effects import state_effect_filter
from app.generated.tictactoe import PatternFilter, Tile, IterativeFilter, StateEffectFilter, game
from typing import List


# Adapter patterns for filter functions


def adapt_pattern_filter(f: PatternFilter, tiles: List[Tile]) -> List[Tile]:
  return pattern_filter(tiles, f.patterns)

def adapt_iterative_filter(f: IterativeFilter, tiles: List[Tile]) -> List[Tile]:
  print(f"Running iterative filter {len(tiles)}")
  return iterative_filter(tiles, f.matchRule, f.endRule, f.directionVector)

def adapt_state_effect_filter(f: StateEffectFilter, tiles: List[Tile]) -> List[Tile]:
  return state_effect_filter(tiles, f) 

filter_dict = {
  "PatternFilter": adapt_pattern_filter,
  "IterativeFilter": adapt_iterative_filter,
  "StateEffectFilter": adapt_state_effect_filter 
}