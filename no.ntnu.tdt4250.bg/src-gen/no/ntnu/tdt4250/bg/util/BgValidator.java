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
		case BgPackage.TURN_POLICY:
			return validateTurnPolicy((TurnPolicy) value, diagnostics, context);
		case BgPackage.LEGAL_MOVES_PIPELINE:
			return validateLegalMovesPipeline((LegalMovesPipeline) value, diagnostics, context);
		case BgPackage.EFFECT_PIPELINE:
			return validateEffectPipeline((EffectPipeline) value, diagnostics, context);
		case BgPackage.FILTER:
			return validateFilter((Filter) value, diagnostics, context);
		case BgPackage.SOME_FILTER1:
			return validateSomeFilter1((SomeFilter1) value, diagnostics, context);
		case BgPackage.SOME_FILTER2:
			return validateSomeFilter2((SomeFilter2) value, diagnostics, context);
		case BgPackage.TILE:
			return validateTile((Tile) value, diagnostics, context);
		case BgPackage.STATE:
			return validateState((State) value, diagnostics, context);
		case BgPackage.TRANSITION:
			return validateTransition((Transition) value, diagnostics, context);
		case BgPackage.TILE_PLACEMENT:
			return validateTilePlacement((TilePlacement) value, diagnostics, context);
		case BgPackage.TURN_TYPE:
			return validateTurnType((TurnType) value, diagnostics, context);
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

			String id = t.getRow() + "," + t.getColumn();

			if (!positions.add(id)) {
				if (diagnostics != null) {
					diagnostics.add(
							createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "Duplicate tile position: " + id,
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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
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
	public boolean validateTurnPolicy(TurnPolicy turnPolicy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(turnPolicy, diagnostics, context);
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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

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

		// No cycle found — chain is valid
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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
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
	public boolean validateSomeFilter1(SomeFilter1 someFilter1, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(someFilter1, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(someFilter1, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(someFilter1, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(someFilter1, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(someFilter1, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(someFilter1, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(someFilter1, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(someFilter1, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(someFilter1, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFilter_filterMustBelongToGame(someFilter1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSomeFilter2(SomeFilter2 someFilter2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(someFilter2, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(someFilter2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(someFilter2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(someFilter2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(someFilter2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(someFilter2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(someFilter2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(someFilter2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(someFilter2, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFilter_filterMustBelongToGame(someFilter2, diagnostics, context);
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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

		State initial = tile.getInitialState();
		Set<State> visited = new HashSet<>();
		Queue<State> queue = new LinkedList<>();
		queue.add(initial);
		visited.add(initial);

		while (!queue.isEmpty()) {
			State current = queue.poll();
			EList<Transition> t = current.getOutbound(); // single outbound transition
			for (Transition trans : t) {
				State s = trans.getTarget();
				if (s != null && !visited.contains(s)) {
					visited.add(s);
					queue.add(s);
				}
			}
		}

		// Check if all states are visited
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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

		boolean allWellFormed = true;

		Set<State> tileStates = new HashSet<>(tile.getStates());

		for (State state : tile.getStates()) {
			EList<Transition> t = state.getOutbound(); // single outbound transition
			for (Transition trans : t) {
				State source = trans.getSource().getFirst();
				State target = trans.getTarget();

				// Rule 4: Transition must be fully defined
				if (source == null || target == null) {
					allWellFormed = false;
					break;
				}

				// Rule 1 & 2: Source and target must belong to the same tile
				if (!tileStates.contains(source) || !tileStates.contains(target)) {
					allWellFormed = false;
					break;
				}

				// Optional extra: ensure the source is the current state
				if (source != state) {
					allWellFormed = false;
					break;
				}
			} //else { // TODO FIX PLS
				// Rule 4: Transition missing entirely
				//allWellFormed = false;
				//break;
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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

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
			result &= validateState_stateMachineMustBeDeterministic(state, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateState_stateHexColorMustBeValid(state, diagnostics, context);
		return result;
	}

	/**
	 * Validates the stateMachineMustBeDeterministic constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState_stateMachineMustBeDeterministic(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "stateMachineMustBeDeterministic", getObjectLabel(state, context) },
								new Object[] { state }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the stateHexColorMustBeValid constraint of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateState_stateHexColorMustBeValid(State state, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
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
		if (result || diagnostics != null)
			result &= validateTransition_transitionMustBelongToTile(transition, diagnostics, context);
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
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

		State source = transition.getSource().getFirst();
		State target = transition.getTarget();

		if (source == null || target == null) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "transitionMustStayWithinTile: source or target is null",
										getObjectLabel(transition, context) },
								new Object[] { transition }, context));
			}
			return false;
		}

		// Traverse containment to find the Tile of each state
		Tile sourceTile = (Tile) source.eContainer();
		Tile targetTile = (Tile) target.eContainer();

		boolean staysWithinTile = sourceTile != null && sourceTile == targetTile;

		if (!staysWithinTile) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "transitionMustStayWithinTile", getObjectLabel(transition, context) },
								new Object[] { transition }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the transitionMustBelongToTile constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTransition_transitionMustBelongToTile(Transition transition, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT

		State source = transition.getSource().getFirst();
		State target = transition.getTarget();

		if (source == null || target == null) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "transitionMustBelongToTile: source or target is null",
										getObjectLabel(transition, context) },
								new Object[] { transition }, context));
			}
			return false;
		}

		// The tile containing the source (and target)
		Tile sourceTile = (Tile) source.eContainer();
		Tile targetTile = (Tile) target.eContainer();

		boolean belongsToTile = sourceTile != null && sourceTile == targetTile;

		if (!belongsToTile) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "transitionMustBelongToTile", getObjectLabel(transition, context) },
								new Object[] { transition }, context));
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
	public boolean validateTilePlacement(TilePlacement tilePlacement, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tilePlacement, diagnostics, context);
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
