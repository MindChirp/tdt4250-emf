/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#getStates <em>States</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#getType <em>Type</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#getHexColor <em>Hex Color</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getTile()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='tileMustHaveInitialState tileStateNamesMustBeUnique allStatesMustBeReachable tileTransitionsMustBeWellFormed tilesMustHaveAtLeastOneState'"
 * @generated
 */
public interface Tile extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' containment reference.
	 * @see #setInitialState(State)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_InitialState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Tile#getInitialState <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' containment reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Tile#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Hex Color</b></em>' attribute.
	 * The default value is <code>"#ffffff"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex Color</em>' attribute.
	 * @see #setHexColor(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_HexColor()
	 * @model default="#ffffff" required="true"
	 * @generated
	 */
	String getHexColor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Tile#getHexColor <em>Hex Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex Color</em>' attribute.
	 * @see #getHexColor()
	 * @generated
	 */
	void setHexColor(String value);

} // Tile
