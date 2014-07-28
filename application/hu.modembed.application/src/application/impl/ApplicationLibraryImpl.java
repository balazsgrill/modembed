/**
 */
package application.impl;

import application.ApplicationLibrary;
import application.ApplicationPackage;
import application.LibraryElement;
import java.util.Collection;
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
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link application.impl.ApplicationLibraryImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link application.impl.ApplicationLibraryImpl#getQualifiedId <em>Qualified Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationLibraryImpl extends MinimalEObjectImpl.Container implements ApplicationLibrary {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<LibraryElement> elements;

	/**
	 * The default value of the '{@link #getQualifiedId() <em>Qualified Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getQualifiedId() <em>Qualified Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedId()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedId = QUALIFIED_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApplicationPackage.Literals.APPLICATION_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LibraryElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<LibraryElement>(LibraryElement.class, this, ApplicationPackage.APPLICATION_LIBRARY__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualifiedId() {
		return qualifiedId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualifiedId(String newQualifiedId) {
		String oldQualifiedId = qualifiedId;
		qualifiedId = newQualifiedId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApplicationPackage.APPLICATION_LIBRARY__QUALIFIED_ID, oldQualifiedId, qualifiedId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApplicationPackage.APPLICATION_LIBRARY__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case ApplicationPackage.APPLICATION_LIBRARY__ELEMENTS:
				return getElements();
			case ApplicationPackage.APPLICATION_LIBRARY__QUALIFIED_ID:
				return getQualifiedId();
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
			case ApplicationPackage.APPLICATION_LIBRARY__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends LibraryElement>)newValue);
				return;
			case ApplicationPackage.APPLICATION_LIBRARY__QUALIFIED_ID:
				setQualifiedId((String)newValue);
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
			case ApplicationPackage.APPLICATION_LIBRARY__ELEMENTS:
				getElements().clear();
				return;
			case ApplicationPackage.APPLICATION_LIBRARY__QUALIFIED_ID:
				setQualifiedId(QUALIFIED_ID_EDEFAULT);
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
			case ApplicationPackage.APPLICATION_LIBRARY__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case ApplicationPackage.APPLICATION_LIBRARY__QUALIFIED_ID:
				return QUALIFIED_ID_EDEFAULT == null ? qualifiedId != null : !QUALIFIED_ID_EDEFAULT.equals(qualifiedId);
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
		result.append(" (qualifiedId: ");
		result.append(qualifiedId);
		result.append(')');
		return result.toString();
	}

} //ApplicationLibraryImpl
