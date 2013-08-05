/**
 */
package hu.modembed.model.modembed.infrastructure.traceability;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.traceability.TextOrigin#getFileName <em>File Name</em>}</li>
 *   <li>{@link hu.modembed.model.modembed.infrastructure.traceability.TextOrigin#getLine <em>Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.modembed.infrastructure.traceability.TraceabilityPackage#getTextOrigin()
 * @model
 * @generated
 */
public interface TextOrigin extends Origin {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see hu.modembed.model.modembed.infrastructure.traceability.TraceabilityPackage#getTextOrigin_FileName()
	 * @model required="true"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.infrastructure.traceability.TextOrigin#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see hu.modembed.model.modembed.infrastructure.traceability.TraceabilityPackage#getTextOrigin_Line()
	 * @model required="true"
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link hu.modembed.model.modembed.infrastructure.traceability.TextOrigin#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

} // TextOrigin
