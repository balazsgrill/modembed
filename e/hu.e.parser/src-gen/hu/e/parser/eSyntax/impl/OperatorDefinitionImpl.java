/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationRole;
import hu.e.parser.eSyntax.OperatorDefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperatorDefinitionImpl#getRole <em>Role</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.OperatorDefinitionImpl#getCandidate <em>Candidate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperatorDefinitionImpl extends LibraryItemImpl implements OperatorDefinition
{
  /**
   * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected static final OperationRole ROLE_EDEFAULT = OperationRole.SET;

  /**
   * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected OperationRole role = ROLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCandidate() <em>Candidate</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCandidate()
   * @generated
   * @ordered
   */
  protected EList<Operation> candidate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatorDefinitionImpl()
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
    return ESyntaxPackage.Literals.OPERATOR_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperationRole getRole()
  {
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRole(OperationRole newRole)
  {
    OperationRole oldRole = role;
    role = newRole == null ? ROLE_EDEFAULT : newRole;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.OPERATOR_DEFINITION__ROLE, oldRole, role));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Operation> getCandidate()
  {
    if (candidate == null)
    {
      candidate = new EObjectResolvingEList<Operation>(Operation.class, this, ESyntaxPackage.OPERATOR_DEFINITION__CANDIDATE);
    }
    return candidate;
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
      case ESyntaxPackage.OPERATOR_DEFINITION__ROLE:
        return getRole();
      case ESyntaxPackage.OPERATOR_DEFINITION__CANDIDATE:
        return getCandidate();
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
      case ESyntaxPackage.OPERATOR_DEFINITION__ROLE:
        setRole((OperationRole)newValue);
        return;
      case ESyntaxPackage.OPERATOR_DEFINITION__CANDIDATE:
        getCandidate().clear();
        getCandidate().addAll((Collection<? extends Operation>)newValue);
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
      case ESyntaxPackage.OPERATOR_DEFINITION__ROLE:
        setRole(ROLE_EDEFAULT);
        return;
      case ESyntaxPackage.OPERATOR_DEFINITION__CANDIDATE:
        getCandidate().clear();
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
      case ESyntaxPackage.OPERATOR_DEFINITION__ROLE:
        return role != ROLE_EDEFAULT;
      case ESyntaxPackage.OPERATOR_DEFINITION__CANDIDATE:
        return candidate != null && !candidate.isEmpty();
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
    result.append(" (role: ");
    result.append(role);
    result.append(')');
    return result.toString();
  }

} //OperatorDefinitionImpl
