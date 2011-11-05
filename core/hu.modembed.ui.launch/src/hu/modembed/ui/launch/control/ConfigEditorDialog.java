/**
 * 
 */
package hu.modembed.ui.launch.control;

import hu.modembed.IProgrammerType;
import hu.modembed.ui.launch.core.IProgrammerInstanceConfigurationPane;
import hu.modembed.ui.launch.core.IUIProgrammerType;
import hu.modembed.ui.launch.programmers.ProgrammersLabelProvider;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

/**
 * @author balazs.grill
 *
 */
public class ConfigEditorDialog extends Dialog {

	private final ProgrammerConfiguration config;
	
	private IProgrammerInstanceConfigurationPane configpane;
	
	/**
	 * @param parentShell
	 */
	public ConfigEditorDialog(Shell parentShell, ProgrammerConfiguration config) {
		super(parentShell);
		this.config = config;
	}

	@Override
	protected void configureShell(Shell newShell) {
		newShell.setText("Programmer configuration");
		super.configureShell(newShell);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite comp = (Composite)super.createDialogArea(parent);
		CLabel clabel = new CLabel(comp, SWT.NONE);
		clabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false));
		ProgrammersLabelProvider lp = new ProgrammersLabelProvider();
		clabel.setImage(lp.getImage(config.getInstance()));
		clabel.setText(lp.getText(config.getInstance()));
		lp.dispose();
		
		IProgrammerType pt = config.getInstance().getType();
		if (pt instanceof IUIProgrammerType){
			configpane = ((IUIProgrammerType) pt).createConfigurationPane(comp);
			configpane.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
			configpane.setProperties(config.getProperties());
		}
		return comp;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
	
	@Override
	protected void okPressed() {
		if (configpane != null){
			config.setProperties(configpane.getProperties());
		}
		
		super.okPressed();
	}
	
}
