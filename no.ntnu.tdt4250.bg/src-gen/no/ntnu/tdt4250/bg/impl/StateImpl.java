/**
 */
package no.ntnu.tdt4250.bg.impl;

import java.util.Collection;
import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.State;
import no.ntnu.tdt4250.bg.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.StateImpl#getOutbound <em>Outbound</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.StateImpl#getInbound <em>Inbound</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.StateImpl#getHexColor <em>Hex Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getOutbound() <em>Outbound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutbound()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outbound;

	/**
	 * The cached value of the '{@link #getInbound() <em>Inbound</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInbound()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> inbound;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHexColor() <em>Hex Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHexColor()
	 * @generated
	 * @ordered
	 */
	protected static final String HEX_COLOR_EDEFAULT = "#dddddd";

	/**
	 * The cached value of the '{@link #getHexColor() <em>Hex Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHexColor()
	 * @generated
	 * @ordered
	 */
	protected String hexColor = HEX_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getOutbound() {
		if (outbound == null) {
			outbound = new EObjectWithInverseResolvingEList.ManyInverse<Transition>(Transition.class, this,
					BgPackage.STATE__OUTBOUND, BgPackage.TRANSITION__SOURCE);
		}
		return outbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getInbound() {
		if (inbound == null) {
			inbound = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, BgPackage.STATE__INBOUND,
					BgPackage.TRANSITION__TARGET);
		}
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHexColor() {
		return hexColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHexColor(String newHexColor) {
		String oldHexColor = hexColor;
		hexColor = newHexColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.STATE__HEX_COLOR, oldHexColor, hexColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.STATE__OUTBOUND:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutbound()).basicAdd(otherEnd, msgs);
		case BgPackage.STATE__INBOUND:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInbound()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.STATE__OUTBOUND:
			return ((InternalEList<?>) getOutbound()).basicRemove(otherEnd, msgs);
		case BgPackage.STATE__INBOUND:
			return ((InternalEList<?>) getInbound()).basicRemove(otherEnd, msgs);
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
		case BgPackage.STATE__OUTBOUND:
			return getOutbound();
		case BgPackage.STATE__INBOUND:
			return getInbound();
		case BgPackage.STATE__NAME:
			return getName();
		case BgPackage.STATE__HEX_COLOR:
			return getHexColor();
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
		case BgPackage.STATE__OUTBOUND:
			getOutbound().clear();
			getOutbound().addAll((Collection<? extends Transition>) newValue);
			return;
		case BgPackage.STATE__INBOUND:
			getInbound().clear();
			getInbound().addAll((Collection<? extends Transition>) newValue);
			return;
		case BgPackage.STATE__NAME:
			setName((String) newValue);
			return;
		case BgPackage.STATE__HEX_COLOR:
			setHexColor((String) newValue);
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
		case BgPackage.STATE__OUTBOUND:
			getOutbound().clear();
			return;
		case BgPackage.STATE__INBOUND:
			getInbound().clear();
			return;
		case BgPackage.STATE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.STATE__HEX_COLOR:
			setHexColor(HEX_COLOR_EDEFAULT);
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
		case BgPackage.STATE__OUTBOUND:
			return outbound != null && !outbound.isEmpty();
		case BgPackage.STATE__INBOUND:
			return inbound != null && !inbound.isEmpty();
		case BgPackage.STATE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.STATE__HEX_COLOR:
			return HEX_COLOR_EDEFAULT == null ? hexColor != null : !HEX_COLOR_EDEFAULT.equals(hexColor);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", hexColor: ");
		result.append(hexColor);
		result.append(')');
		return result.toString();
	}

} //StateImpl
