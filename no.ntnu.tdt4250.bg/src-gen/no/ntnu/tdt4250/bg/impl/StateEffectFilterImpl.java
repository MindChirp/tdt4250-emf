/**
 */
package no.ntnu.tdt4250.bg.impl;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.State;
import no.ntnu.tdt4250.bg.StateEffectFilter;

import no.ntnu.tdt4250.bg.StateSelection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Effect Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.StateEffectFilterImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.StateEffectFilterImpl#getStateSelection <em>State Selection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateEffectFilterImpl extends FilterImpl implements StateEffectFilter {
	/**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
	protected State targetState;

	/**
	 * The default value of the '{@link #getStateSelection() <em>State Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSelection()
	 * @generated
	 * @ordered
	 */
	protected static final StateSelection STATE_SELECTION_EDEFAULT = StateSelection.CURRENT_PLAYER;
	/**
	 * The cached value of the '{@link #getStateSelection() <em>State Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateSelection()
	 * @generated
	 * @ordered
	 */
	protected StateSelection stateSelection = STATE_SELECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateEffectFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.STATE_EFFECT_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject) targetState;
			targetState = (State) eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							BgPackage.STATE_EFFECT_FILTER__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTargetState() {
		return targetState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetState(State newTargetState) {
		State oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.STATE_EFFECT_FILTER__TARGET_STATE,
					oldTargetState, targetState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateSelection getStateSelection() {
		return stateSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateSelection(StateSelection newStateSelection) {
		StateSelection oldStateSelection = stateSelection;
		stateSelection = newStateSelection == null ? STATE_SELECTION_EDEFAULT : newStateSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.STATE_EFFECT_FILTER__STATE_SELECTION,
					oldStateSelection, stateSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.STATE_EFFECT_FILTER__TARGET_STATE:
			if (resolve)
				return getTargetState();
			return basicGetTargetState();
		case BgPackage.STATE_EFFECT_FILTER__STATE_SELECTION:
			return getStateSelection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BgPackage.STATE_EFFECT_FILTER__TARGET_STATE:
			setTargetState((State) newValue);
			return;
		case BgPackage.STATE_EFFECT_FILTER__STATE_SELECTION:
			setStateSelection((StateSelection) newValue);
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
		case BgPackage.STATE_EFFECT_FILTER__TARGET_STATE:
			setTargetState((State) null);
			return;
		case BgPackage.STATE_EFFECT_FILTER__STATE_SELECTION:
			setStateSelection(STATE_SELECTION_EDEFAULT);
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
		case BgPackage.STATE_EFFECT_FILTER__TARGET_STATE:
			return targetState != null;
		case BgPackage.STATE_EFFECT_FILTER__STATE_SELECTION:
			return stateSelection != STATE_SELECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (stateSelection: ");
		result.append(stateSelection);
		result.append(')');
		return result.toString();
	}

} //StateEffectFilterImpl
