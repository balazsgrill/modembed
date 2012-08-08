/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.XExpression;
import hu.e.parser.eSyntax.XForExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XFor Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.XForExpressionImpl#getVar <em>Var</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XForExpressionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XForExpressionImpl#getBy <em>By</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XForExpressionImpl#getTo <em>To</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XForExpressionImpl#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XForExpressionImpl extends XTopLevelExpressionImpl implements XForExpression
{
  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Variable var;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected XExpression from;

  /**
   * The cached value of the '{@link #getBy() <em>By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBy()
   * @generated
   * @ordered
   */
  protected XExpression by;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected XExpression to;

  /**
   * The cached value of the '{@link #getDo() <em>Do</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDo()
   * @generated
   * @ordered
   */
  protected OperationBlock do_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XForExpressionImpl()
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
    return ESyntaxPackage.Literals.XFOR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable getVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar(Variable newVar, NotificationChain msgs)
  {
    Variable oldVar = var;
    var = newVar;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__VAR, oldVar, newVar);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVar(Variable newVar)
  {
    if (newVar != var)
    {
      NotificationChain msgs = null;
      if (var != null)
        msgs = ((InternalEObject)var).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__VAR, null, msgs);
      if (newVar != null)
        msgs = ((InternalEObject)newVar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__VAR, null, msgs);
      msgs = basicSetVar(newVar, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__VAR, newVar, newVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFrom(XExpression newFrom, NotificationChain msgs)
  {
    XExpression oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__FROM, oldFrom, newFrom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(XExpression newFrom)
  {
    if (newFrom != from)
    {
      NotificationChain msgs = null;
      if (from != null)
        msgs = ((InternalEObject)from).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__FROM, null, msgs);
      if (newFrom != null)
        msgs = ((InternalEObject)newFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__FROM, null, msgs);
      msgs = basicSetFrom(newFrom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__FROM, newFrom, newFrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getBy()
  {
    return by;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBy(XExpression newBy, NotificationChain msgs)
  {
    XExpression oldBy = by;
    by = newBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__BY, oldBy, newBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBy(XExpression newBy)
  {
    if (newBy != by)
    {
      NotificationChain msgs = null;
      if (by != null)
        msgs = ((InternalEObject)by).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__BY, null, msgs);
      if (newBy != null)
        msgs = ((InternalEObject)newBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__BY, null, msgs);
      msgs = basicSetBy(newBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__BY, newBy, newBy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTo(XExpression newTo, NotificationChain msgs)
  {
    XExpression oldTo = to;
    to = newTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__TO, oldTo, newTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(XExpression newTo)
  {
    if (newTo != to)
    {
      NotificationChain msgs = null;
      if (to != null)
        msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__TO, null, msgs);
      if (newTo != null)
        msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__TO, null, msgs);
      msgs = basicSetTo(newTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__TO, newTo, newTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationBlock getDo()
  {
    return do_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDo(OperationBlock newDo, NotificationChain msgs)
  {
    OperationBlock oldDo = do_;
    do_ = newDo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__DO, oldDo, newDo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDo(OperationBlock newDo)
  {
    if (newDo != do_)
    {
      NotificationChain msgs = null;
      if (do_ != null)
        msgs = ((InternalEObject)do_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__DO, null, msgs);
      if (newDo != null)
        msgs = ((InternalEObject)newDo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XFOR_EXPRESSION__DO, null, msgs);
      msgs = basicSetDo(newDo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XFOR_EXPRESSION__DO, newDo, newDo));
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
      case ESyntaxPackage.XFOR_EXPRESSION__VAR:
        return basicSetVar(null, msgs);
      case ESyntaxPackage.XFOR_EXPRESSION__FROM:
        return basicSetFrom(null, msgs);
      case ESyntaxPackage.XFOR_EXPRESSION__BY:
        return basicSetBy(null, msgs);
      case ESyntaxPackage.XFOR_EXPRESSION__TO:
        return basicSetTo(null, msgs);
      case ESyntaxPackage.XFOR_EXPRESSION__DO:
        return basicSetDo(null, msgs);
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
      case ESyntaxPackage.XFOR_EXPRESSION__VAR:
        return getVar();
      case ESyntaxPackage.XFOR_EXPRESSION__FROM:
        return getFrom();
      case ESyntaxPackage.XFOR_EXPRESSION__BY:
        return getBy();
      case ESyntaxPackage.XFOR_EXPRESSION__TO:
        return getTo();
      case ESyntaxPackage.XFOR_EXPRESSION__DO:
        return getDo();
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
      case ESyntaxPackage.XFOR_EXPRESSION__VAR:
        setVar((Variable)newValue);
        return;
      case ESyntaxPackage.XFOR_EXPRESSION__FROM:
        setFrom((XExpression)newValue);
        return;
      case ESyntaxPackage.XFOR_EXPRESSION__BY:
        setBy((XExpression)newValue);
        return;
      case ESyntaxPackage.XFOR_EXPRESSION__TO:
        setTo((XExpression)newValue);
        return;
      case ESyntaxPackage.XFOR_EXPRESSION__DO:
        setDo((OperationBlock)newValue);
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
      case ESyntaxPackage.XFOR_EXPRESSION__VAR:
        setVar((Variable)null);
        return;
      case ESyntaxPackage.XFOR_EXPRESSION__FROM:
        setFrom((XExpression)null);
        return;
      case ESyntaxPackage.XFOR_EXPRESSION__BY:
        setBy((XExpression)null);
        return;
      case ESyntaxPackage.XFOR_EXPRESSION__TO:
        setTo((XExpression)null);
        return;
      case ESyntaxPackage.XFOR_EXPRESSION__DO:
        setDo((OperationBlock)null);
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
      case ESyntaxPackage.XFOR_EXPRESSION__VAR:
        return var != null;
      case ESyntaxPackage.XFOR_EXPRESSION__FROM:
        return from != null;
      case ESyntaxPackage.XFOR_EXPRESSION__BY:
        return by != null;
      case ESyntaxPackage.XFOR_EXPRESSION__TO:
        return to != null;
      case ESyntaxPackage.XFOR_EXPRESSION__DO:
        return do_ != null;
    }
    return super.eIsSet(featureID);
  }

} //XForExpressionImpl
