/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.Operation;

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
 * An implementation of the model object '<em><b>Function Binary Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getMemwidth <em>Memwidth</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getMems <em>Mems</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionBinarySectionImpl extends BinarySectionImpl implements FunctionBinarySection
{
  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected Operation operation;

  /**
   * The default value of the '{@link #getMemwidth() <em>Memwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemwidth()
   * @generated
   * @ordered
   */
  protected static final String MEMWIDTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMemwidth() <em>Memwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemwidth()
   * @generated
   * @ordered
   */
  protected String memwidth = MEMWIDTH_EDEFAULT;

  /**
   * The cached value of the '{@link #getMems() <em>Mems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMems()
   * @generated
   * @ordered
   */
  protected EList<FunctionMemory> mems;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionBinarySectionImpl()
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
    return ESyntaxPackage.Literals.FUNCTION_BINARY_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getOperation()
  {
    if (operation != null && operation.eIsProxy())
    {
      InternalEObject oldOperation = (InternalEObject)operation;
      operation = (Operation)eResolveProxy(oldOperation);
      if (operation != oldOperation)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESyntaxPackage.FUNCTION_BINARY_SECTION__OPERATION, oldOperation, operation));
      }
    }
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperation(Operation newOperation)
  {
    Operation oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.FUNCTION_BINARY_SECTION__OPERATION, oldOperation, operation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMemwidth()
  {
    return memwidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemwidth(String newMemwidth)
  {
    String oldMemwidth = memwidth;
    memwidth = newMemwidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH, oldMemwidth, memwidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionMemory> getMems()
  {
    if (mems == null)
    {
      mems = new EObjectContainmentEList<FunctionMemory>(FunctionMemory.class, this, ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS);
    }
    return mems;
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        return ((InternalEList<?>)getMems()).basicRemove(otherEnd, msgs);
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OPERATION:
        if (resolve) return getOperation();
        return basicGetOperation();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH:
        return getMemwidth();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        return getMems();
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OPERATION:
        setOperation((Operation)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH:
        setMemwidth((String)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        getMems().clear();
        getMems().addAll((Collection<? extends FunctionMemory>)newValue);
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OPERATION:
        setOperation((Operation)null);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH:
        setMemwidth(MEMWIDTH_EDEFAULT);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        getMems().clear();
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OPERATION:
        return operation != null;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH:
        return MEMWIDTH_EDEFAULT == null ? memwidth != null : !MEMWIDTH_EDEFAULT.equals(memwidth);
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        return mems != null && !mems.isEmpty();
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
    result.append(" (memwidth: ");
    result.append(memwidth);
    result.append(')');
    return result.toString();
  }

} //FunctionBinarySectionImpl
