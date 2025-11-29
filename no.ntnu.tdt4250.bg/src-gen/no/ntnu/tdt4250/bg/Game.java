/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.Game#getBoard <em>Board</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Game#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Game#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Game#getTurnPolicy <em>Turn Policy</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Game#getInitialPlayer <em>Initial Player</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='playersMustHaveUniqueHexColors playersMustHaveUniqueNames gameMustHaveAtLeastOnePlayer'"
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getGame_Board()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Game#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getGame_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Game#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.Player}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getGame_Players()
	 * @model containment="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Turn Policy</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.TurnPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn Policy</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getGame_TurnPolicy()
	 * @model containment="true"
	 * @generated
	 */
	EList<TurnPolicy> getTurnPolicy();

	/**
	 * Returns the value of the '<em><b>Initial Player</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Player</em>' reference.
	 * @see #setInitialPlayer(Player)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getGame_InitialPlayer()
	 * @model
	 * @generated
	 */
	Player getInitialPlayer();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Game#getInitialPlayer <em>Initial Player</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Player</em>' reference.
	 * @see #getInitialPlayer()
	 * @generated
	 */
	void setInitialPlayer(Player value);

} // Game
