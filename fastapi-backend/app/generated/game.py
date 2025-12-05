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
    
class IterativeFilter(Filter):
    nextFilter: Optional["Filter"] = None
    name: "str"
    directionVectors: List["RelativeCoordinate"] = []
    matchRule: "Pattern"
    endRule: "Pattern"
    
class RelativeCoordinate(BaseModel):
    x: "int"
    y: "int"
    
class Pattern(BaseModel):
    name: "str"
    stateSelection: Optional["str"] = None
    matchState: Optional["str"] = None
    relativecoordinates: List["RelativeCoordinate"] = []

    
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
IterativeFilter.model_rebuild()
RelativeCoordinate.model_rebuild()
Pattern.model_rebuild()
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
        stateWhitePlayed = State(
            name="WhitePlayed",
            hexColor="#ff0000",
            outbound=[], inbound=[]
        )
        stateBlackPlayed = State(
            name="BlackPlayed",
            hexColor="#00ff00",
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
            column=column,
            row=row
        )



initial_tile_placement = {
	(3,3): "WhitePlayed", 
	(4,3): "BlackPlayed", 
	(3,4): "BlackPlayed", 
	(4,4): "WhitePlayed"
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
    PlayTile(7, 0), 
    PlayTile(0, 1), 
    PlayTile(1, 1), 
    PlayTile(2, 1), 
    PlayTile(3, 1), 
    PlayTile(4, 1), 
    PlayTile(5, 1), 
    PlayTile(6, 1), 
    PlayTile(7, 1), 
    PlayTile(0, 2), 
    PlayTile(1, 2), 
    PlayTile(2, 2), 
    PlayTile(3, 2), 
    PlayTile(4, 2), 
    PlayTile(5, 2), 
    PlayTile(6, 2), 
    PlayTile(7, 2), 
    PlayTile(0, 3), 
    PlayTile(1, 3), 
    PlayTile(2, 3), 
    PlayTile(3, 3), 
    PlayTile(4, 3), 
    PlayTile(5, 3), 
    PlayTile(6, 3), 
    PlayTile(7, 3), 
    PlayTile(0, 4), 
    PlayTile(1, 4), 
    PlayTile(2, 4), 
    PlayTile(3, 4), 
    PlayTile(4, 4), 
    PlayTile(5, 4), 
    PlayTile(6, 4), 
    PlayTile(7, 4), 
    PlayTile(0, 5), 
    PlayTile(1, 5), 
    PlayTile(2, 5), 
    PlayTile(3, 5), 
    PlayTile(4, 5), 
    PlayTile(5, 5), 
    PlayTile(6, 5), 
    PlayTile(7, 5), 
    PlayTile(0, 6), 
    PlayTile(1, 6), 
    PlayTile(2, 6), 
    PlayTile(3, 6), 
    PlayTile(4, 6), 
    PlayTile(5, 6), 
    PlayTile(6, 6), 
    PlayTile(7, 6), 
    PlayTile(0, 7), 
    PlayTile(1, 7), 
    PlayTile(2, 7), 
    PlayTile(3, 7), 
    PlayTile(4, 7), 
    PlayTile(5, 7), 
    PlayTile(6, 7), 
    PlayTile(7, 7)
]

for tile in tiles:
	for startingTile in initial_tile_placement.keys():
		if (tile.column, tile.row) == startingTile:
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
            nextFilter=IterativeFilter(
                name="Raycast",
                directionVectors=[
                RelativeCoordinate(
                    x=1,
                    y=0
                ), 
                RelativeCoordinate(
                    x=1,
                    y=1
                ), 
                RelativeCoordinate(
                    x=0,
                    y=1
                ), 
                RelativeCoordinate(
                    x=-1,
                    y=1
                ), 
                RelativeCoordinate(
                    x=-1,
                    y=0
                ), 
                RelativeCoordinate(
                    x=-1,
                    y=-1
                ), 
                RelativeCoordinate(
                    x=0,
                    y=-1
                ), 
                RelativeCoordinate(
                    x=1,
                    y=-1
                )
                ],
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
                )
                ,
                endRule=Pattern(
                    name="LastTileOwn",
                    stateSelection="CurrentPlayer",
                    matchState=None,
                    relativecoordinates=[
                        RelativeCoordinate(
                            x=0,
                            y=0
                        )
                    ]
                )
                ,
                nextFilter=None
            )
        )
    ]
)

effect_pipeline = EffectPipeline(
    filters=[
        IterativeFilter(
            name="Raycast",
            directionVectors=[
            RelativeCoordinate(
                x=1,
                y=0
            ), 
            RelativeCoordinate(
                x=1,
                y=1
            ), 
            RelativeCoordinate(
                x=0,
                y=1
            ), 
            RelativeCoordinate(
                x=-1,
                y=1
            ), 
            RelativeCoordinate(
                x=-1,
                y=0
            ), 
            RelativeCoordinate(
                x=-1,
                y=-1
            ), 
            RelativeCoordinate(
                x=0,
                y=-1
            ), 
            RelativeCoordinate(
                x=1,
                y=-1
            )
            ],
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
            )
            ,
            endRule=Pattern(
                name="LastTileOwn",
                stateSelection="CurrentPlayer",
                matchState=None,
                relativecoordinates=[
                    RelativeCoordinate(
                        x=0,
                        y=0
                    )
                ]
            )
            ,
            nextFilter=StateEffectFilter(
                name="FlipTilesToOwn",
                stateSelection="CurrentPlayer",
                targetState=None,
                nextFilter=None
            )
        ),
        StateEffectFilter(
            name="PlaceClickedTile",
            stateSelection="CurrentPlayer",
            targetState=None,
            nextFilter=None
        )
    ]
)

board = Board(
    width=8,
    height=8,
    tiles=tiles,
    checkered=True,
    size=64,
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