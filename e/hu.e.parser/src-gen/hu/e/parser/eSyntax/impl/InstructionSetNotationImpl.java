/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.InstructionNotation;
import hu.e.parser.eSyntax.InstructionSetNotation;

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
 * An implementation of the model object '<em><b>Instruction Set Notation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.InstructionSetNotationImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.InstructionSetNotationImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstructionSetNotationImpl extends CompilationUnitImpl implements InstructionSetNotation
{
  /**
   * The default value of the '{@link #getExtends() <em>Extends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected static final String EXTENDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected String extends_ = EXTENDS_EDEFAULT;

  /**
   * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstructions()
   * @generated
   * @ordered
   */
  protected EList<InstructionNotation> instructions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InstructionSetNotationImpl()
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
    return ESyntaxPackage.Literals.INSTRUCTION_SET_NOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExtends()
  {
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExtends(String newExtends)
  {
    String oldExtends = extends_;
    extends_ = newExtends;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.INSTRUCTION_SET_NOTATION__EXTENDS, oldExtends, extends_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InstructionNotation> getInstructions()
  {
    if (instructions == null)
    {
      instructions = new EObjectContainmentEList<InstructionNotation>(InstructionNotation.class, this, ESyntaxPackage.INSTRUCTION_SET_NOTATION__INSTRUCTIONS);
    }
    return instructions;
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
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__INSTRUCTIONS:
        return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
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
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__EXTENDS:
        return getExtends();
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__INSTRUCTIONS:
        return getInstructions();
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
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__EXTENDS:
        setExtends((String)newValue);
        return;
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__INSTRUCTIONS:
        getInstructions().clear();
        getInstructions().addAll((Collection<? extends InstructionNotation>)newValue);
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
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__EXTENDS:
        setExtends(EXTENDS_EDEFAULT);
        return;
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__INSTRUCTIONS:
        getInstructions().clear();
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
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__EXTENDS:
        return EXTENDS_EDEFAULT == null ? extends_ != null : !EXTENDS_EDEFAULT.equals(extends_);
      case ESyntaxPackage.INSTRUCTION_SET_NOTATION__INSTRUCTIONS:
        return instructions != null && !instructions.isEmpty();
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
    result.append(" (extends: ");
    result.append(extends_);
    result.append(')');
    return result.toString();
  }

} //InstructionSetNotationImpl
