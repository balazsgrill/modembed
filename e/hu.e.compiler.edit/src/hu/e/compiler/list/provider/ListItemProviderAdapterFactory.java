/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package hu.e.compiler.list.provider;

import hu.e.compiler.list.util.ListAdapterFactory;

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
public class ListItemProviderAdapterFactory extends ListAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public ListItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.e.compiler.list.ProgramList} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramListItemProvider programListItemProvider;

	/**
	 * This creates an adapter for a {@link hu.e.compiler.list.ProgramList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProgramListAdapter() {
		if (programListItemProvider == null) {
			programListItemProvider = new ProgramListItemProvider(this);
		}

		return programListItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.e.compiler.list.InstructionStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionStepItemProvider instructionStepItemProvider;

	/**
	 * This creates an adapter for a {@link hu.e.compiler.list.InstructionStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInstructionStepAdapter() {
		if (instructionStepItemProvider == null) {
			instructionStepItemProvider = new InstructionStepItemProvider(this);
		}

		return instructionStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.e.compiler.list.SequenceStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceStepItemProvider sequenceStepItemProvider;

	/**
	 * This creates an adapter for a {@link hu.e.compiler.list.SequenceStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceStepAdapter() {
		if (sequenceStepItemProvider == null) {
			sequenceStepItemProvider = new SequenceStepItemProvider(this);
		}

		return sequenceStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.e.compiler.list.ChoiceStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceStepItemProvider choiceStepItemProvider;

	/**
	 * This creates an adapter for a {@link hu.e.compiler.list.ChoiceStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceStepAdapter() {
		if (choiceStepItemProvider == null) {
			choiceStepItemProvider = new ChoiceStepItemProvider(this);
		}

		return choiceStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.e.compiler.list.LabelStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelStepItemProvider labelStepItemProvider;

	/**
	 * This creates an adapter for a {@link hu.e.compiler.list.LabelStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLabelStepAdapter() {
		if (labelStepItemProvider == null) {
			labelStepItemProvider = new LabelStepItemProvider(this);
		}

		return labelStepItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.e.compiler.list.LabelReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelReferenceItemProvider labelReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.e.compiler.list.LabelReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLabelReferenceAdapter() {
		if (labelReferenceItemProvider == null) {
			labelReferenceItemProvider = new LabelReferenceItemProvider(this);
		}

		return labelReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.e.compiler.list.StatusStep} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusStepItemProvider statusStepItemProvider;

	/**
	 * This creates an adapter for a {@link hu.e.compiler.list.StatusStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatusStepAdapter() {
		if (statusStepItemProvider == null) {
			statusStepItemProvider = new StatusStepItemProvider(this);
		}

		return statusStepItemProvider;
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
		if (programListItemProvider != null) programListItemProvider.dispose();
		if (instructionStepItemProvider != null) instructionStepItemProvider.dispose();
		if (sequenceStepItemProvider != null) sequenceStepItemProvider.dispose();
		if (choiceStepItemProvider != null) choiceStepItemProvider.dispose();
		if (labelStepItemProvider != null) labelStepItemProvider.dispose();
		if (labelReferenceItemProvider != null) labelReferenceItemProvider.dispose();
		if (statusStepItemProvider != null) statusStepItemProvider.dispose();
	}

}