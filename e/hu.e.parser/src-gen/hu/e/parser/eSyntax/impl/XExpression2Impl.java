/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.MULTIPLICATIVE_OPERATOR;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XExpression2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.XExpression2Impl#getA <em>A</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XExpression2Impl#getOp <em>Op</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XExpression2Impl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XExpression2Impl extends MinimalEObjectImpl.Container implements XExpression2
{
  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected XExpression1 a;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected EList<MULTIPLICATIVE_OPERATOR> op;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected EList<XExpression2> b;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XExpression2Impl()
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
    return ESyntaxPackage.Literals.XEXPRESSION2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression1 getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(XExpression1 newA, NotificationChain msgs)
  {
    XExpression1 oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XEXPRESSION2__A, oldA, newA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(XExpression1 newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XEXPRESSION2__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XEXPRESSION2__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XEXPRESSION2__A, newA, newA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MULTIPLICATIVE_OPERATOR> getOp()
  {
    if (op == null)
    {
      op = new EDataTypeEList<MULTIPLICATIVE_OPERATOR>(MULTIPLICATIVE_OPERATOR.class, this, ESyntaxPackage.XEXPRESSION2__OP);
    }
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression2> getB()
  {
    if (b == null)
    {
      b = new EObjectContainmentEList<XExpression2>(XExpression2.class, this, ESyntaxPackage.XEXPRESSION2__B);
    }
    return b;
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
      case ESyntaxPackage.XEXPRESSION2__A:
        return basicSetA(null, msgs);
      case ESyntaxPackage.XEXPRESSION2__B:
        return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
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
      case ESyntaxPackage.XEXPRESSION2__A:
        return getA();
      case ESyntaxPackage.XEXPRESSION2__OP:
        return getOp();
      case ESyntaxPackage.XEXPRESSION2__B:
        return getB();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ESyntaxPackage.XEXPRESSION2__A:
        setA((XExpression1)newValue);
        return;
      case ESyntaxPackage.XEXPRESSION2__OP:
        getOp().clear();
        getOp().addAll((Collection<? extends MULTIPLICATIVE_OPERATOR>)newValue);
        return;
      case ESyntaxPackage.XEXPRESSION2__B:
        getB().clear();
        getB().addAll((Collection<? extends XExpression2>)newValue);
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
      case ESyntaxPackage.XEXPRESSION2__A:
        setA((XExpression1)null);
        return;
      case ESyntaxPackage.XEXPRESSION2__OP:
        getOp().clear();
        return;
      case ESyntaxPackage.XEXPRESSION2__B:
        getB().clear();
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
      case ESyntaxPackage.XEXPRESSION2__A:
        return a != null;
      case ESyntaxPackage.XEXPRESSION2__OP:
        return op != null && !op.isEmpty();
      case ESyntaxPackage.XEXPRESSION2__B:
        return b != null && !b.isEmpty();
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //XExpression2Impl
