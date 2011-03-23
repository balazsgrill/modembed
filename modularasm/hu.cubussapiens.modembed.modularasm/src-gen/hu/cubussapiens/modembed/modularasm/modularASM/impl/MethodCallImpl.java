/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM.impl;

import hu.cubussapiens.modembed.modularasm.modularASM.MethodCall;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodCallParam;
import hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage;
import hu.cubussapiens.modembed.modularasm.modularASM.QualifiedID;

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
 * An implementation of the model object '<em><b>Method Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodCallImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodCallImpl extends StepImpl implements MethodCall
{
  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected QualifiedID method;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<MethodCallParam> params;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodCallImpl()
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
    return ModularASMPackage.Literals.METHOD_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedID getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(QualifiedID newMethod, NotificationChain msgs)
  {
    QualifiedID oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModularASMPackage.METHOD_CALL__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(QualifiedID newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModularASMPackage.METHOD_CALL__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModularASMPackage.METHOD_CALL__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModularASMPackage.METHOD_CALL__METHOD, newMethod, newMethod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MethodCallParam> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<MethodCallParam>(MethodCallParam.class, this, ModularASMPackage.METHOD_CALL__PARAMS);
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
      case ModularASMPackage.METHOD_CALL__METHOD:
        return basicSetMethod(null, msgs);
      case ModularASMPackage.METHOD_CALL__PARAMS:
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
      case ModularASMPackage.METHOD_CALL__METHOD:
        return getMethod();
      case ModularASMPackage.METHOD_CALL__PARAMS:
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
      case ModularASMPackage.METHOD_CALL__METHOD:
        setMethod((QualifiedID)newValue);
        return;
      case ModularASMPackage.METHOD_CALL__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends MethodCallParam>)newValue);
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
      case ModularASMPackage.METHOD_CALL__METHOD:
        setMethod((QualifiedID)null);
        return;
      case ModularASMPackage.METHOD_CALL__PARAMS:
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
      case ModularASMPackage.METHOD_CALL__METHOD:
        return method != null;
      case ModularASMPackage.METHOD_CALL__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodCallImpl
