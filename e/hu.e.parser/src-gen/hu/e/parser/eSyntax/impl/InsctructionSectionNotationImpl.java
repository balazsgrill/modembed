/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.InsctructionSectionNotation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insctruction Section Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.InsctructionSectionNotationImpl#getParam <em>Param</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.InsctructionSectionNotationImpl#getValue <em>Value</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.InsctructionSectionNotationImpl#getSize <em>Size</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.InsctructionSectionNotationImpl#getShift <em>Shift</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsctructionSectionNotationImpl extends MinimalEObjectImpl.Container implements InsctructionSectionNotation
{
  /**
   * The default value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected static final String PARAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getParam() <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParam()
   * @generated
   * @ordered
   */
  protected String param = PARAM_EDEFAULT;

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
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getShift() <em>Shift</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShift()
   * @generated
   * @ordered
   */
  protected static final String SHIFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShift() <em>Shift</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShift()
   * @generated
   * @ordered
   */
  protected String shift = SHIFT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsctructionSectionNotationImpl()
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
    return ESyntaxPackage.Literals.INSCTRUCTION_SECTION_NOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getParam()
  {
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParam(String newParam)
  {
    String oldParam = param;
    param = newParam;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__PARAM, oldParam, param));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShift()
  {
    return shift;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShift(String newShift)
  {
    String oldShift = shift;
    shift = newShift;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SHIFT, oldShift, shift));
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
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__PARAM:
        return getParam();
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__VALUE:
        return getValue();
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SIZE:
        return getSize();
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SHIFT:
        return getShift();
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
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__PARAM:
        setParam((String)newValue);
        return;
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__VALUE:
        setValue((String)newValue);
        return;
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SIZE:
        setSize((String)newValue);
        return;
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SHIFT:
        setShift((String)newValue);
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
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__PARAM:
        setParam(PARAM_EDEFAULT);
        return;
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SHIFT:
        setShift(SHIFT_EDEFAULT);
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
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__PARAM:
        return PARAM_EDEFAULT == null ? param != null : !PARAM_EDEFAULT.equals(param);
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION__SHIFT:
        return SHIFT_EDEFAULT == null ? shift != null : !SHIFT_EDEFAULT.equals(shift);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (param: ");
    result.append(param);
    result.append(", value: ");
    result.append(value);
    result.append(", size: ");
    result.append(size);
    result.append(", shift: ");
    result.append(shift);
    result.append(')');
    return result.toString();
  }

} //InsctructionSectionNotationImpl
