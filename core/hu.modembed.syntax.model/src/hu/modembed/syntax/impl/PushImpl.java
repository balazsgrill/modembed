/**
 */
package hu.modembed.syntax.impl;

import hu.modembed.syntax.Push;
import hu.modembed.syntax.SyntaxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.syntax.impl.PushImpl#getEclassURI <em>Eclass URI</em>}</li>
 *   <li>{@link hu.modembed.syntax.impl.PushImpl#getFeatue <em>Featue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PushImpl extends RuleItemImpl implements Push {
	/**
	 * The default value of the '{@link #getEclassURI() <em>Eclass URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclassURI()
	 * @generated
	 * @ordered
	 */
	protected static final String ECLASS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEclassURI() <em>Eclass URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEclassURI()
	 * @generated
	 * @ordered
	 */
	protected String eclassURI = ECLASS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatue() <em>Featue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatue()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatue() <em>Featue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatue()
	 * @generated
	 * @ordered
	 */
	protected String featue = FEATUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyntaxPackage.Literals.PUSH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEclassURI() {
		return eclassURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEclassURI(String newEclassURI) {
		String oldEclassURI = eclassURI;
		eclassURI = newEclassURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.PUSH__ECLASS_URI, oldEclassURI, eclassURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFeatue() {
		return featue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatue(String newFeatue) {
		String oldFeatue = featue;
		featue = newFeatue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.PUSH__FEATUE, oldFeatue, featue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SyntaxPackage.PUSH__ECLASS_URI:
				return getEclassURI();
			case SyntaxPackage.PUSH__FEATUE:
				return getFeatue();
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
			case SyntaxPackage.PUSH__ECLASS_URI:
				setEclassURI((String)newValue);
				return;
			case SyntaxPackage.PUSH__FEATUE:
				setFeatue((String)newValue);
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
			case SyntaxPackage.PUSH__ECLASS_URI:
				setEclassURI(ECLASS_URI_EDEFAULT);
				return;
			case SyntaxPackage.PUSH__FEATUE:
				setFeatue(FEATUE_EDEFAULT);
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
			case SyntaxPackage.PUSH__ECLASS_URI:
				return ECLASS_URI_EDEFAULT == null ? eclassURI != null : !ECLASS_URI_EDEFAULT.equals(eclassURI);
			case SyntaxPackage.PUSH__FEATUE:
				return FEATUE_EDEFAULT == null ? featue != null : !FEATUE_EDEFAULT.equals(featue);
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
		result.append(" (eclassURI: ");
		result.append(eclassURI);
		result.append(", featue: ");
		result.append(featue);
		result.append(')');
		return result.toString();
	}

} //PushImpl
