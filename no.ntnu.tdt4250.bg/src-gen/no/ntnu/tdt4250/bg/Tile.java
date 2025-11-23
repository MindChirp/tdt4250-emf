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
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#getRow <em>Row</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#getCol <em>Col</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#getColor <em>Color</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Tile#isDarker <em>Darker</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getTile()
 * @model
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
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_Row()
	 * @model required="true"
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Tile#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Returns the value of the '<em><b>Col</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Col</em>' attribute.
	 * @see #setCol(int)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_Col()
	 * @model required="true"
	 * @generated
	 */
	int getCol();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Tile#getCol <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col</em>' attribute.
	 * @see #getCol()
	 * @generated
	 */
	void setCol(int value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_Color()
	 * @model required="true"
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Tile#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Darker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Darker</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTile_Darker()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isDarker();

} // Tile
