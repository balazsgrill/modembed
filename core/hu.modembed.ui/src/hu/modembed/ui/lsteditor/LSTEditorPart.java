/**
 * 
 */
package hu.modembed.ui.lsteditor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

/**
 * @author balazs.grill
 *
 */
public class LSTEditorPart extends EditorPart {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	private final List<Entry> roots = new ArrayList<Entry>();
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		if (input instanceof FileEditorInput){
			try {
				InputStream is = ((FileEditorInput) input).getFile().getContents();
				
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				Stack<Entry> stack = new Stack<Entry>();
				
				String line = null;
				while((line = br.readLine()) != null){
					
					line = line.trim();
					if (!line.isEmpty()){
						if (line.startsWith("}")){
							if (!stack.isEmpty()) stack.pop();
						}else{
							
							boolean call = line.endsWith("{");
							if (call) line = line.substring(0, line.length()-1);
							
							Entry e = new Entry(line);
							Entry parent = stack.isEmpty() ? null : stack.peek();
							if (parent == null){
								roots.add(e);
							}else{
								parent.subentries.add(e);
							}
							
							if (call){
								stack.push(e);
							}
							
						}
					}
					
				}
				
				is.close();
			} catch (CoreException e) {
				throw new PartInitException(e.getStatus());
			} catch (IOException e) {
				throw new PartInitException(e.getMessage(), e);
			}
			
		}

	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isDirty()
	 */
	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		TreeViewer tv = new TreeViewer(parent);
		tv.setLabelProvider(new LabelProvider());
		tv.setContentProvider(new EntryTreeContentProvider());
		tv.setInput(roots);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
