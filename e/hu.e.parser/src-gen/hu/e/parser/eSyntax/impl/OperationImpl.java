/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.Variable;
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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperationImpl#getReturnvar <em>Returnvar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends OperationSignatureImpl implements Operation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Variable> params;

  /**
   * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlock()
   * @generated
   * @ordered
   */
  protected OperationBlock block;

  /**
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected XExpression return_;

  /**
   * The cached value of the '{@link #getReturnvar() <em>Returnvar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnvar()
   * @generated
   * @ordered
   */
  protected Variable returnvar;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return ESyntaxPackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Variable>(Variable.class, this, ESyntaxPackage.OPERATION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationBlock getBlock()
  {
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBlock(OperationBlock newBlock, NotificationChain msgs)
  {
    OperationBlock oldBlock = block;
    block = newBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION__BLOCK, oldBlock, newBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBlock(OperationBlock newBlock)
  {
    if (newBlock != block)
    {
      NotificationChain msgs = null;
      if (block != null)
        msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION__BLOCK, null, msgs);
      if (newBlock != null)
        msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION__BLOCK, null, msgs);
      msgs = basicSetBlock(newBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION__BLOCK, newBlock, newBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(XExpression newReturn, NotificationChain msgs)
  {
    XExpression oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(XExpression newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION__RETURN, newReturn, newReturn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getReturnvar()
  {
    return returnvar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnvar(Variable newReturnvar, NotificationChain msgs)
  {
    Variable oldReturnvar = returnvar;
    returnvar = newReturnvar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION__RETURNVAR, oldReturnvar, newReturnvar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnvar(Variable newReturnvar)
  {
    if (newReturnvar != returnvar)
    {
      NotificationChain msgs = null;
      if (returnvar != null)
        msgs = ((InternalEObject)returnvar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION__RETURNVAR, null, msgs);
      if (newReturnvar != null)
        msgs = ((InternalEObject)newReturnvar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.OPERATION__RETURNVAR, null, msgs);
      msgs = basicSetReturnvar(newReturnvar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATION__RETURNVAR, newReturnvar, newReturnvar));
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
      case ESyntaxPackage.OPERATION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case ESyntaxPackage.OPERATION__BLOCK:
        return basicSetBlock(null, msgs);
      case ESyntaxPackage.OPERATION__RETURN:
        return basicSetReturn(null, msgs);
      case ESyntaxPackage.OPERATION__RETURNVAR:
        return basicSetReturnvar(null, msgs);
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
      case ESyntaxPackage.OPERATION__NAME:
        return getName();
      case ESyntaxPackage.OPERATION__PARAMS:
        return getParams();
      case ESyntaxPackage.OPERATION__BLOCK:
        return getBlock();
      case ESyntaxPackage.OPERATION__RETURN:
        return getReturn();
      case ESyntaxPackage.OPERATION__RETURNVAR:
        return getReturnvar();
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
      case ESyntaxPackage.OPERATION__NAME:
        setName((String)newValue);
        return;
      case ESyntaxPackage.OPERATION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Variable>)newValue);
        return;
      case ESyntaxPackage.OPERATION__BLOCK:
        setBlock((OperationBlock)newValue);
        return;
      case ESyntaxPackage.OPERATION__RETURN:
        setReturn((XExpression)newValue);
        return;
      case ESyntaxPackage.OPERATION__RETURNVAR:
        setReturnvar((Variable)newValue);
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
      case ESyntaxPackage.OPERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ESyntaxPackage.OPERATION__PARAMS:
        getParams().clear();
        return;
      case ESyntaxPackage.OPERATION__BLOCK:
        setBlock((OperationBlock)null);
        return;
      case ESyntaxPackage.OPERATION__RETURN:
        setReturn((XExpression)null);
        return;
      case ESyntaxPackage.OPERATION__RETURNVAR:
        setReturnvar((Variable)null);
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
      case ESyntaxPackage.OPERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ESyntaxPackage.OPERATION__PARAMS:
        return params != null && !params.isEmpty();
      case ESyntaxPackage.OPERATION__BLOCK:
        return block != null;
      case ESyntaxPackage.OPERATION__RETURN:
        return return_ != null;
      case ESyntaxPackage.OPERATION__RETURNVAR:
        return returnvar != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
