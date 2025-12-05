from typing import List, Optional, Any
from pydantic import BaseModel

# Base Filter Class
class Filter(BaseModel):
    nextFilter: Optional["Filter"] = None

class Board(BaseModel):
    width: "int"
    height: "int"
    tiles: List["Tile"] = []
    legalMovesPipeline: Optional["LegalMovesPipeline"] = None
    effectPipeline: Optional["EffectPipeline"] = None
    checkered: "bool"
    size: "int"
    legalMoves: List["Tile"] = []
    
    
class Tile(BaseModel):
    states: List["State"] = []
    transitions: List["Transition"] = []
    initialState: "State"
    tileType: "str"
    hexColor: "str"
    name: "str"
    activeState: "State"
    row: "int"
    column: "int"
    
    def updateState(self, targetStateName: str):
        # Logic to update state based on transitions
        for transition in self.transitions:
            for source in transition.source:
                if source.name == self.activeState.name and transition.target.name == targetStateName:
                    self.activeState = transition.target

    
class State(BaseModel):
    outbound: List["Transition"] = []
    inbound: List["Transition"] = []
    name: Optional["str"] = None
    hexColor: "str"
    
class Transition(BaseModel):
    source: List["State"] = []
    target: "State"
    name: "str"
    
class LegalMovesPipeline(BaseModel):
    filters: List["Filter"] = []
    
class PatternFilter(Filter):
    nextFilter: Optional["Filter"] = None
    name: "str"
    patterns: List["Pattern"] = []
    
class Pattern(BaseModel):
    name: "str"
    stateSelection: Optional["str"] = None
    matchState: Optional["str"] = None
    relativecoordinates: List["RelativeCoordinate"] = []

    
class RelativeCoordinate(BaseModel):
    x: "int"
    y: "int"
    
class EffectPipeline(BaseModel):
    filters: List["Filter"] = []
    
class IterativeFilter(Filter):
    nextFilter: Optional["Filter"] = None
    name: "str"
    directionVector: "RelativeCoordinate"
    matchRule: "Pattern"
    endRule: "Pattern"
    
class StateEffectFilter(Filter):
    name: "str"
    stateSelection: "str"
    targetState: Optional["str"] = None 

    
class Player(BaseModel):
    name: "str"
    hexColor: "str"
    associatedState: "str"

    
class Game(BaseModel):
    board: "Board"
    name: "str"
    players: List["Player"] = []
    initialPlayer: "Player"
    activePlayer: "Player"
    turnPolicy: "str"
    

# Rebuild models for Pydantic recursion
Board.model_rebuild()
Tile.model_rebuild()
State.model_rebuild()
Transition.model_rebuild()
LegalMovesPipeline.model_rebuild()
PatternFilter.model_rebuild()
Pattern.model_rebuild()
RelativeCoordinate.model_rebuild()
EffectPipeline.model_rebuild()
IterativeFilter.model_rebuild()
StateEffectFilter.model_rebuild()
Player.model_rebuild()
Game.model_rebuild()
Filter.model_rebuild()

# --- Tile Definitions ---

class PlayTile(Tile):
    def __init__(self, row, column):
        # 1. Create Initial State
        stateInitialEmpty = State(
            name="InitialEmpty",
            hexColor="#ffffff",
            outbound=[], inbound=[]
        )

        # 2. Create Other States
        stateWhitePlayed = State(
            name="WhitePlayed",
            hexColor="#aaaaaa",
            outbound=[], inbound=[]
        )
        stateBlackPlayed = State(
            name="BlackPlayed",
            hexColor="#000000",
            outbound=[], inbound=[]
        )
        
        # 3. Create Transitions (Linking objects)
        transitionEmptyToBlack = Transition(
            name="EmptyToBlack",
            source=[stateInitialEmpty],
            target=stateBlackPlayed
        )
        transitionEmptyToWhite = Transition(
            name="EmptyToWhite",
            source=[stateInitialEmpty],
            target=stateWhitePlayed
        )
        transitionBlackToWhite = Transition(
            name="BlackToWhite",
            source=[stateBlackPlayed],
            target=stateWhitePlayed
        )
        transitionWhiteToBlack = Transition(
            name="WhiteToBlack",
            source=[stateWhitePlayed],
            target=stateBlackPlayed
        )

        # 4. Link Transitions to States (Outbound/Inbound wiring)
        # Outbound for EmptyToBlack
        stateInitialEmpty.outbound.append(transitionEmptyToBlack)
        # Inbound for EmptyToBlack
        stateBlackPlayed.inbound.append(transitionEmptyToBlack)
        
        # Outbound for EmptyToWhite
        stateInitialEmpty.outbound.append(transitionEmptyToWhite)
        # Inbound for EmptyToWhite
        stateWhitePlayed.inbound.append(transitionEmptyToWhite)
        
        # Outbound for BlackToWhite
        stateBlackPlayed.outbound.append(transitionBlackToWhite)
        # Inbound for BlackToWhite
        stateWhitePlayed.inbound.append(transitionBlackToWhite)
        
        # Outbound for WhiteToBlack
        stateWhitePlayed.outbound.append(transitionWhiteToBlack)
        # Inbound for WhiteToBlack
        stateBlackPlayed.inbound.append(transitionWhiteToBlack)
        

        super().__init__(
            states=[
                stateWhitePlayed, stateBlackPlayed
                , stateInitialEmpty
            ],
            transitions=[
                transitionEmptyToBlack, transitionEmptyToWhite, transitionBlackToWhite, transitionWhiteToBlack
            ],
            initialState=stateInitialEmpty,
            activeState=stateInitialEmpty,
            tileType="PlayTile",
            hexColor="#ffffff",
            name="PlayTile",
            row=row,
            column=column
        )
initial_tile_placement = {
	(3+1, 3+1): "WhitePlayed", 
	(3+1, 3+1): "WhitePlayed", 
	(4+1, 3+1): "BlackPlayed",
  (3+1, 4+1): "BlackPlayed", 
	(4+1, 4+1): "WhitePlayed"
}



# --- Instance Initialization ---
tiles = [
    PlayTile(0, 0),
    PlayTile(0, 1),
    PlayTile(0, 2),
    PlayTile(0, 3),
    PlayTile(0, 4),
    PlayTile(0, 5),
    PlayTile(0, 6),
    PlayTile(0, 7),
    PlayTile(0, 8),
    PlayTile(0, 9),
    PlayTile(1, 0),
    PlayTile(1, 1),
    PlayTile(1, 2),
    PlayTile(1, 3),
    PlayTile(1, 4),
    PlayTile(1, 5),
    PlayTile(1, 6),
    PlayTile(1, 7),
    PlayTile(1, 8),
    PlayTile(1, 9),
    PlayTile(2, 0),
    PlayTile(2, 1),
    PlayTile(2, 2),
    PlayTile(2, 3),
    PlayTile(2, 4),
    PlayTile(2, 5),
    PlayTile(2, 6),
    PlayTile(2, 7),
    PlayTile(2, 8),
    PlayTile(2, 9),
    PlayTile(3, 0),
    PlayTile(3, 1),
    PlayTile(3, 2),
    PlayTile(3, 3),
    PlayTile(3, 4),
    PlayTile(3, 5),
    PlayTile(3, 6),
    PlayTile(3, 7),
    PlayTile(3, 8),
    PlayTile(3, 9),
    PlayTile(4, 0),
    PlayTile(4, 1),
    PlayTile(4, 2),
    PlayTile(4, 3),
    PlayTile(4, 4),
    PlayTile(4, 5),
    PlayTile(4, 6),
    PlayTile(4, 7),
    PlayTile(4, 8),
    PlayTile(4, 9),
    PlayTile(5, 0),
    PlayTile(5, 1),
    PlayTile(5, 2),
    PlayTile(5, 3),
    PlayTile(5, 4),
    PlayTile(5, 5),
    PlayTile(5, 6),
    PlayTile(5, 7),
    PlayTile(5, 8),
    PlayTile(5, 9),
    PlayTile(6, 0),
    PlayTile(6, 1),
    PlayTile(6, 2),
    PlayTile(6, 3),
    PlayTile(6, 4),
    PlayTile(6, 5),
    PlayTile(6, 6),
    PlayTile(6, 7),
    PlayTile(6, 8),
    PlayTile(6, 9),
    PlayTile(7, 0),
    PlayTile(7, 1),
    PlayTile(7, 2),
    PlayTile(7, 3),
    PlayTile(7, 4),
    PlayTile(7, 5),
    PlayTile(7, 6),
    PlayTile(7, 7),
    PlayTile(7, 8),
    PlayTile(7, 9),
    PlayTile(8, 0),
    PlayTile(8, 1),
    PlayTile(8, 2),
    PlayTile(8, 3),
    PlayTile(8, 4),
    PlayTile(8, 5),
    PlayTile(8, 6),
    PlayTile(8, 7),
    PlayTile(8, 8),
    PlayTile(8, 9),
    PlayTile(9, 0),
    PlayTile(9, 1),
    PlayTile(9, 2),
    PlayTile(9, 3),
    PlayTile(9, 4),
    PlayTile(9, 5),
    PlayTile(9, 6),
    PlayTile(9, 7),
    PlayTile(9, 8),
    PlayTile(9, 9)
]

for tile in tiles:
	for startingTile in initial_tile_placement.keys():
		if (tile.row, tile.column) == startingTile:
			tile.updateState(initial_tile_placement.get(startingTile))

players = [
    Player(name="Player1", hexColor="#999999", associatedState="BlackPlayed"), 
    Player(name="Player2", hexColor="#99ffff", associatedState="WhitePlayed")
]

# --- Pipelines ---

legal_moves_pipeline = LegalMovesPipeline(
    filters=[
      PatternFilter(
          name="MustBeEmptyTile",
          nextFilter=IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=-1,
                y=-1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
          ),
          patterns=[
            Pattern(
              name="CheckEmpty",
              matchState="InitialEmpty",
              stateSelection="StateBased",
              relativecoordinates=[
                RelativeCoordinate(
                  x=0,
                  y=0
                )
              ]
            )
          ]
        ),
        PatternFilter(
          name="MustBeEmptyTile",
          nextFilter=IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=1,
                y=1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
          ),
          patterns=[
            Pattern(
              name="CheckEmpty",
              matchState="InitialEmpty",
              stateSelection="StateBased",
              relativecoordinates=[
                RelativeCoordinate(
                  x=0,
                  y=0
                )
              ]
            )
          ]
        ),
        PatternFilter(
          name="MustBeEmptyTile",
          nextFilter=IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=1,
                y=1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
          ),
          patterns=[
            Pattern(
              name="CheckEmpty",
              matchState="InitialEmpty",
              stateSelection="StateBased",
              relativecoordinates=[
                RelativeCoordinate(
                  x=0,
                  y=0
                )
              ]
            )
          ]
        ),
        PatternFilter(
          name="MustBeEmptyTile",
          nextFilter=IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=-1,
                y=1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
          ),
          patterns=[
            Pattern(
              name="CheckEmpty",
              matchState="InitialEmpty",
              stateSelection="StateBased",
              relativecoordinates=[
                RelativeCoordinate(
                  x=0,
                  y=0
                )
              ]
            )
          ]
        ),
        PatternFilter(
          name="MustBeEmptyTile",
          nextFilter=IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=1,
                y=0
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
          ),
          patterns=[
            Pattern(
              name="CheckEmpty",
              matchState="InitialEmpty",
              stateSelection="StateBased",
              relativecoordinates=[
                RelativeCoordinate(
                  x=0,
                  y=0
                )
              ]
            )
          ]
        ),
      PatternFilter(
          name="MustBeEmptyTile",
          nextFilter=IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=-1,
                y=0
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
          ),
          patterns=[
            Pattern(
              name="CheckEmpty",
              matchState="InitialEmpty",
              stateSelection="StateBased",
              relativecoordinates=[
                RelativeCoordinate(
                  x=0,
                  y=0
                )
              ]
            )
          ]
        ),
      PatternFilter(
          name="MustBeEmptyTile",
          nextFilter=IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=0,
                y=1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
          ),
          patterns=[
            Pattern(
              name="CheckEmpty",
              matchState="InitialEmpty",
              stateSelection="StateBased",
              relativecoordinates=[
                RelativeCoordinate(
                  x=0,
                  y=0
                )
              ]
            )
          ]
        ),
      PatternFilter(
          name="MustBeEmptyTile",
          nextFilter=IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=0,
                y=-1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
          ),
          patterns=[
            Pattern(
              name="CheckEmpty",
              matchState="InitialEmpty",
              stateSelection="StateBased",
              relativecoordinates=[
                RelativeCoordinate(
                  x=0,
                  y=0
                )
              ]
            )
          ]
        )
    ]
)

effect_pipeline = EffectPipeline(
    filters=[
        IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=1,
                y=0
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=-1,
                y=0
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=0,
                y=-1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=0,
                y=1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=1,
                y=1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
        IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=-1,
                y=1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
        IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=-1,
                y=-1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
        IterativeFilter(
            name="SearchRight",
            directionVector=RelativeCoordinate(
                x=1,
                y=-1
            )
            ,
            matchRule=Pattern(
                name="MustBeOfOppositePlayer",
                stateSelection="OtherPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            endRule=Pattern(
                name="MustBeOwnEndingTile",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            ),
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
       StateEffectFilter(
           name="FlipPlacedTile",
           stateSelection="CurrentPlayer",
           targetState=None,
           nextFilter=None
       ) 
    ]
)

board = Board(
    width=10,
    height=10,
    tiles=tiles,
    checkered=True,
    size=9,
    legalMovesPipeline=legal_moves_pipeline,
    effectPipeline=effect_pipeline,
    legalMoves=[]
)

game = Game(
    board=board,
    players=players,
    activePlayer=players[0],
    name="Othello",
    initialPlayer=players[0],
    turnPolicy="TurnBased"
)
# from typing import List, Optional, Any
# from pydantic import BaseModel

# # Base Filter Class
# class Filter(BaseModel):
#     nextFilter: Optional["Filter"] = None

# class Board(BaseModel):
#     width: "int"
#     height: "int"
#     tiles: List["Tile"] = []
#     legalMovesPipeline: Optional["LegalMovesPipeline"] = None
#     effectPipeline: Optional["EffectPipeline"] = None
#     checkered: "bool"
#     size: "int"
#     legalMoves: List["Tile"] = []
    
    
# class Tile(BaseModel):
#     states: List["State"] = []
#     transitions: List["Transition"] = []
#     initialState: "State"
#     tileType: "str"
#     hexColor: "str"
#     name: "str"
#     activeState: "State"
#     row: "int"
#     column: "int"
    
#     def updateState(self, targetStateName: str):
#             for transition in self.transitions:
#                 for source in transition.source:
#                     if source.name == self.activeState.name and transition.target.name == targetStateName:
#                         self.activeState = transition.target

    
# class State(BaseModel):
#     outbound: List["Transition"] = []
#     inbound: List["Transition"] = []
#     name: Optional["str"] = None
#     hexColor: "str"
    
# class Transition(BaseModel):
#     source: List["State"] = []
#     target: "State"
#     name: "str"
    
# class LegalMovesPipeline(BaseModel):
#     filters: List["Filter"] = []
    
# class PatternFilter(Filter):
#     nextFilter: Optional["Filter"] = None
#     name: "str"
#     patterns: List["Pattern"] = []
    
# class Pattern(BaseModel):
#     name: "str"
#     stateSelection: Optional["str"] = None
#     matchState: Optional["str"] = None
#     relativecoordinates: List["RelativeCoordinate"] = []

    
# class RelativeCoordinate(BaseModel):
#     x: "int"
#     y: "int"
    
# class EffectPipeline(BaseModel):
#     filters: List["Filter"] = []
    
# class StateEffectFilter(Filter):
#     name: "str"
#     stateSelection: "str"
#     targetState: Optional["str"] = None 

    
# class WinConditionFilter(Filter):
#     nextFilter: Optional["Filter"] = None
#     name: "str"
#     patterns: List["Pattern"] = []
    
# class Player(BaseModel):
#     name: "str"
#     hexColor: "str"
#     associatedState: "str"

    
# class Game(BaseModel):
#     board: "Board"
#     name: "str"
#     players: List["Player"] = []
#     initialPlayer: "Player"
#     activePlayer: "Player"
#     turnPolicy: "str"
    

# # Rebuild models for Pydantic recursion
# Board.model_rebuild()
# Tile.model_rebuild()
# State.model_rebuild()
# Transition.model_rebuild()
# LegalMovesPipeline.model_rebuild()
# PatternFilter.model_rebuild()
# Pattern.model_rebuild()
# RelativeCoordinate.model_rebuild()
# EffectPipeline.model_rebuild()
# StateEffectFilter.model_rebuild()
# WinConditionFilter.model_rebuild()
# Player.model_rebuild()
# Game.model_rebuild()
# Filter.model_rebuild()

# # --- Tile Definitions ---

# class PlayTile(Tile):
#     def __init__(self, row, column):
#         # 1. Create Initial State
#         stateInitialEmpty = State(
#             name="InitialEmpty",
#             hexColor="#ffffff",
#             outbound=[], inbound=[]
#         )

#         # 2. Create Other States
#         stateXPlayed = State(
#             name="XPlayed",
#             hexColor="#ff0000",
#             outbound=[], inbound=[]
#         )
#         stateOPlayed = State(
#             name="OPlayed",
#             hexColor="#0000ff",
#             outbound=[], inbound=[]
#         )
        
#         # 3. Create Transitions (Linking objects)
#         transitionEmptyToX = Transition(
#             name="EmptyToX",
#             source=[stateInitialEmpty],
#             target=stateXPlayed
#         )
#         transitionEmptyToO = Transition(
#             name="EmptyToO",
#             source=[stateInitialEmpty],
#             target=stateOPlayed
#         )

#         # 4. Link Transitions to States (Outbound/Inbound wiring)
#         # Outbound for EmptyToX
#         stateInitialEmpty.outbound.append(transitionEmptyToX)
#         # Inbound for EmptyToX
#         stateXPlayed.inbound.append(transitionEmptyToX)
        
#         # Outbound for EmptyToO
#         stateInitialEmpty.outbound.append(transitionEmptyToO)
#         # Inbound for EmptyToO
#         stateOPlayed.inbound.append(transitionEmptyToO)
        

#         super().__init__(
#             states=[
#                 stateXPlayed, stateOPlayed
#                 , stateInitialEmpty
#             ],
#             transitions=[
#                 transitionEmptyToX, transitionEmptyToO
#             ],
#             initialState=stateInitialEmpty,
#             activeState=stateInitialEmpty,
#             tileType="PlayTile",
#             hexColor="#ffffff",
#             name="PlayTile",
#             row=row,
#             column=column
#         )



# initial_tile_placement = {
# 	(0, 0): "OPlayed", 
# 	(0, 1): "XPlayed"
# }


# # --- Instance Initialization ---
# tiles = [
#     PlayTile(0, 0), 
#     PlayTile(0, 1), 
#     PlayTile(0, 2), 
#     PlayTile(1, 0), 
#     PlayTile(1, 1), 
#     PlayTile(1, 2), 
#     PlayTile(2, 0), 
#     PlayTile(2, 1), 
#     PlayTile(2, 2)
# ]

# for tile in tiles:
# 	for startingTile in initial_tile_placement.keys():
# 		if (tile.row, tile.column) == startingTile:
# 			tile.updateState(initial_tile_placement.get(startingTile))

# players = [
#     Player(name="PlayerX", hexColor="#ff0000", associatedState="XPlayed"), 
#     Player(name="PlayerO", hexColor="#0000ff", associatedState="OPlayed")
# ]

# # --- Pipelines ---

# legal_moves_pipeline = LegalMovesPipeline(
#     filters=[
#         PatternFilter(
#             name="MustBeEmptyTile",
#             patterns=[
#                 Pattern(
#                     name="CheckEmpty",
#                     stateSelection="StateBased",
#                     matchState="InitialEmpty",
#                     relativecoordinates=[
#                         RelativeCoordinate(
#                             x=0,
#                             y=0
#                         )
#                     ]
#                 )
#             ],
#             nextFilter=None
#         )
#     ]
# )

# effect_pipeline = EffectPipeline(
#     filters=[
#         StateEffectFilter(
#             name="PlaceMark",
#             stateSelection="CurrentPlayer",
#             targetState=None,
#             nextFilter=None
#         ),
#         WinConditionFilter(
#         	name="CheckForWin",
#         	patterns=[
#         		Pattern(
#         		    name="R0",
#         		    stateSelection="CurrentPlayer",
#         		    matchState=None,
#         		    relativecoordinates=[
#         		        RelativeCoordinate(
#         		            x=0,
#         		            y=0
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=1,
#         		            y=0
#         		        )
#         		    ]
#         		), 
#         		Pattern(
#         		    name="R1",
#         		    stateSelection="CurrentPlayer",
#         		    matchState=None,
#         		    relativecoordinates=[
#         		        RelativeCoordinate(
#         		            x=0,
#         		            y=1
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=1,
#         		            y=1
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=2,
#         		            y=1
#         		        )
#         		    ]
#         		), 
#         		Pattern(
#         		    name="R2",
#         		    stateSelection="CurrentPlayer",
#         		    matchState=None,
#         		    relativecoordinates=[
#         		        RelativeCoordinate(
#         		            x=0,
#         		            y=2
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=1,
#         		            y=2
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=2,
#         		            y=2
#         		        )
#         		    ]
#         		), 
#         		Pattern(
#         		    name="C0",
#         		    stateSelection="CurrentPlayer",
#         		    matchState=None,
#         		    relativecoordinates=[
#         		        RelativeCoordinate(
#         		            x=0,
#         		            y=0
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=0,
#         		            y=1
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=0,
#         		            y=2
#         		        )
#         		    ]
#         		), 
#         		Pattern(
#         		    name="C1",
#         		    stateSelection="CurrentPlayer",
#         		    matchState=None,
#         		    relativecoordinates=[
#         		        RelativeCoordinate(
#         		            x=1,
#         		            y=0
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=1,
#         		            y=1
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=1,
#         		            y=2
#         		        )
#         		    ]
#         		), 
#         		Pattern(
#         		    name="C2",
#         		    stateSelection="CurrentPlayer",
#         		    matchState=None,
#         		    relativecoordinates=[
#         		        RelativeCoordinate(
#         		            x=2,
#         		            y=0
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=2,
#         		            y=1
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=2,
#         		            y=2
#         		        )
#         		    ]
#         		), 
#         		Pattern(
#         		    name="D0",
#         		    stateSelection="CurrentPlayer",
#         		    matchState=None,
#         		    relativecoordinates=[
#         		        RelativeCoordinate(
#         		            x=0,
#         		            y=0
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=1,
#         		            y=1
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=2,
#         		            y=2
#         		        )
#         		    ]
#         		), 
#         		Pattern(
#         		    name="D1",
#         		    stateSelection="CurrentPlayer",
#         		    matchState=None,
#         		    relativecoordinates=[
#         		        RelativeCoordinate(
#         		            x=2,
#         		            y=0
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=1,
#         		            y=1
#         		        ), 
#         		        RelativeCoordinate(
#         		            x=0,
#         		            y=2
#         		        )
#         		    ]
#         		)
#         	],
#         	nextFilter=None
#         )
#     ]
# )

# board = Board(
#     width=3,
#     height=3,
#     tiles=tiles,
#     checkered=True,
#     size=9,
#     legalMovesPipeline=legal_moves_pipeline,
#     effectPipeline=effect_pipeline,
#     legalMoves=[]
# )

# game = Game(
#     board=board,
#     players=players,
#     activePlayer=players[0],
#     name="TicTacToe",
#     initialPlayer=players[0],
#     turnPolicy="TurnBased"
# )