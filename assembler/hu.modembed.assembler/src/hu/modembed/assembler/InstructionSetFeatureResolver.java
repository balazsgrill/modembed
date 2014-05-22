/**
 * 
 */
package hu.modembed.assembler;

import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import hu.modembed.assembler.instructionset.Instruction;
import hu.modembed.assembler.instructionset.InstructionParameter;
import hu.modembed.assembler.instructionset.InstructionsetPackage;
import hu.temon.grammar.Terminal;
import hu.temon.parser.BasicFeatureResolver;

/**
 * @author balazs.grill
 *
 */
public class InstructionSetFeatureResolver extends BasicFeatureResolver {

	/**
	 * @param resourceSet
	 */
	public InstructionSetFeatureResolver(Resource resource) {
		super(resource);
	}
	
	@Override
	public Object resolve(EObject context, EStructuralFeature feature,
			Terminal terminal, String value) {
		
		if (InstructionsetPackage.eINSTANCE.getInstructionSet_Extends().equals(feature)){
			URI uri = resource.getURI();
			ResourceSet resourceSet = getResourceSet();
			URI refuri = uri.trimSegments(1).appendSegment(value+".instructionset");
			Resource refres = resourceSet.getResource(refuri, true);
			
			return refres.getContents().get(0);
		}
		
		if (InstructionsetPackage.eINSTANCE.getParameterSection_Parameter().equals(feature)){
			EObject i = context.eContainer().eContainer();
			if (i instanceof Instruction){
				for(InstructionParameter ip : ((Instruction) i).getParameters()){
					if (Objects.equals(ip.getName(), value)){
						return ip;
					}
				}
			}
		}
		
		return super.resolve(context, feature, terminal, value);
	}

}
