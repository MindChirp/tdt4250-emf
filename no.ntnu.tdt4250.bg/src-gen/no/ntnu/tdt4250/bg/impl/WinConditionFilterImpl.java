/**
 */
package no.ntnu.tdt4250.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.PatternFilter;
import no.ntnu.tdt4250.bg.WinConditionFilter;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win Condition Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.WinConditionFilterImpl#getPatternfilter <em>Patternfilter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WinConditionFilterImpl extends FilterImpl implements WinConditionFilter {
	/**
	 * The cached value of the '{@link #getPatternfilter() <em>Patternfilter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternfilter()
	 * @generated
	 * @ordered
	 */
	protected EList<PatternFilter> patternfilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WinConditionFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.WIN_CONDITION_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PatternFilter> getPatternfilter() {
		if (patternfilter == null) {
			patternfilter = new EObjectContainmentEList<PatternFilter>(PatternFilter.class, this,
					BgPackage.WIN_CONDITION_FILTER__PATTERNFILTER);
		}
		return patternfilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION_FILTER__PATTERNFILTER:
			return ((InternalEList<?>) getPatternfilter()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION_FILTER__PATTERNFILTER:
			return getPatternfilter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION_FILTER__PATTERNFILTER:
			getPatternfilter().clear();
			getPatternfilter().addAll((Collection<? extends PatternFilter>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION_FILTER__PATTERNFILTER:
			getPatternfilter().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BgPackage.WIN_CONDITION_FILTER__PATTERNFILTER:
			return patternfilter != null && !patternfilter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WinConditionFilterImpl
