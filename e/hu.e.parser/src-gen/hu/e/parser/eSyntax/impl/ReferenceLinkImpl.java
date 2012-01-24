/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.InstanceReference;
import hu.e.parser.eSyntax.LinkedInstance;
import hu.e.parser.eSyntax.ReferenceLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.ReferenceLinkImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.ReferenceLinkImpl#getInst <em>Inst</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceLinkImpl extends MinimalEObjectImpl.Container implements ReferenceLink
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected InstanceReference ref;

  /**
   * The cached value of the '{@link #getInst() <em>Inst</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInst()
   * @generated
   * @ordered
   */
  protected LinkedInstance inst;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceLinkImpl()
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
    return ESyntaxPackage.Literals.REFERENCE_LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceReference getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (InstanceReference)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESyntaxPackage.REFERENCE_LINK__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstanceReference basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(InstanceReference newRef)
  {
    InstanceReference oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.REFERENCE_LINK__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedInstance getInst()
  {
    if (inst != null && inst.eIsProxy())
    {
      InternalEObject oldInst = (InternalEObject)inst;
      inst = (LinkedInstance)eResolveProxy(oldInst);
      if (inst != oldInst)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESyntaxPackage.REFERENCE_LINK__INST, oldInst, inst));
      }
    }
    return inst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedInstance basicGetInst()
  {
    return inst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInst(LinkedInstance newInst)
  {
    LinkedInstance oldInst = inst;
    inst = newInst;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.REFERENCE_LINK__INST, oldInst, inst));
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
      case ESyntaxPackage.REFERENCE_LINK__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case ESyntaxPackage.REFERENCE_LINK__INST:
        if (resolve) return getInst();
        return basicGetInst();
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
      case ESyntaxPackage.REFERENCE_LINK__REF:
        setRef((InstanceReference)newValue);
        return;
      case ESyntaxPackage.REFERENCE_LINK__INST:
        setInst((LinkedInstance)newValue);
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
      case ESyntaxPackage.REFERENCE_LINK__REF:
        setRef((InstanceReference)null);
        return;
      case ESyntaxPackage.REFERENCE_LINK__INST:
        setInst((LinkedInstance)null);
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
      case ESyntaxPackage.REFERENCE_LINK__REF:
        return ref != null;
      case ESyntaxPackage.REFERENCE_LINK__INST:
        return inst != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceLinkImpl
