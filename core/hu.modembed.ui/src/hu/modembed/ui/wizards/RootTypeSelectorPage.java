/**
 * 
 */
package hu.modembed.ui.wizards;

import hu.modembed.MODembedCore;
import hu.modembed.model.core.CorePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * @author balage
 *
 */
public class RootTypeSelectorPage extends WizardPage {

	/**
	 * @param pageName
	 */
	public RootTypeSelectorPage(String pageName) {
		super(pageName);
		setTitle("Select Root model type");
	}

	public EClass eclass = null;
	
	private void validate(){
		if (eclass == null){
			setPageComplete(false);
			setMessage("Please select a type");
		}else{
			setPageComplete(true);
			setMessage(null);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite c = new Composite(parent, SWT.NONE);
		
		c.setLayout(new GridLayout(2, false));
		Label label = new Label(c, SWT.LEFT);
		label.setText("Model Type: ");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false));
		
		ComboViewer cv = new ComboViewer(c);
		cv.getControl().setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		cv.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				if (element instanceof EClass){
					return ((EClass) element).getName();
				}
				return super.getText(element);
			}
		});
		cv.setContentProvider(new ArrayContentProvider());
		cv.setInput(MODembedCore.getAllSubTypes(null, CorePackage.eINSTANCE.getRootElement()));
		cv.addFilter(new ViewerFilter() {
			
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				if (element instanceof EClass){
					return !((EClass) element).isAbstract();
				}
				return false;
			}
		});
		cv.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection s = event.getSelection();
				if (s instanceof IStructuredSelection){
					Object o = ((IStructuredSelection) s).getFirstElement();
					eclass = (o instanceof EClass) ? (EClass)o : null;
				}else{
					eclass = null;
				}
				validate();
			}
		});
		
		setControl(c);
		setPageComplete(false);
	}

}
