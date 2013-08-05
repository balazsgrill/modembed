/**
 * 
 */
package hu.modembed.ui.databinding;

import hu.modembed.MODembedCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.eclipse.core.databinding.observable.IObservable;
import org.eclipse.core.databinding.observable.Observables;
import org.eclipse.core.databinding.observable.masterdetail.IObservableFactory;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * @author balazs.grill
 *
 */
public class FeaturePossibleValueListFactory implements IObservableFactory {

private final EClass type;
	
	private final ResourceSet resourceSet;
	
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
	
	public FeaturePossibleValueListFactory(EReference ref, ResourceSet resourceSet) {
		this.type = ref.getEReferenceType();
		this.resourceSet = resourceSet;
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
	
	private Object[] getElements(Object inputElement) {
		if (inputElement instanceof EObject){
			if (!allrefs.isEmpty()){
				return getRefElements((EObject)inputElement).toArray();
			}else{
				return MODembedCore.getDefault().getModelIndex().find(((EObject) inputElement).eResource(), this.type).toArray();
			}
		}
		if (inputElement instanceof IProject){
			List<Object> result = new ArrayList<Object>();
			try {
				for(URI uri : MODembedCore.getDefault().getResourceProvider().getResources(((IProject) inputElement).getName(), "xmi")){
					Resource r = resourceSet.getResource(uri, true);
					TreeIterator<EObject> ti = r.getAllContents();
					while(ti.hasNext()){
						EObject eo = ti.next();
						if (type.isInstance(eo)){
							result.add(eo);
						}
					}
				}
				return result.toArray();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return new Object[0];
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.core.databinding.observable.masterdetail.IObservableFactory#createObservable(java.lang.Object)
	 */
	@Override
	public IObservable createObservable(Object target) {
		return Observables.staticObservableList(Arrays.asList(getElements(target)));
	}

}
