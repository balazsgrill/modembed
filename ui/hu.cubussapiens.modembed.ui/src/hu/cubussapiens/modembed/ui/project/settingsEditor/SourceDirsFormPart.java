/**
 * 
 */
package hu.cubussapiens.modembed.ui.project.settingsEditor;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import project.Directory;

/**
 * @author balazs.grill
 *
 */
public class SourceDirsFormPart extends SectionPart {

	private TreeViewer tv;

	private class SourceDirsContentProvder implements ITreeContentProvider{

		@Override
		public void dispose() {
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof ProjectConfigInput){
				return ((ProjectConfigInput) inputElement).config.getSourcedirs().toArray();
			}
			return new Object[0];
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			return null;
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			return false;
		}
		
	}
	
	private class SourceDirLabelProvider extends LabelProvider{
		@Override
		public String getText(Object element) {
			if (element instanceof Directory){
				return ((Directory) element).getPath();
			}
			return super.getText(element);
		}
	}
	
	/**
	 * @param parent
	 * @param toolkit
	 * @param style
	 */
	public SourceDirsFormPart(Composite parent, FormToolkit toolkit, int style) {
		super(parent, toolkit, style);
		createContent(getSection(), toolkit);
	}

	private void createContent(Section section, FormToolkit tk){
		section.setText("Source directories");
		Composite c = tk.createComposite(section);
		tv = new TreeViewer(c, SWT.SINGLE | SWT.BORDER | SWT.FULL_SELECTION);
		tv.setContentProvider(new SourceDirsContentProvder());
		tv.setLabelProvider(new SourceDirLabelProvider());
		tk.adapt(tv.getTree());
		
		Composite buttons = tk.createComposite(c);
		buttons.setLayout(new RowLayout(SWT.VERTICAL));
		
		tk.createButton(buttons, "Add..", SWT.PUSH).addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
			}
		});
		tk.createButton(buttons, "Remove", SWT.PUSH);
		
		c.setLayout(new GridLayout(2,false));
		tv.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		buttons.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, false, true));
		
		section.setClient(c);
	}
	
	@Override
	public void refresh() {
		tv.refresh();
		super.refresh();
	}
	
	@Override
	public void initialize(IManagedForm form) {
		super.initialize(form);
		
		Object input = form.getInput();
		if (input instanceof ProjectConfigInput){
			tv.setInput(input);
		}
	}
	
}
