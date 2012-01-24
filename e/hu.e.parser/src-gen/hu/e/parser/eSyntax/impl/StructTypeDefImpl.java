/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ClassItem;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.LibraryItem;
import hu.e.parser.eSyntax.OperationStep;
import hu.e.parser.eSyntax.ParameterKind;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Type Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.StructTypeDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.StructTypeDefImpl#getType <em>Type</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.StructTypeDefImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.StructTypeDefImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.StructTypeDefImpl#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructTypeDefImpl extends TypeDefImpl implements StructTypeDef
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
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EObject type;

  /**
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final ParameterKind KIND_EDEFAULT = ParameterKind.ANY;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected ParameterKind kind = KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected String default_ = DEFAULT_EDEFAULT;

  /**
   * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMembers()
   * @generated
   * @ordered
   */
  protected EList<Variable> members;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructTypeDefImpl()
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
    return ESyntaxPackage.Literals.STRUCT_TYPE_DEF;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.STRUCT_TYPE_DEF__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(EObject newType, NotificationChain msgs)
  {
    EObject oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.STRUCT_TYPE_DEF__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EObject newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.STRUCT_TYPE_DEF__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.STRUCT_TYPE_DEF__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.STRUCT_TYPE_DEF__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterKind getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(ParameterKind newKind)
  {
    ParameterKind oldKind = kind;
    kind = newKind == null ? KIND_EDEFAULT : newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.STRUCT_TYPE_DEF__KIND, oldKind, kind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(String newDefault)
  {
    String oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.STRUCT_TYPE_DEF__DEFAULT, oldDefault, default_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Variable> getMembers()
  {
    if (members == null)
    {
      members = new EObjectContainmentEList<Variable>(Variable.class, this, ESyntaxPackage.STRUCT_TYPE_DEF__MEMBERS);
    }
    return members;
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
      case ESyntaxPackage.STRUCT_TYPE_DEF__TYPE:
        return basicSetType(null, msgs);
      case ESyntaxPackage.STRUCT_TYPE_DEF__MEMBERS:
        return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
      case ESyntaxPackage.STRUCT_TYPE_DEF__NAME:
        return getName();
      case ESyntaxPackage.STRUCT_TYPE_DEF__TYPE:
        return getType();
      case ESyntaxPackage.STRUCT_TYPE_DEF__KIND:
        return getKind();
      case ESyntaxPackage.STRUCT_TYPE_DEF__DEFAULT:
        return getDefault();
      case ESyntaxPackage.STRUCT_TYPE_DEF__MEMBERS:
        return getMembers();
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
      case ESyntaxPackage.STRUCT_TYPE_DEF__NAME:
        setName((String)newValue);
        return;
      case ESyntaxPackage.STRUCT_TYPE_DEF__TYPE:
        setType((EObject)newValue);
        return;
      case ESyntaxPackage.STRUCT_TYPE_DEF__KIND:
        setKind((ParameterKind)newValue);
        return;
      case ESyntaxPackage.STRUCT_TYPE_DEF__DEFAULT:
        setDefault((String)newValue);
        return;
      case ESyntaxPackage.STRUCT_TYPE_DEF__MEMBERS:
        getMembers().clear();
        getMembers().addAll((Collection<? extends Variable>)newValue);
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
      case ESyntaxPackage.STRUCT_TYPE_DEF__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ESyntaxPackage.STRUCT_TYPE_DEF__TYPE:
        setType((EObject)null);
        return;
      case ESyntaxPackage.STRUCT_TYPE_DEF__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case ESyntaxPackage.STRUCT_TYPE_DEF__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
        return;
      case ESyntaxPackage.STRUCT_TYPE_DEF__MEMBERS:
        getMembers().clear();
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
      case ESyntaxPackage.STRUCT_TYPE_DEF__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ESyntaxPackage.STRUCT_TYPE_DEF__TYPE:
        return type != null;
      case ESyntaxPackage.STRUCT_TYPE_DEF__KIND:
        return kind != KIND_EDEFAULT;
      case ESyntaxPackage.STRUCT_TYPE_DEF__DEFAULT:
        return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
      case ESyntaxPackage.STRUCT_TYPE_DEF__MEMBERS:
        return members != null && !members.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ClassItem.class)
    {
      switch (derivedFeatureID)
      {
        case ESyntaxPackage.STRUCT_TYPE_DEF__NAME: return ESyntaxPackage.CLASS_ITEM__NAME;
        default: return -1;
      }
    }
    if (baseClass == LibraryItem.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == OperationStep.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Variable.class)
    {
      switch (derivedFeatureID)
      {
        case ESyntaxPackage.STRUCT_TYPE_DEF__TYPE: return ESyntaxPackage.VARIABLE__TYPE;
        case ESyntaxPackage.STRUCT_TYPE_DEF__KIND: return ESyntaxPackage.VARIABLE__KIND;
        case ESyntaxPackage.STRUCT_TYPE_DEF__DEFAULT: return ESyntaxPackage.VARIABLE__DEFAULT;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ClassItem.class)
    {
      switch (baseFeatureID)
      {
        case ESyntaxPackage.CLASS_ITEM__NAME: return ESyntaxPackage.STRUCT_TYPE_DEF__NAME;
        default: return -1;
      }
    }
    if (baseClass == LibraryItem.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == OperationStep.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Variable.class)
    {
      switch (baseFeatureID)
      {
        case ESyntaxPackage.VARIABLE__TYPE: return ESyntaxPackage.STRUCT_TYPE_DEF__TYPE;
        case ESyntaxPackage.VARIABLE__KIND: return ESyntaxPackage.STRUCT_TYPE_DEF__KIND;
        case ESyntaxPackage.VARIABLE__DEFAULT: return ESyntaxPackage.STRUCT_TYPE_DEF__DEFAULT;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(", kind: ");
    result.append(kind);
    result.append(", default: ");
    result.append(default_);
    result.append(')');
    return result.toString();
  }

} //StructTypeDefImpl
