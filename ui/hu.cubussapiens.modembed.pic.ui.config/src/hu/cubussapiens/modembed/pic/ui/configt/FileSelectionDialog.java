/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.configt;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * @author balazs.grill
 *
 */
public class FileSelectionDialog extends Dialog {

	private final IContainer root;
	
	private final String extension;

	private Text text;
	
	/**
	 * @param parentShell
	 */
	public FileSelectionDialog(Shell parentShell, IContainer root, String extension) {
		super(parentShell);
		this.root = root;
		this.extension = extension;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}
	
	@Override
	protected Point getInitialSize() {
		return new Point(300, 250);
	}
	
	@Override
	protected Control createDialogArea(Composite parent) {
		getShell().setText("Select or type in resource");
		Composite area = (Composite)super.createDialogArea(parent);
		
		area.setLayout(new GridLayout(1, false));
		
		TreeViewer tree = new TreeViewer(area);
		tree.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		tree.setContentProvider(new ResourceContentProvider());
		tree.setLabelProvider(WorkbenchLabelProvider.getDecoratingWorkbenchLabelProvider());
		if (null != extension){
			tree.setFilters(new ViewerFilter[]{
				new ViewerFilter() {
					
					@Override
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof IFile){
							return extension.equalsIgnoreCase(((IFile) element).getFileExtension());
						}
						return true;
					}
				}	
			});
		}
		tree.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				Object o = ((IStructuredSelection)event.getSelection()).getFirstElement();
				if (o instanceof IResource){
					IResource r = (IResource)o;
					
					text.setText(r.getLocation().makeRelativeTo(root.getLocation()).toString());
				}
			}
		});
		tree.setInput(root);
		
		text = new Text(area, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, false));
		text.addModifyListener(new ModifyListener() {
			
			@Override
			public void modifyText(ModifyEvent e) {
				value = text.getText();
			}
		});
		
		return area;
	}
	
	private String value = null;
	
	public String getValue(){
		return value;
	}
}
