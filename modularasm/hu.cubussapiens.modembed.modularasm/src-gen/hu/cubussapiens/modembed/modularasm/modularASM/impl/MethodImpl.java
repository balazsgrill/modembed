/**
 * <copyright>
 * </copyright>
 *

 */
package hu.cubussapiens.modembed.modularasm.modularASM.impl;

import hu.cubussapiens.modembed.modularasm.modularASM.Method;
import hu.cubussapiens.modembed.modularasm.modularASM.MethodParam;
import hu.cubussapiens.modembed.modularasm.modularASM.ModularASMPackage;
import hu.cubussapiens.modembed.modularasm.modularASM.Step;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodImpl#getParams <em>Params</em>}</li>
 *   <li>{@link hu.cubussapiens.modembed.modularasm.modularASM.impl.MethodImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends ModuleItemImpl implements Method
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<MethodParam> params;

  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected EList<Step> step;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
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
    return ModularASMPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MethodParam> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<MethodParam>(MethodParam.class, this, ModularASMPackage.METHOD__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Step> getStep()
  {
    if (step == null)
    {
      step = new EObjectContainmentEList<Step>(Step.class, this, ModularASMPackage.METHOD__STEP);
    }
    return step;
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
      case ModularASMPackage.METHOD__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case ModularASMPackage.METHOD__STEP:
        return ((InternalEList<?>)getStep()).basicRemove(otherEnd, msgs);
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
      case ModularASMPackage.METHOD__PARAMS:
        return getParams();
      case ModularASMPackage.METHOD__STEP:
        return getStep();
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
      case ModularASMPackage.METHOD__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends MethodParam>)newValue);
        return;
      case ModularASMPackage.METHOD__STEP:
        getStep().clear();
        getStep().addAll((Collection<? extends Step>)newValue);
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
      case ModularASMPackage.METHOD__PARAMS:
        getParams().clear();
        return;
      case ModularASMPackage.METHOD__STEP:
        getStep().clear();
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
      case ModularASMPackage.METHOD__PARAMS:
        return params != null && !params.isEmpty();
      case ModularASMPackage.METHOD__STEP:
        return step != null && !step.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodImpl
