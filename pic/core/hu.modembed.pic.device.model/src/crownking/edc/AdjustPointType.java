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
 * A representation of the model object '<em><b>Adjust Point Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.AdjustPointType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getDCRFieldSemantic <em>DCR Field Semantic</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getAliasList <em>Alias List</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getSFRModeList <em>SFR Mode List</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getStimInfo <em>Stim Info</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getModuleMacro <em>Module Macro</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getModuleExclude <em>Module Exclude</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getSFRDef <em>SFR Def</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getChecksum <em>Checksum</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getSFRFieldSemantic <em>SFR Field Semantic</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getAccess <em>Access</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getBegin <em>Begin</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getCname <em>Cname</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getDesc <em>Desc</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getEnd <em>End</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getImpl <em>Impl</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getIshidden <em>Ishidden</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getIsidehidden <em>Isidehidden</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getIsindirect <em>Isindirect</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getIslanghidden <em>Islanghidden</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getIslnaghidden <em>Islnaghidden</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getIsvolatile <em>Isvolatile</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getMask <em>Mask</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getMclr <em>Mclr</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getModsrc <em>Modsrc</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getName <em>Name</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getNzsize <em>Nzsize</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getNzwidth <em>Nzwidth</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getOffset <em>Offset</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getPor <em>Por</em>}</li>
 *   <li>{@link crownking.edc.AdjustPointType#getRegionidref <em>Regionidref</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getAdjustPointType()
 * @model extendedMetaData="name='AdjustPointType' kind='mixed'"
 * @generated
 */
public interface AdjustPointType extends EObject {
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Mixed()
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Group()
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_DCRFieldSemantic()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DCRFieldSemantic' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DCRFieldSemanticType> getDCRFieldSemantic();

	/**
	 * Returns the value of the '<em><b>Alias List</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.AliasListType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias List</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getAdjustPointType_AliasList()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AliasList' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AliasListType> getAliasList();

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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_SFRModeList()
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_StimInfo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StimInfo' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StimInfoType> getStimInfo();

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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_ModuleMacro()
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_ModuleExclude()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ModuleExclude' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ModuleExcludeType> getModuleExclude();

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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_SFRDef()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SFRDef' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SFRDefType> getSFRDef();

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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Checksum()
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_SFRFieldSemantic()
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Access()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='access'"
	 * @generated
	 */
	String getAccess();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getAccess <em>Access</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Begin()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='begin'"
	 * @generated
	 */
	String getBegin();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getBegin <em>Begin</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Cname()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='cname'"
	 * @generated
	 */
	String getCname();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getCname <em>Cname</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Desc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='desc'"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getDesc <em>Desc</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_End()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='end'"
	 * @generated
	 */
	String getEnd();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getEnd <em>End</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Impl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='impl'"
	 * @generated
	 */
	String getImpl();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getImpl <em>Impl</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Ishidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ishidden'"
	 * @generated
	 */
	String getIshidden();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getIshidden <em>Ishidden</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Isidehidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isidehidden'"
	 * @generated
	 */
	String getIsidehidden();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getIsidehidden <em>Isidehidden</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Isindirect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isindirect'"
	 * @generated
	 */
	String getIsindirect();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getIsindirect <em>Isindirect</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Islanghidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='islanghidden'"
	 * @generated
	 */
	String getIslanghidden();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getIslanghidden <em>Islanghidden</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Islnaghidden()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='islnaghidden'"
	 * @generated
	 */
	String getIslnaghidden();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getIslnaghidden <em>Islnaghidden</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Isvolatile()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isvolatile'"
	 * @generated
	 */
	String getIsvolatile();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getIsvolatile <em>Isvolatile</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Mask()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mask'"
	 * @generated
	 */
	String getMask();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getMask <em>Mask</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Mclr()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mclr'"
	 * @generated
	 */
	String getMclr();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getMclr <em>Mclr</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Modsrc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='modsrc'"
	 * @generated
	 */
	String getModsrc();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getModsrc <em>Modsrc</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getName <em>Name</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Nzsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nzsize'"
	 * @generated
	 */
	String getNzsize();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getNzsize <em>Nzsize</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Nzwidth()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nzwidth'"
	 * @generated
	 */
	String getNzwidth();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getNzwidth <em>Nzwidth</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Offset()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='offset'"
	 * @generated
	 */
	String getOffset();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getOffset <em>Offset</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Por()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='por'"
	 * @generated
	 */
	String getPor();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getPor <em>Por</em>}' attribute.
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
	 * @see crownking.edc.EdcPackage#getAdjustPointType_Regionidref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='regionidref'"
	 * @generated
	 */
	String getRegionidref();

	/**
	 * Sets the value of the '{@link crownking.edc.AdjustPointType#getRegionidref <em>Regionidref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regionidref</em>' attribute.
	 * @see #getRegionidref()
	 * @generated
	 */
	void setRegionidref(String value);

} // AdjustPointType
