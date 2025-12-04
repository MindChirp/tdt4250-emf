/**
 */
package no.ntnu.tdt4250.bg.impl;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.IterativeFilter;
import no.ntnu.tdt4250.bg.Pattern;
import no.ntnu.tdt4250.bg.RelativeCoordinate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Iterative Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.IterativeFilterImpl#getDirectionVector <em>Direction Vector</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.IterativeFilterImpl#getMatchRule <em>Match Rule</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.IterativeFilterImpl#getEndRule <em>End Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IterativeFilterImpl extends FilterImpl implements IterativeFilter {
	/**
	 * The cached value of the '{@link #getDirectionVector() <em>Direction Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectionVector()
	 * @generated
	 * @ordered
	 */
	protected RelativeCoordinate directionVector;

	/**
	 * The cached value of the '{@link #getMatchRule() <em>Match Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchRule()
	 * @generated
	 * @ordered
	 */
	protected Pattern matchRule;

	/**
	 * The cached value of the '{@link #getEndRule() <em>End Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndRule()
	 * @generated
	 * @ordered
	 */
	protected Pattern endRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IterativeFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.ITERATIVE_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelativeCoordinate getDirectionVector() {
		return directionVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDirectionVector(RelativeCoordinate newDirectionVector, NotificationChain msgs) {
		RelativeCoordinate oldDirectionVector = directionVector;
		directionVector = newDirectionVector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR, oldDirectionVector, newDirectionVector);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectionVector(RelativeCoordinate newDirectionVector) {
		if (newDirectionVector != directionVector) {
			NotificationChain msgs = null;
			if (directionVector != null)
				msgs = ((InternalEObject) directionVector).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR, null, msgs);
			if (newDirectionVector != null)
				msgs = ((InternalEObject) newDirectionVector).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR, null, msgs);
			msgs = basicSetDirectionVector(newDirectionVector, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR,
					newDirectionVector, newDirectionVector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern getMatchRule() {
		return matchRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatchRule(Pattern newMatchRule, NotificationChain msgs) {
		Pattern oldMatchRule = matchRule;
		matchRule = newMatchRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BgPackage.ITERATIVE_FILTER__MATCH_RULE, oldMatchRule, newMatchRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMatchRule(Pattern newMatchRule) {
		if (newMatchRule != matchRule) {
			NotificationChain msgs = null;
			if (matchRule != null)
				msgs = ((InternalEObject) matchRule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.ITERATIVE_FILTER__MATCH_RULE, null, msgs);
			if (newMatchRule != null)
				msgs = ((InternalEObject) newMatchRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.ITERATIVE_FILTER__MATCH_RULE, null, msgs);
			msgs = basicSetMatchRule(newMatchRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.ITERATIVE_FILTER__MATCH_RULE, newMatchRule,
					newMatchRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pattern getEndRule() {
		return endRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndRule(Pattern newEndRule, NotificationChain msgs) {
		Pattern oldEndRule = endRule;
		endRule = newEndRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BgPackage.ITERATIVE_FILTER__END_RULE, oldEndRule, newEndRule);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndRule(Pattern newEndRule) {
		if (newEndRule != endRule) {
			NotificationChain msgs = null;
			if (endRule != null)
				msgs = ((InternalEObject) endRule).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.ITERATIVE_FILTER__END_RULE, null, msgs);
			if (newEndRule != null)
				msgs = ((InternalEObject) newEndRule).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.ITERATIVE_FILTER__END_RULE, null, msgs);
			msgs = basicSetEndRule(newEndRule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.ITERATIVE_FILTER__END_RULE, newEndRule,
					newEndRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR:
			return basicSetDirectionVector(null, msgs);
		case BgPackage.ITERATIVE_FILTER__MATCH_RULE:
			return basicSetMatchRule(null, msgs);
		case BgPackage.ITERATIVE_FILTER__END_RULE:
			return basicSetEndRule(null, msgs);
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
		case BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR:
			return getDirectionVector();
		case BgPackage.ITERATIVE_FILTER__MATCH_RULE:
			return getMatchRule();
		case BgPackage.ITERATIVE_FILTER__END_RULE:
			return getEndRule();
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
		case BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR:
			setDirectionVector((RelativeCoordinate) newValue);
			return;
		case BgPackage.ITERATIVE_FILTER__MATCH_RULE:
			setMatchRule((Pattern) newValue);
			return;
		case BgPackage.ITERATIVE_FILTER__END_RULE:
			setEndRule((Pattern) newValue);
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
		case BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR:
			setDirectionVector((RelativeCoordinate) null);
			return;
		case BgPackage.ITERATIVE_FILTER__MATCH_RULE:
			setMatchRule((Pattern) null);
			return;
		case BgPackage.ITERATIVE_FILTER__END_RULE:
			setEndRule((Pattern) null);
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
		case BgPackage.ITERATIVE_FILTER__DIRECTION_VECTOR:
			return directionVector != null;
		case BgPackage.ITERATIVE_FILTER__MATCH_RULE:
			return matchRule != null;
		case BgPackage.ITERATIVE_FILTER__END_RULE:
			return endRule != null;
		}
		return super.eIsSet(featureID);
	}

} //IterativeFilterImpl
