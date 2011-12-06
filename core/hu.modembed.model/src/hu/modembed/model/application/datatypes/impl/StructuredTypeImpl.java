/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.modembed.model.application.datatypes.impl;

import hu.modembed.model.application.datatypes.DatatypesPackage;
import hu.modembed.model.application.datatypes.StructuredType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class StructuredTypeImpl extends DatatypeImpl implements StructuredType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatatypesPackage.Literals.STRUCTURED_TYPE;
	}

} //StructuredTypeImpl