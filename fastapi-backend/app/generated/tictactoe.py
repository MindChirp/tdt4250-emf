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
    
class StateEffectFilter(Filter):
    name: "str"
    stateSelection: "str"
    targetState: Optional["str"] = None 

    
class WinConditionFilter(Filter):
    nextFilter: Optional["Filter"] = None
    name: "str"
    patterns: List["Pattern"] = []
    
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
StateEffectFilter.model_rebuild()
WinConditionFilter.model_rebuild()
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
        stateXPlayed = State(
            name="XPlayed",
            hexColor="#ff0000",
            outbound=[], inbound=[]
        )
        stateOPlayed = State(
            name="OPlayed",
            hexColor="#0000ff",
            outbound=[], inbound=[]
        )
        
        # 3. Create Transitions (Linking objects)
        transitionEmptyToX = Transition(
            name="EmptyToX",
            source=[stateInitialEmpty],
            target=stateXPlayed
        )
        transitionEmptyToO = Transition(
            name="EmptyToO",
            source=[stateInitialEmpty],
            target=stateOPlayed
        )

        # 4. Link Transitions to States (Outbound/Inbound wiring)
        # Outbound for EmptyToX
        stateInitialEmpty.outbound.append(transitionEmptyToX)
        # Inbound for EmptyToX
        stateXPlayed.inbound.append(transitionEmptyToX)
        
        # Outbound for EmptyToO
        stateInitialEmpty.outbound.append(transitionEmptyToO)
        # Inbound for EmptyToO
        stateOPlayed.inbound.append(transitionEmptyToO)
        

        super().__init__(
            states=[
                stateXPlayed, stateOPlayed
                , stateInitialEmpty
            ],
            transitions=[
                transitionEmptyToX, transitionEmptyToO
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
	(0, 0): "OPlayed", 
	(0, 1): "XPlayed"
}


# --- Instance Initialization ---
tiles = [
    PlayTile(0, 0), 
    PlayTile(0, 1), 
    PlayTile(0, 2), 
    PlayTile(1, 0), 
    PlayTile(1, 1), 
    PlayTile(1, 2), 
    PlayTile(2, 0), 
    PlayTile(2, 1), 
    PlayTile(2, 2)
]

for tile in tiles:
	for startingTile in initial_tile_placement.keys():
		if (tile.row, tile.column) == startingTile:
			tile.updateState(initial_tile_placement.get(startingTile))

players = [
    Player(name="PlayerX", hexColor="#ff0000", associatedState="XPlayed"), 
    Player(name="PlayerO", hexColor="#0000ff", associatedState="OPlayed")
]

# --- Pipelines ---

legal_moves_pipeline = LegalMovesPipeline(
    filters=[
        PatternFilter(
            name="MustBeEmptyTile",
            patterns=[
                Pattern(
                    name="CheckEmpty",
                    stateSelection="StateBased",
                    matchState="InitialEmpty",
                    relativecoordinates=[
                        RelativeCoordinate(
                            x=0,
                            y=0
                        )
                    ]
                )
            ],
            nextFilter=None
        )
    ]
)

effect_pipeline = EffectPipeline(
    filters=[
        StateEffectFilter(
            name="PlaceMark",
            stateSelection="CurrentPlayer",
            targetState=None,
            nextFilter=None
        ),
        WinConditionFilter(
        	name="CheckForWin",
        	patterns=[
        		Pattern(
        		    name="R0",
        		    stateSelection="CurrentPlayer",
        		    matchState=None,
        		    relativecoordinates=[
        		        RelativeCoordinate(
        		            x=0,
        		            y=0
        		        ), 
        		        RelativeCoordinate(
        		            x=1,
        		            y=0
        		        )
        		    ]
        		), 
        		Pattern(
        		    name="R1",
        		    stateSelection="CurrentPlayer",
        		    matchState=None,
        		    relativecoordinates=[
        		        RelativeCoordinate(
        		            x=0,
        		            y=1
        		        ), 
        		        RelativeCoordinate(
        		            x=1,
        		            y=1
        		        ), 
        		        RelativeCoordinate(
        		            x=2,
        		            y=1
        		        )
        		    ]
        		), 
        		Pattern(
        		    name="R2",
        		    stateSelection="CurrentPlayer",
        		    matchState=None,
        		    relativecoordinates=[
        		        RelativeCoordinate(
        		            x=0,
        		            y=2
        		        ), 
        		        RelativeCoordinate(
        		            x=1,
        		            y=2
        		        ), 
        		        RelativeCoordinate(
        		            x=2,
        		            y=2
        		        )
        		    ]
        		), 
        		Pattern(
        		    name="C0",
        		    stateSelection="CurrentPlayer",
        		    matchState=None,
        		    relativecoordinates=[
        		        RelativeCoordinate(
        		            x=0,
        		            y=0
        		        ), 
        		        RelativeCoordinate(
        		            x=0,
        		            y=1
        		        ), 
        		        RelativeCoordinate(
        		            x=0,
        		            y=2
        		        )
        		    ]
        		), 
        		Pattern(
        		    name="C1",
        		    stateSelection="CurrentPlayer",
        		    matchState=None,
        		    relativecoordinates=[
        		        RelativeCoordinate(
        		            x=1,
        		            y=0
        		        ), 
        		        RelativeCoordinate(
        		            x=1,
        		            y=1
        		        ), 
        		        RelativeCoordinate(
        		            x=1,
        		            y=2
        		        )
        		    ]
        		), 
        		Pattern(
        		    name="C2",
        		    stateSelection="CurrentPlayer",
        		    matchState=None,
        		    relativecoordinates=[
        		        RelativeCoordinate(
        		            x=2,
        		            y=0
        		        ), 
        		        RelativeCoordinate(
        		            x=2,
        		            y=1
        		        ), 
        		        RelativeCoordinate(
        		            x=2,
        		            y=2
        		        )
        		    ]
        		), 
        		Pattern(
        		    name="D0",
        		    stateSelection="CurrentPlayer",
        		    matchState=None,
        		    relativecoordinates=[
        		        RelativeCoordinate(
        		            x=0,
        		            y=0
        		        ), 
        		        RelativeCoordinate(
        		            x=1,
        		            y=1
        		        ), 
        		        RelativeCoordinate(
        		            x=2,
        		            y=2
        		        )
        		    ]
        		), 
        		Pattern(
        		    name="D1",
        		    stateSelection="CurrentPlayer",
        		    matchState=None,
        		    relativecoordinates=[
        		        RelativeCoordinate(
        		            x=2,
        		            y=0
        		        ), 
        		        RelativeCoordinate(
        		            x=1,
        		            y=1
        		        ), 
        		        RelativeCoordinate(
        		            x=0,
        		            y=2
        		        )
        		    ]
        		)
        	],
        	nextFilter=None
        )
    ]
)

board = Board(
    width=3,
    height=3,
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
    name="TicTacToe",
    initialPlayer=players[0],
    turnPolicy="TurnBased"
)
