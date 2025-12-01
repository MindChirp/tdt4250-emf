/**
 */
package no.ntnu.tdt4250.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.Board;
import no.ntnu.tdt4250.bg.State;
import no.ntnu.tdt4250.bg.Tile;
import no.ntnu.tdt4250.bg.Transition;

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
 * An implementation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TileImpl#getStates <em>States</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TileImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TileImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TileImpl#getRow <em>Row</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TileImpl#getCol <em>Col</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TileImpl#getColor <em>Color</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.TileImpl#isDarker <em>Darker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileImpl extends MinimalEObjectImpl.Container implements Tile {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected State initialState;

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
	 * The default value of the '{@link #getCol() <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected static final int COL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCol() <em>Col</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCol()
	 * @generated
	 * @ordered
	 */
	protected int col = COL_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, BgPackage.TILE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, BgPackage.TILE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialState(State newInitialState, NotificationChain msgs) {
		State oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					BgPackage.TILE__INITIAL_STATE, oldInitialState, newInitialState);
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
	public void setInitialState(State newInitialState) {
		if (newInitialState != initialState) {
			NotificationChain msgs = null;
			if (initialState != null)
				msgs = ((InternalEObject) initialState).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.TILE__INITIAL_STATE, null, msgs);
			if (newInitialState != null)
				msgs = ((InternalEObject) newInitialState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.TILE__INITIAL_STATE, null, msgs);
			msgs = basicSetInitialState(newInitialState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.TILE__INITIAL_STATE, newInitialState,
					newInitialState));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.TILE__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCol() {
		return col;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCol(int newCol) {
		int oldCol = col;
		col = newCol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.TILE__COL, oldCol, col));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.TILE__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isDarker() {
		// TODO: implement this method to return the 'Darker' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		Board board = (Board) this.eContainer();
		return board.isCheckered() && (this.row + this.col) % 2 == 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.TILE__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case BgPackage.TILE__TRANSITIONS:
			return ((InternalEList<?>) getTransitions()).basicRemove(otherEnd, msgs);
		case BgPackage.TILE__INITIAL_STATE:
			return basicSetInitialState(null, msgs);
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
		case BgPackage.TILE__STATES:
			return getStates();
		case BgPackage.TILE__TRANSITIONS:
			return getTransitions();
		case BgPackage.TILE__INITIAL_STATE:
			return getInitialState();
		case BgPackage.TILE__ROW:
			return getRow();
		case BgPackage.TILE__COL:
			return getCol();
		case BgPackage.TILE__COLOR:
			return getColor();
		case BgPackage.TILE__DARKER:
			return isDarker();
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
		case BgPackage.TILE__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case BgPackage.TILE__TRANSITIONS:
			getTransitions().clear();
			getTransitions().addAll((Collection<? extends Transition>) newValue);
			return;
		case BgPackage.TILE__INITIAL_STATE:
			setInitialState((State) newValue);
			return;
		case BgPackage.TILE__ROW:
			setRow((Integer) newValue);
			return;
		case BgPackage.TILE__COL:
			setCol((Integer) newValue);
			return;
		case BgPackage.TILE__COLOR:
			setColor((String) newValue);
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
		case BgPackage.TILE__STATES:
			getStates().clear();
			return;
		case BgPackage.TILE__TRANSITIONS:
			getTransitions().clear();
			return;
		case BgPackage.TILE__INITIAL_STATE:
			setInitialState((State) null);
			return;
		case BgPackage.TILE__ROW:
			setRow(ROW_EDEFAULT);
			return;
		case BgPackage.TILE__COL:
			setCol(COL_EDEFAULT);
			return;
		case BgPackage.TILE__COLOR:
			setColor(COLOR_EDEFAULT);
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
		case BgPackage.TILE__STATES:
			return states != null && !states.isEmpty();
		case BgPackage.TILE__TRANSITIONS:
			return transitions != null && !transitions.isEmpty();
		case BgPackage.TILE__INITIAL_STATE:
			return initialState != null;
		case BgPackage.TILE__ROW:
			return row != ROW_EDEFAULT;
		case BgPackage.TILE__COL:
			return col != COL_EDEFAULT;
		case BgPackage.TILE__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
		case BgPackage.TILE__DARKER:
			return isDarker() != DARKER_EDEFAULT;
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
		result.append(", col: ");
		result.append(col);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} //TileImpl
