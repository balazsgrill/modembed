/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ClassItem;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.Library;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.ClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.ClassImpl#getUse <em>Use</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.ClassImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends CompilationUnitImpl implements hu.e.parser.eSyntax.Class
{
  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected EList<hu.e.parser.eSyntax.Class> extends_;

  /**
   * The cached value of the '{@link #getUse() <em>Use</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUse()
   * @generated
   * @ordered
   */
  protected EList<Library> use;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<ClassItem> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassImpl()
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
    return ESyntaxPackage.Literals.CLASS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<hu.e.parser.eSyntax.Class> getExtends()
  {
    if (extends_ == null)
    {
      extends_ = new EObjectResolvingEList<hu.e.parser.eSyntax.Class>(hu.e.parser.eSyntax.Class.class, this, ESyntaxPackage.CLASS__EXTENDS);
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Library> getUse()
  {
    if (use == null)
    {
      use = new EObjectResolvingEList<Library>(Library.class, this, ESyntaxPackage.CLASS__USE);
    }
    return use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassItem> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<ClassItem>(ClassItem.class, this, ESyntaxPackage.CLASS__ITEMS);
    }
    return items;
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
      case ESyntaxPackage.CLASS__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case ESyntaxPackage.CLASS__EXTENDS:
        return getExtends();
      case ESyntaxPackage.CLASS__USE:
        return getUse();
      case ESyntaxPackage.CLASS__ITEMS:
        return getItems();
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
      case ESyntaxPackage.CLASS__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends hu.e.parser.eSyntax.Class>)newValue);
        return;
      case ESyntaxPackage.CLASS__USE:
        getUse().clear();
        getUse().addAll((Collection<? extends Library>)newValue);
        return;
      case ESyntaxPackage.CLASS__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends ClassItem>)newValue);
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
      case ESyntaxPackage.CLASS__EXTENDS:
        getExtends().clear();
        return;
      case ESyntaxPackage.CLASS__USE:
        getUse().clear();
        return;
      case ESyntaxPackage.CLASS__ITEMS:
        getItems().clear();
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
      case ESyntaxPackage.CLASS__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
      case ESyntaxPackage.CLASS__USE:
        return use != null && !use.isEmpty();
      case ESyntaxPackage.CLASS__ITEMS:
        return items != null && !items.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ClassImpl
