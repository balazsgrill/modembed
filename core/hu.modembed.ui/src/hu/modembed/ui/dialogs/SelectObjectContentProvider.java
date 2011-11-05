/**
 * 
 */
package hu.modembed.ui.dialogs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

/**
 * @author balazs.grill
 *
 */
public class SelectObjectContentProvider implements IStructuredContentProvider {

	private final EClass type;
	
	private final Set<String[]> allrefs = new HashSet<String[]>();
	
	@SuppressWarnings("unchecked")
	private static List<EObject> getScope(EObject eobject, String t){
		if ("..".equals(t)){
			return Collections.singletonList(eobject.eContainer());
		}
		for(EReference r : eobject.eClass().getEAllReferences()){
			if(t.equals(r.getName())){
				Object o = eobject.eGet(r);
				if (o instanceof EObject){
					return Collections.singletonList((EObject)o);
				}
				if (o instanceof List<?>){
					return (List<EObject>)o;
				}
			}
		}
		return Collections.singletonList(eobject);
	}
	
	private List<EObject> getRefElements(EObject source, String[] refs){
		List<EObject> es = Collections.singletonList(source);
		
		for(String ref : refs){
			List<EObject> nes = new ArrayList<EObject>();
			for(EObject eo : es) if (eo != null){
				nes.addAll(getScope(eo, ref));
			}
			es = nes;
		}
		return es;
	}
	
	private List<EObject> getRefElements(EObject source){
		List<EObject> es = new ArrayList<EObject>();
		
		for(String[] refs : allrefs){
			es.addAll(getRefElements(source, refs));
		}
		
		Queue<EObject> q = new LinkedList<EObject>(es);
		es = new ArrayList<EObject>();
		
		while(!q.isEmpty()){
			EObject e = q.poll();
			if (type.isInstance(e)) es.add(e);
			q.addAll(e.eContents());
		}
		
		return es;
	}
	
	public SelectObjectContentProvider(EReference ref) {
		this.type = ref.getEReferenceType();
		EAnnotation ann = ref.getEAnnotation("reference");
		if (ann != null){
			String paths = ann.getDetails().get("scope");
			for(String path : paths.split(",")){
				String[] refs = path.split("/");
				allrefs.add(refs);
			}
		}else{
			
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	@Override
	public void dispose() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.IContentProvider#inputChanged(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof EObject){
			if (!allrefs.isEmpty()){
				return getRefElements((EObject)inputElement).toArray();
			}else{
				URI uri = ((EObject) inputElement).eResource().getURI();
				String projectname = uri.segment(1);
				return getElements(ResourcesPlugin.getWorkspace().getRoot().getProject(projectname));
			}
		}
		if (inputElement instanceof IProject){
//			try {
//				//return MODembedCore.getDefault().getResourceSet((IProject)inputElement).findEObjects(type).toArray();
//			} catch (CoreException e) {
//				e.printStackTrace();
//			}
		}
		return new Object[0];
	}

}
