/**
 */
package hu.e.compiler.list;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Time Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.compiler.list.LinkTimeExpression#getArguments <em>Arguments</em>}</li>
 *   <li>{@link hu.e.compiler.list.LinkTimeExpression#getOperation <em>Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.compiler.list.ListPackage#getLinkTimeExpression()
 * @model
 * @generated
 */
public interface LinkTimeExpression extends LinkTimeValue {
	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link hu.e.compiler.list.LinkTimeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see hu.e.compiler.list.ListPackage#getLinkTimeExpression_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkTimeValue> getArguments();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.e.compiler.list.LinkTimeOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see hu.e.compiler.list.LinkTimeOperation
	 * @see #setOperation(LinkTimeOperation)
	 * @see hu.e.compiler.list.ListPackage#getLinkTimeExpression_Operation()
	 * @model
	 * @generated
	 */
	LinkTimeOperation getOperation();

	/**
	 * Sets the value of the '{@link hu.e.compiler.list.LinkTimeExpression#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see hu.e.compiler.list.LinkTimeOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(LinkTimeOperation value);

} // LinkTimeExpression
