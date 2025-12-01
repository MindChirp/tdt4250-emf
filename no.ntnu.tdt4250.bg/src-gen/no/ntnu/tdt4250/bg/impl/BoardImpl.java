/**
 */
package no.ntnu.tdt4250.bg.impl;

import java.util.Collection;

import no.ntnu.tdt4250.bg.BgPackage;
import no.ntnu.tdt4250.bg.Board;
import no.ntnu.tdt4250.bg.EffectPipeline;
import no.ntnu.tdt4250.bg.LegalMovesPipeline;
import no.ntnu.tdt4250.bg.Tile;

import no.ntnu.tdt4250.bg.TilePlacement;
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
 * An implementation of the model object '<em><b>Board</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.BoardImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.BoardImpl#getTiles <em>Tiles</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.BoardImpl#getLegalMovesPipeline <em>Legal Moves Pipeline</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.BoardImpl#getEffectPipeline <em>Effect Pipeline</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.BoardImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.BoardImpl#isCheckered <em>Checkered</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.bg.impl.BoardImpl#getTileplacement <em>Tileplacement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoardImpl extends MinimalEObjectImpl.Container implements Board {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTiles() <em>Tiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> tiles;

	/**
	 * The cached value of the '{@link #getLegalMovesPipeline() <em>Legal Moves Pipeline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalMovesPipeline()
	 * @generated
	 * @ordered
	 */
	protected EList<LegalMovesPipeline> legalMovesPipeline;

	/**
	 * The cached value of the '{@link #getEffectPipeline() <em>Effect Pipeline</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectPipeline()
	 * @generated
	 * @ordered
	 */
	protected EList<EffectPipeline> effectPipeline;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckered() <em>Checkered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckered() <em>Checkered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckered()
	 * @generated
	 * @ordered
	 */
	protected boolean checkered = CHECKERED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTileplacement() <em>Tileplacement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTileplacement()
	 * @generated
	 * @ordered
	 */
	protected EList<TilePlacement> tileplacement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BgPackage.Literals.BOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tile> getTiles() {
		if (tiles == null) {
			tiles = new EObjectContainmentEList<Tile>(Tile.class, this, BgPackage.BOARD__TILES);
		}
		return tiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LegalMovesPipeline> getLegalMovesPipeline() {
		if (legalMovesPipeline == null) {
			legalMovesPipeline = new EObjectContainmentEList<LegalMovesPipeline>(LegalMovesPipeline.class, this,
					BgPackage.BOARD__LEGAL_MOVES_PIPELINE);
		}
		return legalMovesPipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EffectPipeline> getEffectPipeline() {
		if (effectPipeline == null) {
			effectPipeline = new EObjectContainmentEList<EffectPipeline>(EffectPipeline.class, this,
					BgPackage.BOARD__EFFECT_PIPELINE);
		}
		return effectPipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCheckered() {
		return checkered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCheckered(boolean newCheckered) {
		boolean oldCheckered = checkered;
		checkered = newCheckered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BgPackage.BOARD__CHECKERED, oldCheckered, checkered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TilePlacement> getTileplacement() {
		if (tileplacement == null) {
			tileplacement = new EObjectContainmentEList<TilePlacement>(TilePlacement.class, this,
					BgPackage.BOARD__TILEPLACEMENT);
		}
		return tileplacement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BgPackage.BOARD__TILES:
			return ((InternalEList<?>) getTiles()).basicRemove(otherEnd, msgs);
		case BgPackage.BOARD__LEGAL_MOVES_PIPELINE:
			return ((InternalEList<?>) getLegalMovesPipeline()).basicRemove(otherEnd, msgs);
		case BgPackage.BOARD__EFFECT_PIPELINE:
			return ((InternalEList<?>) getEffectPipeline()).basicRemove(otherEnd, msgs);
		case BgPackage.BOARD__TILEPLACEMENT:
			return ((InternalEList<?>) getTileplacement()).basicRemove(otherEnd, msgs);
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
		case BgPackage.BOARD__WIDTH:
			return getWidth();
		case BgPackage.BOARD__TILES:
			return getTiles();
		case BgPackage.BOARD__LEGAL_MOVES_PIPELINE:
			return getLegalMovesPipeline();
		case BgPackage.BOARD__EFFECT_PIPELINE:
			return getEffectPipeline();
		case BgPackage.BOARD__HEIGHT:
			return getHeight();
		case BgPackage.BOARD__CHECKERED:
			return isCheckered();
		case BgPackage.BOARD__TILEPLACEMENT:
			return getTileplacement();
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
		case BgPackage.BOARD__WIDTH:
			setWidth((Integer) newValue);
			return;
		case BgPackage.BOARD__TILES:
			getTiles().clear();
			getTiles().addAll((Collection<? extends Tile>) newValue);
			return;
		case BgPackage.BOARD__LEGAL_MOVES_PIPELINE:
			getLegalMovesPipeline().clear();
			getLegalMovesPipeline().addAll((Collection<? extends LegalMovesPipeline>) newValue);
			return;
		case BgPackage.BOARD__EFFECT_PIPELINE:
			getEffectPipeline().clear();
			getEffectPipeline().addAll((Collection<? extends EffectPipeline>) newValue);
			return;
		case BgPackage.BOARD__HEIGHT:
			setHeight((Integer) newValue);
			return;
		case BgPackage.BOARD__CHECKERED:
			setCheckered((Boolean) newValue);
			return;
		case BgPackage.BOARD__TILEPLACEMENT:
			getTileplacement().clear();
			getTileplacement().addAll((Collection<? extends TilePlacement>) newValue);
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
		case BgPackage.BOARD__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case BgPackage.BOARD__TILES:
			getTiles().clear();
			return;
		case BgPackage.BOARD__LEGAL_MOVES_PIPELINE:
			getLegalMovesPipeline().clear();
			return;
		case BgPackage.BOARD__EFFECT_PIPELINE:
			getEffectPipeline().clear();
			return;
		case BgPackage.BOARD__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case BgPackage.BOARD__CHECKERED:
			setCheckered(CHECKERED_EDEFAULT);
			return;
		case BgPackage.BOARD__TILEPLACEMENT:
			getTileplacement().clear();
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
		case BgPackage.BOARD__WIDTH:
			return width != WIDTH_EDEFAULT;
		case BgPackage.BOARD__TILES:
			return tiles != null && !tiles.isEmpty();
		case BgPackage.BOARD__LEGAL_MOVES_PIPELINE:
			return legalMovesPipeline != null && !legalMovesPipeline.isEmpty();
		case BgPackage.BOARD__EFFECT_PIPELINE:
			return effectPipeline != null && !effectPipeline.isEmpty();
		case BgPackage.BOARD__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case BgPackage.BOARD__CHECKERED:
			return checkered != CHECKERED_EDEFAULT;
		case BgPackage.BOARD__TILEPLACEMENT:
			return tileplacement != null && !tileplacement.isEmpty();
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", checkered: ");
		result.append(checkered);
		result.append(')');
		return result.toString();
	}

} //BoardImpl
