/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch.control;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.MODembedCore;
import hu.cubussapiens.modembed.RegisteredProgrammer;
import hu.cubussapiens.modembed.ui.MODembedUI;
import hu.cubussapiens.modembed.ui.launch.LaunchPlugin;
import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammersContentProvider;
import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammersLabelProvider;

import java.net.URL;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

/**
 * @author balazs.grill
 *
 */
public class LaunchConfigControl extends Composite {

	private CLabel programmerlabel;

	private ProgrammerConfiguration config = null;
	
	public ProgrammerConfiguration getConfig() {
		return config;
	}
	
	private void updateProgrammerLabel(){
		if (config == null){
			programmerlabel.setText("None");
			programmerlabel.setImage(null);
		}else{
			RegisteredProgrammer rp = MODembedCore.getDefault().getProgrammerRegistry().getProgrammer(config.getInstance().getType().getID());
			programmerlabel.setText(config.getInstance().toString());
			URL im = rp.getImage();
			if (im == null){
				programmerlabel.setImage(null);
			}else{
				programmerlabel.setImage(MODembedUI.getDefault().getSharedImage(im));
			}
		}
	}
	
	/**
	 * @param parent
	 * @param style
	 */
	public LaunchConfigControl(Composite parent, int style) {
		super(parent, style);		
		
		Label label = new Label(this, SWT.NONE);
		label.setText("Programmer: ");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		programmerlabel = new CLabel(this, SWT.SHADOW_NONE);
		programmerlabel.setText("NONE");
		programmerlabel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		Button selectProgrammer = new Button(this, SWT.NONE);
		selectProgrammer.setText("Select..");
		selectProgrammer.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		
		this.setSize(new Point(345, 206));
		this.setLayout(new GridLayout(3, false));
		
		selectProgrammer.addSelectionListener(new SelectionAdapter(){
			@Override
			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new ProgrammersLabelProvider(), new ProgrammersContentProvider());
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
						config = new ProgrammerConfiguration(pd);
						updateProgrammerLabel();
					}
				}
			}
		});
		
	}

}
