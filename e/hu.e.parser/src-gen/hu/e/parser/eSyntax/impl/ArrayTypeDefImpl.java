/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.XExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.ArrayTypeDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.ArrayTypeDefImpl#getLength <em>Length</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayTypeDefImpl extends TypeDefImpl implements ArrayTypeDef
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getLength() <em>Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLength()
   * @generated
   * @ordered
   */
  protected XExpression length;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayTypeDefImpl()
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
    return ESyntaxPackage.Literals.ARRAY_TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (Type)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESyntaxPackage.ARRAY_TYPE_DEF__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.ARRAY_TYPE_DEF__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getLength()
  {
    return length;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLength(XExpression newLength, NotificationChain msgs)
  {
    XExpression oldLength = length;
    length = newLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH, oldLength, newLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLength(XExpression newLength)
  {
    if (newLength != length)
    {
      NotificationChain msgs = null;
      if (length != null)
        msgs = ((InternalEObject)length).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH, null, msgs);
      if (newLength != null)
        msgs = ((InternalEObject)newLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH, null, msgs);
      msgs = basicSetLength(newLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH, newLength, newLength));
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
      case ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH:
        return basicSetLength(null, msgs);
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
      case ESyntaxPackage.ARRAY_TYPE_DEF__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH:
        return getLength();
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
      case ESyntaxPackage.ARRAY_TYPE_DEF__TYPE:
        setType((Type)newValue);
        return;
      case ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH:
        setLength((XExpression)newValue);
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
      case ESyntaxPackage.ARRAY_TYPE_DEF__TYPE:
        setType((Type)null);
        return;
      case ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH:
        setLength((XExpression)null);
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
      case ESyntaxPackage.ARRAY_TYPE_DEF__TYPE:
        return type != null;
      case ESyntaxPackage.ARRAY_TYPE_DEF__LENGTH:
        return length != null;
    }
    return super.eIsSet(featureID);
  }

} //ArrayTypeDefImpl
