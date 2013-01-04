/**
 */
package hu.modembed.model.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Origin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.modembed.model.core.TextOrigin#getPath <em>Path</em>}</li>
 *   <li>{@link hu.modembed.model.core.TextOrigin#getLine <em>Line</em>}</li>
 *   <li>{@link hu.modembed.model.core.TextOrigin#getCharStart <em>Char Start</em>}</li>
 *   <li>{@link hu.modembed.model.core.TextOrigin#getCharEnd <em>Char End</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.modembed.model.core.CorePackage#getTextOrigin()
 * @model
 * @generated
 */
public interface TextOrigin extends Origin {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see hu.modembed.model.core.CorePackage#getTextOrigin_Path()
	 * @model required="true"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.TextOrigin#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

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
	 * @see hu.modembed.model.core.CorePackage#getTextOrigin_Line()
	 * @model
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.TextOrigin#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Char Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Start</em>' attribute.
	 * @see #setCharStart(int)
	 * @see hu.modembed.model.core.CorePackage#getTextOrigin_CharStart()
	 * @model
	 * @generated
	 */
	int getCharStart();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.TextOrigin#getCharStart <em>Char Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Start</em>' attribute.
	 * @see #getCharStart()
	 * @generated
	 */
	void setCharStart(int value);

	/**
	 * Returns the value of the '<em><b>Char End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char End</em>' attribute.
	 * @see #setCharEnd(int)
	 * @see hu.modembed.model.core.CorePackage#getTextOrigin_CharEnd()
	 * @model
	 * @generated
	 */
	int getCharEnd();

	/**
	 * Sets the value of the '{@link hu.modembed.model.core.TextOrigin#getCharEnd <em>Char End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char End</em>' attribute.
	 * @see #getCharEnd()
	 * @generated
	 */
	void setCharEnd(int value);

} // TextOrigin
