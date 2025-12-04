from typing import List, Optional
from pydantic import BaseModel

class Filter(BaseModel):
    pass

class Board(BaseModel):
    width: "int"
    tiles: List["Tile"] = []
    legalMovesPipeline: Optional["LegalMovesPipeline"] = None
    effectPipeline: Optional["EffectPipeline"] = None
    height: "int"
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
    filter: Optional["Filter"] = None
    
class PatternFilter(Filter):
    nextFilter: Optional["Filter"] = None
    patterns: List["Pattern"] = []
    name: "str"
    
class Pattern(BaseModel):
    relativecoordinates: List["RelativeCoordinate"] = []
    name: "str"
    stateSelection: Optional["str"] = None
    matchState: Optional["str"] = None
    
    
class RelativeCoordinate(BaseModel):
    x: "int"
    y: "int"
    
class EffectPipeline(BaseModel):
    filter: Optional["Filter"] = None
    
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
    

Board.model_rebuild()
Tile.model_rebuild()
State.model_rebuild()
Transition.model_rebuild()
LegalMovesPipeline.model_rebuild()
PatternFilter.model_rebuild()
Pattern.model_rebuild()
RelativeCoordinate.model_rebuild()
EffectPipeline.model_rebuild()
Player.model_rebuild()
Game.model_rebuild()


class PlayTile(Tile):
    def __init__(self, row, column):
        stateInitialEmpty = State(
            name="InitialEmpty",
            hexColor="#ffffff",
            outbound=[]
        )

        row = row
        column = column

        stateXPlayed = State(
            name="XPlayed",
            hexColor="#ffffff",
            outbound=[],
            inbound=[]
        )
        stateOPlayed = State(
            name="OPlayed",
            hexColor="#ffffff",
            outbound=[],
            inbound=[]
        )

        transitionEmptyToO = Transition(
            name="EmptyToO",
            source=[
                stateInitialEmpty
            ],
            target=stateOPlayed
        )
        transitionEmptyToX = Transition(
            name="EmptyToX",
            source=[
                stateInitialEmpty
            ],
            target=stateXPlayed
        )

        stateInitialEmpty.outbound.append(transitionEmptyToO)
        stateOPlayed.inbound.append(transitionEmptyToO)
        stateInitialEmpty.outbound.append(transitionEmptyToX)
        stateXPlayed.inbound.append(transitionEmptyToX)

        super().__init__(
            states=[
                stateXPlayed, 
                stateOPlayed
            ],
            transitions=[
                transitionEmptyToO, 
                transitionEmptyToX
            ],
            initialState=stateInitialEmpty,
            activeState=stateInitialEmpty,
            tileType="PlayTile",
            hexColor="#ffffff",
            name="PlayTile",
            row=row,
            column=column
        )


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
    Player(
        name="Player1",
        hexColor="#999999",
        associatedState="OPlayed"
    ), 
    Player(
        name="Player2",
        hexColor="#99ffff",
        associatedState="XPlayed"
    )
]


board = Board(
    width=3,
    height=3,
    tiles=tiles,
    checkered=True,
    size=9,
    legalMovesPipeline=LegalMovesPipeline(filter=PatternFilter(
                name="MustBeEmptyPlace",
                patterns=[Pattern(
                        name="CurrentTileMustBeEmpty",
                        stateSelection="StateBased",
                        matchState="InitialEmpty",
                        relativecoordinates=[RelativeCoordinate(x=0, y=0)]
                    )])),
    effectPipeline=EffectPipeline(filter=PatternFilter(
                name="PlaceCurrentTile",
                patterns=[Pattern(
                        name="SelectCurrentTile",
                        stateSelection="StateBased",
                        matchState="InitialEmpty",
                        relativecoordinates=[RelativeCoordinate(x=0, y=0)]
                    )])),
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

