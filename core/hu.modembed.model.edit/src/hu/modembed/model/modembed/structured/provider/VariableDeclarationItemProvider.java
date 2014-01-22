/**
 */
package hu.modembed.model.modembed.structured.provider;


import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory;

import hu.modembed.model.modembed.abstraction.types.TypesFactory;

import hu.modembed.model.modembed.infrastructure.expressions.ExpressionsFactory;

import hu.modembed.model.modembed.infrastructure.provider.ModembedEditPlugin;
import hu.modembed.model.modembed.infrastructure.provider.NamedElementItemProvider;

import hu.modembed.model.modembed.structured.StructuredFactory;
import hu.modembed.model.modembed.structured.StructuredPackage;
import hu.modembed.model.modembed.structured.VariableDeclaration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.modembed.model.modembed.structured.VariableDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableDeclarationItemProvider
	extends NamedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addConstPropertyDescriptor(object);
			addGlobalPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Const feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_const_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_const_feature", "_UI_VariableDeclaration_type"),
				 StructuredPackage.Literals.VARIABLE_DECLARATION__CONST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Global feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGlobalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VariableDeclaration_global_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VariableDeclaration_global_feature", "_UI_VariableDeclaration_type"),
				 StructuredPackage.Literals.VARIABLE_DECLARATION__GLOBAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(StructuredPackage.Literals.VARIABLE_DECLARATION__TYPE);
			childrenFeatures.add(StructuredPackage.Literals.VARIABLE_DECLARATION__INIT_VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns VariableDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VariableDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VariableDeclaration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_VariableDeclaration_type") :
			getString("_UI_VariableDeclaration_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(VariableDeclaration.class)) {
			case StructuredPackage.VARIABLE_DECLARATION__CONST:
			case StructuredPackage.VARIABLE_DECLARATION__GLOBAL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case StructuredPackage.VARIABLE_DECLARATION__TYPE:
			case StructuredPackage.VARIABLE_DECLARATION__INIT_VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__TYPE,
				 TypesFactory.eINSTANCE.createUnsignedTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__TYPE,
				 TypesFactory.eINSTANCE.createReferenceTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__TYPE,
				 TypesFactory.eINSTANCE.createArrayTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__TYPE,
				 TypesFactory.eINSTANCE.createArrayDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__TYPE,
				 TypesFactory.eINSTANCE.createStructureTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__TYPE,
				 TypesFactory.eINSTANCE.createCodeLabelTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__TYPE,
				 TypesFactory.eINSTANCE.createPointerTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__INIT_VALUE,
				 StructuredFactory.eINSTANCE.createVariableReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__INIT_VALUE,
				 StructuredFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__INIT_VALUE,
				 ExpressionsFactory.eINSTANCE.createIntegerConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__INIT_VALUE,
				 ExpressionsFactory.eINSTANCE.createOperationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__INIT_VALUE,
				 PlatformFactory.eINSTANCE.createLabelParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.VARIABLE_DECLARATION__INIT_VALUE,
				 PlatformFactory.eINSTANCE.createInstructionParameterMapping()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ModembedEditPlugin.INSTANCE;
	}

}
