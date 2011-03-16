/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM.impl;

import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationField;
import hu.cubussapiens.modembed.modularasm.modularASM.ConfigurationFieldPlace;
import hu.cubussapiens.modembed.modularasm.modularASM.LiteralParam;
import hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Field Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldPlaceImpl#getBitNum <em>Bit Num</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldPlaceImpl#getStartBit <em>Start Bit</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.ConfigurationFieldPlaceImpl#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationFieldPlaceImpl extends MinimalEObjectImpl.Container implements ConfigurationFieldPlace
{
  /**
   * The cached value of the '{@link #getBitNum() <em>Bit Num</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBitNum()
   * @generated
   * @ordered
   */
  protected LiteralParam bitNum;

  /**
   * The cached value of the '{@link #getStartBit() <em>Start Bit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartBit()
   * @generated
   * @ordered
   */
  protected LiteralParam startBit;

  /**
   * The cached value of the '{@link #getField() <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getField()
   * @generated
   * @ordered
   */
  protected ConfigurationField field;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigurationFieldPlaceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModularASMPackage.Literals.CONFIGURATION_FIELD_PLACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralParam getBitNum()
  {
    return bitNum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBitNum(LiteralParam newBitNum, NotificationChain msgs)
  {
    LiteralParam oldBitNum = bitNum;
    bitNum = newBitNum;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM, oldBitNum, newBitNum);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBitNum(LiteralParam newBitNum)
  {
    if (newBitNum != bitNum)
    {
      NotificationChain msgs = null;
      if (bitNum != null)
        msgs = ((InternalEObject)bitNum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM, null, msgs);
      if (newBitNum != null)
        msgs = ((InternalEObject)newBitNum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM, null, msgs);
      msgs = basicSetBitNum(newBitNum, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM, newBitNum, newBitNum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LiteralParam getStartBit()
  {
    return startBit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStartBit(LiteralParam newStartBit, NotificationChain msgs)
  {
    LiteralParam oldStartBit = startBit;
    startBit = newStartBit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT, oldStartBit, newStartBit);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartBit(LiteralParam newStartBit)
  {
    if (newStartBit != startBit)
    {
      NotificationChain msgs = null;
      if (startBit != null)
        msgs = ((InternalEObject)startBit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT, null, msgs);
      if (newStartBit != null)
        msgs = ((InternalEObject)newStartBit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT, null, msgs);
      msgs = basicSetStartBit(newStartBit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT, newStartBit, newStartBit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigurationField getField()
  {
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetField(ConfigurationField newField, NotificationChain msgs)
  {
    ConfigurationField oldField = field;
    field = newField;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD, oldField, newField);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setField(ConfigurationField newField)
  {
    if (newField != field)
    {
      NotificationChain msgs = null;
      if (field != null)
        msgs = ((InternalEObject)field).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD, null, msgs);
      if (newField != null)
        msgs = ((InternalEObject)newField).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD, null, msgs);
      msgs = basicSetField(newField, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD, newField, newField));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM:
        return basicSetBitNum(null, msgs);
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT:
        return basicSetStartBit(null, msgs);
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD:
        return basicSetField(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM:
        return getBitNum();
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT:
        return getStartBit();
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD:
        return getField();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM:
        setBitNum((LiteralParam)newValue);
        return;
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT:
        setStartBit((LiteralParam)newValue);
        return;
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD:
        setField((ConfigurationField)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM:
        setBitNum((LiteralParam)null);
        return;
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT:
        setStartBit((LiteralParam)null);
        return;
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD:
        setField((ConfigurationField)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__BIT_NUM:
        return bitNum != null;
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__START_BIT:
        return startBit != null;
      case ModularASMPackage.CONFIGURATION_FIELD_PLACE__FIELD:
        return field != null;
    }
    return super.eIsSet(featureID);
  }

} //ConfigurationFieldPlaceImpl
