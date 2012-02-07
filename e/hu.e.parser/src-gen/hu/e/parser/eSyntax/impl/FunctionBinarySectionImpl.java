/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LinkedInstance;
import hu.e.parser.eSyntax.OperationBlock;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Binary Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getMemwidth <em>Memwidth</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getPointersize <em>Pointersize</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getMems <em>Mems</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getLib <em>Lib</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getDo <em>Do</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionBinarySectionImpl extends BinarySectionImpl implements FunctionBinarySection
{
  /**
   * The default value of the '{@link #getMemwidth() <em>Memwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemwidth()
   * @generated
   * @ordered
   */
  protected static final String MEMWIDTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMemwidth() <em>Memwidth</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemwidth()
   * @generated
   * @ordered
   */
  protected String memwidth = MEMWIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getPointersize() <em>Pointersize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointersize()
   * @generated
   * @ordered
   */
  protected static final String POINTERSIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPointersize() <em>Pointersize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointersize()
   * @generated
   * @ordered
   */
  protected String pointersize = POINTERSIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getMems() <em>Mems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMems()
   * @generated
   * @ordered
   */
  protected EList<FunctionMemory> mems;

  /**
   * The cached value of the '{@link #getLib() <em>Lib</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLib()
   * @generated
   * @ordered
   */
  protected EList<Library> lib;

  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<LinkedInstance> instances;

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
  protected FunctionBinarySectionImpl()
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
    return ESyntaxPackage.Literals.FUNCTION_BINARY_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMemwidth()
  {
    return memwidth;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemwidth(String newMemwidth)
  {
    String oldMemwidth = memwidth;
    memwidth = newMemwidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH, oldMemwidth, memwidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPointersize()
  {
    return pointersize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointersize(String newPointersize)
  {
    String oldPointersize = pointersize;
    pointersize = newPointersize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.FUNCTION_BINARY_SECTION__POINTERSIZE, oldPointersize, pointersize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionMemory> getMems()
  {
    if (mems == null)
    {
      mems = new EObjectContainmentEList<FunctionMemory>(FunctionMemory.class, this, ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS);
    }
    return mems;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Library> getLib()
  {
    if (lib == null)
    {
      lib = new EObjectResolvingEList<Library>(Library.class, this, ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB);
    }
    return lib;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LinkedInstance> getInstances()
  {
    if (instances == null)
    {
      instances = new EObjectContainmentEList<LinkedInstance>(LinkedInstance.class, this, ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES);
    }
    return instances;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ESyntaxPackage.FUNCTION_BINARY_SECTION__DO, oldDo, newDo);
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
        msgs = ((InternalEObject)do_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.FUNCTION_BINARY_SECTION__DO, null, msgs);
      if (newDo != null)
        msgs = ((InternalEObject)newDo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ESyntaxPackage.FUNCTION_BINARY_SECTION__DO, null, msgs);
      msgs = basicSetDo(newDo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.FUNCTION_BINARY_SECTION__DO, newDo, newDo));
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        return ((InternalEList<?>)getMems()).basicRemove(otherEnd, msgs);
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__DO:
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH:
        return getMemwidth();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__POINTERSIZE:
        return getPointersize();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        return getMems();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB:
        return getLib();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        return getInstances();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__DO:
        return getDo();
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH:
        setMemwidth((String)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__POINTERSIZE:
        setPointersize((String)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        getMems().clear();
        getMems().addAll((Collection<? extends FunctionMemory>)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB:
        getLib().clear();
        getLib().addAll((Collection<? extends Library>)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends LinkedInstance>)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__DO:
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH:
        setMemwidth(MEMWIDTH_EDEFAULT);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__POINTERSIZE:
        setPointersize(POINTERSIZE_EDEFAULT);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        getMems().clear();
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB:
        getLib().clear();
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        getInstances().clear();
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__DO:
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMWIDTH:
        return MEMWIDTH_EDEFAULT == null ? memwidth != null : !MEMWIDTH_EDEFAULT.equals(memwidth);
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__POINTERSIZE:
        return POINTERSIZE_EDEFAULT == null ? pointersize != null : !POINTERSIZE_EDEFAULT.equals(pointersize);
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        return mems != null && !mems.isEmpty();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB:
        return lib != null && !lib.isEmpty();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        return instances != null && !instances.isEmpty();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__DO:
        return do_ != null;
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
    result.append(" (memwidth: ");
    result.append(memwidth);
    result.append(", pointersize: ");
    result.append(pointersize);
    result.append(')');
    return result.toString();
  }

} //FunctionBinarySectionImpl
