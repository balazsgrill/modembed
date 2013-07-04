/**
 * 
 */
package hu.modembed.model.editor.mtexteditor;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

/**
 * @author balazs.grill
 *
 */
public class MContentOutlinePage extends ContentOutlinePage implements ITreeContentProvider{

	private final Resource resource;
	
	private final LabelProvider labelProvider = new LabelProvider(){
		@Override
		public String getText(Object element) {
			if (element instanceof Diagnostic){
				Diagnostic d = (Diagnostic)element;
				return d.getMessage() +" ("+d.getLine()+":"+d.getColumn()+")";
			}
			if (element instanceof EObject){
				if (((EObject) element).eContainmentFeature() != null){
					String cont = ((EObject) element).eContainmentFeature().getName();
					return cont+": "+((EObject) element).eClass().getName();
				}
				return ((EObject) element).eClass().getName();
			}
			return super.getText(element);
		}
	};
	
	public MContentOutlinePage(Resource resource) {
		this.resource = resource;
	}
	
	public void update(){
		this.getTreeViewer().refresh();
	}
	
	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		
		getTreeViewer().setContentProvider(this);
		getTreeViewer().setLabelProvider(labelProvider);
		getTreeViewer().setInput(resource);
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Resource){
			List<Object> result = new LinkedList<Object>();
			result.addAll(((Resource) inputElement).getErrors());
			result.addAll(((Resource) inputElement).getContents());
			return result.toArray();
		}
		return new Object[0];
	}

	private String toText(EStructuralFeature f, Object o){
		if (f instanceof EAttribute){
			return f.getName()+" = \""+o+"\""; 
		}
		if (f instanceof EReference){
			return f.getName()+" -> "+labelProvider.getText(o);
		}
		return "<>";
	}
	
	private boolean showAsChild(EStructuralFeature sf){
		return (sf instanceof EAttribute) || !((EReference)sf).isContainment();
	}
	
	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof EObject){
			List<Object> result = new LinkedList<Object>();
			for(EStructuralFeature sf : ((EObject) parentElement).eClass().getEAllStructuralFeatures()) 
				if (showAsChild(sf)){
				Object v = ((EObject) parentElement).eGet(sf);
				if (v != null){
					if (v instanceof List<?>){
						for(Object o : ((List<?>) v).toArray()){
							result.add(toText(sf, o));
						}
					}else{
						result.add(toText(sf, v));
					}
				}
			}
			result.addAll(((EObject) parentElement).eContents());
			return result.toArray();
		}
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}
	
}
