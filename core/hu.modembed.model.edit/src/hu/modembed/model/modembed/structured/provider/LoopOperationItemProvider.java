/**
 */
package hu.modembed.model.modembed.structured.provider;


import hu.modembed.model.modembed.abstraction.behavior.platform.PlatformFactory;

import hu.modembed.model.modembed.infrastructure.expressions.ExpressionsFactory;

import hu.modembed.model.modembed.structured.LoopOperation;
import hu.modembed.model.modembed.structured.StructuredFactory;
import hu.modembed.model.modembed.structured.StructuredPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link hu.modembed.model.modembed.structured.LoopOperation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopOperationItemProvider
	extends OperationItemProvider
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
	public LoopOperationItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(StructuredPackage.Literals.LOOP_OPERATION__ENTRY_CONDITION);
			childrenFeatures.add(StructuredPackage.Literals.LOOP_OPERATION__EXIT_CONDITION);
			childrenFeatures.add(StructuredPackage.Literals.LOOP_OPERATION__BODY);
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
	 * This returns LoopOperation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LoopOperation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LoopOperation)object).getDescription();
		return label == null || label.length() == 0 ?
			getString("_UI_LoopOperation_type") :
			getString("_UI_LoopOperation_type") + " " + label;
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

		switch (notification.getFeatureID(LoopOperation.class)) {
			case StructuredPackage.LOOP_OPERATION__ENTRY_CONDITION:
			case StructuredPackage.LOOP_OPERATION__EXIT_CONDITION:
			case StructuredPackage.LOOP_OPERATION__BODY:
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
				(StructuredPackage.Literals.LOOP_OPERATION__ENTRY_CONDITION,
				 StructuredFactory.eINSTANCE.createVariableReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__ENTRY_CONDITION,
				 StructuredFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__ENTRY_CONDITION,
				 ExpressionsFactory.eINSTANCE.createIntegerConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__ENTRY_CONDITION,
				 ExpressionsFactory.eINSTANCE.createOperationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__ENTRY_CONDITION,
				 PlatformFactory.eINSTANCE.createLabelParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__ENTRY_CONDITION,
				 PlatformFactory.eINSTANCE.createInstructionParameterMapping()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__EXIT_CONDITION,
				 StructuredFactory.eINSTANCE.createVariableReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__EXIT_CONDITION,
				 StructuredFactory.eINSTANCE.createFunctionCallExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__EXIT_CONDITION,
				 ExpressionsFactory.eINSTANCE.createIntegerConstantExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__EXIT_CONDITION,
				 ExpressionsFactory.eINSTANCE.createOperationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__EXIT_CONDITION,
				 PlatformFactory.eINSTANCE.createLabelParameterValue()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__EXIT_CONDITION,
				 PlatformFactory.eINSTANCE.createInstructionParameterMapping()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__BODY,
				 StructuredFactory.eINSTANCE.createReturnOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__BODY,
				 StructuredFactory.eINSTANCE.createExpressionOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__BODY,
				 StructuredFactory.eINSTANCE.createOperationBlock()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__BODY,
				 StructuredFactory.eINSTANCE.createConditionalOperation()));

		newChildDescriptors.add
			(createChildParameter
				(StructuredPackage.Literals.LOOP_OPERATION__BODY,
				 StructuredFactory.eINSTANCE.createLoopOperation()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == StructuredPackage.Literals.LOOP_OPERATION__ENTRY_CONDITION ||
			childFeature == StructuredPackage.Literals.LOOP_OPERATION__EXIT_CONDITION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
