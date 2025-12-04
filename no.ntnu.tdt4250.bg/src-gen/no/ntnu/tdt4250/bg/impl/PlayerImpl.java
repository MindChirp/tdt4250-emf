/**
 */
package no.ntnu.tdt4250.bg.impl;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.Player;

import no.ntnu.tdt4250.bg.State;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.PlayerImpl#getHexColor <em>Hex Color</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.PlayerImpl#getAssociatedState <em>Associated State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
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
	protected static final String HEX_COLOR_EDEFAULT = null;

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
	 * The cached value of the '{@link #getAssociatedState() <em>Associated State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedState()
	 * @generated
	 * @ordered
	 */
	protected State associatedState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.PLAYER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PLAYER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PLAYER__HEX_COLOR, oldHexColor, hexColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getAssociatedState() {
		if (associatedState != null && associatedState.eIsProxy()) {
			InternalEObject oldAssociatedState = (InternalEObject) associatedState;
			associatedState = (State) eResolveProxy(oldAssociatedState);
			if (associatedState != oldAssociatedState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.PLAYER__ASSOCIATED_STATE,
							oldAssociatedState, associatedState));
			}
		}
		return associatedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetAssociatedState() {
		return associatedState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssociatedState(State newAssociatedState) {
		State oldAssociatedState = associatedState;
		associatedState = newAssociatedState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PLAYER__ASSOCIATED_STATE,
					oldAssociatedState, associatedState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.PLAYER__NAME:
			return getName();
		case BgPackage.PLAYER__HEX_COLOR:
			return getHexColor();
		case BgPackage.PLAYER__ASSOCIATED_STATE:
			if (resolve)
				return getAssociatedState();
			return basicGetAssociatedState();
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
		case BgPackage.PLAYER__NAME:
			setName((String) newValue);
			return;
		case BgPackage.PLAYER__HEX_COLOR:
			setHexColor((String) newValue);
			return;
		case BgPackage.PLAYER__ASSOCIATED_STATE:
			setAssociatedState((State) newValue);
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
		case BgPackage.PLAYER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.PLAYER__HEX_COLOR:
			setHexColor(HEX_COLOR_EDEFAULT);
			return;
		case BgPackage.PLAYER__ASSOCIATED_STATE:
			setAssociatedState((State) null);
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
		case BgPackage.PLAYER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.PLAYER__HEX_COLOR:
			return HEX_COLOR_EDEFAULT == null ? hexColor != null : !HEX_COLOR_EDEFAULT.equals(hexColor);
		case BgPackage.PLAYER__ASSOCIATED_STATE:
			return associatedState != null;
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

} //PlayerImpl
