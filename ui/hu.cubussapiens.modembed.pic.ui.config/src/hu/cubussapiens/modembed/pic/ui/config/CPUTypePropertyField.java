/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.config;

import hu.cubussapiens.modembed.pic.PICPlugin;
import hu.cubussapiens.modembed.pic.ui.ContentProposedTextViewer;
import hu.cubussapiens.modembed.pic.ui.PicTargetContentProvider;
import hu.cubussapiens.modembed.pic.ui.PicTargetLabelProvider;

import java.net.URL;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @author balazs.grill
 *
 */
public class CPUTypePropertyField extends PropertyField {

	private ContentProposedTextViewer cpuviewer;

	public CPUTypePropertyField(Composite parent, final String property, String label) {
		Label l = new Label(parent, SWT.NONE);
		l.setText(label);
		l.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		cpuviewer = new ContentProposedTextViewer(parent, SWT.BORDER);
		cpuviewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		cpuviewer.setContentProvider(new PicTargetContentProvider());
		cpuviewer.setLabelProvider(new PicTargetLabelProvider());
		cpuviewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection ss = (IStructuredSelection)event.getSelection();
				Object o = ss.getFirstElement();
				if (o instanceof URL){
					fireValueChangeEvent(property, o.toString());
				}
			}
		});
		cpuviewer.setInput(PICPlugin.getDefault().getDefinitions());
	}

	@Override
	public void setValue(String value) {
		try{
			URL url = new URL(value);
			if (PICPlugin.getDefault().getDefinitions().containsKey(url)){
				cpuviewer.setSelection(new StructuredSelection(url));
			}
		}catch(Exception e){
			
		}
		
	}
	
}
