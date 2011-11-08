/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.BOOLEAN_OPERATOR;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XExpression5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.XExpression5Impl#getA <em>A</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XExpression5Impl#getOp <em>Op</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XExpression5Impl#getB <em>B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XExpression5Impl extends XExpressionImpl implements XExpression5
{
  /**
   * The cached value of the '{@link #getA() <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getA()
   * @generated
   * @ordered
   */
  protected XExpression4 a;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected EList<BOOLEAN_OPERATOR> op;

  /**
   * The cached value of the '{@link #getB() <em>B</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getB()
   * @generated
   * @ordered
   */
  protected EList<XExpression4> b;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XExpression5Impl()
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
    return ESyntaxPackage.Literals.XEXPRESSION5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression4 getA()
  {
    return a;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetA(XExpression4 newA, NotificationChain msgs)
  {
    XExpression4 oldA = a;
    a = newA;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XEXPRESSION5__A, oldA, newA);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setA(XExpression4 newA)
  {
    if (newA != a)
    {
      NotificationChain msgs = null;
      if (a != null)
        msgs = ((InternalEObject)a).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XEXPRESSION5__A, null, msgs);
      if (newA != null)
        msgs = ((InternalEObject)newA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XEXPRESSION5__A, null, msgs);
      msgs = basicSetA(newA, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XEXPRESSION5__A, newA, newA));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BOOLEAN_OPERATOR> getOp()
  {
    if (op == null)
    {
      op = new EDataTypeEList<BOOLEAN_OPERATOR>(BOOLEAN_OPERATOR.class, this, ESyntaxPackage.XEXPRESSION5__OP);
    }
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression4> getB()
  {
    if (b == null)
    {
      b = new EObjectContainmentEList<XExpression4>(XExpression4.class, this, ESyntaxPackage.XEXPRESSION5__B);
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
      case ESyntaxPackage.XEXPRESSION5__A:
        return basicSetA(null, msgs);
      case ESyntaxPackage.XEXPRESSION5__B:
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
      case ESyntaxPackage.XEXPRESSION5__A:
        return getA();
      case ESyntaxPackage.XEXPRESSION5__OP:
        return getOp();
      case ESyntaxPackage.XEXPRESSION5__B:
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
      case ESyntaxPackage.XEXPRESSION5__A:
        setA((XExpression4)newValue);
        return;
      case ESyntaxPackage.XEXPRESSION5__OP:
        getOp().clear();
        getOp().addAll((Collection<? extends BOOLEAN_OPERATOR>)newValue);
        return;
      case ESyntaxPackage.XEXPRESSION5__B:
        getB().clear();
        getB().addAll((Collection<? extends XExpression4>)newValue);
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
      case ESyntaxPackage.XEXPRESSION5__A:
        setA((XExpression4)null);
        return;
      case ESyntaxPackage.XEXPRESSION5__OP:
        getOp().clear();
        return;
      case ESyntaxPackage.XEXPRESSION5__B:
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
      case ESyntaxPackage.XEXPRESSION5__A:
        return a != null;
      case ESyntaxPackage.XEXPRESSION5__OP:
        return op != null && !op.isEmpty();
      case ESyntaxPackage.XEXPRESSION5__B:
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

} //XExpression5Impl
