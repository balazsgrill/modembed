/**
 */
package hu.modembed.model.architecture.linking.impl;

import hu.modembed.model.architecture.linking.LinkingElement;
import hu.modembed.model.architecture.linking.LinkingPackage;

import hu.modembed.model.core.impl.RootElementImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class LinkingElementImpl extends RootElementImpl implements LinkingElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkingElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LinkingPackage.Literals.LINKING_ELEMENT;
	}

} //LinkingElementImpl
