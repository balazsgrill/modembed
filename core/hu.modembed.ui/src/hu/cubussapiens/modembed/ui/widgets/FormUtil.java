/**
 * 
 */
package hu.cubussapiens.modembed.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * @author balazs.grill
 *
 */
public class FormUtil {

	private FormUtil() {
	}
	
	public static void createFieldLabel(String label, Composite parent, FormToolkit tk){
		Label l = tk.createLabel(parent, label);
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
	}
	
	public static void setOnlyField(Control field){
		field.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
	}
	
	public static void setField(Control field, Control rhcontrol){
		field.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		rhcontrol.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
	}
	
	public static void createDirField(Composite parent, FormToolkit tk, String def, IDataListener listener){
		Text t = tk.createText(parent, def);
		Button browse = tk.createButton(parent, "Browse", SWT.PUSH);
		setField(t, browse);
	}
	
}
