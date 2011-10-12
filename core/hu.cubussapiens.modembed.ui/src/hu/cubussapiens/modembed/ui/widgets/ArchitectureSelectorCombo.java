/**
 * 
 */
package hu.cubussapiens.modembed.ui.widgets;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public class ArchitectureSelectorCombo extends ComboViewer {

	/**
	 * @param parent
	 * @param style
	 */
	public ArchitectureSelectorCombo(Composite parent, int style) {
		super(parent, style | SWT.READ_ONLY);
		//setContentProvider(new ArchitectureContentProvider());
		//setLabelProvider(new ArchitectureLabelProvider());
		setInput("");
	}

	public String getArchSelection(){
		Object o = ((IStructuredSelection)getSelection()).getFirstElement();
		if (o != null){
			return o.toString();
		}
		return null;
	}
	
	public void setArchSelection(String archID){
//		if (MODembedCore.getDefault().getArchitectures().contains(archID)){
//			setSelection(new StructuredSelection(archID));
//		}
		setSelection(new StructuredSelection());
	}
	
}
