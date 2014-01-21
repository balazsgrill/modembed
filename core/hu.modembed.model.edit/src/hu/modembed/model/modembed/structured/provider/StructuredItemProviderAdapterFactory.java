/**
 */
package hu.modembed.model.modembed.structured.provider;

import hu.modembed.model.modembed.structured.util.StructuredAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredItemProviderAdapterFactory extends StructuredAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.StructuredModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredModuleItemProvider structuredModuleItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.StructuredModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuredModuleAdapter() {
		if (structuredModuleItemProvider == null) {
			structuredModuleItemProvider = new StructuredModuleItemProvider(this);
		}

		return structuredModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.VariableDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationItemProvider variableDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.VariableDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableDeclarationAdapter() {
		if (variableDeclarationItemProvider == null) {
			variableDeclarationItemProvider = new VariableDeclarationItemProvider(this);
		}

		return variableDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.StructuredFunction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredFunctionItemProvider structuredFunctionItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.StructuredFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStructuredFunctionAdapter() {
		if (structuredFunctionItemProvider == null) {
			structuredFunctionItemProvider = new StructuredFunctionItemProvider(this);
		}

		return structuredFunctionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.VariableReferenceExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableReferenceExpressionItemProvider variableReferenceExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.VariableReferenceExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVariableReferenceExpressionAdapter() {
		if (variableReferenceExpressionItemProvider == null) {
			variableReferenceExpressionItemProvider = new VariableReferenceExpressionItemProvider(this);
		}

		return variableReferenceExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.FunctionCallExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionCallExpressionItemProvider functionCallExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.FunctionCallExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionCallExpressionAdapter() {
		if (functionCallExpressionItemProvider == null) {
			functionCallExpressionItemProvider = new FunctionCallExpressionItemProvider(this);
		}

		return functionCallExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.ReturnOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnOperationItemProvider returnOperationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.ReturnOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReturnOperationAdapter() {
		if (returnOperationItemProvider == null) {
			returnOperationItemProvider = new ReturnOperationItemProvider(this);
		}

		return returnOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.ExpressionOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionOperationItemProvider expressionOperationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.ExpressionOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExpressionOperationAdapter() {
		if (expressionOperationItemProvider == null) {
			expressionOperationItemProvider = new ExpressionOperationItemProvider(this);
		}

		return expressionOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.OperationBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationBlockItemProvider operationBlockItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.OperationBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationBlockAdapter() {
		if (operationBlockItemProvider == null) {
			operationBlockItemProvider = new OperationBlockItemProvider(this);
		}

		return operationBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.ConditionalOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalOperationItemProvider conditionalOperationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.ConditionalOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalOperationAdapter() {
		if (conditionalOperationItemProvider == null) {
			conditionalOperationItemProvider = new ConditionalOperationItemProvider(this);
		}

		return conditionalOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.structured.LoopOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopOperationItemProvider loopOperationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.structured.LoopOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLoopOperationAdapter() {
		if (loopOperationItemProvider == null) {
			loopOperationItemProvider = new LoopOperationItemProvider(this);
		}

		return loopOperationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (structuredModuleItemProvider != null) structuredModuleItemProvider.dispose();
		if (variableDeclarationItemProvider != null) variableDeclarationItemProvider.dispose();
		if (structuredFunctionItemProvider != null) structuredFunctionItemProvider.dispose();
		if (variableReferenceExpressionItemProvider != null) variableReferenceExpressionItemProvider.dispose();
		if (functionCallExpressionItemProvider != null) functionCallExpressionItemProvider.dispose();
		if (returnOperationItemProvider != null) returnOperationItemProvider.dispose();
		if (expressionOperationItemProvider != null) expressionOperationItemProvider.dispose();
		if (operationBlockItemProvider != null) operationBlockItemProvider.dispose();
		if (conditionalOperationItemProvider != null) conditionalOperationItemProvider.dispose();
		if (loopOperationItemProvider != null) loopOperationItemProvider.dispose();
	}

}