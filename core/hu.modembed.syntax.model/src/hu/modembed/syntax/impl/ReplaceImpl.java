/**
 */
package hu.modembed.syntax.impl;

import hu.modembed.model.modembed.infrastructure.impl.MODembedElementImpl;

import hu.modembed.syntax.Replace;
import hu.modembed.syntax.SyntaxPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Replace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.modembed.syntax.impl.ReplaceImpl#getSearch <em>Search</em>}</li>
 *   <li>{@link hu.modembed.syntax.impl.ReplaceImpl#getReplace <em>Replace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReplaceImpl extends MODembedElementImpl implements Replace {
	/**
	 * The default value of the '{@link #getSearch() <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected static final String SEARCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSearch() <em>Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearch()
	 * @generated
	 * @ordered
	 */
	protected String search = SEARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReplace() <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected static final String REPLACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReplace() <em>Replace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplace()
	 * @generated
	 * @ordered
	 */
	protected String replace = REPLACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReplaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyntaxPackage.Literals.REPLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSearch() {
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearch(String newSearch) {
		String oldSearch = search;
		search = newSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.REPLACE__SEARCH, oldSearch, search));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReplace() {
		return replace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplace(String newReplace) {
		String oldReplace = replace;
		replace = newReplace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyntaxPackage.REPLACE__REPLACE, oldReplace, replace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SyntaxPackage.REPLACE__SEARCH:
				return getSearch();
			case SyntaxPackage.REPLACE__REPLACE:
				return getReplace();
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
			case SyntaxPackage.REPLACE__SEARCH:
				setSearch((String)newValue);
				return;
			case SyntaxPackage.REPLACE__REPLACE:
				setReplace((String)newValue);
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
			case SyntaxPackage.REPLACE__SEARCH:
				setSearch(SEARCH_EDEFAULT);
				return;
			case SyntaxPackage.REPLACE__REPLACE:
				setReplace(REPLACE_EDEFAULT);
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
			case SyntaxPackage.REPLACE__SEARCH:
				return SEARCH_EDEFAULT == null ? search != null : !SEARCH_EDEFAULT.equals(search);
			case SyntaxPackage.REPLACE__REPLACE:
				return REPLACE_EDEFAULT == null ? replace != null : !REPLACE_EDEFAULT.equals(replace);
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
		result.append(" (search: ");
		result.append(search);
		result.append(", replace: ");
		result.append(replace);
		result.append(')');
		return result.toString();
	}

} //ReplaceImpl
