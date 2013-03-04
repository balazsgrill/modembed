/**
 * 
 */
package hu.modembed.ui.wizards.included;

import hu.modembed.includedcode.IncludedProject;
import hu.modembed.includedcode.IncludedProjectsRegistry;
import hu.modembed.ui.MODembedUI;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.observable.list.ComputedList;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;

/**
 * @author balazs.grill
 *
 */
public class ImportProjectListReviewWizardPage extends WizardPage {

	protected ImportProjectListReviewWizardPage(String pageName, IObservableList selection) {
		super(pageName);
		setDescription("Review list of projects to be imported");
		setPageComplete(true);
		final IObservableList baseSelection = selection;
		this.selection = new ComputedList() {
			
			@Override
			protected List<?> calculate() {
				List<IncludedProject> ips = new ArrayList<IncludedProject>(baseSelection.size());
				for(Object o : baseSelection){
					if (o instanceof IncludedProject){
						ips.add((IncludedProject)o);
					}
				}
				return IncludedProjectsRegistry.getInstance().resolveDependencies(ips);
			}
		};
	}
	
	public IObservableList getSelection() {
		return selection;
	}
	
	private final IObservableList selection;
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		TableViewer tv = new TableViewer(parent);
		setControl(tv.getControl());

		tv.setContentProvider(new ObservableListContentProvider());
		tv.setLabelProvider(new LabelProvider(){
			@Override
			public Image getImage(Object element) {
				if (element instanceof IncludedProject){
					URL url = ((IncludedProject) element).getIcon();
					if (url != null) return MODembedUI.getDefault().getSharedImage(url);
				}
				return MODembedUI.getDefault().getImageRegistry().get(MODembedUI.IMAGE_ELEMENT_FOLDER);
			}
		});
		tv.setInput(selection);
		
	}

}
