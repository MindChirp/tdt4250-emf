/**
 */
package no.ntnu.tdt4250.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.Board;
import no.ntnu.tdt4250.bg.Game;
import no.ntnu.tdt4250.bg.Player;
import no.ntnu.tdt4250.bg.TurnPolicy;

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
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.GameImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.GameImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.GameImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.GameImpl#getTurnPolicy <em>Turn Policy</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.GameImpl#getInitialPlayer <em>Initial Player</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

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
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getTurnPolicy() <em>Turn Policy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnPolicy()
	 * @generated
	 * @ordered
	 */
	protected TurnPolicy turnPolicy;

	/**
	 * The cached value of the '{@link #getInitialPlayer() <em>Initial Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialPlayer()
	 * @generated
	 * @ordered
	 */
	protected Player initialPlayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BgPackage.GAME__BOARD,
					oldBoard, newBoard);
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
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject) board).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BgPackage.GAME__BOARD,
						null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject) newBoard).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BgPackage.GAME__BOARD,
						null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.GAME__BOARD, newBoard, newBoard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.GAME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<Player>(Player.class, this, BgPackage.GAME__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TurnPolicy getTurnPolicy() {
		return turnPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnPolicy(TurnPolicy newTurnPolicy, NotificationChain msgs) {
		TurnPolicy oldTurnPolicy = turnPolicy;
		turnPolicy = newTurnPolicy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BgPackage.GAME__TURN_POLICY,
					oldTurnPolicy, newTurnPolicy);
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
	public void setTurnPolicy(TurnPolicy newTurnPolicy) {
		if (newTurnPolicy != turnPolicy) {
			NotificationChain msgs = null;
			if (turnPolicy != null)
				msgs = ((InternalEObject) turnPolicy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.GAME__TURN_POLICY, null, msgs);
			if (newTurnPolicy != null)
				msgs = ((InternalEObject) newTurnPolicy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - BgPackage.GAME__TURN_POLICY, null, msgs);
			msgs = basicSetTurnPolicy(newTurnPolicy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.GAME__TURN_POLICY, newTurnPolicy,
					newTurnPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Player getInitialPlayer() {
		if (initialPlayer != null && initialPlayer.eIsProxy()) {
			InternalEObject oldInitialPlayer = (InternalEObject) initialPlayer;
			initialPlayer = (Player) eResolveProxy(oldInitialPlayer);
			if (initialPlayer != oldInitialPlayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BgPackage.GAME__INITIAL_PLAYER,
							oldInitialPlayer, initialPlayer));
			}
		}
		return initialPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player basicGetInitialPlayer() {
		return initialPlayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialPlayer(Player newInitialPlayer) {
		Player oldInitialPlayer = initialPlayer;
		initialPlayer = newInitialPlayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.GAME__INITIAL_PLAYER, oldInitialPlayer,
					initialPlayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.GAME__BOARD:
			return basicSetBoard(null, msgs);
		case BgPackage.GAME__PLAYERS:
			return ((InternalEList<?>) getPlayers()).basicRemove(otherEnd, msgs);
		case BgPackage.GAME__TURN_POLICY:
			return basicSetTurnPolicy(null, msgs);
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
		case BgPackage.GAME__BOARD:
			return getBoard();
		case BgPackage.GAME__NAME:
			return getName();
		case BgPackage.GAME__PLAYERS:
			return getPlayers();
		case BgPackage.GAME__TURN_POLICY:
			return getTurnPolicy();
		case BgPackage.GAME__INITIAL_PLAYER:
			if (resolve)
				return getInitialPlayer();
			return basicGetInitialPlayer();
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
		case BgPackage.GAME__BOARD:
			setBoard((Board) newValue);
			return;
		case BgPackage.GAME__NAME:
			setName((String) newValue);
			return;
		case BgPackage.GAME__PLAYERS:
			getPlayers().clear();
			getPlayers().addAll((Collection<? extends Player>) newValue);
			return;
		case BgPackage.GAME__TURN_POLICY:
			setTurnPolicy((TurnPolicy) newValue);
			return;
		case BgPackage.GAME__INITIAL_PLAYER:
			setInitialPlayer((Player) newValue);
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
		case BgPackage.GAME__BOARD:
			setBoard((Board) null);
			return;
		case BgPackage.GAME__NAME:
			setName(NAME_EDEFAULT);
			return;
		case BgPackage.GAME__PLAYERS:
			getPlayers().clear();
			return;
		case BgPackage.GAME__TURN_POLICY:
			setTurnPolicy((TurnPolicy) null);
			return;
		case BgPackage.GAME__INITIAL_PLAYER:
			setInitialPlayer((Player) null);
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
		case BgPackage.GAME__BOARD:
			return board != null;
		case BgPackage.GAME__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case BgPackage.GAME__PLAYERS:
			return players != null && !players.isEmpty();
		case BgPackage.GAME__TURN_POLICY:
			return turnPolicy != null;
		case BgPackage.GAME__INITIAL_PLAYER:
			return initialPlayer != null;
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
		result.append(')');
		return result.toString();
	}

} //GameImpl
