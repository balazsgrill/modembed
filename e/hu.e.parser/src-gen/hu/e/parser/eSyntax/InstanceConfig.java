/**
 * <copyright>
 * </copyright>
 *

 */
package hu.e.parser.eSyntax;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.e.parser.eSyntax.InstanceConfig#getConf <em>Conf</em>}</li>
 *   <li>{@link hu.e.parser.eSyntax.InstanceConfig#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstanceConfig()
 * @model
 * @generated
 */
public interface InstanceConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Conf</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conf</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conf</em>' reference.
   * @see #setConf(ConfigVariable)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstanceConfig_Conf()
   * @model
   * @generated
   */
  ConfigVariable getConf();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.InstanceConfig#getConf <em>Conf</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conf</em>' reference.
   * @see #getConf()
   * @generated
   */
  void setConf(ConfigVariable value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(XExpression)
   * @see hu.e.parser.eSyntax.ESyntaxPackage#getInstanceConfig_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link hu.e.parser.eSyntax.InstanceConfig#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

} // InstanceConfig
