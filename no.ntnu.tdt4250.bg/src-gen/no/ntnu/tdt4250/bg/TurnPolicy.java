/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.TurnPolicy#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getTurnPolicy()
 * @model
 * @generated
 */
public interface TurnPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.bg.TurnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.TurnType
	 * @see #setType(TurnType)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTurnPolicy_Type()
	 * @model required="true"
	 * @generated
	 */
	TurnType getType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.TurnPolicy#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.TurnType
	 * @see #getType()
	 * @generated
	 */
	void setType(TurnType value);

} // TurnPolicy
