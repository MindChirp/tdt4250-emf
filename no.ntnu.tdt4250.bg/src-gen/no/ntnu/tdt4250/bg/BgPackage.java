/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.bg.BgFactory
 * @model kind="package"
 * @generated
 */
public interface BgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bg";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bg";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bg";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BgPackage eINSTANCE = no.ntnu.tdt4250.bg.impl.BgPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.GameImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__BOARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NAME = 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = 2;

	/**
	 * The feature id for the '<em><b>Turn Policy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__TURN_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Initial Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__INITIAL_PLAYER = 4;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.BoardImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__TILES = 1;

	/**
	 * The feature id for the '<em><b>Legal Moves Pipeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__LEGAL_MOVES_PIPELINE = 2;

	/**
	 * The feature id for the '<em><b>Effect Pipeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__EFFECT_PIPELINE = 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Checkered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__CHECKERED = 5;

	/**
	 * The feature id for the '<em><b>Tileplacement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__TILEPLACEMENT = 6;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__SIZE = 7;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.PlayerImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Hex Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__HEX_COLOR = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.TurnPolicyImpl <em>Turn Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.TurnPolicyImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTurnPolicy()
	 * @generated
	 */
	int TURN_POLICY = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_POLICY__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Turn Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_POLICY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Turn Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.LegalMovesPipelineImpl <em>Legal Moves Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.LegalMovesPipelineImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getLegalMovesPipeline()
	 * @generated
	 */
	int LEGAL_MOVES_PIPELINE = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_MOVES_PIPELINE__FILTER = 0;

	/**
	 * The number of structural features of the '<em>Legal Moves Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_MOVES_PIPELINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Legal Moves Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_MOVES_PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.EffectPipelineImpl <em>Effect Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.EffectPipelineImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getEffectPipeline()
	 * @generated
	 */
	int EFFECT_PIPELINE = 5;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_PIPELINE__FILTER = 0;

	/**
	 * The number of structural features of the '<em>Effect Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_PIPELINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Effect Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.FilterImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 6;

	/**
	 * The feature id for the '<em><b>Next Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NEXT_FILTER = 0;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.SomeFilter1Impl <em>Some Filter1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.SomeFilter1Impl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getSomeFilter1()
	 * @generated
	 */
	int SOME_FILTER1 = 7;

	/**
	 * The feature id for the '<em><b>Next Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_FILTER1__NEXT_FILTER = FILTER__NEXT_FILTER;

	/**
	 * The number of structural features of the '<em>Some Filter1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_FILTER1_FEATURE_COUNT = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Some Filter1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_FILTER1_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.SomeFilter2Impl <em>Some Filter2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.SomeFilter2Impl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getSomeFilter2()
	 * @generated
	 */
	int SOME_FILTER2 = 8;

	/**
	 * The feature id for the '<em><b>Next Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_FILTER2__NEXT_FILTER = FILTER__NEXT_FILTER;

	/**
	 * The number of structural features of the '<em>Some Filter2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_FILTER2_FEATURE_COUNT = FILTER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Some Filter2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOME_FILTER2_OPERATION_COUNT = FILTER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.TileImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTile()
	 * @generated
	 */
	int TILE = 9;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__STATES = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__INITIAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.StateImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getState()
	 * @generated
	 */
	int STATE = 10;

	/**
	 * The feature id for the '<em><b>Outbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTBOUND = 0;

	/**
	 * The feature id for the '<em><b>Inbound</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INBOUND = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Hex Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HEX_COLOR = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.TransitionImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.impl.TilePlacementImpl <em>Tile Placement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.impl.TilePlacementImpl
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTilePlacement()
	 * @generated
	 */
	int TILE_PLACEMENT = 12;

	/**
	 * The feature id for the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PLACEMENT__ROW = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PLACEMENT__COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PLACEMENT__TILE = 2;

	/**
	 * The feature id for the '<em><b>Darker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PLACEMENT__DARKER = 3;

	/**
	 * The feature id for the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PLACEMENT__COORDINATE = 4;

	/**
	 * The number of structural features of the '<em>Tile Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PLACEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tile Placement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_PLACEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.bg.TurnType <em>Turn Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.bg.TurnType
	 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTurnType()
	 * @generated
	 */
	int TURN_TYPE = 13;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see no.ntnu.tdt4250.bg.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.bg.Game#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see no.ntnu.tdt4250.bg.Game#getBoard()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Board();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Game#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.bg.Game#getName()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.bg.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.ntnu.tdt4250.bg.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.bg.Game#getTurnPolicy <em>Turn Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Turn Policy</em>'.
	 * @see no.ntnu.tdt4250.bg.Game#getTurnPolicy()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_TurnPolicy();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.bg.Game#getInitialPlayer <em>Initial Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial Player</em>'.
	 * @see no.ntnu.tdt4250.bg.Game#getInitialPlayer()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_InitialPlayer();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see no.ntnu.tdt4250.bg.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Board#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see no.ntnu.tdt4250.bg.Board#getWidth()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Width();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.bg.Board#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see no.ntnu.tdt4250.bg.Board#getTiles()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Tiles();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.bg.Board#getLegalMovesPipeline <em>Legal Moves Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Legal Moves Pipeline</em>'.
	 * @see no.ntnu.tdt4250.bg.Board#getLegalMovesPipeline()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_LegalMovesPipeline();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.bg.Board#getEffectPipeline <em>Effect Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect Pipeline</em>'.
	 * @see no.ntnu.tdt4250.bg.Board#getEffectPipeline()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_EffectPipeline();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Board#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see no.ntnu.tdt4250.bg.Board#getHeight()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Height();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Board#isCheckered <em>Checkered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checkered</em>'.
	 * @see no.ntnu.tdt4250.bg.Board#isCheckered()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Checkered();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.bg.Board#getTileplacement <em>Tileplacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tileplacement</em>'.
	 * @see no.ntnu.tdt4250.bg.Board#getTileplacement()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Tileplacement();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Board#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see no.ntnu.tdt4250.bg.Board#getSize()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Size();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.ntnu.tdt4250.bg.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.bg.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Player#getHexColor <em>Hex Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hex Color</em>'.
	 * @see no.ntnu.tdt4250.bg.Player#getHexColor()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_HexColor();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.TurnPolicy <em>Turn Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Policy</em>'.
	 * @see no.ntnu.tdt4250.bg.TurnPolicy
	 * @generated
	 */
	EClass getTurnPolicy();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.TurnPolicy#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see no.ntnu.tdt4250.bg.TurnPolicy#getType()
	 * @see #getTurnPolicy()
	 * @generated
	 */
	EAttribute getTurnPolicy_Type();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.LegalMovesPipeline <em>Legal Moves Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Moves Pipeline</em>'.
	 * @see no.ntnu.tdt4250.bg.LegalMovesPipeline
	 * @generated
	 */
	EClass getLegalMovesPipeline();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.bg.LegalMovesPipeline#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see no.ntnu.tdt4250.bg.LegalMovesPipeline#getFilter()
	 * @see #getLegalMovesPipeline()
	 * @generated
	 */
	EReference getLegalMovesPipeline_Filter();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.EffectPipeline <em>Effect Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect Pipeline</em>'.
	 * @see no.ntnu.tdt4250.bg.EffectPipeline
	 * @generated
	 */
	EClass getEffectPipeline();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.bg.EffectPipeline#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see no.ntnu.tdt4250.bg.EffectPipeline#getFilter()
	 * @see #getEffectPipeline()
	 * @generated
	 */
	EReference getEffectPipeline_Filter();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see no.ntnu.tdt4250.bg.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.bg.Filter#getNextFilter <em>Next Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next Filter</em>'.
	 * @see no.ntnu.tdt4250.bg.Filter#getNextFilter()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_NextFilter();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.SomeFilter1 <em>Some Filter1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Filter1</em>'.
	 * @see no.ntnu.tdt4250.bg.SomeFilter1
	 * @generated
	 */
	EClass getSomeFilter1();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.SomeFilter2 <em>Some Filter2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Some Filter2</em>'.
	 * @see no.ntnu.tdt4250.bg.SomeFilter2
	 * @generated
	 */
	EClass getSomeFilter2();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see no.ntnu.tdt4250.bg.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.bg.Tile#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see no.ntnu.tdt4250.bg.Tile#getStates()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_States();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.bg.Tile#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see no.ntnu.tdt4250.bg.Tile#getTransitions()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Transitions();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.bg.Tile#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial State</em>'.
	 * @see no.ntnu.tdt4250.bg.Tile#getInitialState()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_InitialState();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Tile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see no.ntnu.tdt4250.bg.Tile#getType()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Type();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see no.ntnu.tdt4250.bg.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.bg.State#getOutbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outbound</em>'.
	 * @see no.ntnu.tdt4250.bg.State#getOutbound()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outbound();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.bg.State#getInbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inbound</em>'.
	 * @see no.ntnu.tdt4250.bg.State#getInbound()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Inbound();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.bg.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.State#getHexColor <em>Hex Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hex Color</em>'.
	 * @see no.ntnu.tdt4250.bg.State#getHexColor()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_HexColor();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see no.ntnu.tdt4250.bg.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.bg.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Source</em>'.
	 * @see no.ntnu.tdt4250.bg.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.bg.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see no.ntnu.tdt4250.bg.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.bg.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.bg.TilePlacement <em>Tile Placement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile Placement</em>'.
	 * @see no.ntnu.tdt4250.bg.TilePlacement
	 * @generated
	 */
	EClass getTilePlacement();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.TilePlacement#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Row</em>'.
	 * @see no.ntnu.tdt4250.bg.TilePlacement#getRow()
	 * @see #getTilePlacement()
	 * @generated
	 */
	EAttribute getTilePlacement_Row();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.TilePlacement#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Column</em>'.
	 * @see no.ntnu.tdt4250.bg.TilePlacement#getColumn()
	 * @see #getTilePlacement()
	 * @generated
	 */
	EAttribute getTilePlacement_Column();

	/**
	 * Returns the meta object for the reference '{@link no.ntnu.tdt4250.bg.TilePlacement#getTile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tile</em>'.
	 * @see no.ntnu.tdt4250.bg.TilePlacement#getTile()
	 * @see #getTilePlacement()
	 * @generated
	 */
	EReference getTilePlacement_Tile();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.TilePlacement#isDarker <em>Darker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Darker</em>'.
	 * @see no.ntnu.tdt4250.bg.TilePlacement#isDarker()
	 * @see #getTilePlacement()
	 * @generated
	 */
	EAttribute getTilePlacement_Darker();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.bg.TilePlacement#getCoordinate <em>Coordinate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coordinate</em>'.
	 * @see no.ntnu.tdt4250.bg.TilePlacement#getCoordinate()
	 * @see #getTilePlacement()
	 * @generated
	 */
	EAttribute getTilePlacement_Coordinate();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.bg.TurnType <em>Turn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Turn Type</em>'.
	 * @see no.ntnu.tdt4250.bg.TurnType
	 * @generated
	 */
	EEnum getTurnType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BgFactory getBgFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.GameImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__BOARD = eINSTANCE.getGame_Board();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NAME = eINSTANCE.getGame_Name();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>Turn Policy</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__TURN_POLICY = eINSTANCE.getGame_TurnPolicy();

		/**
		 * The meta object literal for the '<em><b>Initial Player</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__INITIAL_PLAYER = eINSTANCE.getGame_InitialPlayer();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.BoardImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__WIDTH = eINSTANCE.getBoard_Width();

		/**
		 * The meta object literal for the '<em><b>Tiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__TILES = eINSTANCE.getBoard_Tiles();

		/**
		 * The meta object literal for the '<em><b>Legal Moves Pipeline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__LEGAL_MOVES_PIPELINE = eINSTANCE.getBoard_LegalMovesPipeline();

		/**
		 * The meta object literal for the '<em><b>Effect Pipeline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__EFFECT_PIPELINE = eINSTANCE.getBoard_EffectPipeline();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__HEIGHT = eINSTANCE.getBoard_Height();

		/**
		 * The meta object literal for the '<em><b>Checkered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__CHECKERED = eINSTANCE.getBoard_Checkered();

		/**
		 * The meta object literal for the '<em><b>Tileplacement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__TILEPLACEMENT = eINSTANCE.getBoard_Tileplacement();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__SIZE = eINSTANCE.getBoard_Size();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.PlayerImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Hex Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__HEX_COLOR = eINSTANCE.getPlayer_HexColor();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.TurnPolicyImpl <em>Turn Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.TurnPolicyImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTurnPolicy()
		 * @generated
		 */
		EClass TURN_POLICY = eINSTANCE.getTurnPolicy();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_POLICY__TYPE = eINSTANCE.getTurnPolicy_Type();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.LegalMovesPipelineImpl <em>Legal Moves Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.LegalMovesPipelineImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getLegalMovesPipeline()
		 * @generated
		 */
		EClass LEGAL_MOVES_PIPELINE = eINSTANCE.getLegalMovesPipeline();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_MOVES_PIPELINE__FILTER = eINSTANCE.getLegalMovesPipeline_Filter();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.EffectPipelineImpl <em>Effect Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.EffectPipelineImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getEffectPipeline()
		 * @generated
		 */
		EClass EFFECT_PIPELINE = eINSTANCE.getEffectPipeline();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT_PIPELINE__FILTER = eINSTANCE.getEffectPipeline_Filter();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.FilterImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Next Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__NEXT_FILTER = eINSTANCE.getFilter_NextFilter();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.SomeFilter1Impl <em>Some Filter1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.SomeFilter1Impl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getSomeFilter1()
		 * @generated
		 */
		EClass SOME_FILTER1 = eINSTANCE.getSomeFilter1();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.SomeFilter2Impl <em>Some Filter2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.SomeFilter2Impl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getSomeFilter2()
		 * @generated
		 */
		EClass SOME_FILTER2 = eINSTANCE.getSomeFilter2();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.TileImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__STATES = eINSTANCE.getTile_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__TRANSITIONS = eINSTANCE.getTile_Transitions();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__INITIAL_STATE = eINSTANCE.getTile_InitialState();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TYPE = eINSTANCE.getTile_Type();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.StateImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Outbound</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTBOUND = eINSTANCE.getState_Outbound();

		/**
		 * The meta object literal for the '<em><b>Inbound</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INBOUND = eINSTANCE.getState_Inbound();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Hex Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__HEX_COLOR = eINSTANCE.getState_HexColor();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.TransitionImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.impl.TilePlacementImpl <em>Tile Placement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.impl.TilePlacementImpl
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTilePlacement()
		 * @generated
		 */
		EClass TILE_PLACEMENT = eINSTANCE.getTilePlacement();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE_PLACEMENT__ROW = eINSTANCE.getTilePlacement_Row();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE_PLACEMENT__COLUMN = eINSTANCE.getTilePlacement_Column();

		/**
		 * The meta object literal for the '<em><b>Tile</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE_PLACEMENT__TILE = eINSTANCE.getTilePlacement_Tile();

		/**
		 * The meta object literal for the '<em><b>Darker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE_PLACEMENT__DARKER = eINSTANCE.getTilePlacement_Darker();

		/**
		 * The meta object literal for the '<em><b>Coordinate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE_PLACEMENT__COORDINATE = eINSTANCE.getTilePlacement_Coordinate();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.bg.TurnType <em>Turn Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.bg.TurnType
		 * @see no.ntnu.tdt4250.bg.impl.BgPackageImpl#getTurnType()
		 * @generated
		 */
		EEnum TURN_TYPE = eINSTANCE.getTurnType();

	}

} //BgPackage
