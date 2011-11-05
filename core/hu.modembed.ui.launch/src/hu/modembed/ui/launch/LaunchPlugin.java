package hu.modembed.ui.launch;

import hu.modembed.IProgrammerInstance;
import hu.modembed.ui.launch.programmers.ProgrammersContentProvider;
import hu.modembed.ui.launch.programmers.ProgrammersLabelProvider;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class LaunchPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.modembed.ui.launch"; //$NON-NLS-1$

	public static final String LaunchConfigTypeID = "hu.modembed.ui.launch";
	
	// The shared instance
	private static LaunchPlugin plugin;

	public static final String A_HEXFILE = PLUGIN_ID+".hexfile";

	public static final String A_PROG = PLUGIN_ID+".programmer";

	public static final String A_PROGID = PLUGIN_ID+".prog_ID";

	public static final String A_DEVICE = PLUGIN_ID+".device";
	
	public static final String A_ALWAYSPROGRAM = PLUGIN_ID+".alwaysprogram";

	public static final String IMAGECPU = PLUGIN_ID+".image.cpu";
	
	/**
	 * The constructor
	 */
	public LaunchPlugin() {
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		reg.put(IMAGECPU, ImageDescriptor.createFromURL(getBundle().getEntry("icons/cpu_16.png")));
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
	public static LaunchPlugin getDefault() {
		return plugin;
	}
	
	public IProgrammerInstance selectProgrammer(Shell shell){
		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(shell, new ProgrammersLabelProvider(), new ProgrammersContentProvider());
		dialog.setInput(Object.class);
		dialog.setAllowMultiple(false);
		dialog.setTitle("Select a programmer");
		dialog.setValidator(new ISelectionStatusValidator() {
			
			@Override
			public IStatus validate(Object[] selection) {
				if (selection.length == 1){
					return Status.OK_STATUS;
				}
				return new Status(IStatus.ERROR, LaunchPlugin.PLUGIN_ID, "You must select a programmer!");
			}
		});
		if (dialog.open() == Dialog.OK){
			Object o = dialog.getFirstResult();
			if (o instanceof IProgrammerInstance){
				IProgrammerInstance pd = (IProgrammerInstance)o;
				return pd;
			}
		}
		return null;
	}

}
