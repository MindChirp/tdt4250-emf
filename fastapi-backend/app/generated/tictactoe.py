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
            hexColor="#ff0000",
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

players = [
    Player(name="Player1", hexColor="#999999", associatedState="BlackPlayed"), 
    Player(name="Player2", hexColor="#99ffff", associatedState="WhitePlayed")
]

# --- Pipelines ---

legal_moves_pipeline = LegalMovesPipeline(
    filters=[
        PatternFilter(
            name="MustBeEmptyPlace",
            patterns=[
                Pattern(
                    name="CurrentTileMustBeEmpty",
                    stateSelection="StateBased",
                    matchState="InitialEmpty",
                    relativecoordinates=[
                        RelativeCoordinate(
                            x=0,
                            y=0
                        ),
                    ]
                )
            ],
            nextFilter=None
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
            )
            ,
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
            ,
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
    name="Othello",
    initialPlayer=players[0],
    turnPolicy="TurnBased"
)
