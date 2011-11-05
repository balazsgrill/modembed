/**
 * 
 */
package hu.cubussapiens.modembed.ui.widgets;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author balazs.grill
 *
 */
public class WizardPageUtil {

	private WizardPageUtil() {
	}
	
	public static void createTextField(Composite parent, String label, String def, final IDataListener listener){
		Label l = new Label(parent, SWT.NONE);
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		final Text t = new Text(parent, SWT.BORDER);
		t.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		l.setText(label);
		t.setText(def);
		t.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				listener.dataChanged(t.getText());
			}
		});
	}
	
	public static void createArchSelectorField(Composite parent, String label, final IDataListener listener){
		Label l = new Label(parent, SWT.NONE);
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		final ArchitectureSelectorCombo c = new ArchitectureSelectorCombo(parent, SWT.BORDER);
		c.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		l.setText(label);
		c.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				listener.dataChanged(c.getArchSelection());
			}
		});
	}
	
}
