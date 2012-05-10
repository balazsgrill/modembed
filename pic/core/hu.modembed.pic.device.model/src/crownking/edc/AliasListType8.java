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
 * A representation of the model object '<em><b>Alias List Type8</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link crownking.edc.AliasListType8#getGroup <em>Group</em>}</li>
 *   <li>{@link crownking.edc.AliasListType8#getLegacyAlias <em>Legacy Alias</em>}</li>
 *   <li>{@link crownking.edc.AliasListType8#getMigrationAlias <em>Migration Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see crownking.edc.EdcPackage#getAliasListType8()
 * @model extendedMetaData="name='AliasListType' kind='elementOnly'"
 * @generated
 */
public interface AliasListType8 extends EObject {
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
	 * @see crownking.edc.EdcPackage#getAliasListType8_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Legacy Alias</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.LegacyAliasType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legacy Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Alias</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getAliasListType8_LegacyAlias()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LegacyAlias' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LegacyAliasType> getLegacyAlias();

	/**
	 * Returns the value of the '<em><b>Migration Alias</b></em>' containment reference list.
	 * The list contents are of type {@link crownking.edc.MigrationAliasType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Migration Alias</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Migration Alias</em>' containment reference list.
	 * @see crownking.edc.EdcPackage#getAliasListType8_MigrationAlias()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MigrationAlias' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MigrationAliasType> getMigrationAlias();

} // AliasListType8
