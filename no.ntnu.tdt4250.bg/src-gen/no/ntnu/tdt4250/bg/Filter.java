/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.Filter#getNextFilter <em>Next Filter</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getFilter()
 * @model abstract="true"
 * @generated
 */
public interface Filter extends EObject {
	/**
	 * Returns the value of the '<em><b>Next Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Filter</em>' containment reference.
	 * @see #setNextFilter(Filter)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getFilter_NextFilter()
	 * @model containment="true"
	 * @generated
	 */
	Filter getNextFilter();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Filter#getNextFilter <em>Next Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Filter</em>' containment reference.
	 * @see #getNextFilter()
	 * @generated
	 */
	void setNextFilter(Filter value);

} // Filter
