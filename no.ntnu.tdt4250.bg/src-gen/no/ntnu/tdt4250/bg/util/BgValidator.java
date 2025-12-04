/**
 */
package no.ntnu.tdt4250.bg.util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import no.ntnu.tdt4250.bg.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.bg.BgPackage
 * @generated
 */
public class BgValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BgValidator INSTANCE = new BgValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.bg";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BgValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return BgPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case BgPackage.GAME:
			return validateGame((Game) value, diagnostics, context);
		case BgPackage.BOARD:
			return validateBoard((Board) value, diagnostics, context);
		case BgPackage.PLAYER:
			return validatePlayer((Player) value, diagnostics, context);
		case BgPackage.LEGAL_MOVES_PIPELINE:
			return validateLegalMovesPipeline((LegalMovesPipeline) value, diagnostics, context);
		case BgPackage.EFFECT_PIPELINE:
			return validateEffectPipeline((EffectPipeline) value, diagnostics, context);
		case BgPackage.FILTER:
			return validateFilter((Filter) value, diagnostics, context);
		case BgPackage.PATTERN_FILTER:
			return validatePatternFilter((PatternFilter) value, diagnostics, context);
		case BgPackage.TILE:
			return validateTile((Tile) value, diagnostics, context);
		case BgPackage.STATE:
			return validateState((State) value, diagnostics, context);
		case BgPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case BgPackage.TILE_PLACEMENT:
			return validateTilePlacement((TilePlacement) value, diagnostics, context);
		case BgPackage.PATTERN:
			return validatePattern((Pattern) value, diagnostics, context);
		case BgPackage.RELATIVE_COORDINATE:
			return validateRelativeCoordinate((RelativeCoordinate) value, diagnostics, context);
		case BgPackage.TURN_TYPE:
			return validateTurnType((TurnType) value, diagnostics, context);
		case BgPackage.STATE_SELECTION:
			return validateStateSelection((StateSelection) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(game, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGame_playersMustHaveUniqueHexColors(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGame_playersMustHaveUniqueNames(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGame_gameMustHaveAtLeastOnePlayer(game, diagnostics, context);
		return result;
	}

	/**
	 * Validates the playersMustHaveUniqueHexColors constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_playersMustHaveUniqueHexColors(Game game, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		Set<String> seenColors = new HashSet<>();
		boolean valid = true;

		for (Player p : game.getPlayers()) {

			String color = p.getHexColor();

			// Duplicate color found
			if (!seenColors.add(color.toLowerCase())) {
				valid = false;

				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "Duplicate player color: " + color,
									new Object[] { "playersMustHaveUniqueHexColors", getObjectLabel(game, context) },
									new Object[] { p }, context));
				}
			}
		}

		return valid;
	}

	/**
	 * Validates the playersMustHaveUniqueNames constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_playersMustHaveUniqueNames(Game game, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		//Name can't be null or empty due to lower & upper boundary set in ECore model i think, so no need to check for this (?)
		Set<String> seenNames = new HashSet<>();
		boolean valid = true;

		for (Player p : game.getPlayers()) {

			String name = p.getName();

			// Duplicate name
			if (!seenNames.add(name.toLowerCase())) {
				valid = false;

				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "Duplicate player name: " + name,
									new Object[] { "playersMustHaveUniqueNames", getObjectLabel(game, context) },
									new Object[] { p }, context));
				}
			}
		}

		return valid;
	}

	/**
	 * Validates the gameMustHaveAtLeastOnePlayer constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_gameMustHaveAtLeastOnePlayer(Game game, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (game.getPlayers().isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "gameMustHaveAtLeastOnePlayer", getObjectLabel(game, context) },
								new Object[] { game }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoard(Board board, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(board, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoard_boardDimensionsMustBePositive(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoard_tilePositionsMustBeUnique(board, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateBoard_boardMustBelongToGame(board, diagnostics, context);
		return result;
	}

	/**
	 * Validates the boardDimensionsMustBePositive constraint of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoard_boardDimensionsMustBePositive(Board board, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (board.getHeight() <= 0 || board.getWidth() <= 0) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "boardDimensionsMustBePositive", getObjectLabel(board, context) },
								new Object[] { board }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tilePositionsMustBeUnique constraint of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoard_tilePositionsMustBeUnique(Board board, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Set<String> positions = new HashSet<>();

		for (TilePlacement t : board.getTileplacement()) {

			String coordinate = t.getCoordinate();

			if (!positions.add(coordinate)) {
				if (diagnostics != null) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
							"Duplicate tile position: " + coordinate,
							new Object[] { "tilePositionsMustBeUnique", getObjectLabel(board, context) },
							new Object[] { t }, context));
				}
				return false;
			}
		}
		return true;
	}

	/**
	 * Validates the boardMustBelongToGame constraint of '<em>Board</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateBoard_boardMustBelongToGame(Board board, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (!(board.eContainer() instanceof Game)) {

			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "Board must be contained in a Game",
								new Object[] { "boardMustBelongToGame", getObjectLabel(board, context) },
								new Object[] { board }, context));
			}

			return false;
		}

		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(player, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlayer_playerHexColorMustBeValid(player, diagnostics, context);
		return result;
	}

	/**
	 * Validates the playerHexColorMustBeValid constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlayer_playerHexColorMustBeValid(Player player, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		String playerHex = player.getHexColor();
		boolean isValidHex = (playerHex != null) && (playerHex.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$"));

		if (!isValidHex) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "playerHexColorMustBeValid", getObjectLabel(player, context) },
								new Object[] { player }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegalMovesPipeline(LegalMovesPipeline legalMovesPipeline, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(legalMovesPipeline, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(legalMovesPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(legalMovesPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(legalMovesPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(legalMovesPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(legalMovesPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(legalMovesPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(legalMovesPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(legalMovesPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLegalMovesPipeline_legalMovesPipelineFiltersMustFormValidChain(legalMovesPipeline,
					diagnostics, context);
		return result;
	}

	/**
	 * Validates the legalMovesPipelineFiltersMustFromValidChain constraint of '<em>Legal Moves Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateLegalMovesPipeline_legalMovesPipelineFiltersMustFormValidChain(
			LegalMovesPipeline legalMovesPipeline, DiagnosticChain diagnostics, Map<Object, Object> context) {

		Filter startFilter = legalMovesPipeline.getFilter();
		boolean isValidChain = isValidFilterChain(startFilter);

		if (!isValidChain) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "legalMovesPipelineFiltersMustFromValidChain",
										getObjectLabel(legalMovesPipeline, context) },
								new Object[] { legalMovesPipeline }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEffectPipeline(EffectPipeline effectPipeline, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(effectPipeline, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(effectPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(effectPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(effectPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(effectPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(effectPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(effectPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(effectPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(effectPipeline, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEffectPipeline_effectPipelineFiltersMustFormValidChain(effectPipeline, diagnostics,
					context);
		return result;
	}

	/**
	 * Helper function
	 * @generated NOT
	 */
	private boolean isValidFilterChain(Filter start) {
		Filter slow = start;
		Filter fast = start;

		while (fast != null && fast.getNextFilter() != null) {
			slow = slow.getNextFilter();
			fast = fast.getNextFilter().getNextFilter();

			if (slow == fast) {
				// A cycle exists
				return false;
			}
		}

		// No cycle found - chain is valid
		return true;
	}

	/**
	 * Validates the effectPipelineFiltersMustFormValidChain constraint of '<em>Effect Pipeline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEffectPipeline_effectPipelineFiltersMustFormValidChain(EffectPipeline effectPipeline,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		Filter startFilter = effectPipeline.getFilter();
		boolean isValidChain = isValidFilterChain(startFilter);

		if (!isValidChain) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic", new Object[] {
								"effectPipelineFiltersMustFormValidChain", getObjectLabel(effectPipeline, context) },
						new Object[] { effectPipeline }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilter(Filter filter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(filter, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(filter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(filter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(filter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(filter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(filter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(filter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(filter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(filter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFilter_filterMustBelongToGame(filter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the filterMustBelongToGame constraint of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateFilter_filterMustBelongToGame(Filter filter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

		return true;
		/*
		if (!(filter.eContainer().eContainer().eContainer() instanceof Game)) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "filterMustBelongToGame", getObjectLabel(filter, context) },
								new Object[] { filter }, context));
			}
			return false;
		}*/
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternFilter(PatternFilter patternFilter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patternFilter, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(patternFilter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(patternFilter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(patternFilter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(patternFilter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(patternFilter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(patternFilter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(patternFilter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(patternFilter, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFilter_filterMustBelongToGame(patternFilter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTile(Tile tile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tile, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tileMustHaveInitialState(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tileStateNamesMustBeUnique(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_allStatesMustBeReachable(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tileTransitionsMustBeWellFormed(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tilesMustHaveAtLeastOneState(tile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the tileMustHaveInitialState constraint of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTile_tileMustHaveInitialState(Tile tile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean hasInitialState = tile.getInitialState() != null;

		if (!hasInitialState) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "tileMustHaveInitialState", getObjectLabel(tile, context) },
								new Object[] { tile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tileStateNamesMustBeUnique constraint of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTile_tileStateNamesMustBeUnique(Tile tile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Set<String> seenNames = new HashSet<>();
		boolean allUnique = true;

		for (State state : tile.getStates()) {
			String name = state.getName();
			if (name != null && !seenNames.add(name)) {
				allUnique = false;
				break;
			}
		}

		if (!allUnique) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "tileStateNamesMustBeUnique", getObjectLabel(tile, context) },
								new Object[] { tile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the allStatesMustBeReachable constraint of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTile_allStatesMustBeReachable(Tile tile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		State initial = tile.getInitialState();
		Set<State> visited = new HashSet<>();
		Queue<State> queue = new LinkedList<>();
		queue.add(initial);
		visited.add(initial);

		while (!queue.isEmpty()) {
			State current = queue.poll();
			EList<Transition> t = current.getOutbound();
			for (Transition trans : t) {
				State s = trans.getTarget();
				if (s != null && !visited.contains(s)) {
					visited.add(s);
					queue.add(s);
				}
			}
		}

		boolean allReachable = visited.containsAll(tile.getStates());

		if (!allReachable) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "allStatesMustBeReachable", getObjectLabel(tile, context) },
								new Object[] { tile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tileTransitionsMustBeWellFormed constraint of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTile_tileTransitionsMustBeWellFormed(Tile tile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean allWellFormed = true;

		Set<State> tileStates = new HashSet<>(tile.getStates());

		for (State state : tile.getStates()) {

			for (Transition trans : state.getOutbound()) {

				if (!tileStates.containsAll(trans.getSource()) || !tileStates.contains(trans.getTarget())) {

					allWellFormed = false;
					break;
				}

				if (!trans.getSource().contains(state)) {
					allWellFormed = false;
					break;
				}

				if (trans.getTarget() == null) {
					allWellFormed = false;
					break;
				}
			}

			if (!allWellFormed)
				break;
		}

		if (!allWellFormed) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "tileTransitionsMustBeWellFormed", getObjectLabel(tile, context) },
								new Object[] { tile }, context));
			}
			return false;
		}

		return true;
	}

	/**
	 * Validates the tilesMustHaveAtLeastOneState constraint of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTile_tilesMustHaveAtLeastOneState(Tile tile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if ((tile.getStates().isEmpty())) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "tilesMustHaveAtLeastOneState", getObjectLabel(tile, context) },
								new Object[] { tile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(state, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_stateHexColorMustBeValid(state, diagnostics, context);
		return result;
	}

	/**
	 * Validates the stateHexColorMustBeValid constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateState_stateHexColorMustBeValid(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		String playerHex = state.getHexColor();
		boolean isValidHex = playerHex != null && playerHex.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");

		if (!isValidHex) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "stateHexColorMustBeValid", getObjectLabel(state, context) },
								new Object[] { state }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTransition_transitionMustStayWithinTile(transition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the transitionMustStayWithinTile constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTransition_transitionMustStayWithinTile(Transition transition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		State target = transition.getTarget();
		if (target == null) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"transitionMustStayWithinTile: target is null", getObjectLabel(transition, context) },
						new Object[] { transition }, context));
			}
			return false;
		}

		Tile targetTile = (Tile) target.eContainer();
		if (targetTile == null) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "transitionMustStayWithinTile: target is not contained in a Tile",
										getObjectLabel(transition, context) },
								new Object[] { transition }, context));
			}
			return false;
		}

		EList<State> sources = transition.getSource();
		if (sources == null || sources.isEmpty()) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "transitionMustStayWithinTile: no sources declared",
										getObjectLabel(transition, context) },
								new Object[] { transition }, context));
			}
			return false;
		}

		for (State source : sources) {
			if (source == null) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
									new Object[] { "transitionMustStayWithinTile: a source is null",
											getObjectLabel(transition, context) },
									new Object[] { transition }, context));
				}
				return false;
			}

			Tile sourceTile = (Tile) source.eContainer();
			if (sourceTile == null || sourceTile != targetTile) {
				if (diagnostics != null) {
					diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
							"_UI_GenericConstraint_diagnostic",
							new Object[] { "transitionMustStayWithinTile", getObjectLabel(transition, context) },
							new Object[] { transition }, context));
				}
				return false;
			}
		}

		// all sources and target live in the same tile
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTilePlacement(TilePlacement tilePlacement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tilePlacement, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTilePlacement_rowAndColumnMustBeNonNegative(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTilePlacement_tilePlacementMustBelongToBoard(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTilePlacement_rowAndColumnMustBeWithinBoardBounds(tilePlacement, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTilePlacement_tileMustBeSet(tilePlacement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the rowAndColumnMustBeNonNegative constraint of '<em>Tile Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTilePlacement_rowAndColumnMustBeNonNegative(TilePlacement tilePlacement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (tilePlacement.getColumn() < 0 || tilePlacement.getRow() < 0) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "rowAndColumnMustBeNonNegative", getObjectLabel(tilePlacement, context) },
						new Object[] { tilePlacement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tilePlacementMustBelongToBoard constraint of '<em>Tile Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTilePlacement_tilePlacementMustBelongToBoard(TilePlacement tilePlacement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (!(tilePlacement.eContainer() instanceof Board)) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "tilePlacementMustBelongToBoard", getObjectLabel(tilePlacement, context) },
						new Object[] { tilePlacement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the rowAndColumnMustBeWithinBoardBounds constraint of '<em>Tile Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTilePlacement_rowAndColumnMustBeWithinBoardBounds(TilePlacement tilePlacement,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		EObject container = tilePlacement.eContainer();
		if (!(container instanceof Board)) {
			// this is checked in another constraint, so we just return true
			return true;
		}

		Board board = (Board) container;

		int row = tilePlacement.getRow();
		int col = tilePlacement.getColumn();

		boolean inBounds = row >= 0 && col >= 0 && row < board.getHeight() && col < board.getWidth();
		if (!inBounds) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "rowAndColumnMustBeWithinBoardBounds", getObjectLabel(tilePlacement, context) },
						new Object[] { tilePlacement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tileMustBeSet constraint of '<em>Tile Placement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTilePlacement_tileMustBeSet(TilePlacement tilePlacement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Tile tile = tilePlacement.getTile();

		if (tile == null) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "tileMustBeSet", getObjectLabel(tilePlacement, context) },
								new Object[] { tilePlacement }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePattern(Pattern pattern, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pattern, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pattern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pattern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pattern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pattern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pattern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pattern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pattern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pattern, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePattern_matchStateDefined(pattern, diagnostics, context);
		return result;
	}

	/**
	 * Validates the matchStateDefined constraint of '<em>Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePattern_matchStateDefined(Pattern pattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		boolean isLegal = true;

		if (pattern.getStateSelection().getLiteral() == (StateSelection.STATE_BASED).getLiteral()) {
			isLegal = (pattern.getMatchState() != null);
		}

		if (!isLegal) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "matchStateDefined", getObjectLabel(pattern, context) },
								new Object[] { pattern }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelativeCoordinate(RelativeCoordinate relativeCoordinate, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relativeCoordinate, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurnType(TurnType turnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStateSelection(StateSelection stateSelection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BgValidator
