/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterative Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.IterativeFilter#getDirectionVectors <em>Direction Vectors</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.IterativeFilter#getMatchRule <em>Match Rule</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.IterativeFilter#getEndRule <em>End Rule</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getIterativeFilter()
 * @model
 * @generated
 */
public interface IterativeFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Direction Vectors</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.RelativeCoordinate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction Vectors</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getIterativeFilter_DirectionVectors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelativeCoordinate> getDirectionVectors();

	/**
	 * Returns the value of the '<em><b>Match Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match Rule</em>' containment reference.
	 * @see #setMatchRule(Pattern)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getIterativeFilter_MatchRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pattern getMatchRule();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.IterativeFilter#getMatchRule <em>Match Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Rule</em>' containment reference.
	 * @see #getMatchRule()
	 * @generated
	 */
	void setMatchRule(Pattern value);

	/**
	 * Returns the value of the '<em><b>End Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Rule</em>' containment reference.
	 * @see #setEndRule(Pattern)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getIterativeFilter_EndRule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pattern getEndRule();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.IterativeFilter#getEndRule <em>End Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Rule</em>' containment reference.
	 * @see #getEndRule()
	 * @generated
	 */
	void setEndRule(Pattern value);

} // IterativeFilter
