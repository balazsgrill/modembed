/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax.impl;

import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.InstanceConfig;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LinkedInstance;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.ReferenceLink;

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
 * An implementation of the model object '<em><b>Function Binary Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getMemwidth <em>Memwidth</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getMems <em>Mems</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getLib <em>Lib</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getConfs <em>Confs</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getOpins <em>Opins</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.impl.FunctionBinarySectionImpl#getOp <em>Op</em>}</li>
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
   * The cached value of the '{@link #getMems() <em>Mems</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMems()
   * @generated
   * @ordered
   */
  protected EList<FunctionMemory> mems;

  /**
   * The cached value of the '{@link #getLib() <em>Lib</em>}' containment reference list.
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
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<ReferenceLink> links;

  /**
   * The cached value of the '{@link #getConfs() <em>Confs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfs()
   * @generated
   * @ordered
   */
  protected EList<InstanceConfig> confs;

  /**
   * The cached value of the '{@link #getOpins() <em>Opins</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpins()
   * @generated
   * @ordered
   */
  protected LinkedInstance opins;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected Operation op;

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
      lib = new EObjectContainmentEList<Library>(Library.class, this, ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB);
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
  public EList<ReferenceLink> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<ReferenceLink>(ReferenceLink.class, this, ESyntaxPackage.FUNCTION_BINARY_SECTION__LINKS);
    }
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InstanceConfig> getConfs()
  {
    if (confs == null)
    {
      confs = new EObjectContainmentEList<InstanceConfig>(InstanceConfig.class, this, ESyntaxPackage.FUNCTION_BINARY_SECTION__CONFS);
    }
    return confs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedInstance getOpins()
  {
    if (opins != null && opins.eIsProxy())
    {
      InternalEObject oldOpins = (InternalEObject)opins;
      opins = (LinkedInstance)eResolveProxy(oldOpins);
      if (opins != oldOpins)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESyntaxPackage.FUNCTION_BINARY_SECTION__OPINS, oldOpins, opins));
      }
    }
    return opins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkedInstance basicGetOpins()
  {
    return opins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpins(LinkedInstance newOpins)
  {
    LinkedInstance oldOpins = opins;
    opins = newOpins;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.FUNCTION_BINARY_SECTION__OPINS, oldOpins, opins));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation getOp()
  {
    if (op != null && op.eIsProxy())
    {
      InternalEObject oldOp = (InternalEObject)op;
      op = (Operation)eResolveProxy(oldOp);
      if (op != oldOp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESyntaxPackage.FUNCTION_BINARY_SECTION__OP, oldOp, op));
      }
    }
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation basicGetOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(Operation newOp)
  {
    Operation oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ESyntaxPackage.FUNCTION_BINARY_SECTION__OP, oldOp, op));
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB:
        return ((InternalEList<?>)getLib()).basicRemove(otherEnd, msgs);
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__CONFS:
        return ((InternalEList<?>)getConfs()).basicRemove(otherEnd, msgs);
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        return getMems();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB:
        return getLib();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        return getInstances();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LINKS:
        return getLinks();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__CONFS:
        return getConfs();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OPINS:
        if (resolve) return getOpins();
        return basicGetOpins();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OP:
        if (resolve) return getOp();
        return basicGetOp();
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends ReferenceLink>)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__CONFS:
        getConfs().clear();
        getConfs().addAll((Collection<? extends InstanceConfig>)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OPINS:
        setOpins((LinkedInstance)newValue);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OP:
        setOp((Operation)newValue);
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        getMems().clear();
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB:
        getLib().clear();
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        getInstances().clear();
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LINKS:
        getLinks().clear();
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__CONFS:
        getConfs().clear();
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OPINS:
        setOpins((LinkedInstance)null);
        return;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OP:
        setOp((Operation)null);
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
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__MEMS:
        return mems != null && !mems.isEmpty();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LIB:
        return lib != null && !lib.isEmpty();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__INSTANCES:
        return instances != null && !instances.isEmpty();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__LINKS:
        return links != null && !links.isEmpty();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__CONFS:
        return confs != null && !confs.isEmpty();
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OPINS:
        return opins != null;
      case ESyntaxPackage.FUNCTION_BINARY_SECTION__OP:
        return op != null;
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
    result.append(')');
    return result.toString();
  }

} //FunctionBinarySectionImpl
