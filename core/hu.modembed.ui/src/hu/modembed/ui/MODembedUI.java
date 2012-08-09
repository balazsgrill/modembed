package hu.modembed.ui;

import hu.modembed.ui.internal.ModelDescriptionRegistry;

import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.transaction.impl.TransactionalEditingDomainImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class MODembedUI extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.modembed.ui"; //$NON-NLS-1$

	// The shared instance
	private static MODembedUI plugin;
	
	public static String NatureID = "hu.modembed.ui.nature";
	
	public static String SettingsFile = "modembed.project";
	
	public static String IMAGE_NEWPROJWZRD = PLUGIN_ID+".image.newprojectwizard";

	public static String IMAGE_ELEMENT_ARCH = PLUGIN_ID+".elements.image.arch";
	public static String IMAGE_ELEMENT_FOLDER = PLUGIN_ID+".elements.image.folder";
	public static String IMAGE_ELEMENT_INSTRUCTION = PLUGIN_ID+".elements.image.instruction";
	public static String IMAGE_ELEMENT_MODULE = PLUGIN_ID+".elements.image.module";
	
	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		reg.put(IMAGE_NEWPROJWZRD, ImageDescriptor.createFromURL(getBundle().getEntry("icons/newprj_modembed_wiz.png")));
		reg.put(IMAGE_ELEMENT_ARCH, ImageDescriptor.createFromURL(getBundle().getEntry("icons/elements/arch.png")));
		reg.put(IMAGE_ELEMENT_FOLDER, ImageDescriptor.createFromURL(getBundle().getEntry("icons/elements/folder.gif")));
		reg.put(IMAGE_ELEMENT_INSTRUCTION, ImageDescriptor.createFromURL(getBundle().getEntry("icons/elements/instruction_obj.gif")));
		reg.put(IMAGE_ELEMENT_MODULE, ImageDescriptor.createFromURL(getBundle().getEntry("icons/elements/module.png")));
	}
	
	public EditingDomain createEditingDomain(IProject project){
		
		EditingDomain editingDomain = TransactionalEditingDomainImpl.FactoryImpl.INSTANCE.createEditingDomain(new ResourceSetImpl());
		
		return editingDomain;
	}
	
	public Image getSharedImage(URL url){
		if (url == null) return null;
		String id = url.toString();
		Image im = getImageRegistry().get(id);
		if (im == null){
			getImageRegistry().put(id, ImageDescriptor.createFromURL(url));
			im = getImageRegistry().get(id);
		}
		return im;
	}
	
	private ModelDescriptionRegistry modescreg = null;
	public AdapterFactory[] getAdapterFactories(){
		if (modescreg == null){
			modescreg = new ModelDescriptionRegistry();
		}
		return modescreg.getAdapterFactories();
	}
	
	public ComposedAdapterFactory createAdapterFactory(){
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		
		for(AdapterFactory af : MODembedUI.getDefault().getAdapterFactories()){
			adapterFactory.addAdapterFactory(af);
		}
		
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
		return adapterFactory;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static MODembedUI getDefault() {
		return plugin;
	}
	
	public void showFile(IFile f){
		IWorkbench workbench = PlatformUI.getWorkbench();
		Shell shell = workbench.getActiveWorkbenchWindow().getShell();
		
		// Select the new file resource in the current view.
		//
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		final IWorkbenchPart activePart = page.getActivePart();
		if (activePart instanceof ISetSelectionTarget) {
			final ISelection targetSelection = new StructuredSelection(f);
			shell.getDisplay().asyncExec
				(new Runnable() {
					 public void run() {
						 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
					 }
				 });
		}

		// Open an editor on the new file.
		//
		try {
			page.openEditor
				(new FileEditorInput(f),
				 workbench.getEditorRegistry().getDefaultEditor(f.getFullPath().toString()).getId());					 	 
		}
		catch (PartInitException exception) {
			MessageDialog.openError(workbenchWindow.getShell(), "Could not open editor", exception.getMessage());
			
		}
	}
	
}
