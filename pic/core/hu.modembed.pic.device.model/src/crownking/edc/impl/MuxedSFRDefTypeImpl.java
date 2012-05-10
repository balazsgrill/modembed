/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AliasListType7;
import crownking.edc.ChecksumType;
import crownking.edc.DCRFieldSemanticType;
import crownking.edc.EdcPackage;
import crownking.edc.ModuleExcludeType;
import crownking.edc.ModuleMacroType;
import crownking.edc.MuxedSFRDefType;
import crownking.edc.SFRDefType;
import crownking.edc.SFRFieldSemanticType;
import crownking.edc.SFRModeListType;
import crownking.edc.SelectSFRType;
import crownking.edc.StimInfoType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Muxed SFR Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getSelectSFR <em>Select SFR</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getDCRFieldSemantic <em>DCR Field Semantic</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getSFRModeList <em>SFR Mode List</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getStimInfo <em>Stim Info</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getModuleMacro <em>Module Macro</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getModuleExclude <em>Module Exclude</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getSFRDef <em>SFR Def</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getSFRFieldSemantic <em>SFR Field Semantic</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getImpl <em>Impl</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getIshidden <em>Ishidden</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getIsidehidden <em>Isidehidden</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getIsindirect <em>Isindirect</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getIslanghidden <em>Islanghidden</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getIslnaghidden <em>Islnaghidden</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getIsvolatile <em>Isvolatile</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getMclr <em>Mclr</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getModsrc <em>Modsrc</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getNzsize <em>Nzsize</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getNzwidth <em>Nzwidth</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getPor <em>Por</em>}</li>
 *   <li>{@link crownking.edc.impl.MuxedSFRDefTypeImpl#getRegionidref <em>Regionidref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MuxedSFRDefTypeImpl extends EObjectImpl implements MuxedSFRDefType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccess()
	 * @generated
	 * @ordered
	 */
	protected String access = ACCESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected static final String BEGIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBegin() <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBegin()
	 * @generated
	 * @ordered
	 */
	protected String begin = BEGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected static final String CNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCname() <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCname()
	 * @generated
	 * @ordered
	 */
	protected String cname = CNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesc() <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesc()
	 * @generated
	 * @ordered
	 */
	protected String desc = DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final String END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected String end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #getImpl() <em>Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImpl() <em>Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImpl()
	 * @generated
	 * @ordered
	 */
	protected String impl = IMPL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIshidden() <em>Ishidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIshidden()
	 * @generated
	 * @ordered
	 */
	protected static final String ISHIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIshidden() <em>Ishidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIshidden()
	 * @generated
	 * @ordered
	 */
	protected String ishidden = ISHIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsidehidden() <em>Isidehidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsidehidden()
	 * @generated
	 * @ordered
	 */
	protected static final String ISIDEHIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsidehidden() <em>Isidehidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsidehidden()
	 * @generated
	 * @ordered
	 */
	protected String isidehidden = ISIDEHIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsindirect() <em>Isindirect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsindirect()
	 * @generated
	 * @ordered
	 */
	protected static final String ISINDIRECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsindirect() <em>Isindirect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsindirect()
	 * @generated
	 * @ordered
	 */
	protected String isindirect = ISINDIRECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIslanghidden() <em>Islanghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslanghidden()
	 * @generated
	 * @ordered
	 */
	protected static final String ISLANGHIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIslanghidden() <em>Islanghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslanghidden()
	 * @generated
	 * @ordered
	 */
	protected String islanghidden = ISLANGHIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIslnaghidden() <em>Islnaghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslnaghidden()
	 * @generated
	 * @ordered
	 */
	protected static final String ISLNAGHIDDEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIslnaghidden() <em>Islnaghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIslnaghidden()
	 * @generated
	 * @ordered
	 */
	protected String islnaghidden = ISLNAGHIDDEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsvolatile() <em>Isvolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsvolatile()
	 * @generated
	 * @ordered
	 */
	protected static final String ISVOLATILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsvolatile() <em>Isvolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsvolatile()
	 * @generated
	 * @ordered
	 */
	protected String isvolatile = ISVOLATILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected static final String MASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
	protected String mask = MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMclr() <em>Mclr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMclr()
	 * @generated
	 * @ordered
	 */
	protected static final String MCLR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMclr() <em>Mclr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMclr()
	 * @generated
	 * @ordered
	 */
	protected String mclr = MCLR_EDEFAULT;

	/**
	 * The default value of the '{@link #getModsrc() <em>Modsrc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModsrc()
	 * @generated
	 * @ordered
	 */
	protected static final String MODSRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModsrc() <em>Modsrc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModsrc()
	 * @generated
	 * @ordered
	 */
	protected String modsrc = MODSRC_EDEFAULT;

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
	 * The default value of the '{@link #getNzsize() <em>Nzsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNzsize()
	 * @generated
	 * @ordered
	 */
	protected static final String NZSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNzsize() <em>Nzsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNzsize()
	 * @generated
	 * @ordered
	 */
	protected String nzsize = NZSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNzwidth() <em>Nzwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNzwidth()
	 * @generated
	 * @ordered
	 */
	protected static final String NZWIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNzwidth() <em>Nzwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNzwidth()
	 * @generated
	 * @ordered
	 */
	protected String nzwidth = NZWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final String OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected String offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPor() <em>Por</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPor()
	 * @generated
	 * @ordered
	 */
	protected static final String POR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPor() <em>Por</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPor()
	 * @generated
	 * @ordered
	 */
	protected String por = POR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegionidref() <em>Regionidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionidref()
	 * @generated
	 * @ordered
	 */
	protected static final String REGIONIDREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegionidref() <em>Regionidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionidref()
	 * @generated
	 * @ordered
	 */
	protected String regionidref = REGIONIDREF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MuxedSFRDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getMuxedSFRDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.MUXED_SFR_DEF_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(EdcPackage.eINSTANCE.getMuxedSFRDefType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectSFRType> getSelectSFR() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_SelectSFR());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCRFieldSemanticType> getDCRFieldSemantic() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_DCRFieldSemantic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AliasListType7> getAliasList() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_AliasList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRModeListType> getSFRModeList() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_SFRModeList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StimInfoType> getStimInfo() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_StimInfo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleMacroType> getModuleMacro() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_ModuleMacro());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleExcludeType> getModuleExclude() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_ModuleExclude());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRDefType> getSFRDef() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_SFRDef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChecksumType> getChecksum() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_Checksum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRFieldSemanticType> getSFRFieldSemantic() {
		return getGroup().list(EdcPackage.eINSTANCE.getMuxedSFRDefType_SFRFieldSemantic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccess() {
		return access;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccess(String newAccess) {
		String oldAccess = access;
		access = newAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__ACCESS, oldAccess, access));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBegin() {
		return begin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBegin(String newBegin) {
		String oldBegin = begin;
		begin = newBegin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__BEGIN, oldBegin, begin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCname(String newCname) {
		String oldCname = cname;
		cname = newCname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__CNAME, oldCname, cname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesc(String newDesc) {
		String oldDesc = desc;
		desc = newDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__DESC, oldDesc, desc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(String newEnd) {
		String oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImpl() {
		return impl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImpl(String newImpl) {
		String oldImpl = impl;
		impl = newImpl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__IMPL, oldImpl, impl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIshidden() {
		return ishidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIshidden(String newIshidden) {
		String oldIshidden = ishidden;
		ishidden = newIshidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__ISHIDDEN, oldIshidden, ishidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsidehidden() {
		return isidehidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsidehidden(String newIsidehidden) {
		String oldIsidehidden = isidehidden;
		isidehidden = newIsidehidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__ISIDEHIDDEN, oldIsidehidden, isidehidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsindirect() {
		return isindirect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsindirect(String newIsindirect) {
		String oldIsindirect = isindirect;
		isindirect = newIsindirect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__ISINDIRECT, oldIsindirect, isindirect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIslanghidden() {
		return islanghidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIslanghidden(String newIslanghidden) {
		String oldIslanghidden = islanghidden;
		islanghidden = newIslanghidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__ISLANGHIDDEN, oldIslanghidden, islanghidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIslnaghidden() {
		return islnaghidden;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIslnaghidden(String newIslnaghidden) {
		String oldIslnaghidden = islnaghidden;
		islnaghidden = newIslnaghidden;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__ISLNAGHIDDEN, oldIslnaghidden, islnaghidden));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsvolatile() {
		return isvolatile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsvolatile(String newIsvolatile) {
		String oldIsvolatile = isvolatile;
		isvolatile = newIsvolatile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__ISVOLATILE, oldIsvolatile, isvolatile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(String newMask) {
		String oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__MASK, oldMask, mask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMclr() {
		return mclr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMclr(String newMclr) {
		String oldMclr = mclr;
		mclr = newMclr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__MCLR, oldMclr, mclr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModsrc() {
		return modsrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModsrc(String newModsrc) {
		String oldModsrc = modsrc;
		modsrc = newModsrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__MODSRC, oldModsrc, modsrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNzsize() {
		return nzsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNzsize(String newNzsize) {
		String oldNzsize = nzsize;
		nzsize = newNzsize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__NZSIZE, oldNzsize, nzsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNzwidth() {
		return nzwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNzwidth(String newNzwidth) {
		String oldNzwidth = nzwidth;
		nzwidth = newNzwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__NZWIDTH, oldNzwidth, nzwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(String newOffset) {
		String oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPor() {
		return por;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPor(String newPor) {
		String oldPor = por;
		por = newPor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__POR, oldPor, por));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionidref() {
		return regionidref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionidref(String newRegionidref) {
		String oldRegionidref = regionidref;
		regionidref = newRegionidref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.MUXED_SFR_DEF_TYPE__REGIONIDREF, oldRegionidref, regionidref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.MUXED_SFR_DEF_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__SELECT_SFR:
				return ((InternalEList<?>)getSelectSFR()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__DCR_FIELD_SEMANTIC:
				return ((InternalEList<?>)getDCRFieldSemantic()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__ALIAS_LIST:
				return ((InternalEList<?>)getAliasList()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_MODE_LIST:
				return ((InternalEList<?>)getSFRModeList()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__STIM_INFO:
				return ((InternalEList<?>)getStimInfo()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_MACRO:
				return ((InternalEList<?>)getModuleMacro()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_EXCLUDE:
				return ((InternalEList<?>)getModuleExclude()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_DEF:
				return ((InternalEList<?>)getSFRDef()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__CHECKSUM:
				return ((InternalEList<?>)getChecksum()).basicRemove(otherEnd, msgs);
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_FIELD_SEMANTIC:
				return ((InternalEList<?>)getSFRFieldSemantic()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EdcPackage.MUXED_SFR_DEF_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.MUXED_SFR_DEF_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.MUXED_SFR_DEF_TYPE__SELECT_SFR:
				return getSelectSFR();
			case EdcPackage.MUXED_SFR_DEF_TYPE__DCR_FIELD_SEMANTIC:
				return getDCRFieldSemantic();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ALIAS_LIST:
				return getAliasList();
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_MODE_LIST:
				return getSFRModeList();
			case EdcPackage.MUXED_SFR_DEF_TYPE__STIM_INFO:
				return getStimInfo();
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_MACRO:
				return getModuleMacro();
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_EXCLUDE:
				return getModuleExclude();
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_DEF:
				return getSFRDef();
			case EdcPackage.MUXED_SFR_DEF_TYPE__CHECKSUM:
				return getChecksum();
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_FIELD_SEMANTIC:
				return getSFRFieldSemantic();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ACCESS:
				return getAccess();
			case EdcPackage.MUXED_SFR_DEF_TYPE__BEGIN:
				return getBegin();
			case EdcPackage.MUXED_SFR_DEF_TYPE__CNAME:
				return getCname();
			case EdcPackage.MUXED_SFR_DEF_TYPE__DESC:
				return getDesc();
			case EdcPackage.MUXED_SFR_DEF_TYPE__END:
				return getEnd();
			case EdcPackage.MUXED_SFR_DEF_TYPE__IMPL:
				return getImpl();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISHIDDEN:
				return getIshidden();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISIDEHIDDEN:
				return getIsidehidden();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISINDIRECT:
				return getIsindirect();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISLANGHIDDEN:
				return getIslanghidden();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISLNAGHIDDEN:
				return getIslnaghidden();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISVOLATILE:
				return getIsvolatile();
			case EdcPackage.MUXED_SFR_DEF_TYPE__MASK:
				return getMask();
			case EdcPackage.MUXED_SFR_DEF_TYPE__MCLR:
				return getMclr();
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODSRC:
				return getModsrc();
			case EdcPackage.MUXED_SFR_DEF_TYPE__NAME:
				return getName();
			case EdcPackage.MUXED_SFR_DEF_TYPE__NZSIZE:
				return getNzsize();
			case EdcPackage.MUXED_SFR_DEF_TYPE__NZWIDTH:
				return getNzwidth();
			case EdcPackage.MUXED_SFR_DEF_TYPE__OFFSET:
				return getOffset();
			case EdcPackage.MUXED_SFR_DEF_TYPE__POR:
				return getPor();
			case EdcPackage.MUXED_SFR_DEF_TYPE__REGIONIDREF:
				return getRegionidref();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EdcPackage.MUXED_SFR_DEF_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__SELECT_SFR:
				getSelectSFR().clear();
				getSelectSFR().addAll((Collection<? extends SelectSFRType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__DCR_FIELD_SEMANTIC:
				getDCRFieldSemantic().clear();
				getDCRFieldSemantic().addAll((Collection<? extends DCRFieldSemanticType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ALIAS_LIST:
				getAliasList().clear();
				getAliasList().addAll((Collection<? extends AliasListType7>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_MODE_LIST:
				getSFRModeList().clear();
				getSFRModeList().addAll((Collection<? extends SFRModeListType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__STIM_INFO:
				getStimInfo().clear();
				getStimInfo().addAll((Collection<? extends StimInfoType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_MACRO:
				getModuleMacro().clear();
				getModuleMacro().addAll((Collection<? extends ModuleMacroType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_EXCLUDE:
				getModuleExclude().clear();
				getModuleExclude().addAll((Collection<? extends ModuleExcludeType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_DEF:
				getSFRDef().clear();
				getSFRDef().addAll((Collection<? extends SFRDefType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__CHECKSUM:
				getChecksum().clear();
				getChecksum().addAll((Collection<? extends ChecksumType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_FIELD_SEMANTIC:
				getSFRFieldSemantic().clear();
				getSFRFieldSemantic().addAll((Collection<? extends SFRFieldSemanticType>)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ACCESS:
				setAccess((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__BEGIN:
				setBegin((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__CNAME:
				setCname((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__END:
				setEnd((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__IMPL:
				setImpl((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISHIDDEN:
				setIshidden((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISIDEHIDDEN:
				setIsidehidden((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISINDIRECT:
				setIsindirect((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISLANGHIDDEN:
				setIslanghidden((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISLNAGHIDDEN:
				setIslnaghidden((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISVOLATILE:
				setIsvolatile((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MASK:
				setMask((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MCLR:
				setMclr((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODSRC:
				setModsrc((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__NZSIZE:
				setNzsize((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__NZWIDTH:
				setNzwidth((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__OFFSET:
				setOffset((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__POR:
				setPor((String)newValue);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__REGIONIDREF:
				setRegionidref((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EdcPackage.MUXED_SFR_DEF_TYPE__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__SELECT_SFR:
				getSelectSFR().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__DCR_FIELD_SEMANTIC:
				getDCRFieldSemantic().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ALIAS_LIST:
				getAliasList().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_MODE_LIST:
				getSFRModeList().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__STIM_INFO:
				getStimInfo().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_MACRO:
				getModuleMacro().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_EXCLUDE:
				getModuleExclude().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_DEF:
				getSFRDef().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__CHECKSUM:
				getChecksum().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_FIELD_SEMANTIC:
				getSFRFieldSemantic().clear();
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__IMPL:
				setImpl(IMPL_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISHIDDEN:
				setIshidden(ISHIDDEN_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISIDEHIDDEN:
				setIsidehidden(ISIDEHIDDEN_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISINDIRECT:
				setIsindirect(ISINDIRECT_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISLANGHIDDEN:
				setIslanghidden(ISLANGHIDDEN_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISLNAGHIDDEN:
				setIslnaghidden(ISLNAGHIDDEN_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISVOLATILE:
				setIsvolatile(ISVOLATILE_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MCLR:
				setMclr(MCLR_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODSRC:
				setModsrc(MODSRC_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__NZSIZE:
				setNzsize(NZSIZE_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__NZWIDTH:
				setNzwidth(NZWIDTH_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__POR:
				setPor(POR_EDEFAULT);
				return;
			case EdcPackage.MUXED_SFR_DEF_TYPE__REGIONIDREF:
				setRegionidref(REGIONIDREF_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EdcPackage.MUXED_SFR_DEF_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__GROUP:
				return !getGroup().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__SELECT_SFR:
				return !getSelectSFR().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__DCR_FIELD_SEMANTIC:
				return !getDCRFieldSemantic().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ALIAS_LIST:
				return !getAliasList().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_MODE_LIST:
				return !getSFRModeList().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__STIM_INFO:
				return !getStimInfo().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_MACRO:
				return !getModuleMacro().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODULE_EXCLUDE:
				return !getModuleExclude().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_DEF:
				return !getSFRDef().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__CHECKSUM:
				return !getChecksum().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__SFR_FIELD_SEMANTIC:
				return !getSFRFieldSemantic().isEmpty();
			case EdcPackage.MUXED_SFR_DEF_TYPE__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case EdcPackage.MUXED_SFR_DEF_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case EdcPackage.MUXED_SFR_DEF_TYPE__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case EdcPackage.MUXED_SFR_DEF_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case EdcPackage.MUXED_SFR_DEF_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case EdcPackage.MUXED_SFR_DEF_TYPE__IMPL:
				return IMPL_EDEFAULT == null ? impl != null : !IMPL_EDEFAULT.equals(impl);
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISHIDDEN:
				return ISHIDDEN_EDEFAULT == null ? ishidden != null : !ISHIDDEN_EDEFAULT.equals(ishidden);
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISIDEHIDDEN:
				return ISIDEHIDDEN_EDEFAULT == null ? isidehidden != null : !ISIDEHIDDEN_EDEFAULT.equals(isidehidden);
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISINDIRECT:
				return ISINDIRECT_EDEFAULT == null ? isindirect != null : !ISINDIRECT_EDEFAULT.equals(isindirect);
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISLANGHIDDEN:
				return ISLANGHIDDEN_EDEFAULT == null ? islanghidden != null : !ISLANGHIDDEN_EDEFAULT.equals(islanghidden);
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISLNAGHIDDEN:
				return ISLNAGHIDDEN_EDEFAULT == null ? islnaghidden != null : !ISLNAGHIDDEN_EDEFAULT.equals(islnaghidden);
			case EdcPackage.MUXED_SFR_DEF_TYPE__ISVOLATILE:
				return ISVOLATILE_EDEFAULT == null ? isvolatile != null : !ISVOLATILE_EDEFAULT.equals(isvolatile);
			case EdcPackage.MUXED_SFR_DEF_TYPE__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
			case EdcPackage.MUXED_SFR_DEF_TYPE__MCLR:
				return MCLR_EDEFAULT == null ? mclr != null : !MCLR_EDEFAULT.equals(mclr);
			case EdcPackage.MUXED_SFR_DEF_TYPE__MODSRC:
				return MODSRC_EDEFAULT == null ? modsrc != null : !MODSRC_EDEFAULT.equals(modsrc);
			case EdcPackage.MUXED_SFR_DEF_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdcPackage.MUXED_SFR_DEF_TYPE__NZSIZE:
				return NZSIZE_EDEFAULT == null ? nzsize != null : !NZSIZE_EDEFAULT.equals(nzsize);
			case EdcPackage.MUXED_SFR_DEF_TYPE__NZWIDTH:
				return NZWIDTH_EDEFAULT == null ? nzwidth != null : !NZWIDTH_EDEFAULT.equals(nzwidth);
			case EdcPackage.MUXED_SFR_DEF_TYPE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case EdcPackage.MUXED_SFR_DEF_TYPE__POR:
				return POR_EDEFAULT == null ? por != null : !POR_EDEFAULT.equals(por);
			case EdcPackage.MUXED_SFR_DEF_TYPE__REGIONIDREF:
				return REGIONIDREF_EDEFAULT == null ? regionidref != null : !REGIONIDREF_EDEFAULT.equals(regionidref);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", access: ");
		result.append(access);
		result.append(", begin: ");
		result.append(begin);
		result.append(", cname: ");
		result.append(cname);
		result.append(", desc: ");
		result.append(desc);
		result.append(", end: ");
		result.append(end);
		result.append(", impl: ");
		result.append(impl);
		result.append(", ishidden: ");
		result.append(ishidden);
		result.append(", isidehidden: ");
		result.append(isidehidden);
		result.append(", isindirect: ");
		result.append(isindirect);
		result.append(", islanghidden: ");
		result.append(islanghidden);
		result.append(", islnaghidden: ");
		result.append(islnaghidden);
		result.append(", isvolatile: ");
		result.append(isvolatile);
		result.append(", mask: ");
		result.append(mask);
		result.append(", mclr: ");
		result.append(mclr);
		result.append(", modsrc: ");
		result.append(modsrc);
		result.append(", name: ");
		result.append(name);
		result.append(", nzsize: ");
		result.append(nzsize);
		result.append(", nzwidth: ");
		result.append(nzwidth);
		result.append(", offset: ");
		result.append(offset);
		result.append(", por: ");
		result.append(por);
		result.append(", regionidref: ");
		result.append(regionidref);
		result.append(')');
		return result.toString();
	}

} //MuxedSFRDefTypeImpl
