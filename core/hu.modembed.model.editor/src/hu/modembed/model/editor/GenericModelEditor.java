/**
 * 
 */
package hu.modembed.model.editor;

import hu.modembed.model.editor.internal.WrappedSelectionProvider;
import hu.modembed.ui.MODembedUI;

import java.io.IOException;
import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;

/**
 * @author balage
 *
 */
public class GenericModelEditor extends EditorPart 
	implements IEditingDomainProvider, IMenuListener, IGotoMarker{

	/**
	 * This keeps track of the editing domain that is used to track all changes to the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AdapterFactoryEditingDomain editingDomain;
	
	private Resource resource;
	
	private WrappedSelectionProvider selectionProvider = new WrappedSelectionProvider();
	
	/**
	 * This is the one adapter factory used for providing views of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory adapterFactory;
	
	public GenericModelEditor() {
		super();
		initializeEditingDomain();
	}
	
	/**
	 * This sets up the editing domain for the model editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private void initializeEditingDomain() {
		// Create an adapter factory that yields item providers.
		//
		adapterFactory = MODembedUI.getDefault().createAdapterFactory();

		// Create the command stack that will notify this editor as commands are executed.
		//
		BasicCommandStack commandStack = new BasicCommandStack();

		// Add a listener to set the most recent command's affected objects to be the selection of the viewer with focus.
		//
		commandStack.addCommandStackListener
			(new CommandStackListener() {
				 public void commandStackChanged(final EventObject event) {
					 PlatformUI.getWorkbench().getDisplay().asyncExec
						 (new Runnable() {
							  public void run() {
								  firePropertyChange(IEditorPart.PROP_DIRTY);
							  }
						  });
				 }
			 });

		// Create the editing domain with a special command stack.
		//
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());
	}
	
	/**
	 * This creates a context menu for the viewer and adds a listener as well registering the menu for extension.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MenuManager createContextMenu() {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
//		Menu menu = contextMenu.createContextMenu(viewer.getControl());
//		viewer.getControl().setMenu(menu);
		
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(selectionProvider));

		return contextMenu;
	}

	
	/**
	 * This is the method called to load a resource into the editing domain's resource set based on the editor's input.
	 */
	private void createModel() {
		URI resourceURI = EditUIUtil.getURI(getEditorInput());
		//Exception exception = null;
		
		try {
			// Load the resource through the editing domain.
			//
			resource = editingDomain.getResourceSet().getResource(resourceURI, true);
		}
		catch (Exception e) {
			//exception = e;
			resource = editingDomain.getResourceSet().getResource(resourceURI, false);
		}

//		Diagnostic diagnostic = analyzeResourceProblems(resource, exception);
//		if (diagnostic.getSeverity() != Diagnostic.OK) {
//			resourceToDiagnosticMap.put(resource,  analyzeResourceProblems(resource, exception));
//		}
//		editingDomain.getResourceSet().eAdapters().add(problemIndicationAdapter);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		
		monitor.beginTask("Saving model", -1);
		
		try {
			resource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}

		((BasicCommandStack)editingDomain.getCommandStack()).saveIsDone();
		firePropertyChange(IEditorPart.PROP_DIRTY);
		monitor.done();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInputWithNotify(input);
		setPartName(input.getName());
		//site.getPage().addPartListener(partListener);
		//ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener, IResourceChangeEvent.POST_CHANGE);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		return ((BasicCommandStack)editingDomain.getCommandStack()).isSaveNeeded();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	//private TreeViewer selectionViewer;
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		createModel();
		
		propertySheetPage =
			new GenericModelPropertyPage(editingDomain);
		selectionProvider.addSelectionChangedListener(propertySheetPage);
		getSite().setSelectionProvider(selectionProvider);
		
		Collection<IModelEditorPage> cpages = ModembedEditorPlugin.getEditorPages(resource.getContents().get(0));
		
		IModelEditorPage[] pages = cpages.toArray(new IModelEditorPage[cpages.size()]);
		
		for(IModelEditorPage page : pages){
			page.init(resource, editingDomain, adapterFactory);
		}
		
		MenuManager contextMenu = createContextMenu();
		
		if (pages.length == 1){
			
			pages[0].createControls(parent);
			pages[0].setContextMenu(contextMenu);
			setActiveEditorPage(pages[0]);
		}else{
			
			parent.setLayout(new FillLayout());
			final CTabFolder folder = new CTabFolder(parent, SWT.BORDER | SWT.DOWN);
			
			boolean first = true;
			for(IModelEditorPage page : pages){
				CTabItem item = new CTabItem(folder, SWT.NONE);
				
				Composite c = new Composite(folder, SWT.NONE);
				item.setControl(c);
				
				page.createControls(c);
				page.setContextMenu(contextMenu);
				item.setText(page.toString());
				item.setData(page);
				if (first){
					first = false;
					folder.setSelection(item);
					setActiveEditorPage(page);
				}
			}
			
			folder.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					IModelEditorPage page = (IModelEditorPage)folder.getSelection().getData();
					setActiveEditorPage(page);
				}
			});
			
			
		}
		
	}

	IModelEditorPage lastActivePage = null;
	
	public void setActiveEditorPage(IModelEditorPage page){
		if (lastActivePage != null){
			lastActivePage = null;
			selectionProvider.setInternalSelectionProvider(null);
		}
		if (page != null){
			
			ISelectionProvider sp = page.getSelectionProvider();
			selectionProvider.setInternalSelectionProvider(sp);
			lastActivePage = page;
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		//selectionViewer.getControl().setFocus();
	}

	@Override
	public void gotoMarker(IMarker marker) {
		try {
			if (marker.getType().equals(EValidator.MARKER)) {
				String uriAttribute = marker.getAttribute(EValidator.URI_ATTRIBUTE, null);
				if (uriAttribute != null) {
					URI uri = URI.createURI(uriAttribute);
					EObject eObject = editingDomain.getResourceSet().getEObject(uri, true);
					if (eObject != null) {
					  // TODO setSelectionToViewer(Collections.singleton(editingDomain.getWrapper(eObject)));
					}
				}
			}
		}
		catch (CoreException exception) {
			ModembedEditorPlugin.INSTANCE.log(exception);
		}
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(manager);
	}

	@Override
	public EditingDomain getEditingDomain() {
		return editingDomain;
	}

	GenericModelPropertyPage propertySheetPage;
	
	/**
	 * This accesses a cached version of the property sheet.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPropertySheetPage getPropertySheetPage() {
		return propertySheetPage;
	}
	
	/**
	 * This is how the framework determines which interfaces we implement.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IContentOutlinePage.class)) {
			//return showOutlineView() ? getContentOutlinePage() : null;
			return null;
		}
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		if (key.equals(IGotoMarker.class)) {
			return this;
		}
		return super.getAdapter(key);
	}
	
}
