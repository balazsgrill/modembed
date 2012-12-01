/**
 * 
 */
package hu.modembed.ui.workflow;

import hu.modembed.model.core.RootElement;
import hu.modembed.model.core.workflow.Workflow;
import hu.modembed.ui.MODembedUI;
import hu.modembed.ui.WorkbenchModelContentProvider;
import hu.modembed.ui.WorkbenchModelLabelProvider;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

/**
 * @author balazs.grill
 *
 */
public class WorkflowLaunchConfigurationTab extends
		AbstractLaunchConfigurationTab implements IWorkflowLaunchAttributes{

	private Text wfuri;
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite control = new Composite(parent, SWT.NONE);

		control.setLayout(new GridLayout(3, false));

		Label label = new Label(control, SWT.NONE);
		label.setText("Workflow model URI: ");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		wfuri = new Text(control, SWT.BORDER);
		wfuri.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		wfuri.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				updateLaunchConfigurationDialog();
			}
		});
		
		Button browse = new Button(control, SWT.PUSH);
		browse.setText("Browse..");
		browse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		browse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new WorkbenchModelLabelProvider(), new WorkbenchModelContentProvider());
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.setAllowMultiple(false);
				dialog.setTitle("Select Workflow model");
				dialog.setValidator(new ISelectionStatusValidator() {

					@Override
					public IStatus validate(Object[] selection) {
						if (selection.length == 1 && selection[0] instanceof Workflow){
							return Status.OK_STATUS;
						}
						return new Status(IStatus.ERROR, MODembedUI.PLUGIN_ID, "You must select a workflow model!");
					}
				});

				if (dialog.open() == Dialog.OK){
					Object o = dialog.getFirstResult();
					if (o instanceof Workflow){
						RootElement iset = (RootElement)o;
						Resource r = iset.eResource();
						wfuri.setText(r.getURI().appendFragment(r.getURIFragment(iset)).toString());
					}
				}
			}
		});
		
		setControl(control);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#setDefaults(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		//No defaults

	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#initializeFrom(org.eclipse.debug.core.ILaunchConfiguration)
	 */
	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			wfuri.setText(configuration.getAttribute(WORKFLOW_URI, ""));
		} catch (CoreException e) {
			MODembedUI.getDefault().getLog().log(e.getStatus());
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#performApply(org.eclipse.debug.core.ILaunchConfigurationWorkingCopy)
	 */
	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(WORKFLOW_URI, wfuri.getText());
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.ui.ILaunchConfigurationTab#getName()
	 */
	@Override
	public String getName() {
		return "Workflow";
	}


}
