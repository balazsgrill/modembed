/**
 * 
 */
package hu.modembed.pic.ui.wizard;

import hu.modembed.pic.ui.ContentProposedTextViewer;
import hu.modembed.pic.ui.PicUIPlugin;

import java.net.URL;
import java.util.Map.Entry;

import org.eclipse.core.resources.IContainer;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.dialogs.WizardResourceImportPage;
import org.eclipse.ui.model.WorkbenchContentProvider;

/**
 * @author balazs.grill
 *
 */
public class PICLibSelectionWizardPage extends WizardResourceImportPage {

	protected PICLibSelectionWizardPage(String name,
			IStructuredSelection selection) {
		super(name, selection);
		setDescription("Import the library for the selected PIC device to the given folder");
		setTitle("Import PIC base library");
	}

	private URL selection;
	
	@Override
	protected void createSourceGroup(Composite parent) {
		
		Composite c = new Composite(parent, SWT.NONE);
		
		c.setLayout(new GridLayout(2, false));
		c.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		Label l = new Label(c, SWT.NONE);
		l.setText("PIC Device: ");
		
		ContentProposedTextViewer viewer = new ContentProposedTextViewer(c, SWT.BORDER);
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		
		viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof Entry<?, ?>){
					return ((Entry<?,?>) element).getKey().toString();
				}
				return super.getText(element);
			}
		});
		viewer.setInput(PicUIPlugin.getAvailablePICs().entrySet().toArray());
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				IStructuredSelection ss = (IStructuredSelection)event.getSelection();
				Object o = ss.getFirstElement();
				if (o instanceof Entry<?, ?>){
					selection = (URL)((Entry<?,?>) o).getValue();
				}else{
					selection = null;
				}
				updatePageCompletion();
			}
		});
	}
	
	@Override
	protected void createOptionsGroup(Composite parent) {
		//nothing
	}
	
	public URL getSelection() {
		return selection;
	}
	
	@Override
	protected boolean validateSourceGroup() {
		if (selection == null){
			setMessage("A valid PIC device must be selected!", IMessageProvider.ERROR);
			return false;
		}
		setMessage(null);
		return true;
	}
	
	public IContainer getDestinationContainer(){
		return getSpecifiedContainer();
	}
	
	@Override
	protected ITreeContentProvider getFileProvider() {
		return new WorkbenchContentProvider();
	}

	@Override
	protected ITreeContentProvider getFolderProvider() {
		return new WorkbenchContentProvider();
	}


}
