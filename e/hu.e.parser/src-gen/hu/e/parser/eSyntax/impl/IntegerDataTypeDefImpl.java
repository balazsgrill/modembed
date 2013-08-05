/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.IntegerDataTypeDef;
import hu.e.parser.eSyntax.IntegerKind;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Data Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.IntegerDataTypeDefImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.IntegerDataTypeDefImpl#getBits <em>Bits</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerDataTypeDefImpl extends DataTypeDefImpl implements IntegerDataTypeDef
{
  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final IntegerKind KIND_EDEFAULT = IntegerKind.UNSIGNED;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected IntegerKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getBits() <em>Bits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBits()
   * @generated
   * @ordered
   */
  protected static final int BITS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getBits() <em>Bits</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBits()
   * @generated
   * @ordered
   */
  protected int bits = BITS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntegerDataTypeDefImpl()
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
    return ESyntaxPackage.Literals.INTEGER_DATA_TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(IntegerKind newKind)
  {
    IntegerKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.INTEGER_DATA_TYPE_DEF__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getBits()
  {
    return bits;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBits(int newBits)
  {
    int oldBits = bits;
    bits = newBits;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.INTEGER_DATA_TYPE_DEF__BITS, oldBits, bits));
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
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF__KIND:
        return getKind();
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF__BITS:
        return getBits();
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
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF__KIND:
        setKind((IntegerKind)newValue);
        return;
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF__BITS:
        setBits((Integer)newValue);
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
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF__BITS:
        setBits(BITS_EDEFAULT);
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
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF__KIND:
        return kind != KIND_EDEFAULT;
      case ESyntaxPackage.INTEGER_DATA_TYPE_DEF__BITS:
        return bits != BITS_EDEFAULT;
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
    result.append(" (kind: ");
    result.append(kind);
    result.append(", bits: ");
    result.append(bits);
    result.append(')');
    return result.toString();
  }

} //IntegerDataTypeDefImpl