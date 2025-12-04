/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.Pattern#getRelativecoordinates <em>Relativecoordinates</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Pattern#getStateSelection <em>State Selection</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Pattern#getMatchState <em>Match State</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='matchStateDefined'"
 * @generated
 */
public interface Pattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Relativecoordinates</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.RelativeCoordinate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativecoordinates</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern_Relativecoordinates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelativeCoordinate> getRelativecoordinates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.bg.StateSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Selection</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.StateSelection
	 * @see #setStateSelection(StateSelection)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern_StateSelection()
	 * @model
	 * @generated
	 */
	StateSelection getStateSelection();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Pattern#getStateSelection <em>State Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Selection</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.StateSelection
	 * @see #getStateSelection()
	 * @generated
	 */
	void setStateSelection(StateSelection value);

	/**
	 * Returns the value of the '<em><b>Match State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match State</em>' reference.
	 * @see #setMatchState(State)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern_MatchState()
	 * @model
	 * @generated
	 */
	State getMatchState();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Pattern#getMatchState <em>Match State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match State</em>' reference.
	 * @see #getMatchState()
	 * @generated
	 */
	void setMatchState(State value);

} // Pattern
