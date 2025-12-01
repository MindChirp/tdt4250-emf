/**
 */
package no.ntnu.tdt4250.bg.impl;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.State;
import no.ntnu.tdt4250.bg.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * The cached value of the '{@link #getOutbound() <em>Outbound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutbound()
	 * @generated
	 * @ordered
	 */
	protected Transition outbound;

	/**
	 * The cached value of the '{@link #getInbound() <em>Inbound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInbound()
	 * @generated
	 * @ordered
	 */
	protected Transition inbound;

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
	public Transition getOutbound() {
		if (outbound != null && outbound.eIsProxy()) {
			InternalEObject oldOutbound = (InternalEObject) outbound;
			outbound = (Transition) eResolveProxy(oldOutbound);
			if (outbound != oldOutbound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.STATE__OUTBOUND, oldOutbound,
							outbound));
			}
		}
		return outbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetOutbound() {
		return outbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutbound(Transition newOutbound, NotificationChain msgs) {
		Transition oldOutbound = outbound;
		outbound = newOutbound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BgPackage.STATE__OUTBOUND,
					oldOutbound, newOutbound);
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
	public void setOutbound(Transition newOutbound) {
		if (newOutbound != outbound) {
			NotificationChain msgs = null;
			if (outbound != null)
				msgs = ((InternalEObject) outbound).eInverseRemove(this, BgPackage.TRANSITION__SOURCE, Transition.class,
						msgs);
			if (newOutbound != null)
				msgs = ((InternalEObject) newOutbound).eInverseAdd(this, BgPackage.TRANSITION__SOURCE, Transition.class,
						msgs);
			msgs = basicSetOutbound(newOutbound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.STATE__OUTBOUND, newOutbound, newOutbound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition getInbound() {
		if (inbound != null && inbound.eIsProxy()) {
			InternalEObject oldInbound = (InternalEObject) inbound;
			inbound = (Transition) eResolveProxy(oldInbound);
			if (inbound != oldInbound) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.STATE__INBOUND, oldInbound,
							inbound));
			}
		}
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetInbound() {
		return inbound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInbound(Transition newInbound, NotificationChain msgs) {
		Transition oldInbound = inbound;
		inbound = newInbound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BgPackage.STATE__INBOUND,
					oldInbound, newInbound);
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
	public void setInbound(Transition newInbound) {
		if (newInbound != inbound) {
			NotificationChain msgs = null;
			if (inbound != null)
				msgs = ((InternalEObject) inbound).eInverseRemove(this, BgPackage.TRANSITION__TARGET, Transition.class,
						msgs);
			if (newInbound != null)
				msgs = ((InternalEObject) newInbound).eInverseAdd(this, BgPackage.TRANSITION__TARGET, Transition.class,
						msgs);
			msgs = basicSetInbound(newInbound, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.STATE__INBOUND, newInbound, newInbound));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.STATE__OUTBOUND:
			if (outbound != null)
				msgs = ((InternalEObject) outbound).eInverseRemove(this, BgPackage.TRANSITION__SOURCE, Transition.class,
						msgs);
			return basicSetOutbound((Transition) otherEnd, msgs);
		case BgPackage.STATE__INBOUND:
			if (inbound != null)
				msgs = ((InternalEObject) inbound).eInverseRemove(this, BgPackage.TRANSITION__TARGET, Transition.class,
						msgs);
			return basicSetInbound((Transition) otherEnd, msgs);
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
			return basicSetOutbound(null, msgs);
		case BgPackage.STATE__INBOUND:
			return basicSetInbound(null, msgs);
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
			if (resolve)
				return getOutbound();
			return basicGetOutbound();
		case BgPackage.STATE__INBOUND:
			if (resolve)
				return getInbound();
			return basicGetInbound();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BgPackage.STATE__OUTBOUND:
			setOutbound((Transition) newValue);
			return;
		case BgPackage.STATE__INBOUND:
			setInbound((Transition) newValue);
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
			setOutbound((Transition) null);
			return;
		case BgPackage.STATE__INBOUND:
			setInbound((Transition) null);
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
			return outbound != null;
		case BgPackage.STATE__INBOUND:
			return inbound != null;
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
