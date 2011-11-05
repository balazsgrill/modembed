/**
 * 
 */
package hu.cubussapiens.modembed.ui.launch.control;

import hu.cubussapiens.modembed.IProgrammerInstance;
import hu.cubussapiens.modembed.ui.launch.LaunchPlugin;
import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammersContentProvider;
import hu.cubussapiens.modembed.ui.launch.programmers.ProgrammersLabelProvider;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.dialogs.ISelectionStatusValidator;

/**
 * @author balazs.grill
 *
 */
public class LaunchConfigControl extends Composite {

	private final List<ProgrammerConfiguration> config = new ArrayList<ProgrammerConfiguration>();
	private final TreeViewer viewer;
	
	private final Set<Runnable> listeners = new HashSet<Runnable>();
	
	private void trigger(){
		for(Runnable r : listeners){
			r.run();
		}
	}
	
	public void addListener(Runnable listener){
		listeners.add(listener);
	}
	
	public List<ProgrammerConfiguration> getConfigurations() {
		return config;
	}
	
	public void setConfigurations(List<ProgrammerConfiguration> configs){
		this.config.clear();
		this.config.addAll(configs);
		updateViewer();
	}
	
	private void addNewInstance(){

		ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(getShell(), new ProgrammersLabelProvider(), new ProgrammersContentProvider());
		dialog.setInput(Object.class);
		dialog.setAllowMultiple(false);
		dialog.setTitle("Select a programmer");
		dialog.setValidator(new ISelectionStatusValidator() {

			@Override
			public IStatus validate(Object[] selection) {
				if (selection.length == 1){
					return Status.OK_STATUS;
				}
				return new Status(IStatus.ERROR, LaunchPlugin.PLUGIN_ID, "You must select a programmer!");
			}
		});
		if (dialog.open() == Dialog.OK){
			Object o = dialog.getFirstResult();
			if (o instanceof IProgrammerInstance){
				IProgrammerInstance pd = (IProgrammerInstance)o;
				config.add(new ProgrammerConfiguration(pd));
				updateViewer();
				trigger();
			}
		}

	}
	
	private void updateViewer(){
		viewer.setInput(config.toArray());
	}
	
	/**
	 * @param parent
	 * @param style
	 */
	public LaunchConfigControl(Composite parent, int style) {
		super(parent, style);		
		
		this.setSize(new Point(345, 206));
		this.setLayout(new GridLayout(1, false));
		
		ToolBar tb = new ToolBar(this, style);
		tb.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		ToolBarManager tbman = new ToolBarManager(tb);
		tbman.add(new Action("Add") {
			@Override
			public void run() {
				addNewInstance();
			}
		});
		tbman.update(true);
		
		viewer = new TreeViewer(this);
		viewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		viewer.setLabelProvider(new ProgrammersLabelProvider());
		viewer.setContentProvider(new ArrayTreeContentProvider());
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				ISelection s = event.getSelection();
				if (!s.isEmpty()){
					Object o = ((IStructuredSelection)s).getFirstElement();
					if (o instanceof ProgrammerConfiguration){
						editProgrammerConfiguration((ProgrammerConfiguration)o);
					}
				}
				
			}
		});
		
	}

	private void editProgrammerConfiguration(ProgrammerConfiguration conf){
		if (new ConfigEditorDialog(getShell(), conf).open() == Dialog.OK){
			trigger();
		}
	}
	
}
