/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.Pattern#getRelativecoordinates <em>Relativecoordinates</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Pattern#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Pattern#getTileTypeName <em>Tile Type Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.Pattern#getTileStateName <em>Tile State Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern()
 * @model
 * @generated
 */
public interface Pattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Relativecoordinates</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.bg.RelativeCoordinate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relativecoordinates</em>' containment reference list.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern_Relativecoordinates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RelativeCoordinate> getRelativecoordinates();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Pattern#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tile Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile Type Name</em>' attribute.
	 * @see #setTileTypeName(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern_TileTypeName()
	 * @model
	 * @generated
	 */
	String getTileTypeName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Pattern#getTileTypeName <em>Tile Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Type Name</em>' attribute.
	 * @see #getTileTypeName()
	 * @generated
	 */
	void setTileTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Tile State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile State Name</em>' attribute.
	 * @see #setTileStateName(String)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getPattern_TileStateName()
	 * @model
	 * @generated
	 */
	String getTileStateName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.Pattern#getTileStateName <em>Tile State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile State Name</em>' attribute.
	 * @see #getTileStateName()
	 * @generated
	 */
	void setTileStateName(String value);

} // Pattern
