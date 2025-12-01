/**
 */
package no.ntnu.tdt4250.bg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Placement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.TilePlacement#getRow <em>Row</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.TilePlacement#getColumn <em>Column</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.TilePlacement#getTile <em>Tile</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.TilePlacement#isDarker <em>Darker</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.TilePlacement#getCoordinate <em>Coordinate</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.bg.BgPackage#getTilePlacement()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='rowAndColumnMustBeNonNegative tilePlacementMustBelongToBoard rowAndColumnMustBeWithinBoardBounds tileMustBeSet'"
 * @generated
 */
public interface TilePlacement extends EObject {
	/**
	 * Returns the value of the '<em><b>Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' attribute.
	 * @see #setRow(int)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTilePlacement_Row()
	 * @model required="true"
	 * @generated
	 */
	int getRow();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.TilePlacement#getRow <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' attribute.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTilePlacement_Column()
	 * @model required="true"
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.TilePlacement#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

	/**
	 * Returns the value of the '<em><b>Tile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tile</em>' reference.
	 * @see #setTile(Tile)
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTilePlacement_Tile()
	 * @model required="true"
	 * @generated
	 */
	Tile getTile();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.bg.TilePlacement#getTile <em>Tile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile</em>' reference.
	 * @see #getTile()
	 * @generated
	 */
	void setTile(Tile value);

	/**
	 * Returns the value of the '<em><b>Darker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Darker</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTilePlacement_Darker()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isDarker();

	/**
	 * Returns the value of the '<em><b>Coordinate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinate</em>' attribute.
	 * @see no.ntnu.tdt4250.bg.BgPackage#getTilePlacement_Coordinate()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCoordinate();

} // TilePlacement
