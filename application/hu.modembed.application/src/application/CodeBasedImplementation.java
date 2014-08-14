/**
 */
package application;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Based Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link application.CodeBasedImplementation#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link application.CodeBasedImplementation#getAdditionalSources <em>Additional Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see application.ApplicationPackage#getCodeBasedImplementation()
 * @model
 * @generated
 */
public interface CodeBasedImplementation extends ApplicationModuleImplementation {

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see application.ApplicationPackage#getCodeBasedImplementation_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link application.CodeBasedImplementation#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Additional Sources</b></em>' containment reference list.
	 * The list contents are of type {@link application.SourceFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Sources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Sources</em>' containment reference list.
	 * @see application.ApplicationPackage#getCodeBasedImplementation_AdditionalSources()
	 * @model containment="true"
	 * @generated
	 */
	EList<SourceFile> getAdditionalSources();
} // CodeBasedImplementation
