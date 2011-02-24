/**
 * 
 */
package hu.cubussapiens.modembed.pic.ui.config.editor;

import java.util.HashSet;
import java.util.Set;

import modembedconfig.Parameter;
import modembedconfig.ParameterSet;
import modembedconfig.instance.Configuration;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * @author balage
 *
 */
public class ParameterSetViewer {

	private final Set<IParameterListener> listeners = new HashSet<IParameterListener>();
	
	public boolean addListener(IParameterListener e) {
		return listeners.add(e);
	}

	public boolean removeListener(IParameterListener o) {
		return listeners.remove(o);
	}

	private void fireEvent(Parameter parameter, int value){
		for(IParameterListener l : listeners){
			l.parameterValueChanged(parameter, value);
		}
	}
	
	private final Composite control;
	
	public ParameterSetViewer(Composite parent, FormToolkit tk, ParameterSet paramset, Configuration configuration) {
		this.control = tk.createComposite(parent);
		
		control.setLayout(new GridLayout(3, false));
		
		for(Parameter p : paramset.getParameters()){
			new ParameterViewer(control, p, configuration).addListener(new IParameterListener() {
				
				@Override
				public void parameterValueChanged(Parameter parameter, int newvalue) {
					fireEvent(parameter, newvalue);
				}
			});
		}
		
		for(ParameterSet pm : paramset.getSubsets()){
			Section section = tk.createSection(control, Section.TITLE_BAR);
			section.setText(pm.getName());
			section.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 3, 1));
			
			ParameterSetViewer psv = new ParameterSetViewer(section, tk, pm, configuration);
			section.setClient(psv.getControl());
			psv.addListener(new IParameterListener() {
				
				@Override
				public void parameterValueChanged(Parameter parameter, int newvalue) {
					fireEvent(parameter, newvalue);
				}
			});
		}
	}
	
	public Composite getControl() {
		return control;
	}
	
}
