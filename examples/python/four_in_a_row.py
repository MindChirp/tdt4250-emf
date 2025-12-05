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
    column: "int"
    row: "int"
    
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
    winMessage: "str" = None

    

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
Player.model_rebuild()
Game.model_rebuild()
Filter.model_rebuild()

# --- Tile Definitions ---

class PlayTile(Tile):
    def __init__(self, column, row):
        # 1. Create Initial State
        stateInitialEmpty = State(
            name="InitialEmpty",
            hexColor="#ffffff",
            outbound=[], inbound=[]
        )

        # 2. Create Other States
        stateOrangePlayed = State(
            name="OrangePlayed",
            hexColor="#FFA500",
            outbound=[], inbound=[]
        )
        stateBluePlayed = State(
            name="BluePlayed",
            hexColor="#0096FF",
            outbound=[], inbound=[]
        )
        
        # 3. Create Transitions (Linking objects)
        transitionEmptyToOrange = Transition(
            name="EmptyToOrange",
            source=[stateInitialEmpty],
            target=stateOrangePlayed
        )
        transitionEmptyToBlue = Transition(
            name="EmptyToBlue",
            source=[stateInitialEmpty],
            target=stateBluePlayed
        )

        # 4. Link Transitions to States (Outbound/Inbound wiring)
        # Outbound for EmptyToOrange
        stateInitialEmpty.outbound.append(transitionEmptyToOrange)
        # Inbound for EmptyToOrange
        stateOrangePlayed.inbound.append(transitionEmptyToOrange)
        
        # Outbound for EmptyToBlue
        stateInitialEmpty.outbound.append(transitionEmptyToBlue)
        # Inbound for EmptyToBlue
        stateBluePlayed.inbound.append(transitionEmptyToBlue)
        

        super().__init__(
            states=[
                stateOrangePlayed, stateBluePlayed
                , stateInitialEmpty
            ],
            transitions=[
                transitionEmptyToOrange, transitionEmptyToBlue
            ],
            initialState=stateInitialEmpty,
            activeState=stateInitialEmpty,
            tileType="PlayTile",
            hexColor="#ffffff",
            name="PlayTile",
            column=column,
            row=row
        )

class FloorTile(Tile):
    def __init__(self, column, row):
        # 1. Create Initial State
        stateFloorTileInitial = State(
            name="FloorTileInitial",
            hexColor="#bbbbbb",
            outbound=[], inbound=[]
        )

        # 2. Create Other States
        stateFloorTile = State(
            name="FloorTile",
            hexColor="#bbbbbb",
            outbound=[], inbound=[]
        )
        
        # 3. Create Transitions (Linking objects)
        transitionInitialToFloor = Transition(
            name="InitialToFloor",
            source=[stateFloorTileInitial],
            target=stateFloorTile
        )

        # 4. Link Transitions to States (Outbound/Inbound wiring)
        # Outbound for InitialToFloor
        stateFloorTileInitial.outbound.append(transitionInitialToFloor)
        # Inbound for InitialToFloor
        stateFloorTile.inbound.append(transitionInitialToFloor)
        

        super().__init__(
            states=[
                stateFloorTile
                , stateFloorTileInitial
            ],
            transitions=[
                transitionInitialToFloor
            ],
            initialState=stateFloorTileInitial,
            activeState=stateFloorTileInitial,
            tileType="FloorTile",
            hexColor="#bbbbbb",
            name="FloorTile",
            column=column,
            row=row
        )



initial_tile_placement = {
}


# --- Instance Initialization ---
tiles = [
    PlayTile(0, 0), 
    PlayTile(1, 0), 
    PlayTile(2, 0), 
    PlayTile(3, 0), 
    PlayTile(4, 0), 
    PlayTile(5, 0), 
    PlayTile(6, 0), 
    PlayTile(0, 1), 
    PlayTile(1, 1), 
    PlayTile(2, 1), 
    PlayTile(3, 1), 
    PlayTile(4, 1), 
    PlayTile(5, 1), 
    PlayTile(6, 1), 
    PlayTile(0, 2), 
    PlayTile(1, 2), 
    PlayTile(2, 2), 
    PlayTile(3, 2), 
    PlayTile(4, 2), 
    PlayTile(5, 2), 
    PlayTile(6, 2), 
    PlayTile(0, 3), 
    PlayTile(1, 3), 
    PlayTile(2, 3), 
    PlayTile(3, 3), 
    PlayTile(4, 3), 
    PlayTile(5, 3), 
    PlayTile(6, 3), 
    PlayTile(0, 4), 
    PlayTile(1, 4), 
    PlayTile(2, 4), 
    PlayTile(3, 4), 
    PlayTile(4, 4), 
    PlayTile(5, 4), 
    PlayTile(6, 4), 
    PlayTile(0, 5), 
    PlayTile(1, 5), 
    PlayTile(2, 5), 
    PlayTile(3, 5), 
    PlayTile(4, 5), 
    PlayTile(5, 5), 
    PlayTile(6, 5), 
    FloorTile(0, 6), 
    FloorTile(1, 6), 
    FloorTile(2, 6), 
    FloorTile(3, 6), 
    FloorTile(4, 6), 
    FloorTile(5, 6), 
    FloorTile(6, 6)
]

for tile in tiles:
	for startingTile in initial_tile_placement.keys():
		if (tile.column, tile.row) == startingTile:
			tile.updateState(initial_tile_placement.get(startingTile))

players = [
    Player(name="Orange", hexColor="#ffffff", associatedState="OrangePlayed"), 
    Player(name="Blue", hexColor="#000000", associatedState="BluePlayed")
]

# --- Pipelines ---

legal_moves_pipeline = LegalMovesPipeline(
    filters=[
        PatternFilter(
            name="MustBeFloor",
            patterns=[
                Pattern(
                    name="FloorBelow",
                    stateSelection="StateBased",
                    matchState="FloorTileInitial",
                    relativecoordinates=[
                        RelativeCoordinate(
                            x=0,
                            y=1
                        )
                    ]
                ), 
                Pattern(
                    name="TileIsFree",
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
        ),
        PatternFilter(
            name="MustBeFloor",
            patterns=[
                Pattern(
                    name="FloorBelow",
                    stateSelection="OtherPlayer",
                    matchState=None,
                    relativecoordinates=[
                        RelativeCoordinate(
                            x=0,
                            y=1
                        )
                    ]
                ), 
                Pattern(
                    name="TileIsFree",
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
        ),
        PatternFilter(
            name="MustBeFloor",
            patterns=[
                Pattern(
                    name="FloorBelow",
                    stateSelection="CurrentPlayer",
                    matchState=None,
                    relativecoordinates=[
                        RelativeCoordinate(
                            x=0,
                            y=1
                        )
                    ]
                ), 
                Pattern(
                    name="TileIsFree",
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
            name="ClaimCurrentTile",
            stateSelection="CurrentPlayer",
            targetState=None,
            nextFilter=None
        )
    ]
)

board = Board(
    width=7,
    height=7,
    tiles=tiles,
    checkered=True,
    size=49,
    legalMovesPipeline=legal_moves_pipeline,
    effectPipeline=effect_pipeline,
    legalMoves=[]
)

game = Game(
    board=board,
    players=players,
    activePlayer=players[0],
    name="FourInARow",
    initialPlayer=players[0],
    turnPolicy="TurnBased"
)