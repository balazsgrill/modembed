/**
 */
package hu.modembed.syntax;

import hu.modembed.model.modembed.infrastructure.RootElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.syntax.SyntaxModel#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link hu.modembed.syntax.SyntaxModel#getRules <em>Rules</em>}</li>
 *   <li>{@link hu.modembed.syntax.SyntaxModel#getStartItem <em>Start Item</em>}</li>
 *   <li>{@link hu.modembed.syntax.SyntaxModel#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.syntax.SyntaxPackage#getSyntaxModel()
 * @model
 * @generated
 */
public interface SyntaxModel extends RootElement {
	/**
	 * Returns the value of the '<em><b>Terminals</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.syntax.Terminal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Terminals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Terminals</em>' containment reference list.
	 * @see hu.modembed.syntax.SyntaxPackage#getSyntaxModel_Terminals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Terminal> getTerminals();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link hu.modembed.syntax.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see hu.modembed.syntax.SyntaxPackage#getSyntaxModel_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Start Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Item</em>' attribute.
	 * @see #setStartItem(String)
	 * @see hu.modembed.syntax.SyntaxPackage#getSyntaxModel_StartItem()
	 * @model required="true"
	 * @generated
	 */
	String getStartItem();

	/**
	 * Sets the value of the '{@link hu.modembed.syntax.SyntaxModel#getStartItem <em>Start Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Item</em>' attribute.
	 * @see #getStartItem()
	 * @generated
	 */
	void setStartItem(String value);

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference list.
	 * The list contents are of type {@link hu.modembed.syntax.SyntaxModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference list.
	 * @see hu.modembed.syntax.SyntaxPackage#getSyntaxModel_Import()
	 * @model
	 * @generated
	 */
	EList<SyntaxModel> getImport();

} // SyntaxModel
