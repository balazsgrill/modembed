/**
 * 
 */
package hu.modembed.syntax.persistence.build;

import hu.modembed.syntax.persistence.ParsingError;

import java.util.Collections;
import java.util.Deque;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

/**
 * @author balazs.grill
 *
 */
public class CreateObjectBuildStep implements IModelBuildStep {

	private final String EClassURI;
	private final String feature;
	
	public CreateObjectBuildStep(String EClassURI, String feature) {
		this.EClassURI = EClassURI;
		this.feature = feature;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.build.IModelBuildStep#apply(java.util.Deque)
	 */
	@Override
	public List<? extends Diagnostic> apply(ModelBuilder builder, Deque<EObject> modelStack) {
		int i = EClassURI.indexOf('#');
		String nsURI = EClassURI.substring(0, i);
		String name = EClassURI.substring(i+1);
		ExtendedMetaData metaData = new BasicExtendedMetaData(Registry.INSTANCE);
		EClass eclass = (EClass)metaData.getType(nsURI, name);
		
		EObject eobject = eclass.getEPackage().getEFactoryInstance().create(eclass);
		String feature = this.feature;
		if (feature == null){
			feature = builder.getNextFeature();
			builder.setNextFeature(null);
		}
		
		if (feature != null){
			EObject container = modelStack.peek();
			EReference reference = null;
			for(EReference ref : container.eClass().getEAllContainments()){
				if (feature.equals(ref.getName())){
					reference = ref;
				}
			}
			if (reference == null){
				return Collections.singletonList(new ParsingError("Could not find feature : "+EClassURI+"/"+feature, ""));
			}
			if (reference.isMany()){
				@SuppressWarnings("unchecked")
				List<EObject> list = (List<EObject>)container.eGet(reference);
				list.add(eobject);
			}else{
				container.eSet(reference, eobject);
			}
		}
		modelStack.push(eobject);
		return Collections.emptyList();
	}

}
