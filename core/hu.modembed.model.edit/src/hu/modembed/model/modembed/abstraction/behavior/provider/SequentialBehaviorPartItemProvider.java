/**
 */
package hu.modembed.model.modembed.abstraction.behavior.provider;


import hu.modembed.model.modembed.abstraction.behavior.BehaviorFactory;
import hu.modembed.model.modembed.abstraction.behavior.BehaviorPackage;
import hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart;

import hu.modembed.model.modembed.infrastructure.provider.ModembedEditPlugin;
import hu.modembed.model.modembed.infrastructure.provider.NamedElementItemProvider;

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
 * This is the item provider adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SequentialBehaviorPartItemProvider
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
	public SequentialBehaviorPartItemProvider(AdapterFactory adapterFactory) {
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

			addParametersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SequentialBehaviorPart_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SequentialBehaviorPart_parameters_feature", "_UI_SequentialBehaviorPart_type"),
				 BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR_PART__PARAMETERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR__ACTIONS);
			childrenFeatures.add(BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS);
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
	 * This returns SequentialBehaviorPart.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SequentialBehaviorPart"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SequentialBehaviorPart)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SequentialBehaviorPart_type") :
			getString("_UI_SequentialBehaviorPart_type") + " " + label;
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

		switch (notification.getFeatureID(SequentialBehaviorPart.class)) {
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__PARAMETERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__ACTIONS:
			case BehaviorPackage.SEQUENTIAL_BEHAVIOR_PART__LOCAL_SYMBOLS:
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
				(BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR__ACTIONS,
				 BehaviorFactory.eINSTANCE.createCodeSymbolPlacement()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR__ACTIONS,
				 BehaviorFactory.eINSTANCE.createOperationExecution()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS,
				 BehaviorFactory.eINSTANCE.createSymbolAllocation()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS,
				 BehaviorFactory.eINSTANCE.createSymbolIndirection()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS,
				 BehaviorFactory.eINSTANCE.createSymbolAddressAssignment()));

		newChildDescriptors.add
			(createChildParameter
				(BehaviorPackage.Literals.SEQUENTIAL_BEHAVIOR__LOCAL_SYMBOLS,
				 BehaviorFactory.eINSTANCE.createSymbolValueAssignment()));
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
