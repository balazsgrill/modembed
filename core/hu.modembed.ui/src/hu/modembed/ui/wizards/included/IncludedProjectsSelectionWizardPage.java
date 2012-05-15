/**
 * 
 */
package hu.modembed.ui.wizards.included;

import hu.modembed.includedcode.IncludedProject;
import hu.modembed.includedcode.IncludedProjectsRegistry;
import hu.modembed.ui.MODembedUI;

import java.net.URL;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public class IncludedProjectsSelectionWizardPage extends WizardPage {

	protected IncludedProjectsSelectionWizardPage(String pageName) {
		super(pageName);
		setDescription("Select projects below to be imported");
	}
	
	private IStructuredSelection selection = new StructuredSelection();
	
	private void validate(){
		setPageComplete(!selection.isEmpty());
	}
	
	public IStructuredSelection getSelection() {
		return selection;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		TableViewer tv = new TableViewer(parent);
		setControl(tv.getControl());

		tv.setContentProvider(new ArrayContentProvider());
		tv.setLabelProvider(new LabelProvider(){
			@Override
			public Image getImage(Object element) {
				if (element instanceof IncludedProject){
					URL url = ((IncludedProject) element).getIcon();
					if (url != null) return MODembedUI.getDefault().getSharedImage(url);
				}
				return super.getImage(element);
			}
		});
		tv.setInput(IncludedProjectsRegistry.getInstance().getProjects().toArray());
		
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection = (IStructuredSelection)event.getSelection();
				validate();
			}
		});
		
	}

}
