/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.PatternFilter#getPatterns <em>Patterns</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getPatternFilter()
 * @model
 * @generated
 */
public interface PatternFilter extends Filter {
	/**
	 * Returns the value of the '<em><b>Patterns</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.Pattern}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patterns</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPatternFilter_Patterns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Pattern> getPatterns();

} // PatternFilter
