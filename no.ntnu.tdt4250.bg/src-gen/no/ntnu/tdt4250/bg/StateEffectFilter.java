/**
 */
package no.ntnu.tdt4250.bg;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Effect Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.StateEffectFilter#getTargetState <em>Target State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.StateEffectFilter#getStateSelection <em>State Selection</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getStateEffectFilter()
 * @model
 * @generated
 */
public interface StateEffectFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(State)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getStateEffectFilter_TargetState()
	 * @model
	 * @generated
	 */
	State getTargetState();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.StateEffectFilter#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
	void setTargetState(State value);

	/**
	 * Returns the value of the '<em><b>State Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.bg.StateSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Selection</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.StateSelection
	 * @see #setStateSelection(StateSelection)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getStateEffectFilter_StateSelection()
	 * @model required="true"
	 * @generated
	 */
	StateSelection getStateSelection();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.StateEffectFilter#getStateSelection <em>State Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Selection</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.StateSelection
	 * @see #getStateSelection()
	 * @generated
	 */
	void setStateSelection(StateSelection value);

} // StateEffectFilter
