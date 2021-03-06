/**
 */
package hu.modembed.model.modembed.abstraction.behavior.provider;

import hu.modembed.model.modembed.abstraction.behavior.util.BehaviorAdapterFactory;

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
public class BehaviorItemProviderAdapterFactory extends BehaviorAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public BehaviorItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialBehaviorModuleItemProvider sequentialBehaviorModuleItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequentialBehaviorModuleAdapter() {
		if (sequentialBehaviorModuleItemProvider == null) {
			sequentialBehaviorModuleItemProvider = new SequentialBehaviorModuleItemProvider(this);
		}

		return sequentialBehaviorModuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SymbolMap} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolMapItemProvider symbolMapItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SymbolMap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolMapAdapter() {
		if (symbolMapItemProvider == null) {
			symbolMapItemProvider = new SymbolMapItemProvider(this);
		}

		return symbolMapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRules} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolMappingRulesItemProvider symbolMappingRulesItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRules}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolMappingRulesAdapter() {
		if (symbolMappingRulesItemProvider == null) {
			symbolMappingRulesItemProvider = new SymbolMappingRulesItemProvider(this);
		}

		return symbolMappingRulesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolMappingRuleItemProvider symbolMappingRuleItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SymbolMappingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolMappingRuleAdapter() {
		if (symbolMappingRuleItemProvider == null) {
			symbolMappingRuleItemProvider = new SymbolMappingRuleItemProvider(this);
		}

		return symbolMappingRuleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootSequentialBehaviorItemProvider rootSequentialBehaviorItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.RootSequentialBehavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRootSequentialBehaviorAdapter() {
		if (rootSequentialBehaviorItemProvider == null) {
			rootSequentialBehaviorItemProvider = new RootSequentialBehaviorItemProvider(this);
		}

		return rootSequentialBehaviorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialBehaviorPartItemProvider sequentialBehaviorPartItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SequentialBehaviorPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequentialBehaviorPartAdapter() {
		if (sequentialBehaviorPartItemProvider == null) {
			sequentialBehaviorPartItemProvider = new SequentialBehaviorPartItemProvider(this);
		}

		return sequentialBehaviorPartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeSymbolPlacementItemProvider codeSymbolPlacementItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.CodeSymbolPlacement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCodeSymbolPlacementAdapter() {
		if (codeSymbolPlacementItemProvider == null) {
			codeSymbolPlacementItemProvider = new CodeSymbolPlacementItemProvider(this);
		}

		return codeSymbolPlacementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.OperationExecution} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationExecutionItemProvider operationExecutionItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.OperationExecution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationExecutionAdapter() {
		if (operationExecutionItemProvider == null) {
			operationExecutionItemProvider = new OperationExecutionItemProvider(this);
		}

		return operationExecutionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolAllocationItemProvider symbolAllocationItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SymbolAllocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolAllocationAdapter() {
		if (symbolAllocationItemProvider == null) {
			symbolAllocationItemProvider = new SymbolAllocationItemProvider(this);
		}

		return symbolAllocationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SymbolIndirection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolIndirectionItemProvider symbolIndirectionItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SymbolIndirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolIndirectionAdapter() {
		if (symbolIndirectionItemProvider == null) {
			symbolIndirectionItemProvider = new SymbolIndirectionItemProvider(this);
		}

		return symbolIndirectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolAddressAssignmentItemProvider symbolAddressAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SymbolAddressAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolAddressAssignmentAdapter() {
		if (symbolAddressAssignmentItemProvider == null) {
			symbolAddressAssignmentItemProvider = new SymbolAddressAssignmentItemProvider(this);
		}

		return symbolAddressAssignmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolValueAssignmentItemProvider symbolValueAssignmentItemProvider;

	/**
	 * This creates an adapter for a {@link hu.modembed.model.modembed.abstraction.behavior.SymbolValueAssignment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSymbolValueAssignmentAdapter() {
		if (symbolValueAssignmentItemProvider == null) {
			symbolValueAssignmentItemProvider = new SymbolValueAssignmentItemProvider(this);
		}

		return symbolValueAssignmentItemProvider;
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
		if (sequentialBehaviorModuleItemProvider != null) sequentialBehaviorModuleItemProvider.dispose();
		if (symbolMapItemProvider != null) symbolMapItemProvider.dispose();
		if (symbolMappingRulesItemProvider != null) symbolMappingRulesItemProvider.dispose();
		if (symbolMappingRuleItemProvider != null) symbolMappingRuleItemProvider.dispose();
		if (rootSequentialBehaviorItemProvider != null) rootSequentialBehaviorItemProvider.dispose();
		if (sequentialBehaviorPartItemProvider != null) sequentialBehaviorPartItemProvider.dispose();
		if (codeSymbolPlacementItemProvider != null) codeSymbolPlacementItemProvider.dispose();
		if (operationExecutionItemProvider != null) operationExecutionItemProvider.dispose();
		if (symbolAllocationItemProvider != null) symbolAllocationItemProvider.dispose();
		if (symbolIndirectionItemProvider != null) symbolIndirectionItemProvider.dispose();
		if (symbolAddressAssignmentItemProvider != null) symbolAddressAssignmentItemProvider.dispose();
		if (symbolValueAssignmentItemProvider != null) symbolValueAssignmentItemProvider.dispose();
	}

}
