/**
 */
package no.ntnu.tdt4250.bg.impl;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.Board;
import no.ntnu.tdt4250.bg.Tile;
import no.ntnu.tdt4250.bg.TilePlacement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Placement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TilePlacementImpl#getRow <em>Row</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TilePlacementImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TilePlacementImpl#getTile <em>Tile</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TilePlacementImpl#isDarker <em>Darker</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TilePlacementImpl#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TilePlacementImpl extends MinimalEObjectImpl.Container implements TilePlacement {
	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final int ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected int row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected int column = COLUMN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTile() <em>Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTile()
	 * @generated
	 * @ordered
	 */
	protected Tile tile;

	/**
	 * The default value of the '{@link #isDarker() <em>Darker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDarker()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DARKER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getCoordinate() <em>Coordinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinate()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDINATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TilePlacementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.TILE_PLACEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRow(int newRow) {
		int oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.TILE_PLACEMENT__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColumn(int newColumn) {
		int oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.TILE_PLACEMENT__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tile getTile() {
		if (tile != null && tile.eIsProxy()) {
			InternalEObject oldTile = (InternalEObject) tile;
			tile = (Tile) eResolveProxy(oldTile);
			if (tile != oldTile) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.TILE_PLACEMENT__TILE, oldTile,
							tile));
			}
		}
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tile basicGetTile() {
		return tile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTile(Tile newTile) {
		Tile oldTile = tile;
		tile = newTile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.TILE_PLACEMENT__TILE, oldTile, tile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isDarker() {
		Board board = (Board) this.eContainer();
		return board.isCheckered() && (this.row + this.column) % 2 == 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getCoordinate() {
		return "(" + getRow() + ", " + getColumn() + ")";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BgPackage.TILE_PLACEMENT__ROW:
			return getRow();
		case BgPackage.TILE_PLACEMENT__COLUMN:
			return getColumn();
		case BgPackage.TILE_PLACEMENT__TILE:
			if (resolve)
				return getTile();
			return basicGetTile();
		case BgPackage.TILE_PLACEMENT__DARKER:
			return isDarker();
		case BgPackage.TILE_PLACEMENT__COORDINATE:
			return getCoordinate();
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
		case BgPackage.TILE_PLACEMENT__ROW:
			setRow((Integer) newValue);
			return;
		case BgPackage.TILE_PLACEMENT__COLUMN:
			setColumn((Integer) newValue);
			return;
		case BgPackage.TILE_PLACEMENT__TILE:
			setTile((Tile) newValue);
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
		case BgPackage.TILE_PLACEMENT__ROW:
			setRow(ROW_EDEFAULT);
			return;
		case BgPackage.TILE_PLACEMENT__COLUMN:
			setColumn(COLUMN_EDEFAULT);
			return;
		case BgPackage.TILE_PLACEMENT__TILE:
			setTile((Tile) null);
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
		case BgPackage.TILE_PLACEMENT__ROW:
			return row != ROW_EDEFAULT;
		case BgPackage.TILE_PLACEMENT__COLUMN:
			return column != COLUMN_EDEFAULT;
		case BgPackage.TILE_PLACEMENT__TILE:
			return tile != null;
		case BgPackage.TILE_PLACEMENT__DARKER:
			return isDarker() != DARKER_EDEFAULT;
		case BgPackage.TILE_PLACEMENT__COORDINATE:
			return COORDINATE_EDEFAULT == null ? getCoordinate() != null : !COORDINATE_EDEFAULT.equals(getCoordinate());
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
		result.append(" (row: ");
		result.append(row);
		result.append(", column: ");
		result.append(column);
		result.append(')');
		return result.toString();
	}

} //TilePlacementImpl
