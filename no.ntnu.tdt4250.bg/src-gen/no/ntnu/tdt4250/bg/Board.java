/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.Board#getWidth <em>Width</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Board#getTiles <em>Tiles</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Board#getLegalMovesPipeline <em>Legal Moves Pipeline</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Board#getEffectPipeline <em>Effect Pipeline</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Board#getHeight <em>Height</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Board#isCheckered <em>Checkered</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Board#getTileplacement <em>Tileplacement</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getBoard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='boardDimensionsMustBePositive tilePositionsMustBeUnique boardMustBelongToGame'"
 * @generated
 */
public interface Board extends EObject {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getBoard_Width()
	 * @model required="true"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Board#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getBoard_Tiles()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tile> getTiles();

	/**
	 * Returns the value of the '<em><b>Legal Moves Pipeline</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.LegalMovesPipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legal Moves Pipeline</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getBoard_LegalMovesPipeline()
	 * @model containment="true"
	 * @generated
	 */
	EList<LegalMovesPipeline> getLegalMovesPipeline();

	/**
	 * Returns the value of the '<em><b>Effect Pipeline</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.EffectPipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect Pipeline</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getBoard_EffectPipeline()
	 * @model containment="true"
	 * @generated
	 */
	EList<EffectPipeline> getEffectPipeline();

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getBoard_Height()
	 * @model required="true"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Board#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Checkered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checkered</em>' attribute.
	 * @see #setCheckered(boolean)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getBoard_Checkered()
	 * @model required="true"
	 * @generated
	 */
	boolean isCheckered();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Board#isCheckered <em>Checkered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checkered</em>' attribute.
	 * @see #isCheckered()
	 * @generated
	 */
	void setCheckered(boolean value);

	/**
	 * Returns the value of the '<em><b>Tileplacement</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.TilePlacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tileplacement</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getBoard_Tileplacement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TilePlacement> getTileplacement();

} // Board
