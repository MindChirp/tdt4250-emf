package no.ntnu.tdt4250.bg.bgdsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EStructuralFeature
import java.util.Set
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.common.util.EList
import java.nio.file.Files
import java.nio.file.Paths

class BgDslGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val gameInstance = resource.contents.head as EObject
        val gameEClass = gameInstance.eClass
        
        val allUniqueEClasses = gameInstance.eAllContents.toIterable.map[eClass].toSet
        allUniqueEClasses.add(gameEClass)
        
        if (gameInstance === null) {
            System.err.println("Model resource is empty.")
            return;
        }
        
        // Generate the full Python file content
        val generatedContent = allUniqueEClasses.compileModels(gameInstance)

        // Generate to Xtext standard location
        fsa.generateFile("game.py", generatedContent)
        
        // Optional: specific path writing (uncomment if needed locally)
        /*
        val personalPath = "/Users/andgjers/Development/eclipse-workspace-project/"
        val projectPath = "tdt4250-emf/fastapi-backend/app/generated/"
        val outputFolder = personalPath + projectPath
        val targetDir = Paths.get(outputFolder)
        if (!Files.exists(targetDir)) Files.createDirectories(targetDir)
        val targetFile = targetDir.resolve("game.py")
        Files.writeString(targetFile, generatedContent)
        */
    }
    
    def compileModels(Set<EClass> models, EObject gameInstance)
    '''
    from typing import List, Optional, Any
    from pydantic import BaseModel

    # Base Filter Class
    class Filter(BaseModel):
        nextFilter: Optional["Filter"] = None

    «FOR model : models»
    «IF model.name == "TilePlacement"»
    «ELSE»
    «IF getAllFilterTypes().contains(model.name)»
    class «model.name»(Filter):
    «ELSE»
    class «model.name»(BaseModel):
    «ENDIF»
        «IF model.EAllStructuralFeatures.empty»
        pass
        «ELSE»
            «IF model.name == "Tile"»
                «FOR field : model.EAllStructuralFeatures»
                «field.toPythonFieldDec»
                «ENDFOR»
                activeState: "State"
                row: "int"
                column: "int"
                
                def updateState(self, targetStateName: str):
                    # Logic to update state based on transitions
                    pass

            «ELSEIF model.name == "Board"»
                width: "int"
                height: "int"
                tiles: List["Tile"] = []
                legalMovesPipeline: Optional["LegalMovesPipeline"] = None
                effectPipeline: Optional["EffectPipeline"] = None
                checkered: "bool"
                size: "int"
                legalMoves: List["Tile"] = []
                
            «ELSEIF model.name == "Pattern"»
                name: "str"
                stateSelection: Optional["str"] = None
                matchState: Optional["str"] = None
                relativecoordinates: List["RelativeCoordinate"] = []

            «ELSEIF model.name == "StateEffectFilter"»
                name: "str"
                stateSelection: "str"
                targetState: Optional["str"] = None 

            «ELSEIF model.name == "Player"»
                name: "str"
                hexColor: "str"
                associatedState: "str"

            «ELSE»
                «FOR field : model.EAllStructuralFeatures»
                «field.toPythonFieldDec»
                «ENDFOR»
            «ENDIF»
        «ENDIF»
        
    «ENDIF»
    «ENDFOR»

    # Rebuild models for Pydantic recursion
    «FOR model : models»
    «IF model.name != "TilePlacement"»
    «model.name».model_rebuild()
    «ENDIF»
    «ENDFOR»
    Filter.model_rebuild()

    «initializeValues(gameInstance)»
    '''

    def initializeValues(EObject gameInstance) {
        val boardInstance = gameInstance.getFeature("board") as EObject
        val tileTypes = boardInstance.getFeature("tiles") as EList<EObject>
        val tilePlacements = boardInstance.getFeature("tileplacement") as EList<EObject>
        val players = gameInstance.getFeature("players") as EList<EObject>
        
        // Extract Pipelines
        val legalMovesPipeline = boardInstance.getFeature("legalMovesPipeline") as EObject
        val effectPipeline = boardInstance.getFeature("effectPipeline") as EObject

        '''
        # --- Tile Definitions ---
        «FOR tileType : tileTypes»
        «val tileName = tileType.getFeature("name")»
        «val initState = tileType.getFeature("initialState") as EObject»
        «val initName = initState.getFeature("name")»
        «val initColor = initState.getFeature("hexColor")»
        «val states = tileType.getFeature("states") as EList<EObject>»
        «val transitions = tileType.getFeature("transitions") as EList<EObject>»

        class «tileName»(Tile):
            def __init__(self, row, column):
                # 1. Create Initial State
                state«initName» = State(
                    name="«initName»",
                    hexColor="«initColor»",
                    outbound=[], inbound=[]
                )

                # 2. Create Other States
                «FOR state : states»
                state«state.getFeature("name")» = State(
                    name="«state.getFeature("name")»",
                    hexColor="«state.getFeature("hexColor")»",
                    outbound=[], inbound=[]
                )
                «ENDFOR»
                
                # 3. Create Transitions (Linking objects)
                «FOR transition : transitions»
                «val tName = transition.getFeature("name")»
                «val sources = transition.getFeature("source") as EList<EObject>»
                «val target = transition.getFeature("target") as EObject»
                transition«tName» = Transition(
                    name="«tName»",
                    source=[«FOR src : sources SEPARATOR ", "»state«src.getFeature("name")»«ENDFOR»],
                    target=state«target.getFeature("name")»
                )
                «ENDFOR»

                # 4. Link Transitions to States (Outbound/Inbound wiring)
                «FOR transition : transitions»
                «val tName = transition.getFeature("name")»
                «val sources = transition.getFeature("source") as EList<EObject>»
                «val target = transition.getFeature("target") as EObject»
                # Outbound for «tName»
                «FOR src : sources»
                state«src.getFeature("name")».outbound.append(transition«tName»)
                «ENDFOR»
                # Inbound for «tName»
                state«target.getFeature("name")».inbound.append(transition«tName»)
                
                «ENDFOR»

                super().__init__(
                    states=[
                        «FOR state : states SEPARATOR ", "»state«state.getFeature("name")»«ENDFOR»
                        «IF !states.contains(initState)», state«initName»«ENDIF»
                    ],
                    transitions=[
                        «FOR transition : transitions SEPARATOR ", "»transition«transition.getFeature("name")»«ENDFOR»
                    ],
                    initialState=state«initName»,
                    activeState=state«initName»,
                    tileType="«tileName»",
                    hexColor="«tileType.getFeature("hexColor")»",
                    name="«tileName»",
                    row=row,
                    column=column
                )
        «ENDFOR»

        # --- Instance Initialization ---
        tiles = [
            «FOR placement : tilePlacements SEPARATOR ", "»
            «(placement.getFeature("tile") as EObject).getFeature("name")»(«placement.getFeature("row")», «placement.getFeature("column")»)
            «ENDFOR»
        ]

        players = [
            «FOR player : players SEPARATOR ", "»
            Player(name="«player.getFeature("name")»", hexColor="«player.getFeature("hexColor")»", associatedState="«(player.getFeature("associatedState") as EObject).getFeature("name")»")
            «ENDFOR»
        ]
        
        # --- Pipelines ---
        
        legal_moves_pipeline = «IF legalMovesPipeline !== null»«generatePipelineObject(legalMovesPipeline)»«ELSE»None«ENDIF»
        
        effect_pipeline = «IF effectPipeline !== null»«generatePipelineObject(effectPipeline)»«ELSE»None«ENDIF»

        board = Board(
            width=«boardInstance.getFeature("width")»,
            height=«boardInstance.getFeature("height")»,
            tiles=tiles,
            checkered=«(boardInstance.getFeature("checkered") as Boolean).toPyBool»,
            size=«(boardInstance.getFeature("width") as Integer) * (boardInstance.getFeature("height") as Integer)»,
            legalMovesPipeline=legal_moves_pipeline,
            effectPipeline=effect_pipeline,
            legalMoves=[]
        )

        game = Game(
            board=board,
            players=players,
            activePlayer=players[«players.indexOf(gameInstance.getFeature("initialPlayer"))»],
            name="«gameInstance.getFeature("name")»",
            initialPlayer=players[«players.indexOf(gameInstance.getFeature("initialPlayer"))»],
            turnPolicy="«gameInstance.getFeature("turnPolicy")»"
        )
        '''
    }

    // --- PIPELINE GENERATION DISPATCH METHODS ---

    def generatePipelineObject(EObject pipeline) '''
        «pipeline.eClass.name»(
            filters=[
                «val filters = pipeline.getFeature("filters") as EList<EObject>»
                «FOR filter : filters SEPARATOR ","»
                «generateFilter(filter)»
                «ENDFOR»
            ]
        )
    '''

    /* Dispatch: PatternFilter */
    def dispatch String generateFilter(EObject filter) {
        if (filter.eClass.name == "PatternFilter") {
            val patterns = filter.getFeature("patterns") as EList<EObject>
            val nextFilter = filter.getFeature("nextFilter") as EObject
            '''
            PatternFilter(
                name="«filter.getFeature("name")»",
                patterns=[
                    «FOR p : patterns SEPARATOR ", "»
                    «generatePattern(p)»
                    «ENDFOR»
                ],
                nextFilter=«IF nextFilter !== null»«generateFilter(nextFilter)»«ELSE»None«ENDIF»
            )'''
        } else if (filter.eClass.name == "IterativeFilter") {
            val nextFilter = filter.getFeature("nextFilter") as EObject
            val dirVector = filter.getFeature("directionVector") as EObject
            val matchRule = filter.getFeature("matchRule") as EObject
            val endRule = filter.getFeature("endRule") as EObject
            '''
            IterativeFilter(
                name="«filter.getFeature("name")»",
                directionVector=«generateRelCoord(dirVector)»,
                matchRule=«generatePattern(matchRule)»,
                endRule=«generatePattern(endRule)»,
                nextFilter=«IF nextFilter !== null»«generateFilter(nextFilter)»«ELSE»None«ENDIF»
            )'''
        } else if (filter.eClass.name == "StateEffectFilter") {
            val nextFilter = filter.getFeature("nextFilter") as EObject
            val targetState = filter.getFeature("targetState") as EObject
            '''
            StateEffectFilter(
                name="«filter.getFeature("name")»",
                stateSelection="«filter.getFeature("stateSelection")»",
                targetState=«IF targetState !== null»"«targetState.getFeature("name")»"«ELSE»None«ENDIF»,
                nextFilter=«IF nextFilter !== null»«generateFilter(nextFilter)»«ELSE»None«ENDIF»
            )'''
        } else {
            '''None'''
        }
    }

    def generatePattern(EObject pattern) {
        val coords = pattern.getFeature("relativecoordinates") as EList<EObject>
        val matchState = pattern.getFeature("matchState") as EObject
        '''
        Pattern(
            name="«pattern.getFeature("name")»",
            stateSelection="«pattern.getFeature("stateSelection")»",
            matchState=«IF matchState !== null»"«matchState.getFeature("name")»"«ELSE»None«ENDIF»,
            relativecoordinates=[
                «FOR c : coords SEPARATOR ", "»
                «generateRelCoord(c)»
                «ENDFOR»
            ]
        )
        '''
    }

    def generateRelCoord(EObject coord) '''
        RelativeCoordinate(
            x=«coord.getFeature("x")»,
            y=«coord.getFeature("y")»
        )
    '''

    // --- HELPERS ---

    def getAllFilterTypes() {
        newHashSet("PatternFilter", "IterativeFilter", "StateEffectFilter")
    }

    def getFeature(EObject self, String feature) {
        val es = self.eClass.getEStructuralFeature(feature)
        if (es === null) return null
        return self.eGet(es)
    }

    def toPythonFieldDec(EStructuralFeature field) {
        val typeStr = field.pythonTypeString
        if (field.many) {
            '''«field.name»: List["«typeStr»"] = []'''
        } else {
            if (field.lowerBound == 0) {
                '''«field.name»: Optional["«typeStr»"] = None'''
            } else {
                '''«field.name»: "«typeStr»"'''
            }
        }
    }

    def pythonTypeString(EStructuralFeature field) {
        switch field {
            EAttribute: {
                val icn = field.EAttributeType.instanceClassName
                if (icn == "int" || icn == "java.lang.Integer") "int"
                else if (icn == "boolean" || icn == "java.lang.Boolean") "bool"
                else "str"
            }
            EReference: {
                (field as EReference).EReferenceType.name
            }
            default: "str"
        }
    }
    
    def toPyBool(Boolean b) {
        if (b) "True" else "False"
    }
}