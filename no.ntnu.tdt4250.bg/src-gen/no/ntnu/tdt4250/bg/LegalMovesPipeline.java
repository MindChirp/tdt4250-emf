/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legal Moves Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.LegalMovesPipeline#getFilters <em>Filters</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getLegalMovesPipeline()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='legalMovesPipelineFiltersMustFormValidChain'"
 * @generated
 */
public interface LegalMovesPipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.Filter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getLegalMovesPipeline_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

} // LegalMovesPipeline
