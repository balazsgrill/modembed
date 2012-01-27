/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LibraryItem;

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
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.LibraryImpl#getOverrides <em>Overrides</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.LibraryImpl#getUse <em>Use</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.LibraryImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends CompilationUnitImpl implements Library
{
  /**
   * The cached value of the '{@link #getOverrides() <em>Overrides</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverrides()
   * @generated
   * @ordered
   */
  protected EList<Library> overrides;

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
  protected EList<LibraryItem> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LibraryImpl()
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
    return ESyntaxPackage.Literals.LIBRARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Library> getOverrides()
  {
    if (overrides == null)
    {
      overrides = new EObjectResolvingEList<Library>(Library.class, this, ESyntaxPackage.LIBRARY__OVERRIDES);
    }
    return overrides;
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
      use = new EObjectResolvingEList<Library>(Library.class, this, ESyntaxPackage.LIBRARY__USE);
    }
    return use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LibraryItem> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<LibraryItem>(LibraryItem.class, this, ESyntaxPackage.LIBRARY__ITEMS);
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
      case ESyntaxPackage.LIBRARY__ITEMS:
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
      case ESyntaxPackage.LIBRARY__OVERRIDES:
        return getOverrides();
      case ESyntaxPackage.LIBRARY__USE:
        return getUse();
      case ESyntaxPackage.LIBRARY__ITEMS:
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
      case ESyntaxPackage.LIBRARY__OVERRIDES:
        getOverrides().clear();
        getOverrides().addAll((Collection<? extends Library>)newValue);
        return;
      case ESyntaxPackage.LIBRARY__USE:
        getUse().clear();
        getUse().addAll((Collection<? extends Library>)newValue);
        return;
      case ESyntaxPackage.LIBRARY__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends LibraryItem>)newValue);
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
      case ESyntaxPackage.LIBRARY__OVERRIDES:
        getOverrides().clear();
        return;
      case ESyntaxPackage.LIBRARY__USE:
        getUse().clear();
        return;
      case ESyntaxPackage.LIBRARY__ITEMS:
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
      case ESyntaxPackage.LIBRARY__OVERRIDES:
        return overrides != null && !overrides.isEmpty();
      case ESyntaxPackage.LIBRARY__USE:
        return use != null && !use.isEmpty();
      case ESyntaxPackage.LIBRARY__ITEMS:
        return items != null && !items.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LibraryImpl
