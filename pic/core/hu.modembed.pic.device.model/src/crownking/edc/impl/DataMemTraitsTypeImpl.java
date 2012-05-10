/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.DataMemTraitsType;
import crownking.edc.EdcPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Mem Traits Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.DataMemTraitsTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link crownking.edc.impl.DataMemTraitsTypeImpl#getLocsize <em>Locsize</em>}</li>
 *   <li>{@link crownking.edc.impl.DataMemTraitsTypeImpl#getWordimpl <em>Wordimpl</em>}</li>
 *   <li>{@link crownking.edc.impl.DataMemTraitsTypeImpl#getWordinit <em>Wordinit</em>}</li>
 *   <li>{@link crownking.edc.impl.DataMemTraitsTypeImpl#getWordsafe <em>Wordsafe</em>}</li>
 *   <li>{@link crownking.edc.impl.DataMemTraitsTypeImpl#getWordsize <em>Wordsize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataMemTraitsTypeImpl extends EObjectImpl implements DataMemTraitsType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocsize() <em>Locsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocsize()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocsize() <em>Locsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocsize()
	 * @generated
	 * @ordered
	 */
	protected String locsize = LOCSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordimpl() <em>Wordimpl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordimpl()
	 * @generated
	 * @ordered
	 */
	protected static final String WORDIMPL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordimpl() <em>Wordimpl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordimpl()
	 * @generated
	 * @ordered
	 */
	protected String wordimpl = WORDIMPL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordinit() <em>Wordinit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordinit()
	 * @generated
	 * @ordered
	 */
	protected static final String WORDINIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordinit() <em>Wordinit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordinit()
	 * @generated
	 * @ordered
	 */
	protected String wordinit = WORDINIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordsafe() <em>Wordsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsafe()
	 * @generated
	 * @ordered
	 */
	protected static final String WORDSAFE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordsafe() <em>Wordsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsafe()
	 * @generated
	 * @ordered
	 */
	protected String wordsafe = WORDSAFE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWordsize() <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsize()
	 * @generated
	 * @ordered
	 */
	protected static final String WORDSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWordsize() <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsize()
	 * @generated
	 * @ordered
	 */
	protected String wordsize = WORDSIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataMemTraitsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getDataMemTraitsType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_MEM_TRAITS_TYPE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocsize() {
		return locsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocsize(String newLocsize) {
		String oldLocsize = locsize;
		locsize = newLocsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_MEM_TRAITS_TYPE__LOCSIZE, oldLocsize, locsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWordimpl() {
		return wordimpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordimpl(String newWordimpl) {
		String oldWordimpl = wordimpl;
		wordimpl = newWordimpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_MEM_TRAITS_TYPE__WORDIMPL, oldWordimpl, wordimpl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWordinit() {
		return wordinit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordinit(String newWordinit) {
		String oldWordinit = wordinit;
		wordinit = newWordinit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_MEM_TRAITS_TYPE__WORDINIT, oldWordinit, wordinit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWordsafe() {
		return wordsafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordsafe(String newWordsafe) {
		String oldWordsafe = wordsafe;
		wordsafe = newWordsafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSAFE, oldWordsafe, wordsafe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWordsize() {
		return wordsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordsize(String newWordsize) {
		String oldWordsize = wordsize;
		wordsize = newWordsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSIZE, oldWordsize, wordsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.DATA_MEM_TRAITS_TYPE__VALUE:
				return getValue();
			case EdcPackage.DATA_MEM_TRAITS_TYPE__LOCSIZE:
				return getLocsize();
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDIMPL:
				return getWordimpl();
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDINIT:
				return getWordinit();
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSAFE:
				return getWordsafe();
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSIZE:
				return getWordsize();
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
			case EdcPackage.DATA_MEM_TRAITS_TYPE__VALUE:
				setValue((String)newValue);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__LOCSIZE:
				setLocsize((String)newValue);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDIMPL:
				setWordimpl((String)newValue);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDINIT:
				setWordinit((String)newValue);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSAFE:
				setWordsafe((String)newValue);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSIZE:
				setWordsize((String)newValue);
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
			case EdcPackage.DATA_MEM_TRAITS_TYPE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__LOCSIZE:
				setLocsize(LOCSIZE_EDEFAULT);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDIMPL:
				setWordimpl(WORDIMPL_EDEFAULT);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDINIT:
				setWordinit(WORDINIT_EDEFAULT);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSAFE:
				setWordsafe(WORDSAFE_EDEFAULT);
				return;
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSIZE:
				setWordsize(WORDSIZE_EDEFAULT);
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
			case EdcPackage.DATA_MEM_TRAITS_TYPE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case EdcPackage.DATA_MEM_TRAITS_TYPE__LOCSIZE:
				return LOCSIZE_EDEFAULT == null ? locsize != null : !LOCSIZE_EDEFAULT.equals(locsize);
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDIMPL:
				return WORDIMPL_EDEFAULT == null ? wordimpl != null : !WORDIMPL_EDEFAULT.equals(wordimpl);
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDINIT:
				return WORDINIT_EDEFAULT == null ? wordinit != null : !WORDINIT_EDEFAULT.equals(wordinit);
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSAFE:
				return WORDSAFE_EDEFAULT == null ? wordsafe != null : !WORDSAFE_EDEFAULT.equals(wordsafe);
			case EdcPackage.DATA_MEM_TRAITS_TYPE__WORDSIZE:
				return WORDSIZE_EDEFAULT == null ? wordsize != null : !WORDSIZE_EDEFAULT.equals(wordsize);
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
		result.append(" (value: ");
		result.append(value);
		result.append(", locsize: ");
		result.append(locsize);
		result.append(", wordimpl: ");
		result.append(wordimpl);
		result.append(", wordinit: ");
		result.append(wordinit);
		result.append(", wordsafe: ");
		result.append(wordsafe);
		result.append(", wordsize: ");
		result.append(wordsize);
		result.append(')');
		return result.toString();
	}

} //DataMemTraitsTypeImpl
