/**
 */
package hu.modembed.model.modembed.abstraction.provider;


import hu.modembed.model.modembed.abstraction.AbstractionPackage;
import hu.modembed.model.modembed.abstraction.DeviceAbstraction;

import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory;

import hu.modembed.model.modembed.abstraction.memorymodel.MemorymodelFactory;

import hu.modembed.model.modembed.infrastructure.provider.ModembedEditPlugin;
import hu.modembed.model.modembed.infrastructure.provider.RootElementItemProvider;

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
 * This is the item provider adapter for a {@link hu.modembed.model.modembed.abstraction.DeviceAbstraction} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceAbstractionItemProvider
	extends RootElementItemProvider
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
	public DeviceAbstractionItemProvider(AdapterFactory adapterFactory) {
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

			addAncestorPropertyDescriptor(object);
			addInstructionsetPropertyDescriptor(object);
			addSizeOfPointerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ancestor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAncestorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceAbstraction_ancestor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceAbstraction_ancestor_feature", "_UI_DeviceAbstraction_type"),
				 AbstractionPackage.Literals.DEVICE_ABSTRACTION__ANCESTOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instructionset feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstructionsetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceAbstraction_instructionset_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceAbstraction_instructionset_feature", "_UI_DeviceAbstraction_type"),
				 AbstractionPackage.Literals.DEVICE_ABSTRACTION__INSTRUCTIONSET,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Size Of Pointer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSizeOfPointerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DeviceAbstraction_sizeOfPointer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DeviceAbstraction_sizeOfPointer_feature", "_UI_DeviceAbstraction_type"),
				 AbstractionPackage.Literals.DEVICE_ABSTRACTION__SIZE_OF_POINTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(AbstractionPackage.Literals.DEVICE_ABSTRACTION__MEMORY_TYPES);
			childrenFeatures.add(AbstractionPackage.Literals.DEVICE_ABSTRACTION__MEMORY_INSTANCES);
			childrenFeatures.add(AbstractionPackage.Literals.DEVICE_ABSTRACTION__OPERATION);
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
	 * This returns DeviceAbstraction.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DeviceAbstraction"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DeviceAbstraction)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_DeviceAbstraction_type") :
			getString("_UI_DeviceAbstraction_type") + " " + label;
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

		switch (notification.getFeatureID(DeviceAbstraction.class)) {
			case AbstractionPackage.DEVICE_ABSTRACTION__SIZE_OF_POINTER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_TYPES:
			case AbstractionPackage.DEVICE_ABSTRACTION__MEMORY_INSTANCES:
			case AbstractionPackage.DEVICE_ABSTRACTION__OPERATION:
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
				(AbstractionPackage.Literals.DEVICE_ABSTRACTION__MEMORY_TYPES,
				 MemorymodelFactory.eINSTANCE.createMemoryType()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractionPackage.Literals.DEVICE_ABSTRACTION__MEMORY_INSTANCES,
				 MemorymodelFactory.eINSTANCE.createMemoryInstance()));

		newChildDescriptors.add
			(createChildParameter
				(AbstractionPackage.Literals.DEVICE_ABSTRACTION__OPERATION,
				 PlatformFactory.eINSTANCE.createOperationDefinition()));
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
