/**
 * 
 */
package hu.cubussapiens.modembed.ui.config.editor;

import java.util.HashSet;
import java.util.Set;

import modembedconfig.EnumParam;
import modembedconfig.EnumParamLiteral;
import modembedconfig.Parameter;
import modembedconfig.instance.Configuration;
import modembedconfig.instance.InstanceFactory;
import modembedconfig.instance.Value;

import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;



/**
 * @author balage
 *
 */
public class ParameterViewer implements ISelectionChangedListener{

	private final Parameter parameter;
	private final Configuration config;
	
	private final Set<IParameterListener> listeners = new HashSet<IParameterListener>();
		
	public boolean addListener(IParameterListener e) {
		return listeners.add(e);
	}

	public boolean removeListener(IParameterListener o) {
		return listeners.remove(o);
	}

	private void fireEvent(int value){
		for(IParameterListener l : listeners){
			l.parameterValueChanged(parameter, value);
		}
	}
	
	private int getValue(){
		for(Value v : config.getValues()){
			if (parameter.equals(v.getParameter())){
				return v.getValue();
			}
		}
		return parameter.getDefault();
	}
	
	private void setValue(int value){
		for(Value v : config.getValues()){
			if (parameter.equals(v.getParameter())){
				v.setValue(value);
				return;
			}
		}
		Value v = InstanceFactory.eINSTANCE.createValue();
		v.setParameter(parameter);
		v.setValue(value);
		config.getValues().add(v);
	}
	
	private EnumParamLiteral getLiteral(int value){
		if (parameter instanceof EnumParam){
			for(EnumParamLiteral l : ((EnumParam) parameter).getLiterals()){
				if (l.getValue() == value)
					return l;
			}
		}
		return null;
	}
	
	/**
	 * 
	 */
	public ParameterViewer(Composite parent, Parameter parameter, Configuration config) {
		
		this.parameter = parameter;
		this.config = config;
		
		Label label = new Label(parent, SWT.NONE);
		label.setText(parameter.getName()+": ");
		label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false));
		
		if (parameter instanceof EnumParam){
		
			ComboViewer cviewer = new ComboViewer(parent, SWT.READ_ONLY);
			cviewer.setContentProvider(new IStructuredContentProvider() {
				
				@Override
				public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
				}
				
				@Override
				public void dispose() {
				}
				
				@Override
				public Object[] getElements(Object inputElement) {
					if (inputElement instanceof EnumParam){
						return ((EnumParam) inputElement).getLiterals().toArray();
					}
					return new Object[0];
				}
			});
			cviewer.setLabelProvider(new LabelProvider(){
				@Override
				public String getText(Object element) {
					if (element instanceof EnumParamLiteral){
						return ((EnumParamLiteral) element).getName();
					}
					return super.getText(element);
				}
			});
			cviewer.setInput(parameter);
			cviewer.setSelection(new StructuredSelection(getLiteral(getValue())));
			cviewer.addSelectionChangedListener(this);
			
			cviewer.getControl().setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,2,1));
		}else{
			label = new Label(parent, SWT.NONE);
			label.setText("Unknown parameter type!");
			label.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, false, false,2,1));
		}
		
	}

	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (event.getSelection() instanceof IStructuredSelection){
			Object o = ((IStructuredSelection)event.getSelection()).getFirstElement();
			if (o instanceof EnumParamLiteral){
				int v = ((EnumParamLiteral) o).getValue();
				setValue(v);
				fireEvent(v);
			}
		}
	}
	
}
