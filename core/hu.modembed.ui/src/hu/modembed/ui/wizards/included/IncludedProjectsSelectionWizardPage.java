/**
 * 
 */
package hu.modembed.ui.wizards.included;

import hu.modembed.includedcode.IncludedProject;
import hu.modembed.includedcode.IncludedProjectsRegistry;
import hu.modembed.ui.MODembedUI;
import hu.modembed.ui.TreeContentProvider;

import java.net.URL;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;

/**
 * @author balazs.grill
 *
 */
public class IncludedProjectsSelectionWizardPage extends WizardPage {

	protected IncludedProjectsSelectionWizardPage(String pageName) {
		super(pageName);
		setDescription("Select projects below to be imported");
	}
	
	private IObservableList selection = new WritableList();
	
	private void validate(){
		setPageComplete(!selection.isEmpty());
	}
	
	public IObservableList getSelection() {
		return selection;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		final PatternFilter patternFilter = new PatternFilter();
		
		final FilteredTree tree = new FilteredTree(parent,SWT.H_SCROLL|SWT.V_SCROLL|SWT.BORDER,patternFilter, true);
		TreeViewer tv = tree.getViewer();
		
		tv.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		setControl(tree);
		
		tv.setContentProvider(new TreeContentProvider());
		tv.setLabelProvider(new LabelProvider(){
			@Override
			public Image getImage(Object element) {
				if (element instanceof IncludedProject){
					URL url = ((IncludedProject) element).getIcon();
					if (url != null) return MODembedUI.getDefault().getSharedImage(url);
					return MODembedUI.getDefault().getImageRegistry().get(MODembedUI.IMAGE_ELEMENT_FOLDER);
				}
				return MODembedUI.getDefault().getImageRegistry().get(MODembedUI.IMAGE_ELEMENT_FOLDERS);
			}
		});
		tv.setInput(IncludedProjectsRegistry.getInstance().getProjectTree());
		
		tv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				selection.clear();
				selection.addAll(((IStructuredSelection)event.getSelection()).toList());
				validate();
			}
		});
		
	}

}
