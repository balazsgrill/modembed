/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.XExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationBlockImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationBlockImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationBlockImpl extends XExpressionBlockImpl implements OperationBlock
{
  /**
   * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSteps()
   * @generated
   * @ordered
   */
  protected EList<OperationStep> steps;

  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected XExpression result;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationBlockImpl()
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
    return ESyntaxPackage.Literals.OPERATION_BLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationStep> getSteps()
  {
    if (steps == null)
    {
      steps = new EObjectContainmentEList<OperationStep>(OperationStep.class, this, ESyntaxPackage.OPERATION_BLOCK__STEPS);
    }
    return steps;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(XExpression newResult, NotificationChain msgs)
  {
    XExpression oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION_BLOCK__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(XExpression newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION_BLOCK__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION_BLOCK__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION_BLOCK__RESULT, newResult, newResult));
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
      case ESyntaxPackage.OPERATION_BLOCK__STEPS:
        return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
      case ESyntaxPackage.OPERATION_BLOCK__RESULT:
        return basicSetResult(null, msgs);
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
      case ESyntaxPackage.OPERATION_BLOCK__STEPS:
        return getSteps();
      case ESyntaxPackage.OPERATION_BLOCK__RESULT:
        return getResult();
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
      case ESyntaxPackage.OPERATION_BLOCK__STEPS:
        getSteps().clear();
        getSteps().addAll((Collection<? extends OperationStep>)newValue);
        return;
      case ESyntaxPackage.OPERATION_BLOCK__RESULT:
        setResult((XExpression)newValue);
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
      case ESyntaxPackage.OPERATION_BLOCK__STEPS:
        getSteps().clear();
        return;
      case ESyntaxPackage.OPERATION_BLOCK__RESULT:
        setResult((XExpression)null);
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
      case ESyntaxPackage.OPERATION_BLOCK__STEPS:
        return steps != null && !steps.isEmpty();
      case ESyntaxPackage.OPERATION_BLOCK__RESULT:
        return result != null;
    }
    return super.eIsSet(featureID);
  }

} //OperationBlockImpl
