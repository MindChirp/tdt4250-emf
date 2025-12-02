/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='transitionMustStayWithinTile'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.State}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.bg.State#getOutbound <em>Outbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTransition_Source()
	 * @see no.ntnu.tdt4250.bg.State#getOutbound
	 * @model opposite="outbound" required="true"
	 * @generated
	 */
	EList<State> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.bg.State#getInbound <em>Inbound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTransition_Target()
	 * @see no.ntnu.tdt4250.bg.State#getInbound
	 * @model opposite="inbound" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTransition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
