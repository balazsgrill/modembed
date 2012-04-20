/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.XScriptedExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XScripted Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.XScriptedExpressionImpl#getScript <em>Script</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.XScriptedExpressionImpl#getConditional <em>Conditional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XScriptedExpressionImpl extends XTopLevelExpressionImpl implements XScriptedExpression
{
  /**
   * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected static final String SCRIPT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getScript() <em>Script</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScript()
   * @generated
   * @ordered
   */
  protected String script = SCRIPT_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditional() <em>Conditional</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional()
   * @generated
   * @ordered
   */
  protected OperationBlock conditional;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XScriptedExpressionImpl()
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
    return ESyntaxPackage.Literals.XSCRIPTED_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getScript()
  {
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScript(String newScript)
  {
    String oldScript = script;
    script = newScript;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XSCRIPTED_EXPRESSION__SCRIPT, oldScript, script));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationBlock getConditional()
  {
    return conditional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional(OperationBlock newConditional, NotificationChain msgs)
  {
    OperationBlock oldConditional = conditional;
    conditional = newConditional;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL, oldConditional, newConditional);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional(OperationBlock newConditional)
  {
    if (newConditional != conditional)
    {
      NotificationChain msgs = null;
      if (conditional != null)
        msgs = ((InternalEObject)conditional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL, null, msgs);
      if (newConditional != null)
        msgs = ((InternalEObject)newConditional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL, null, msgs);
      msgs = basicSetConditional(newConditional, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL, newConditional, newConditional));
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
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL:
        return basicSetConditional(null, msgs);
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
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__SCRIPT:
        return getScript();
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL:
        return getConditional();
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
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__SCRIPT:
        setScript((String)newValue);
        return;
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL:
        setConditional((OperationBlock)newValue);
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
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__SCRIPT:
        setScript(SCRIPT_EDEFAULT);
        return;
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL:
        setConditional((OperationBlock)null);
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
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__SCRIPT:
        return SCRIPT_EDEFAULT == null ? script != null : !SCRIPT_EDEFAULT.equals(script);
      case ESyntaxPackage.XSCRIPTED_EXPRESSION__CONDITIONAL:
        return conditional != null;
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
    result.append(" (script: ");
    result.append(script);
    result.append(')');
    return result.toString();
  }

} //XScriptedExpressionImpl
