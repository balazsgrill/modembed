/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch;

import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammerDescriptor;
import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammersContentProvider;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

/**
 * @author balazs.grill
 *
 */
public class MODembedLaunchShortcut implements ILaunchShortcut{

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection){
			Object o = ((IStructuredSelection) selection).getFirstElement();
			if (o instanceof IFile){
				try {
					run((IFile)o, mode);
				} catch (CoreException e) {
					LaunchPlugin.getDefault().getLog().log(e.getStatus());
				}
			}
		}
	}

	@Override
	public void launch(IEditorPart editor, String mode) {
		
		
	}

	private void run(IFile file, String mode) throws CoreException{
		ILaunchConfiguration lc = getLaunchConfig(file);
		if (lc == null) return;
		
		DebugUITools.launch(lc, mode);
	}
	
	private ProgrammerDescriptor findProgrammer(){
		ProgrammersContentProvider cp = new ProgrammersContentProvider();
		Object[] ps = cp.getElements(null);
		if (ps.length == 0){
			MessageDialog.openError(getShell(), "Could not execute", "Cannot find device to execute program!");
			return null;
		}
		if (ps.length == 1){
			return (ProgrammerDescriptor)ps[0];
		}
		return LaunchPlugin.getDefault().selectProgrammer(getShell());
	}
	
	private Shell getShell(){
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	}
	
	private ILaunchConfiguration createConfiguration(IFile file) {
		ILaunchConfiguration config = null;
		ILaunchConfigurationWorkingCopy wc = null;
		try {
			ILaunchConfigurationType configType = getType();
			wc = configType.newInstance(null, getLaunchManager().generateLaunchConfigurationName(file.getName()));
			wc.setAttribute(LaunchPlugin.A_HEXFILE, file.getFullPath().toString());
			
			ProgrammerDescriptor pdesc = findProgrammer();
			if (pdesc != null){
				wc.setAttribute(LaunchPlugin.A_PROG, pdesc.id);
				//wc.setAttribute(LaunchPlugin.A_PROGID, pdesc.pi.getID());
				wc.setAttribute(LaunchPlugin.A_ALWAYSPROGRAM, true);
			}else{
				return null;
			}
			
			config = wc.doSave();
		} catch (CoreException e) {
			LaunchPlugin.getDefault().getLog().log(e.getStatus());	
		} 
		return config;
	}
	
	private ILaunchConfiguration getLaunchConfig(IFile file) throws CoreException{
		for(ILaunchConfiguration lc : getLaunchManager().getLaunchConfigurations(getType())){
			if (file.getFullPath().toString().equals(lc.getAttribute(LaunchPlugin.A_HEXFILE, ""))){
				return lc;
			}
		}
		
		return createConfiguration(file);
	}
	
	private ILaunchConfigurationType getType(){
		return getLaunchManager().getLaunchConfigurationType(LaunchPlugin.LaunchConfigTypeID);
	}
	
	private ILaunchManager getLaunchManager(){
		return DebugPlugin.getDefault().getLaunchManager();
	}
	
	
}
