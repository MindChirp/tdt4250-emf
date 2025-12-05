# Tile-Based Game Engine - Project Overview

This repository provides a complete model-driven framework for defining and executing tile-based board games such as **Connect 4**, **TicTacToe**, and **Othello** using a custom DSL.  
All gameplay logic, tile state machines, legal move rules, effect rules, and win conditions, is modeled declaratively in the DSL, with a large focus being the usage of modular filters that can be chained together to model compex rulesets.  

The system is built using **EMF/Ecore**, **Xtext**, **Xtend**, and **Java** to define the metamodel and generate all necessary runtime classes.  
From each DSL game description, the generator produces runnable **Python code**, which integrates with our **FastAPI backend** and **React frontend** to create a fully playable game environment.

This project was developed by **Emil Johnsen, Frikk Balder Ormestad, Andreas Gjersøe, and Knut Johansen**.

---

## Table of Contents

- [Project description](#project-description)
- [What We Implemented](#what-we-implemented)
- [System Requirements](#system-requirements)
- [How to Setup and Use](#how-to-setup-and-use)  
- [Repository Overview](#repository-overview)  
- [Tile-Based Game Engine Deep Dives](#tile-based-game-engine-deep-dives)  
  - [Metamodel Deep Dive](#metamodel-deep-dive)  
    - [Classes and Relationships](#classes-and-relationships)  
    - [Pipelines](#pipelines)  
    - [Filters](#filters)  
    - [Constraints](#constraints)
    - [Derived Attributes](#derived-attributes)  
  - [Game Logic Flow Deep Dive](#game-logic-flow-deep-dive)  
- [Example Game: Connect 4](#example-game-connect-4)  
- [Example Game: Othello](#example-game-othello)  

---

## Project description

The **Tile-Based Game Engine** is a model-driven framework for designing deterministic, grid-based board games through a custom DSL (domain-specific language).  
Its goal is to allow users to define gameplay rules declaratively, without writing imperative gameplay code.

Games are expressed entirely through models that describe:

- The board layout  
- Tile types and their internal state machines  
- How states can transition during play  
- How patterns of tiles should be interpreted  
- Pipelines for evaluating legal moves and applying effects  

Instead of implementing all game logic by hand, users compose rules by connecting filters, transitions, and patterns.  
These models are then interpreted by a runtime engine that executes moves, updates tile states, evaluates patterns, and determines when a game has been won.

This approach follows a typical model-driven engineering workflow:
1. **Define** the game in the DSL  
2. **Generate** model artifacts  
3. **Execute** the game through the backend engine  
4. **Visualize** gameplay in a frontend UI  

The result is a flexible platform capable of representing a wide range of turn-based, tile-based games such as TicTacToe, Connect Four, and Othello.

---

## What We Implemented

- A complete Xtext DSL for defining tile-based board games
- An EMF metamodel covering:
  - Game, Player, Board, TilePlacement
  - Tile state machines (State & Transition)
  - Pattern-based logic (PatternFilter, Pattern, RelativeCoordinate)
  - Legal/Effect pipelines and chained Filter system
  - IterativeFilter, StateEffectFilter, WinConditionFilter
- Xtend code generator producing Python runtime classes
- A full backend engine supporting:
  - Legal move calculation
  - Effect execution
  - Pattern matching
  - Win detection
  - Turn switching
- FastAPI server exposing:
  - Game creation
  - Game state retrieval
  - Move submission
- Multiple example games:
  - TicTacToe
  - Connect Four
  - Othello (Reversi)
- A React frontend for visualization and interaction

---

## System Requirements

### Backend (DSL + Code Generator + API)
- **Eclipse IDE 2023-xx** with:
  - Xtext 2.30+
  - EMF (Eclipse Modeling Framework)
- **Java 17+**
- **Gradle or Maven** (depending on your project setup)
- **Python 3.10+**
- **FastAPI**
- **uvicorn**

### Frontend [(separate repository)](https://github.com/MindChirp/tdt4250-gui)
- **Node.js 18+**
- **npm or yarn**

### Recommended OS
- Windows 10/11  
- macOS 12+  
- Linux (Ubuntu 22.04)

---

## How to setup and use

This repository contains multiple components required for running, developing, and extending the Tile-Based Game Engine.  
Before working with the DSL, backend, or frontend, ensure your environment is correctly set up.

---

## Eclipse Plugin Packaging (Feature, Update Site, P2 Repository)

The project includes a complete Eclipse plugin distribution packaged into:

- **Feature Project** ' bundles all DSL, EMF, and generator plugins  
- **Update Site Project** - defines how the feature is published  
- **P2 Repository** - installable Eclipse update site (ready for end-users)

These are included in the repository:

```
/feature/ – Feature project (.feature)
/update-site/ – Update Site project (site.xml)
/p2-repo/ – Built installable P2 repository
```

### Installing the DSL in Eclipse

1. Open **Eclipse**
2. Navigate to **Help → Install New Software…**
3. Click **Add…**
4. Choose **Local…** and select: **/p2-repo/**
5. Install the offered feature and restart Eclipse.



---

## Repository Overview

The repository contains all components required for defining the DSL, generating runtime code, packaging Eclipse plugins, and running the backend.

### Eclipse / EMF / Xtext Projects

These folders form the core of the DSL tooling:

    no.ntnu.tdt4250.bg/               – EMF metamodel (Ecore), validator, and generated model code
    no.ntnu.tdt4250.bg.bgdsl/         – Xtext grammar project (DSL definition + Xtend generator)
    no.ntnu.tdt4250.bg.bgdsl.ide/     – Xtext IDE support (content assist, indexing)
    no.ntnu.tdt4250.bg.bgdsl.ui/      – Xtext UI plugin (DSL editor, syntax highlighting)
    no.ntnu.tdt4250.bg.bgdsl.tests/   – DSL unit tests
    no.ntnu.tdt4250.bg.bgdsl.ui.tests – UI tests for the DSL editor
    no.ntnu.tdt4250.bg.edit/          – EMF edit plugin (item providers)
    no.ntnu.tdt4250.bg.editor/        – EMF editor plugin (tree editor)

### Packaging (Feature + Update Site + P2 Repository)

These projects provide the required Eclipse plugin packaging:

    no.ntnu.tdt4250.bg.feature/       – Feature project bundling all DSL/EMF plugins
    no.ntnu.tdt4250.bg.update/        – Update site project (site.xml)
    p2-repository/                    – Built P2 repository for installing the DSL into Eclipse

### Backend (Generated Runtime + API)

    fastapi-backend/                  – Python backend engine + FastAPI server

Contains:
- Generated Python code from the Xtend generator  
- Runtime for executing pipelines, transitions, and win conditions  
- REST API for interacting with the frontend  

### Sirius (Legacy / Unused)

The following folders are remnants from early experimentation with Sirius (graphical modeling).  
They remain for completeness but **are not part of the final solution**:

    no.ntnu.tdt4250.bg.design/        – Sirius design project (unused)
    no.ntnu.tdt4250.bg.editor/        – Sirius diagram editor fragments (unused)

### Miscellaneous

    README.md                         – Project documentation
    bg.jpg                            – Metamodel diagram


---

## **Tile-Based Game Engine Deep Dives**

### **Metamodel Deep Dive**

The following is a detailed description of the latest version of the Tile-Based Game Engine metamodel.

#### **Classes and Relationships**

The following diagram shows the complete structure of the Tile-Based Game Engine metamodel.  
It includes the core game entities (Game, Board, Tile), tile state machines, pipelines, filters, and pattern-based match logic used to determine legal moves and apply effects during gameplay.

![Metamodel Diagram](bg.jpg)

---

### **Class Descriptions**

---

### **Game**
Represents a complete, fully defined playable game configuration.

- **`name : EString`**  
  The name of the game (e.g., “Connect 4”, “Othello”).

- **`players : Player[1..*]`**  
  All players participating in the game.

- **`board : Board`**  
  The board used for gameplay.

- **`turnPolicy : TurnType`**  
  Defines turn-taking rules (TurnBased or Simultaneous).

- **`initialPlayer : Player[1..1]`**  
  The first player to take a turn.

- **`activePlayer : Player[1..1]`**  
  The player whose turn is currently active.

---

### **Player**
Represents a participant in the game.

- **`name : EString`**  
  The name of the player.

- **`hexColor : EString`**  
  UI color representing the player's pieces (e.g., `#FF0000`).

- **`associatedState : State[1..1]`**  
  The state representing this player's tile ownership (e.g., XPlayed, RedPiece).

---

### **Board**
Defines the 2D grid for the game.

- **`width : EInt`**  
  Number of columns.

- **`height : EInt`**  
  Number of rows.

- **`checkered : EBoolean = false`**  
  Enables optional light/dark alternating tiles.

- **`tiles : Tile[1..*]`**  
  All tile types that may appear on the board.

- **`tileplacement : TilePlacement[1..*]`**  
  Specifies each tile's position in the grid.

- **`legalMovesPipeline : LegalMovesPipeline[0..1]`**  
  Determines which moves are legal for the current player.

- **`effectPipeline : EffectPipeline[0..1]`**  
  Applies effects (state changes, flips, win conditions) after a tile is selected.

---

### **TilePlacement**
Maps a tile type to an exact location on the board.

- **`row : EInt`**  
  Grid row (0-indexed).

- **`column : EInt`**  
  Grid column (0-indexed).

- **`tile : Tile[1..1]`**  
  The tile instance placed at these coordinates.

---

### **Tile**
Represents a logical tile type used on the board.

- **`tileType : EString`**  
  Category label for the tile (e.g., 'PlayTile').

- **`hexColor : EString`**  
  Base tile color.

- **`name : EString`**  
  Tile identifier.

- **`initialState : State[1..1]`**  
  Default tile state before gameplay starts.

- **`states : State[1..*]`**  
  All possible states this tile may transition between.

- **`transitions : Transition[0..*]`**  
  Defines the tile's internal state machine.

---

### **State**
Represents a tile's visual and logical status.

- **`name : EString`**  
  The state name.

- **`hexColor : EString = "#dddddd"`**  
  UI color of the tile when in this state.

- **`(reverse) matchState : Pattern[0..1]`**  
  Patterns may reference this state when matching.

---

### **Transition**
Defines valid state changes for a tile.

- **`name : EString`**  
  Identifier for the transition.

- **`source : State[0..*]`**  
  State(s) from which this transition may originate.

- **`target : State[1..1]`**  
  State that results from the transition.

Transitions form per-tile state machines.

---

## Pipelines

### **LegalMovesPipeline**
Determines how legal moves are computed.

- **`filter : Filter[0..1]`**  
  The first filter in the pipeline.  
  Filters are chained together using `nextFilter`.

---

### **EffectPipeline**
Runs after a legal move is executed.

- **`filter : Filter[0..1]`**  
  First filter in the effect sequence.  
  This pipeline may include:
  - StateEffect filters (state transitions)
  - WinCondition filters (global win evaluation)

---

## Filters

### **Filter**
Abstract superclass for all filters.

- **`name : EString`**  
  Identifier for the filter.

- **`nextFilter : Filter[0..1]`**  
  Next filter in the sequence; null indicates end of chain.

Filters form a linked list in both pipelines.

---

## Concrete Filters

### **PatternFilter**
Matches tile configurations using relative coordinate patterns.

- **`name : EString`**

- **`patterns : Pattern[1..*]`**  
  Patterns used for checking tile legality or effect conditions.

Used primarily in:
- LegalMovesPipeline
- IterativeFilter (as matchRule / endRule)
- WinConditionFilter (as child PatternFilters)

---

### **Pattern**
Defines a pattern relative to an anchor tile.

- **`name : EString`**

- **`stateSelection : StateSelection = CurrentPlayer`**  
  Determines which states this pattern matches:
  - `CurrentPlayer`
  - `OtherPlayer`
  - `StateBased`

- **`matchState : State[0..1]`**  
  When `stateSelection = StateBased`, this is the state to match.

- **`relativecoordinates : RelativeCoordinate[1..*]`**  
  Offsets relative to the anchor tile.

Patterns are reusable and composable.

---

### **RelativeCoordinate**
A single coordinate inside a pattern.

- **`x : EInt`**  
  Column offset relative to anchor.

- **`y : EInt`**  
  Row offset relative to anchor.

---

### **StateEffectFilter**
Applies a state transition to all affected tiles.

- **`stateSelection : StateSelection = CurrentPlayer`**  
  Controls which state is applied:
  - CurrentPlayer → player's associatedState  
  - OtherPlayer → opponent's associatedState  
  - StateBased → a specific state

Used for:
- Placing pieces (TicTacToe, Connect Four)
- Flipping discs (Othello)

---

### **IterativeFilter**
A loop-based filter that repeatedly scans tiles in a direction.

Used heavily in Othello/Reversi.

- **`directionVector : RelativeCoordinate[1..1]`**  
  The direction to scan (e.g., (1,0) for right).

- **`matchRule : Pattern[1..1]`**  
  Pattern that must match repeatedly to continue scanning.

- **`endRule : Pattern[1..1]`**  
  Pattern that must match to confirm a successful scan.

- **`nextFilter : Filter[0..1]`**  
  The effect to apply when scanning completes.

---

### **WinConditionFilter**
Evaluates game-winning conditions.

- **`patternFilters : PatternFilter[1..*]`**  
  Each PatternFilter describes one possible winning line.

WinConditionFilter is a **global filter**:
- It inspects the **entire board**.
- It is always run **after** local effect filters.
- If a win is detected, gameplay ends.

Used in:
- TicTacToe (rows, cols, diagonals)
- Connect Four (lines of four)
- Other alignment-based games.

---

## Summary of Pipeline Execution

### **LegalMovesPipeline**
1. Runs per-tile.
2. Each filter anchors on the tile being tested.
3. Returns a list of legal tiles.

### **EffectPipeline**
1. Runs only after a legal move is chosen.
2. **Local filters** (PatternFilter, StateEffectFilter, IterativeFilter) receive a list of affected tiles.
3. **Global filters** (WinConditionFilter) inspect the entire board at the end of the pipeline.
4. Determines:
   - tile updates  
   - flips  
   - cascades  
   - whether the player has won  

This pipeline-based model enables expressive rule definitions across many types of board games.

---

## Constraints

- Implemented in the generated `Validator` using Java.

---

### **Game constraints**

- **`playersMustHaveUniqueHexColors`**  
  Ensures that no two players share the same `hexColor`, guaranteeing a unique visual identity for each player.

- **`playersMustHaveUniqueNames`**  
  Ensures that every player in a game has a distinct name to avoid ambiguity in UI and rule processing.

- **`gameMustHaveAtLeastOnePlayer`**  
  Prevents creation of a game without players; every valid game must include at least one participant.

---

### **Board constraints**

- **`tilePositionsMustBeUnique`**  
  Ensures that no two `TilePlacement` instances occupy the same `(row, column)` coordinate within a board.

- **`boardDimensionsMustBePositive`**  
  Validates that both `width` and `height` are greater than zero, preventing invalid board sizes.

- **`tilesInsideBoardBounds`**  
  Ensures that all `TilePlacement` coordinates lie within the board's width and height.

- **`boardMustBelongToGame`**  
  Ensures every board is associated with exactly one game, preventing orphaned boards.

---

### **Tile constraints**

- **`tileMustHaveInitialState`**  
  Validates that each tile defines exactly one `initialState`, ensuring a deterministic starting point.

- **`stateNamesUniqueWithinTile`**  
  Ensures all states within a tile have unique names, preventing ambiguity when transitions reference them.

---

### **TilePlacement constraints**

- **`tilePlacementMustBelongToBoard`**  
  Ensures each `TilePlacement` is contained within a `Board`.

- **`rowAndColumnMustBeNonNegative`**  
  Ensures `row` and `column` coordinates are never negative.

- **`rowAndColumnMustBeWithinBoardBounds`**  
  Verifies that the placement's coordinates fit inside the board dimensions.

- **`tileMustBeSet`**  
  Ensures that every `TilePlacement` references a valid `Tile` (no empty placements).

---

### **State machine constraints**

- **`allStatesMustBeReachable`**  
  Ensures every state inside a tile can be reached from the tile's `initialState`.

- **`transitionMustStayWithinTile`**  
  Validates that all transition source and target states belong to the same tile, preventing cross-tile transitions.

- **`stateHexColourMustBeValid`**  
  Confirms that the `hexColor` attribute follows the `#RRGGBB` pattern.

---

### **Pipeline constraints**

- **`legalPipelineMustBeValidChain`**  
  Ensures the legal-moves pipeline forms a properly linked, acyclic chain of filters.

- **`effectPipelineMustBeValidChain`**  
  Same as above, but applied to the effect pipeline; ensures effects execute in the intended order.

---

## Derived Attributes

- Implemented in the generated `*Impl` classes using Java (`@generated NOT` getters).
- All derived attributes in the Ecore model are declared with:
  - `derived = true`
  - `volatile = true`
  - `changeable = false`

  This ensures they are computed dynamically and never stored in the underlying model.

---

### **Board derived attribute**

- **`/size`**  
  Computes the total number of addressable cells on the board using `width * height`.  

---

### **TilePlacement derived attributes**

- **`/darker`**  
  Determines whether the tile position should be visually rendered as a dark-colored square on checkered boards.  
  Computed using `(row + column) % 2 == 1` when `Board.checkered` is enabled.

---

### Game Logic Flow Deep Dive

1. `LegalMovesPipeline` identifies allowed tiles.  
2. User selects a tile.  
3. `EffectPipeline` applies the tile's effects:
   - state transition
   - flips (if applicable)
   - gravity (if applicable)
   - win checking
   - turn switching  
4. Game updates model state.  
5. Everything remains model-driven - the engine interprets the model and executes pipelines/filters/transition logic.

---

## Example Game: Connect 4

- **Board**
  - `width = 7`
  - `height = 6`

- **States**
  - `empty`
  - `red`
  - `yellow`

- **Transitions**
  - `empty → red`
  - `empty → yellow`

- **LegalMovesPipeline**
  - `PatternFilter`

- **EffectPipeline**
  - `StateEffectFilter` → `WinConditionFilter`

---

## Example Game: Othello

- **States**
  - `empty`
  - `black`
  - `white`

- **Transitions**
  - `empty → white`
  - `empty → black`
  - `white → black`
  - `black → white`

- **LegalMovesPipeline**
  - `IterativeFilter`

- **EffectPipeline**
  - `IterativeFilter` → `StateEffectFilter`

---
