from typing import List, Optional
from pydantic import BaseModel

class Board(BaseModel):
	width: "int"
	tiles: List["Tile"] = []
	legalMovesPipeline: List["LegalMovesPipeline"] = []
	effectPipeline: List["EffectPipeline"] = []
	height: "int"
	checkered: "bool"
	tileplacement: List["TilePlacement"] = []
	size: "int"

class Tile(BaseModel):
	states: List["State"] = []
	transitions: List["Transition"] = []
	initialState: "State"
	type: "str"
	hexColor: "str"
	name: "str"

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
	filters: Optional["Filter"] = None


class Filter(BaseModel):
  pass

class PatternFilter(Filter):
  nextFilter: Optional["Filter"] = None
  patterns: List["Pattern"] = []

  
class Pattern(BaseModel):
  name: "str"
  stateSelection: "str" = "StateBased" 
  matchState: "str"
  relativeCoordinates: List["RelativeCoordinate"] = []

class RelativeCoordinate(BaseModel):
  x: "int"
  y: "int"

class EffectPipeline(BaseModel):
	filter: Optional["Filter"] = None

class TilePlacement(BaseModel):
	row: "int"
	column: "int"
	tile: "Tile"
	darker: "bool"
	coordinate: "tuple"

class Player(BaseModel):
	name: "str"
	hexColor: "str"

class TurnPolicy(BaseModel):
	type: "str"

class Game(BaseModel):
	board: "Board"
	name: "str"
	players: List["Player"] = []
	turnPolicy: List["TurnPolicy"] = []
	initialPlayer: Optional["Player"] = None
	activePlayer: "Player"

Board.model_rebuild()
Tile.model_rebuild()
State.model_rebuild()
Transition.model_rebuild()
LegalMovesPipeline.model_rebuild()
Filter.model_rebuild()
PatternFilter.model_rebuild()
EffectPipeline.model_rebuild()
TilePlacement.model_rebuild()
Player.model_rebuild()
TurnPolicy.model_rebuild()
Game.model_rebuild()


class PlayTile(Tile):
    def __init__(self):
        stateInitialEmpty = State(
            name="InitialEmpty",
            hexColor="#FFFFFF",
            outbound=[]
        )

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

        transitionEmptyToX = Transition(
            name="EmptyToX",
            source=[
                stateInitialEmpty
            ],
            target=stateXPlayed
        )
        transitionEmptyToO = Transition(
            name="EmptyToO",
            source=[
                stateInitialEmpty
            ],
            target=stateOPlayed
        )

        stateInitialEmpty.outbound.append(transitionEmptyToX)
        stateXPlayed.inbound.append(transitionEmptyToX)
        stateInitialEmpty.outbound.append(transitionEmptyToO)
        stateOPlayed.inbound.append(transitionEmptyToO)
        
        super().__init__(
        	states=[
        	stateXPlayed, 
        	stateOPlayed
        	],
        	transitions=[
        	transitionEmptyToX, 
        	transitionEmptyToO
        	],
        	initialState=stateInitialEmpty,
        	type="PlayTile",
        	hexColor="#FFFFFF",
        	name="PlayTile"
        )

tileplacements = [
    TilePlacement(
        row=0,
        column=0,
        tile=PlayTile(),
        darker=False,
        coordinate=(0, 0)
    ), 
    TilePlacement(
        row=0,
        column=1,
        tile=PlayTile(),
        darker=True,
        coordinate=(0, 1)
    ), 
    TilePlacement(
        row=0,
        column=2,
        tile=PlayTile(),
        darker=False,
        coordinate=(0, 2)
    ), 
    TilePlacement(
        row=1,
        column=0,
        tile=PlayTile(),
        darker=True,
        coordinate=(1, 0)
    ), 
    TilePlacement(
        row=1,
        column=1,
        tile=PlayTile(),
        darker=False,
        coordinate=(1, 1)
    ), 
    TilePlacement(
        row=1,
        column=2,
        tile=PlayTile(),
        darker=True,
        coordinate=(1, 2)
    ), 
    TilePlacement(
        row=2,
        column=0,
        tile=PlayTile(),
        darker=False,
        coordinate=(2, 0)
    ), 
    TilePlacement(
        row=2,
        column=1,
        tile=PlayTile(),
        darker=True,
        coordinate=(2, 1)
    ), 
    TilePlacement(
        row=2,
        column=2,
        tile=PlayTile(),
        darker=False,
        coordinate=(2, 2)
    )
]

players = [
    Player(name="PlayerX", hexColor="#FF0000"), 
    Player(name="PlayerO", hexColor="#0000FF")
]

board = Board(
    width=3,
    height=3,
    tileplacement=tileplacements,
    checkered=True,
    size=9
)

game = Game(
    board=board,
    players=players,
    activePlayer=players[0],
    name="TicTacToe",
    initialPlayer=players[0]
)