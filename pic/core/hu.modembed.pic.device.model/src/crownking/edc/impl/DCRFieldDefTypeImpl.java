/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc.impl;

import crownking.edc.AliasListType1;
import crownking.edc.ChecksumType;
import crownking.edc.DCRFieldDefType;
import crownking.edc.DCRFieldSemanticType;
import crownking.edc.EdcPackage;
import crownking.edc.ModuleExcludeType;
import crownking.edc.ModuleMacroType;
import crownking.edc.SFRDefType;
import crownking.edc.SFRFieldSemanticType;
import crownking.edc.SFRModeListType;
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
 * An implementation of the model object '<em><b>DCR Field Def Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getDCRFieldSemantic <em>DCR Field Semantic</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getSFRModeList <em>SFR Mode List</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getStimInfo <em>Stim Info</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getModuleMacro <em>Module Macro</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getModuleExclude <em>Module Exclude</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getSFRDef <em>SFR Def</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getSFRFieldSemantic <em>SFR Field Semantic</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getAccess <em>Access</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getBegin <em>Begin</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getImpl <em>Impl</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getIshidden <em>Ishidden</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getIsidehidden <em>Isidehidden</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getIsindirect <em>Isindirect</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getIslanghidden <em>Islanghidden</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getIslnaghidden <em>Islnaghidden</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getIsvolatile <em>Isvolatile</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getMask <em>Mask</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getMclr <em>Mclr</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getModsrc <em>Modsrc</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getNzsize <em>Nzsize</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getNzwidth <em>Nzwidth</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getPor <em>Por</em>}</li>
 *   <li>{@link crownking.edc.impl.DCRFieldDefTypeImpl#getRegionidref <em>Regionidref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DCRFieldDefTypeImpl extends EObjectImpl implements DCRFieldDefType {
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
	protected DCRFieldDefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EdcPackage.eINSTANCE.getDCRFieldDefType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, EdcPackage.DCR_FIELD_DEF_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(EdcPackage.eINSTANCE.getDCRFieldDefType_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DCRFieldSemanticType> getDCRFieldSemantic() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_DCRFieldSemantic());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AliasListType1> getAliasList() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_AliasList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRModeListType> getSFRModeList() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_SFRModeList());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StimInfoType> getStimInfo() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_StimInfo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleMacroType> getModuleMacro() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_ModuleMacro());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModuleExcludeType> getModuleExclude() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_ModuleExclude());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRDefType> getSFRDef() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_SFRDef());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChecksumType> getChecksum() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_Checksum());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFRFieldSemanticType> getSFRFieldSemantic() {
		return getGroup().list(EdcPackage.eINSTANCE.getDCRFieldDefType_SFRFieldSemantic());
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__ACCESS, oldAccess, access));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__BEGIN, oldBegin, begin));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__CNAME, oldCname, cname));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__DESC, oldDesc, desc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__END, oldEnd, end));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__IMPL, oldImpl, impl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__ISHIDDEN, oldIshidden, ishidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__ISIDEHIDDEN, oldIsidehidden, isidehidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__ISINDIRECT, oldIsindirect, isindirect));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__ISLANGHIDDEN, oldIslanghidden, islanghidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__ISLNAGHIDDEN, oldIslnaghidden, islnaghidden));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__ISVOLATILE, oldIsvolatile, isvolatile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__MASK, oldMask, mask));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__MCLR, oldMclr, mclr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__MODSRC, oldModsrc, modsrc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__NZSIZE, oldNzsize, nzsize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__NZWIDTH, oldNzwidth, nzwidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__OFFSET, oldOffset, offset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__POR, oldPor, por));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EdcPackage.DCR_FIELD_DEF_TYPE__REGIONIDREF, oldRegionidref, regionidref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EdcPackage.DCR_FIELD_DEF_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__DCR_FIELD_SEMANTIC:
				return ((InternalEList<?>)getDCRFieldSemantic()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__ALIAS_LIST:
				return ((InternalEList<?>)getAliasList()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_MODE_LIST:
				return ((InternalEList<?>)getSFRModeList()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__STIM_INFO:
				return ((InternalEList<?>)getStimInfo()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_MACRO:
				return ((InternalEList<?>)getModuleMacro()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_EXCLUDE:
				return ((InternalEList<?>)getModuleExclude()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_DEF:
				return ((InternalEList<?>)getSFRDef()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__CHECKSUM:
				return ((InternalEList<?>)getChecksum()).basicRemove(otherEnd, msgs);
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_FIELD_SEMANTIC:
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
			case EdcPackage.DCR_FIELD_DEF_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case EdcPackage.DCR_FIELD_DEF_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case EdcPackage.DCR_FIELD_DEF_TYPE__DCR_FIELD_SEMANTIC:
				return getDCRFieldSemantic();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ALIAS_LIST:
				return getAliasList();
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_MODE_LIST:
				return getSFRModeList();
			case EdcPackage.DCR_FIELD_DEF_TYPE__STIM_INFO:
				return getStimInfo();
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_MACRO:
				return getModuleMacro();
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_EXCLUDE:
				return getModuleExclude();
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_DEF:
				return getSFRDef();
			case EdcPackage.DCR_FIELD_DEF_TYPE__CHECKSUM:
				return getChecksum();
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_FIELD_SEMANTIC:
				return getSFRFieldSemantic();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ACCESS:
				return getAccess();
			case EdcPackage.DCR_FIELD_DEF_TYPE__BEGIN:
				return getBegin();
			case EdcPackage.DCR_FIELD_DEF_TYPE__CNAME:
				return getCname();
			case EdcPackage.DCR_FIELD_DEF_TYPE__DESC:
				return getDesc();
			case EdcPackage.DCR_FIELD_DEF_TYPE__END:
				return getEnd();
			case EdcPackage.DCR_FIELD_DEF_TYPE__IMPL:
				return getImpl();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISHIDDEN:
				return getIshidden();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISIDEHIDDEN:
				return getIsidehidden();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISINDIRECT:
				return getIsindirect();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISLANGHIDDEN:
				return getIslanghidden();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISLNAGHIDDEN:
				return getIslnaghidden();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISVOLATILE:
				return getIsvolatile();
			case EdcPackage.DCR_FIELD_DEF_TYPE__MASK:
				return getMask();
			case EdcPackage.DCR_FIELD_DEF_TYPE__MCLR:
				return getMclr();
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODSRC:
				return getModsrc();
			case EdcPackage.DCR_FIELD_DEF_TYPE__NAME:
				return getName();
			case EdcPackage.DCR_FIELD_DEF_TYPE__NZSIZE:
				return getNzsize();
			case EdcPackage.DCR_FIELD_DEF_TYPE__NZWIDTH:
				return getNzwidth();
			case EdcPackage.DCR_FIELD_DEF_TYPE__OFFSET:
				return getOffset();
			case EdcPackage.DCR_FIELD_DEF_TYPE__POR:
				return getPor();
			case EdcPackage.DCR_FIELD_DEF_TYPE__REGIONIDREF:
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
			case EdcPackage.DCR_FIELD_DEF_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__DCR_FIELD_SEMANTIC:
				getDCRFieldSemantic().clear();
				getDCRFieldSemantic().addAll((Collection<? extends DCRFieldSemanticType>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ALIAS_LIST:
				getAliasList().clear();
				getAliasList().addAll((Collection<? extends AliasListType1>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_MODE_LIST:
				getSFRModeList().clear();
				getSFRModeList().addAll((Collection<? extends SFRModeListType>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__STIM_INFO:
				getStimInfo().clear();
				getStimInfo().addAll((Collection<? extends StimInfoType>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_MACRO:
				getModuleMacro().clear();
				getModuleMacro().addAll((Collection<? extends ModuleMacroType>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_EXCLUDE:
				getModuleExclude().clear();
				getModuleExclude().addAll((Collection<? extends ModuleExcludeType>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_DEF:
				getSFRDef().clear();
				getSFRDef().addAll((Collection<? extends SFRDefType>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__CHECKSUM:
				getChecksum().clear();
				getChecksum().addAll((Collection<? extends ChecksumType>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_FIELD_SEMANTIC:
				getSFRFieldSemantic().clear();
				getSFRFieldSemantic().addAll((Collection<? extends SFRFieldSemanticType>)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ACCESS:
				setAccess((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__BEGIN:
				setBegin((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__CNAME:
				setCname((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__DESC:
				setDesc((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__END:
				setEnd((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__IMPL:
				setImpl((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISHIDDEN:
				setIshidden((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISIDEHIDDEN:
				setIsidehidden((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISINDIRECT:
				setIsindirect((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISLANGHIDDEN:
				setIslanghidden((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISLNAGHIDDEN:
				setIslnaghidden((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISVOLATILE:
				setIsvolatile((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MASK:
				setMask((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MCLR:
				setMclr((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODSRC:
				setModsrc((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__NAME:
				setName((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__NZSIZE:
				setNzsize((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__NZWIDTH:
				setNzwidth((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__OFFSET:
				setOffset((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__POR:
				setPor((String)newValue);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__REGIONIDREF:
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
			case EdcPackage.DCR_FIELD_DEF_TYPE__MIXED:
				getMixed().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__GROUP:
				getGroup().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__DCR_FIELD_SEMANTIC:
				getDCRFieldSemantic().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ALIAS_LIST:
				getAliasList().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_MODE_LIST:
				getSFRModeList().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__STIM_INFO:
				getStimInfo().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_MACRO:
				getModuleMacro().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_EXCLUDE:
				getModuleExclude().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_DEF:
				getSFRDef().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__CHECKSUM:
				getChecksum().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_FIELD_SEMANTIC:
				getSFRFieldSemantic().clear();
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ACCESS:
				setAccess(ACCESS_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__BEGIN:
				setBegin(BEGIN_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__CNAME:
				setCname(CNAME_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__DESC:
				setDesc(DESC_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__END:
				setEnd(END_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__IMPL:
				setImpl(IMPL_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISHIDDEN:
				setIshidden(ISHIDDEN_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISIDEHIDDEN:
				setIsidehidden(ISIDEHIDDEN_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISINDIRECT:
				setIsindirect(ISINDIRECT_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISLANGHIDDEN:
				setIslanghidden(ISLANGHIDDEN_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISLNAGHIDDEN:
				setIslnaghidden(ISLNAGHIDDEN_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISVOLATILE:
				setIsvolatile(ISVOLATILE_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MCLR:
				setMclr(MCLR_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODSRC:
				setModsrc(MODSRC_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__NZSIZE:
				setNzsize(NZSIZE_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__NZWIDTH:
				setNzwidth(NZWIDTH_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__POR:
				setPor(POR_EDEFAULT);
				return;
			case EdcPackage.DCR_FIELD_DEF_TYPE__REGIONIDREF:
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
			case EdcPackage.DCR_FIELD_DEF_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__GROUP:
				return !getGroup().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__DCR_FIELD_SEMANTIC:
				return !getDCRFieldSemantic().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ALIAS_LIST:
				return !getAliasList().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_MODE_LIST:
				return !getSFRModeList().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__STIM_INFO:
				return !getStimInfo().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_MACRO:
				return !getModuleMacro().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODULE_EXCLUDE:
				return !getModuleExclude().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_DEF:
				return !getSFRDef().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__CHECKSUM:
				return !getChecksum().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__SFR_FIELD_SEMANTIC:
				return !getSFRFieldSemantic().isEmpty();
			case EdcPackage.DCR_FIELD_DEF_TYPE__ACCESS:
				return ACCESS_EDEFAULT == null ? access != null : !ACCESS_EDEFAULT.equals(access);
			case EdcPackage.DCR_FIELD_DEF_TYPE__BEGIN:
				return BEGIN_EDEFAULT == null ? begin != null : !BEGIN_EDEFAULT.equals(begin);
			case EdcPackage.DCR_FIELD_DEF_TYPE__CNAME:
				return CNAME_EDEFAULT == null ? cname != null : !CNAME_EDEFAULT.equals(cname);
			case EdcPackage.DCR_FIELD_DEF_TYPE__DESC:
				return DESC_EDEFAULT == null ? desc != null : !DESC_EDEFAULT.equals(desc);
			case EdcPackage.DCR_FIELD_DEF_TYPE__END:
				return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
			case EdcPackage.DCR_FIELD_DEF_TYPE__IMPL:
				return IMPL_EDEFAULT == null ? impl != null : !IMPL_EDEFAULT.equals(impl);
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISHIDDEN:
				return ISHIDDEN_EDEFAULT == null ? ishidden != null : !ISHIDDEN_EDEFAULT.equals(ishidden);
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISIDEHIDDEN:
				return ISIDEHIDDEN_EDEFAULT == null ? isidehidden != null : !ISIDEHIDDEN_EDEFAULT.equals(isidehidden);
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISINDIRECT:
				return ISINDIRECT_EDEFAULT == null ? isindirect != null : !ISINDIRECT_EDEFAULT.equals(isindirect);
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISLANGHIDDEN:
				return ISLANGHIDDEN_EDEFAULT == null ? islanghidden != null : !ISLANGHIDDEN_EDEFAULT.equals(islanghidden);
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISLNAGHIDDEN:
				return ISLNAGHIDDEN_EDEFAULT == null ? islnaghidden != null : !ISLNAGHIDDEN_EDEFAULT.equals(islnaghidden);
			case EdcPackage.DCR_FIELD_DEF_TYPE__ISVOLATILE:
				return ISVOLATILE_EDEFAULT == null ? isvolatile != null : !ISVOLATILE_EDEFAULT.equals(isvolatile);
			case EdcPackage.DCR_FIELD_DEF_TYPE__MASK:
				return MASK_EDEFAULT == null ? mask != null : !MASK_EDEFAULT.equals(mask);
			case EdcPackage.DCR_FIELD_DEF_TYPE__MCLR:
				return MCLR_EDEFAULT == null ? mclr != null : !MCLR_EDEFAULT.equals(mclr);
			case EdcPackage.DCR_FIELD_DEF_TYPE__MODSRC:
				return MODSRC_EDEFAULT == null ? modsrc != null : !MODSRC_EDEFAULT.equals(modsrc);
			case EdcPackage.DCR_FIELD_DEF_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EdcPackage.DCR_FIELD_DEF_TYPE__NZSIZE:
				return NZSIZE_EDEFAULT == null ? nzsize != null : !NZSIZE_EDEFAULT.equals(nzsize);
			case EdcPackage.DCR_FIELD_DEF_TYPE__NZWIDTH:
				return NZWIDTH_EDEFAULT == null ? nzwidth != null : !NZWIDTH_EDEFAULT.equals(nzwidth);
			case EdcPackage.DCR_FIELD_DEF_TYPE__OFFSET:
				return OFFSET_EDEFAULT == null ? offset != null : !OFFSET_EDEFAULT.equals(offset);
			case EdcPackage.DCR_FIELD_DEF_TYPE__POR:
				return POR_EDEFAULT == null ? por != null : !POR_EDEFAULT.equals(por);
			case EdcPackage.DCR_FIELD_DEF_TYPE__REGIONIDREF:
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

} //DCRFieldDefTypeImpl
