/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package crownking.edc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joined SFR Def Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getDCRFieldSemantic <em>DCR Field Semantic</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getSFRModeList <em>SFR Mode List</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getStimInfo <em>Stim Info</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getSFRDef <em>SFR Def</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getModuleMacro <em>Module Macro</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getModuleExclude <em>Module Exclude</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getSFRFieldSemantic <em>SFR Field Semantic</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getAccess <em>Access</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getBegin <em>Begin</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getEnd <em>End</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getImpl <em>Impl</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getIshidden <em>Ishidden</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getIsidehidden <em>Isidehidden</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getIsindirect <em>Isindirect</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getIslanghidden <em>Islanghidden</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getIslnaghidden <em>Islnaghidden</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getIsvolatile <em>Isvolatile</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getMask <em>Mask</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getMclr <em>Mclr</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getModsrc <em>Modsrc</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getNzsize <em>Nzsize</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getNzwidth <em>Nzwidth</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getOffset <em>Offset</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getPor <em>Por</em>}</li>
 *   <li>{@link crownking.edc.JoinedSFRDefType#getRegionidref <em>Regionidref</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getJoinedSFRDefType()
 * @model extendedMetaData="name='JoinedSFRDefType' kind='mixed'"
 * @generated
 */
public interface JoinedSFRDefType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>DCR Field Semantic</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.DCRFieldSemanticType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DCR Field Semantic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DCR Field Semantic</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_DCRFieldSemantic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DCRFieldSemantic' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DCRFieldSemanticType> getDCRFieldSemantic();

	/**
	 * Returns the value of the '<em><b>Alias List</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.AliasListType2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias List</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_AliasList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AliasList' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AliasListType2> getAliasList();

	/**
	 * Returns the value of the '<em><b>SFR Mode List</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.SFRModeListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFR Mode List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFR Mode List</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_SFRModeList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SFRModeList' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SFRModeListType> getSFRModeList();

	/**
	 * Returns the value of the '<em><b>Stim Info</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.StimInfoType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stim Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stim Info</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_StimInfo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StimInfo' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StimInfoType> getStimInfo();

	/**
	 * Returns the value of the '<em><b>SFR Def</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.SFRDefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFR Def</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFR Def</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_SFRDef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SFRDef' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SFRDefType> getSFRDef();

	/**
	 * Returns the value of the '<em><b>Module Macro</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.ModuleMacroType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Macro</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Macro</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_ModuleMacro()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModuleMacro' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ModuleMacroType> getModuleMacro();

	/**
	 * Returns the value of the '<em><b>Module Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.ModuleExcludeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Exclude</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Exclude</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_ModuleExclude()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModuleExclude' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ModuleExcludeType> getModuleExclude();

	/**
	 * Returns the value of the '<em><b>Checksum</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.ChecksumType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checksum</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checksum</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Checksum()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Checksum' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ChecksumType> getChecksum();

	/**
	 * Returns the value of the '<em><b>SFR Field Semantic</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.SFRFieldSemanticType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFR Field Semantic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFR Field Semantic</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_SFRFieldSemantic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SFRFieldSemantic' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SFRFieldSemanticType> getSFRFieldSemantic();

	/**
	 * Returns the value of the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access</em>' attribute.
	 * @see #setAccess(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getAccess <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access</em>' attribute.
	 * @see #getAccess()
	 * @generated
	 */
	void setAccess(String value);

	/**
	 * Returns the value of the '<em><b>Begin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' attribute.
	 * @see #setBegin(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Begin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='begin'"
	 * @generated
	 */
	String getBegin();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getBegin <em>Begin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' attribute.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(String value);

	/**
	 * Returns the value of the '<em><b>Cname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cname</em>' attribute.
	 * @see #setCname(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Cname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cname'"
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getCname <em>Cname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cname</em>' attribute.
	 * @see #getCname()
	 * @generated
	 */
	void setCname(String value);

	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_End()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(String value);

	/**
	 * Returns the value of the '<em><b>Impl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Impl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Impl</em>' attribute.
	 * @see #setImpl(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Impl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='impl'"
	 * @generated
	 */
	String getImpl();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getImpl <em>Impl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Impl</em>' attribute.
	 * @see #getImpl()
	 * @generated
	 */
	void setImpl(String value);

	/**
	 * Returns the value of the '<em><b>Ishidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ishidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ishidden</em>' attribute.
	 * @see #setIshidden(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Ishidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ishidden'"
	 * @generated
	 */
	String getIshidden();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getIshidden <em>Ishidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ishidden</em>' attribute.
	 * @see #getIshidden()
	 * @generated
	 */
	void setIshidden(String value);

	/**
	 * Returns the value of the '<em><b>Isidehidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isidehidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isidehidden</em>' attribute.
	 * @see #setIsidehidden(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Isidehidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isidehidden'"
	 * @generated
	 */
	String getIsidehidden();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getIsidehidden <em>Isidehidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isidehidden</em>' attribute.
	 * @see #getIsidehidden()
	 * @generated
	 */
	void setIsidehidden(String value);

	/**
	 * Returns the value of the '<em><b>Isindirect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isindirect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isindirect</em>' attribute.
	 * @see #setIsindirect(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Isindirect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isindirect'"
	 * @generated
	 */
	String getIsindirect();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getIsindirect <em>Isindirect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isindirect</em>' attribute.
	 * @see #getIsindirect()
	 * @generated
	 */
	void setIsindirect(String value);

	/**
	 * Returns the value of the '<em><b>Islanghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Islanghidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Islanghidden</em>' attribute.
	 * @see #setIslanghidden(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Islanghidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='islanghidden'"
	 * @generated
	 */
	String getIslanghidden();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getIslanghidden <em>Islanghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Islanghidden</em>' attribute.
	 * @see #getIslanghidden()
	 * @generated
	 */
	void setIslanghidden(String value);

	/**
	 * Returns the value of the '<em><b>Islnaghidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Islnaghidden</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Islnaghidden</em>' attribute.
	 * @see #setIslnaghidden(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Islnaghidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='islnaghidden'"
	 * @generated
	 */
	String getIslnaghidden();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getIslnaghidden <em>Islnaghidden</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Islnaghidden</em>' attribute.
	 * @see #getIslnaghidden()
	 * @generated
	 */
	void setIslnaghidden(String value);

	/**
	 * Returns the value of the '<em><b>Isvolatile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Isvolatile</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Isvolatile</em>' attribute.
	 * @see #setIsvolatile(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Isvolatile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isvolatile'"
	 * @generated
	 */
	String getIsvolatile();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getIsvolatile <em>Isvolatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Isvolatile</em>' attribute.
	 * @see #getIsvolatile()
	 * @generated
	 */
	void setIsvolatile(String value);

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Mask()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mask'"
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(String value);

	/**
	 * Returns the value of the '<em><b>Mclr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mclr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mclr</em>' attribute.
	 * @see #setMclr(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Mclr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mclr'"
	 * @generated
	 */
	String getMclr();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getMclr <em>Mclr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mclr</em>' attribute.
	 * @see #getMclr()
	 * @generated
	 */
	void setMclr(String value);

	/**
	 * Returns the value of the '<em><b>Modsrc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modsrc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modsrc</em>' attribute.
	 * @see #setModsrc(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Modsrc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='modsrc'"
	 * @generated
	 */
	String getModsrc();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getModsrc <em>Modsrc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modsrc</em>' attribute.
	 * @see #getModsrc()
	 * @generated
	 */
	void setModsrc(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Nzsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nzsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nzsize</em>' attribute.
	 * @see #setNzsize(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Nzsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nzsize'"
	 * @generated
	 */
	String getNzsize();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getNzsize <em>Nzsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nzsize</em>' attribute.
	 * @see #getNzsize()
	 * @generated
	 */
	void setNzsize(String value);

	/**
	 * Returns the value of the '<em><b>Nzwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nzwidth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nzwidth</em>' attribute.
	 * @see #setNzwidth(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Nzwidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nzwidth'"
	 * @generated
	 */
	String getNzwidth();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getNzwidth <em>Nzwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nzwidth</em>' attribute.
	 * @see #getNzwidth()
	 * @generated
	 */
	void setNzwidth(String value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Offset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='offset'"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(String value);

	/**
	 * Returns the value of the '<em><b>Por</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Por</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Por</em>' attribute.
	 * @see #setPor(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Por()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='por'"
	 * @generated
	 */
	String getPor();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getPor <em>Por</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Por</em>' attribute.
	 * @see #getPor()
	 * @generated
	 */
	void setPor(String value);

	/**
	 * Returns the value of the '<em><b>Regionidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regionidref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regionidref</em>' attribute.
	 * @see #setRegionidref(String)
	 * @see crownking.edc.EdcPackage#getJoinedSFRDefType_Regionidref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionidref'"
	 * @generated
	 */
	String getRegionidref();

	/**
	 * Sets the value of the '{@link crownking.edc.JoinedSFRDefType#getRegionidref <em>Regionidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionidref</em>' attribute.
	 * @see #getRegionidref()
	 * @generated
	 */
	void setRegionidref(String value);

} // JoinedSFRDefType
