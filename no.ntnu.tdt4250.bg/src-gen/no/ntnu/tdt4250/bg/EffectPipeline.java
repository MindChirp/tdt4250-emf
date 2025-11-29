/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.EffectPipeline#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getEffectPipeline()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='effectPipelineFiltersMustFormValidChain'"
 * @generated
 */
public interface EffectPipeline extends EObject {
	/**
	 * Returns the value of the '<em><b>Filter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' reference.
	 * @see #setFilter(Filter)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getEffectPipeline_Filter()
	 * @model
	 * @generated
	 */
	Filter getFilter();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.EffectPipeline#getFilter <em>Filter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(Filter value);

} // EffectPipeline
