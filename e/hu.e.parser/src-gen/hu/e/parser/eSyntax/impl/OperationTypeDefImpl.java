/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.OperationParameter;
import hu.e.parser.eSyntax.OperationTypeDef;
import hu.e.parser.eSyntax.TypeDef;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationTypeDefImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationTypeDefImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationTypeDefImpl extends MinimalEObjectImpl.Container implements OperationTypeDef
{
  /**
   * The cached value of the '{@link #getResultType() <em>Result Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResultType()
   * @generated
   * @ordered
   */
  protected TypeDef resultType;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<OperationParameter> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationTypeDefImpl()
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
    return ESyntaxPackage.Literals.OPERATION_TYPE_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDef getResultType()
  {
    return resultType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResultType(TypeDef newResultType, NotificationChain msgs)
  {
    TypeDef oldResultType = resultType;
    resultType = newResultType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE, oldResultType, newResultType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResultType(TypeDef newResultType)
  {
    if (newResultType != resultType)
    {
      NotificationChain msgs = null;
      if (resultType != null)
        msgs = ((InternalEObject)resultType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE, null, msgs);
      if (newResultType != null)
        msgs = ((InternalEObject)newResultType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE, null, msgs);
      msgs = basicSetResultType(newResultType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE, newResultType, newResultType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OperationParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<OperationParameter>(OperationParameter.class, this, ESyntaxPackage.OPERATION_TYPE_DEF__PARAMS);
    }
    return params;
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
      case ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE:
        return basicSetResultType(null, msgs);
      case ESyntaxPackage.OPERATION_TYPE_DEF__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE:
        return getResultType();
      case ESyntaxPackage.OPERATION_TYPE_DEF__PARAMS:
        return getParams();
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
      case ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE:
        setResultType((TypeDef)newValue);
        return;
      case ESyntaxPackage.OPERATION_TYPE_DEF__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends OperationParameter>)newValue);
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
      case ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE:
        setResultType((TypeDef)null);
        return;
      case ESyntaxPackage.OPERATION_TYPE_DEF__PARAMS:
        getParams().clear();
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
      case ESyntaxPackage.OPERATION_TYPE_DEF__RESULT_TYPE:
        return resultType != null;
      case ESyntaxPackage.OPERATION_TYPE_DEF__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OperationTypeDefImpl
