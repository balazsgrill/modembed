/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package microchip.device.memory.impl;

import microchip.device.memory.MemoryPackage;
import microchip.device.memory.Stimulus;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stimulus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link microchip.device.memory.impl.StimulusImpl#getScl <em>Scl</em>}</li>
 *   <li>{@link microchip.device.memory.impl.StimulusImpl#getPcfiles <em>Pcfiles</em>}</li>
 *   <li>{@link microchip.device.memory.impl.StimulusImpl#getRegfiles <em>Regfiles</em>}</li>
 *   <li>{@link microchip.device.memory.impl.StimulusImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StimulusImpl extends EObjectImpl implements Stimulus {
	/**
	 * The default value of the '{@link #getScl() <em>Scl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScl()
	 * @generated
	 * @ordered
	 */
	protected static final String SCL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScl() <em>Scl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScl()
	 * @generated
	 * @ordered
	 */
	protected String scl = SCL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPcfiles() <em>Pcfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcfiles()
	 * @generated
	 * @ordered
	 */
	protected static final String PCFILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPcfiles() <em>Pcfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPcfiles()
	 * @generated
	 * @ordered
	 */
	protected String pcfiles = PCFILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegfiles() <em>Regfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegfiles()
	 * @generated
	 * @ordered
	 */
	protected static final String REGFILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegfiles() <em>Regfiles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegfiles()
	 * @generated
	 * @ordered
	 */
	protected String regfiles = REGFILES_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StimulusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MemoryPackage.Literals.STIMULUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScl() {
		return scl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScl(String newScl) {
		String oldScl = scl;
		scl = newScl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.STIMULUS__SCL, oldScl, scl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPcfiles() {
		return pcfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPcfiles(String newPcfiles) {
		String oldPcfiles = pcfiles;
		pcfiles = newPcfiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.STIMULUS__PCFILES, oldPcfiles, pcfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegfiles() {
		return regfiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegfiles(String newRegfiles) {
		String oldRegfiles = regfiles;
		regfiles = newRegfiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.STIMULUS__REGFILES, oldRegfiles, regfiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MemoryPackage.STIMULUS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MemoryPackage.STIMULUS__SCL:
				return getScl();
			case MemoryPackage.STIMULUS__PCFILES:
				return getPcfiles();
			case MemoryPackage.STIMULUS__REGFILES:
				return getRegfiles();
			case MemoryPackage.STIMULUS__TYPE:
				return getType();
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
			case MemoryPackage.STIMULUS__SCL:
				setScl((String)newValue);
				return;
			case MemoryPackage.STIMULUS__PCFILES:
				setPcfiles((String)newValue);
				return;
			case MemoryPackage.STIMULUS__REGFILES:
				setRegfiles((String)newValue);
				return;
			case MemoryPackage.STIMULUS__TYPE:
				setType((String)newValue);
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
			case MemoryPackage.STIMULUS__SCL:
				setScl(SCL_EDEFAULT);
				return;
			case MemoryPackage.STIMULUS__PCFILES:
				setPcfiles(PCFILES_EDEFAULT);
				return;
			case MemoryPackage.STIMULUS__REGFILES:
				setRegfiles(REGFILES_EDEFAULT);
				return;
			case MemoryPackage.STIMULUS__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MemoryPackage.STIMULUS__SCL:
				return SCL_EDEFAULT == null ? scl != null : !SCL_EDEFAULT.equals(scl);
			case MemoryPackage.STIMULUS__PCFILES:
				return PCFILES_EDEFAULT == null ? pcfiles != null : !PCFILES_EDEFAULT.equals(pcfiles);
			case MemoryPackage.STIMULUS__REGFILES:
				return REGFILES_EDEFAULT == null ? regfiles != null : !REGFILES_EDEFAULT.equals(regfiles);
			case MemoryPackage.STIMULUS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (scl: ");
		result.append(scl);
		result.append(", pcfiles: ");
		result.append(pcfiles);
		result.append(", regfiles: ");
		result.append(regfiles);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StimulusImpl
