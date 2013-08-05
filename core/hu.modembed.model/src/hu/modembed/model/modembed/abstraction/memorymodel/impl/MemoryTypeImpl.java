/**
 */
package hu.modembed.model.modembed.abstraction.memorymodel.impl;

import hu.modembed.model.modembed.abstraction.memorymodel.MemoryType;
import hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelPackage;

import hu.modembed.model.modembed.infrastructure.AttributeContainerDefinition;

import hu.modembed.model.modembed.infrastructure.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl#getAccessCost <em>Access Cost</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl#isContentVolatile <em>Content Volatile</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl#isForData <em>For Data</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.abstraction.memorymodel.impl.MemoryTypeImpl#isForProgram <em>For Program</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemoryTypeImpl extends NamedElementImpl implements MemoryType {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected AttributeContainerDefinition attributes;

	/**
	 * The default value of the '{@link #getAccessCost() <em>Access Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessCost()
	 * @generated
	 * @ordered
	 */
	protected static final int ACCESS_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAccessCost() <em>Access Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessCost()
	 * @generated
	 * @ordered
	 */
	protected int accessCost = ACCESS_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #isContentVolatile() <em>Content Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContentVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTENT_VOLATILE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContentVolatile() <em>Content Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContentVolatile()
	 * @generated
	 * @ordered
	 */
	protected boolean contentVolatile = CONTENT_VOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #isForData() <em>For Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForData() <em>For Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForData()
	 * @generated
	 * @ordered
	 */
	protected boolean forData = FOR_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isForProgram() <em>For Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForProgram()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FOR_PROGRAM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForProgram() <em>For Program</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForProgram()
	 * @generated
	 * @ordered
	 */
	protected boolean forProgram = FOR_PROGRAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemorymodelPackage.Literals.MEMORY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeContainerDefinition getAttributes() {
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributes(AttributeContainerDefinition newAttributes, NotificationChain msgs) {
		AttributeContainerDefinition oldAttributes = attributes;
		attributes = newAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES, oldAttributes, newAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributes(AttributeContainerDefinition newAttributes) {
		if (newAttributes != attributes) {
			NotificationChain msgs = null;
			if (attributes != null)
				msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES, null, msgs);
			if (newAttributes != null)
				msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES, null, msgs);
			msgs = basicSetAttributes(newAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES, newAttributes, newAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAccessCost() {
		return accessCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessCost(int newAccessCost) {
		int oldAccessCost = accessCost;
		accessCost = newAccessCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemorymodelPackage.MEMORY_TYPE__ACCESS_COST, oldAccessCost, accessCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContentVolatile() {
		return contentVolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentVolatile(boolean newContentVolatile) {
		boolean oldContentVolatile = contentVolatile;
		contentVolatile = newContentVolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE, oldContentVolatile, contentVolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForData() {
		return forData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForData(boolean newForData) {
		boolean oldForData = forData;
		forData = newForData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemorymodelPackage.MEMORY_TYPE__FOR_DATA, oldForData, forData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForProgram() {
		return forProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForProgram(boolean newForProgram) {
		boolean oldForProgram = forProgram;
		forProgram = newForProgram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM, oldForProgram, forProgram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES:
				return basicSetAttributes(null, msgs);
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
			case MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES:
				return getAttributes();
			case MemorymodelPackage.MEMORY_TYPE__ACCESS_COST:
				return getAccessCost();
			case MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE:
				return isContentVolatile();
			case MemorymodelPackage.MEMORY_TYPE__FOR_DATA:
				return isForData();
			case MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM:
				return isForProgram();
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
			case MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES:
				setAttributes((AttributeContainerDefinition)newValue);
				return;
			case MemorymodelPackage.MEMORY_TYPE__ACCESS_COST:
				setAccessCost((Integer)newValue);
				return;
			case MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE:
				setContentVolatile((Boolean)newValue);
				return;
			case MemorymodelPackage.MEMORY_TYPE__FOR_DATA:
				setForData((Boolean)newValue);
				return;
			case MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM:
				setForProgram((Boolean)newValue);
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
			case MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES:
				setAttributes((AttributeContainerDefinition)null);
				return;
			case MemorymodelPackage.MEMORY_TYPE__ACCESS_COST:
				setAccessCost(ACCESS_COST_EDEFAULT);
				return;
			case MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE:
				setContentVolatile(CONTENT_VOLATILE_EDEFAULT);
				return;
			case MemorymodelPackage.MEMORY_TYPE__FOR_DATA:
				setForData(FOR_DATA_EDEFAULT);
				return;
			case MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM:
				setForProgram(FOR_PROGRAM_EDEFAULT);
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
			case MemorymodelPackage.MEMORY_TYPE__ATTRIBUTES:
				return attributes != null;
			case MemorymodelPackage.MEMORY_TYPE__ACCESS_COST:
				return accessCost != ACCESS_COST_EDEFAULT;
			case MemorymodelPackage.MEMORY_TYPE__CONTENT_VOLATILE:
				return contentVolatile != CONTENT_VOLATILE_EDEFAULT;
			case MemorymodelPackage.MEMORY_TYPE__FOR_DATA:
				return forData != FOR_DATA_EDEFAULT;
			case MemorymodelPackage.MEMORY_TYPE__FOR_PROGRAM:
				return forProgram != FOR_PROGRAM_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (accessCost: ");
		result.append(accessCost);
		result.append(", contentVolatile: ");
		result.append(contentVolatile);
		result.append(", forData: ");
		result.append(forData);
		result.append(", forProgram: ");
		result.append(forProgram);
		result.append(')');
		return result.toString();
	}

} //MemoryTypeImpl
