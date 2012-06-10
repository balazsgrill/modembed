/**
 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.ReferenceBinarySection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Binary Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.ReferenceBinarySectionImpl#getInc <em>Inc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceBinarySectionImpl extends BinarySectionImpl implements ReferenceBinarySection
{
  /**
   * The cached value of the '{@link #getInc() <em>Inc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInc()
   * @generated
   * @ordered
   */
  protected LinkedBinary inc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceBinarySectionImpl()
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
    return ESyntaxPackage.Literals.REFERENCE_BINARY_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedBinary getInc()
  {
    if (inc != null && inc.eIsProxy())
    {
      InternalEObject oldInc = (InternalEObject)inc;
      inc = (LinkedBinary)eResolveProxy(oldInc);
      if (inc != oldInc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESyntaxPackage.REFERENCE_BINARY_SECTION__INC, oldInc, inc));
      }
    }
    return inc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedBinary basicGetInc()
  {
    return inc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInc(LinkedBinary newInc)
  {
    LinkedBinary oldInc = inc;
    inc = newInc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.REFERENCE_BINARY_SECTION__INC, oldInc, inc));
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
      case ESyntaxPackage.REFERENCE_BINARY_SECTION__INC:
        if (resolve) return getInc();
        return basicGetInc();
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
      case ESyntaxPackage.REFERENCE_BINARY_SECTION__INC:
        setInc((LinkedBinary)newValue);
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
      case ESyntaxPackage.REFERENCE_BINARY_SECTION__INC:
        setInc((LinkedBinary)null);
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
      case ESyntaxPackage.REFERENCE_BINARY_SECTION__INC:
        return inc != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceBinarySectionImpl
