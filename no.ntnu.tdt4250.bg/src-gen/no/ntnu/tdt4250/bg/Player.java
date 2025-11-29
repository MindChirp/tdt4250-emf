/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.Player#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Player#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Player#getHexColor <em>Hex Color</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getPlayer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='playerHexColorMustBeValid'"
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPlayer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPlayer_IsActive()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Returns the value of the '<em><b>Hex Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex Color</em>' attribute.
	 * @see #setHexColor(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPlayer_HexColor()
	 * @model required="true"
	 * @generated
	 */
	String getHexColor();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Player#getHexColor <em>Hex Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex Color</em>' attribute.
	 * @see #getHexColor()
	 * @generated
	 */
	void setHexColor(String value);

} // Player
