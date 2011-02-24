/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.configt;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * @author balazs.grill
 *
 */
public class FilePropertyField extends PropertyField{

	private final IProject project;
	private Text text;
	
	public FilePropertyField(Composite parent, IProject project,final String property, String label,final String ext) {
		
		this.project = project;
		
		Label l = new Label(parent, SWT.NONE);
		l.setText(label);
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		text = new Text(parent, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		final Button button = new Button(parent, SWT.PUSH);
		button.setText("Browse..");
		button.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
		
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				FileSelectionDialog dialog = new FileSelectionDialog(button.getShell(), FilePropertyField.this.project, ext);
				if (dialog.open() == IDialogConstants.OK_ID){
					text.setText(dialog.getValue());
				}
			}
		});
		text.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				fireValueChangeEvent(property, text.getText());
			}
		});
	}

	@Override
	public void setValue(String value) {
		if (value == null){
			text.setText("");
		}else{
			text.setText(value);
		}
	}


	
}
