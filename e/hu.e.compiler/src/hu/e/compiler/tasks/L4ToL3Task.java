/**
 * 
 */
package hu.e.compiler.tasks;

import hu.e.compiler.IModembedTask;
import hu.e.compiler.ITaskContext;
import hu.e.compiler.TaskUtils;
import hu.modembed.model.core.CorePackage;
import hu.modembed.model.core.MODembedElement;
import hu.modembed.model.emodel.EmodelFactory;
import hu.modembed.model.emodel.Library;
import hu.modembed.model.emodel.LibraryElement;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class L4ToL3Task implements IModembedTask {

	public static final String INPUT = "input";
	public static final String OUTPUT = "output";
	
	private class Reference{
		public final EObject source;
		public final EReference reference;
		public final EObject originalTarget;
		
		public Reference(EObject source, EReference reference,
				EObject originalTarget) {
			this.source = source;
			this.reference = reference;
			this.originalTarget = originalTarget;
		}
	
		@SuppressWarnings("unchecked")
		public void resolve(Integrator integrator){
			EObject target = integrator.getConverted(originalTarget);
			if (reference.isMany()){
				((List<EObject>)source.eGet(reference)).add(target);
			}else{
				source.eSet(reference, target);
			}
		}
	}
	
	private class Integrator{
		
		private final Library target;
		
		public Integrator(Library target) {
			this.target = target;
		}
		
		private final Map<EObject, EObject> converted = new HashMap<EObject, EObject>();
		public final List<Reference> references = new LinkedList<L4ToL3Task.Reference>();
		
		public EObject getConverted(EObject original) {
			EObject target = converted.get(original);
			if (target == null) target = original;
			return target;
		}
		
		public void addLibrary(Library library){
			TaskUtils.addOrigin(target, library);
			for(LibraryElement element : library.getContent()){
				target.getContent().add(copy(element));
			}
		}
		
		private <T extends EObject> T copy(T element){
			EClass eclass = element.eClass();
			@SuppressWarnings("unchecked")
			T result = (T)eclass.getEPackage().getEFactoryInstance().create(eclass);
			converted.put(element, result);
			
			if (element instanceof MODembedElement){
				TaskUtils.addOrigin((MODembedElement) element, (MODembedElement)result);
			}
			
			for(EStructuralFeature feature: eclass.getEAllStructuralFeatures()){
				if (!CorePackage.eINSTANCE.getMODembedElement_Origins().equals(feature)){
					if (feature instanceof EAttribute){
						result.eSet(feature, element.eGet(feature));
					}
					if (feature instanceof EReference){
						if (((EReference) feature).isContainment()){
							if (feature.isMany()){
								@SuppressWarnings("unchecked")
								List<EObject> resultList = (List<EObject>) result.eGet(feature);
								for(Object o : (List<?>)element.eGet(feature)){
									resultList.add(copy((EObject)o));
								}
							}else{
								Object o = element.eGet(feature);
								if (o instanceof EObject){
									result.eSet(feature, copy((EObject)o));
								}
							}
						}else{
							if (feature.isMany()){
								for(Object o : (List<?>)element.eGet(feature)){
									references.add(new Reference(result, (EReference)feature, (EObject)o));
								}
							}else{
								Object o = element.eGet(feature);
								if (o instanceof EObject){
									references.add(new Reference(result, (EReference)feature, (EObject)o));
								}
							}
						}
					}
				}
			}
			
			return result;
		}
		
		public void resolveCrossReferences(){
			for(Reference ref : references){
				ref.resolve(this);
			}
		}
		
	}
	
	/* (non-Javadoc)
	 * @see hu.e.compiler.IModembedTask#execute(hu.e.compiler.ITaskContext, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void execute(ITaskContext context, IProgressMonitor monitor) {
		
		String outputmodel = context.getParameterValue(OUTPUT).get(0);
		Resource outr = context.getOutput(context.getModelURI(outputmodel));
		Library outlib = EmodelFactory.eINSTANCE.createLibrary();
		outlib.setName(outputmodel);
		outr.getContents().add(outlib);
		
		Integrator integrator = new Integrator(outlib);
		
		for(String libmodel : context.getParameterValue(INPUT)){
			Resource libr = context.getInput(context.getModelURI(libmodel));
			EObject lib = libr.getContents().get(0);
			if (lib instanceof Library){
				integrator.addLibrary((Library)lib);
			}
		}

		integrator.resolveCrossReferences();
		
	}

}
