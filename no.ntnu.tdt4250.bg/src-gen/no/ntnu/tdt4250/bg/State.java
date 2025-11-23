/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.State#getOutbound <em>Outbound</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.State#getInbound <em>Inbound</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.State#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.State#getHexColor <em>Hex Color</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Outbound</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.bg.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound</em>' reference.
	 * @see #setOutbound(Transition)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getState_Outbound()
	 * @see no.ntnu.tdt4250.bg.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Transition getOutbound();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.State#getOutbound <em>Outbound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outbound</em>' reference.
	 * @see #getOutbound()
	 * @generated
	 */
	void setOutbound(Transition value);

	/**
	 * Returns the value of the '<em><b>Inbound</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.bg.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound</em>' reference.
	 * @see #setInbound(Transition)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getState_Inbound()
	 * @see no.ntnu.tdt4250.bg.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Transition getInbound();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.State#getInbound <em>Inbound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound</em>' reference.
	 * @see #getInbound()
	 * @generated
	 */
	void setInbound(Transition value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Hex Color</b></em>' attribute.
	 * The default value is <code>"#dddddd"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex Color</em>' attribute.
	 * @see #setHexColor(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getState_HexColor()
	 * @model default="#dddddd" required="true"
	 * @generated
	 */
	String getHexColor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.State#getHexColor <em>Hex Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex Color</em>' attribute.
	 * @see #getHexColor()
	 * @generated
	 */
	void setHexColor(String value);

} // State
