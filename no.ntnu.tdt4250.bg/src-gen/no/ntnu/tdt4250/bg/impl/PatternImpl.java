/**
 */
package no.ntnu.tdt4250.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.Pattern;
import no.ntnu.tdt4250.bg.RelativeCoordinate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.PatternImpl#getRelativecoordinates <em>Relativecoordinates</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.PatternImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.PatternImpl#getTileTypeName <em>Tile Type Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.PatternImpl#getTileStateName <em>Tile State Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatternImpl extends MinimalEObjectImpl.Container implements Pattern {
	/**
	 * The cached value of the '{@link #getRelativecoordinates() <em>Relativecoordinates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativecoordinates()
	 * @generated
	 * @ordered
	 */
	protected EList<RelativeCoordinate> relativecoordinates;

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
	 * The default value of the '{@link #getTileTypeName() <em>Tile Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TILE_TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTileTypeName() <em>Tile Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileTypeName()
	 * @generated
	 * @ordered
	 */
	protected String tileTypeName = TILE_TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTileStateName() <em>Tile State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileStateName()
	 * @generated
	 * @ordered
	 */
	protected static final String TILE_STATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTileStateName() <em>Tile State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileStateName()
	 * @generated
	 * @ordered
	 */
	protected String tileStateName = TILE_STATE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelativeCoordinate> getRelativecoordinates() {
		if (relativecoordinates == null) {
			relativecoordinates = new EObjectContainmentEList<RelativeCoordinate>(RelativeCoordinate.class, this,
					BgPackage.PATTERN__RELATIVECOORDINATES);
		}
		return relativecoordinates;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PATTERN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTileTypeName() {
		return tileTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileTypeName(String newTileTypeName) {
		String oldTileTypeName = tileTypeName;
		tileTypeName = newTileTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PATTERN__TILE_TYPE_NAME, oldTileTypeName,
					tileTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTileStateName() {
		return tileStateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTileStateName(String newTileStateName) {
		String oldTileStateName = tileStateName;
		tileStateName = newTileStateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.PATTERN__TILE_STATE_NAME, oldTileStateName,
					tileStateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.PATTERN__RELATIVECOORDINATES:
			return ((InternalEList<?>) getRelativecoordinates()).basicRemove(otherEnd, msgs);
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
		case BgPackage.PATTERN__RELATIVECOORDINATES:
			return getRelativecoordinates();
		case BgPackage.PATTERN__NAME:
			return getName();
		case BgPackage.PATTERN__TILE_TYPE_NAME:
			return getTileTypeName();
		case BgPackage.PATTERN__TILE_STATE_NAME:
			return getTileStateName();
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
		case BgPackage.PATTERN__RELATIVECOORDINATES:
			getRelativecoordinates().clear();
			getRelativecoordinates().addAll((Collection<? extends RelativeCoordinate>) newValue);
			return;
		case BgPackage.PATTERN__NAME:
			setName((String) newValue);
			return;
		case BgPackage.PATTERN__TILE_TYPE_NAME:
			setTileTypeName((String) newValue);
			return;
		case BgPackage.PATTERN__TILE_STATE_NAME:
			setTileStateName((String) newValue);
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
		case BgPackage.PATTERN__RELATIVECOORDINATES:
			getRelativecoordinates().clear();
			return;
		case BgPackage.PATTERN__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.PATTERN__TILE_TYPE_NAME:
			setTileTypeName(TILE_TYPE_NAME_EDEFAULT);
			return;
		case BgPackage.PATTERN__TILE_STATE_NAME:
			setTileStateName(TILE_STATE_NAME_EDEFAULT);
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
		case BgPackage.PATTERN__RELATIVECOORDINATES:
			return relativecoordinates != null && !relativecoordinates.isEmpty();
		case BgPackage.PATTERN__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.PATTERN__TILE_TYPE_NAME:
			return TILE_TYPE_NAME_EDEFAULT == null ? tileTypeName != null
					: !TILE_TYPE_NAME_EDEFAULT.equals(tileTypeName);
		case BgPackage.PATTERN__TILE_STATE_NAME:
			return TILE_STATE_NAME_EDEFAULT == null ? tileStateName != null
					: !TILE_STATE_NAME_EDEFAULT.equals(tileStateName);
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
		result.append(", tileTypeName: ");
		result.append(tileTypeName);
		result.append(", tileStateName: ");
		result.append(tileStateName);
		result.append(')');
		return result.toString();
	}

} //PatternImpl
