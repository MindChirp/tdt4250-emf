/**
 */
package no.ntnu.tdt4250.bg.impl;

import no.ntnu.tdt4250.bg.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BgFactoryImpl extends EFactoryImpl implements BgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BgFactory init() {
		try {
			BgFactory theBgFactory = (BgFactory) EPackage.Registry.INSTANCE.getEFactory(BgPackage.eNS_URI);
			if (theBgFactory != null) {
				return theBgFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BgPackage.GAME:
			return createGame();
		case BgPackage.BOARD:
			return createBoard();
		case BgPackage.PLAYER:
			return createPlayer();
		case BgPackage.LEGAL_MOVES_PIPELINE:
			return createLegalMovesPipeline();
		case BgPackage.EFFECT_PIPELINE:
			return createEffectPipeline();
		case BgPackage.PATTERN_FILTER:
			return createPatternFilter();
		case BgPackage.TILE:
			return createTile();
		case BgPackage.STATE:
			return createState();
		case BgPackage.TRANSITION:
			return createTransition();
		case BgPackage.TILE_PLACEMENT:
			return createTilePlacement();
		case BgPackage.PATTERN:
			return createPattern();
		case BgPackage.RELATIVE_COORDINATE:
			return createRelativeCoordinate();
		case BgPackage.ITERATIVE_FILTER:
			return createIterativeFilter();
		case BgPackage.STATE_EFFECT_FILTER:
			return createStateEffectFilter();
		case BgPackage.WIN_CONDITION_FILTER:
			return createWinConditionFilter();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BgPackage.TURN_TYPE:
			return createTurnTypeFromString(eDataType, initialValue);
		case BgPackage.STATE_SELECTION:
			return createStateSelectionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BgPackage.TURN_TYPE:
			return convertTurnTypeToString(eDataType, instanceValue);
		case BgPackage.STATE_SELECTION:
			return convertStateSelectionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Game createGame() {
		GameImpl game = new GameImpl();
		return game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board createBoard() {
		BoardImpl board = new BoardImpl();
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LegalMovesPipeline createLegalMovesPipeline() {
		LegalMovesPipelineImpl legalMovesPipeline = new LegalMovesPipelineImpl();
		return legalMovesPipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EffectPipeline createEffectPipeline() {
		EffectPipelineImpl effectPipeline = new EffectPipelineImpl();
		return effectPipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PatternFilter createPatternFilter() {
		PatternFilterImpl patternFilter = new PatternFilterImpl();
		return patternFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile createTile() {
		TileImpl tile = new TileImpl();
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TilePlacement createTilePlacement() {
		TilePlacementImpl tilePlacement = new TilePlacementImpl();
		return tilePlacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern createPattern() {
		PatternImpl pattern = new PatternImpl();
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeCoordinate createRelativeCoordinate() {
		RelativeCoordinateImpl relativeCoordinate = new RelativeCoordinateImpl();
		return relativeCoordinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IterativeFilter createIterativeFilter() {
		IterativeFilterImpl iterativeFilter = new IterativeFilterImpl();
		return iterativeFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateEffectFilter createStateEffectFilter() {
		StateEffectFilterImpl stateEffectFilter = new StateEffectFilterImpl();
		return stateEffectFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WinConditionFilter createWinConditionFilter() {
		WinConditionFilterImpl winConditionFilter = new WinConditionFilterImpl();
		return winConditionFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnType createTurnTypeFromString(EDataType eDataType, String initialValue) {
		TurnType result = TurnType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTurnTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSelection createStateSelectionFromString(EDataType eDataType, String initialValue) {
		StateSelection result = StateSelection.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateSelectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BgPackage getBgPackage() {
		return (BgPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BgPackage getPackage() {
		return BgPackage.eINSTANCE;
	}

} //BgFactoryImpl
