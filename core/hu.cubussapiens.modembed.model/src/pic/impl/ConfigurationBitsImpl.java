/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package pic.impl;

import java.util.Collection;

import modembedconfig.Scheme;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pic.ConfigurationBits;
import pic.ConfigurationWord;
import pic.PicPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Bits</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link pic.impl.ConfigurationBitsImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link pic.impl.ConfigurationBitsImpl#getWords <em>Words</em>}</li>
 *   <li>{@link pic.impl.ConfigurationBitsImpl#getWordsize <em>Wordsize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationBitsImpl extends EObjectImpl implements ConfigurationBits {
	/**
	 * The cached value of the '{@link #getScheme() <em>Scheme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheme()
	 * @generated
	 * @ordered
	 */
	protected Scheme scheme;

	/**
	 * The cached value of the '{@link #getWords() <em>Words</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWords()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigurationWord> words;

	/**
	 * The default value of the '{@link #getWordsize() <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsize()
	 * @generated
	 * @ordered
	 */
	protected static final int WORDSIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWordsize() <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWordsize()
	 * @generated
	 * @ordered
	 */
	protected int wordsize = WORDSIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationBitsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PicPackage.Literals.CONFIGURATION_BITS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scheme getScheme() {
		return scheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScheme(Scheme newScheme, NotificationChain msgs) {
		Scheme oldScheme = scheme;
		scheme = newScheme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PicPackage.CONFIGURATION_BITS__SCHEME, oldScheme, newScheme);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheme(Scheme newScheme) {
		if (newScheme != scheme) {
			NotificationChain msgs = null;
			if (scheme != null)
				msgs = ((InternalEObject)scheme).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PicPackage.CONFIGURATION_BITS__SCHEME, null, msgs);
			if (newScheme != null)
				msgs = ((InternalEObject)newScheme).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PicPackage.CONFIGURATION_BITS__SCHEME, null, msgs);
			msgs = basicSetScheme(newScheme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicPackage.CONFIGURATION_BITS__SCHEME, newScheme, newScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigurationWord> getWords() {
		if (words == null) {
			words = new EObjectContainmentEList<ConfigurationWord>(ConfigurationWord.class, this, PicPackage.CONFIGURATION_BITS__WORDS);
		}
		return words;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWordsize() {
		return wordsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWordsize(int newWordsize) {
		int oldWordsize = wordsize;
		wordsize = newWordsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PicPackage.CONFIGURATION_BITS__WORDSIZE, oldWordsize, wordsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PicPackage.CONFIGURATION_BITS__SCHEME:
				return basicSetScheme(null, msgs);
			case PicPackage.CONFIGURATION_BITS__WORDS:
				return ((InternalEList<?>)getWords()).basicRemove(otherEnd, msgs);
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
			case PicPackage.CONFIGURATION_BITS__SCHEME:
				return getScheme();
			case PicPackage.CONFIGURATION_BITS__WORDS:
				return getWords();
			case PicPackage.CONFIGURATION_BITS__WORDSIZE:
				return getWordsize();
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
			case PicPackage.CONFIGURATION_BITS__SCHEME:
				setScheme((Scheme)newValue);
				return;
			case PicPackage.CONFIGURATION_BITS__WORDS:
				getWords().clear();
				getWords().addAll((Collection<? extends ConfigurationWord>)newValue);
				return;
			case PicPackage.CONFIGURATION_BITS__WORDSIZE:
				setWordsize((Integer)newValue);
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
			case PicPackage.CONFIGURATION_BITS__SCHEME:
				setScheme((Scheme)null);
				return;
			case PicPackage.CONFIGURATION_BITS__WORDS:
				getWords().clear();
				return;
			case PicPackage.CONFIGURATION_BITS__WORDSIZE:
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
			case PicPackage.CONFIGURATION_BITS__SCHEME:
				return scheme != null;
			case PicPackage.CONFIGURATION_BITS__WORDS:
				return words != null && !words.isEmpty();
			case PicPackage.CONFIGURATION_BITS__WORDSIZE:
				return wordsize != WORDSIZE_EDEFAULT;
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
		result.append(" (wordsize: ");
		result.append(wordsize);
		result.append(')');
		return result.toString();
	}

} //ConfigurationBitsImpl
