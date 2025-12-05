from app.util.filters.pattern_filter import pattern_filter
from app.util.filters.iterative_filter import iterative_filter
from app.util.pipelines.move_effects import state_effect_filter
from app.generated.game import Tile
from typing import List



# Adapter patterns for filter functions
adapt_iterative_filter = None
adapt_pattern_filter = None
adapt_state_effect_filter = None

try:
  from app.generated.game import PatternFilter
  def adapt_pattern_filter(f: PatternFilter, tiles: List[Tile]) -> List[Tile]:
    return pattern_filter(tiles, f.patterns)
except Exception as e:
  print(e)

try:
  from app.generated.game import IterativeFilter
  def adapt_iterative_filter(f: IterativeFilter, tiles: List[Tile]) -> List[Tile]:
    return iterative_filter(tiles, f.matchRule, f.endRule, f.directionVector)
except Exception as e:
  print(e)

try:
  from app.generated.game import StateEffectFilter
  def adapt_state_effect_filter(f: StateEffectFilter, tiles: List[Tile]) -> List[Tile]:
    return state_effect_filter(tiles, f) 
except Exception as e:
  print(e)


filter_dict = {
  "PatternFilter": adapt_pattern_filter,
  "IterativeFilter": adapt_iterative_filter,
  "StateEffectFilter": adapt_state_effect_filter 
}