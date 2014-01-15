/**
 * 
 */
package hu.modembed.resource.scope;

import hu.modembed.model.modembed.core.instructionset.InstructionsetPackage;
import hu.textualmodeler.grammar.Terminal;
import hu.textualmodeler.parser.BasicFeatureResolver;
import hu.textualmodeler.parser.IGrammar;
import hu.textualmodeler.parser.scope.IFeatureScope;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * @author balazs.grill
 *
 */
public class MFeatureResolver extends BasicFeatureResolver {

	private final Resource resource;
	
	private Terminal BINARY_NUMBER = null;
	
	public MFeatureResolver(Resource resource, IGrammar grammar) {
		super(resource.getResourceSet());
		this.resource = resource;
		for(Terminal t : grammar.terminals()){
			if ("BINARY_NUMBER".equals(t.getName())){
				this.BINARY_NUMBER = t;
			}
		}
	}

	@Override
	public IFeatureScope getScope(EObject context, EReference feature,
			Terminal terminal, String value) {
		if (InstructionsetPackage.eINSTANCE.getParameterSection_Parameter().equals(feature)){
			
			EObject container = context.eContainer().eContainer();
			
			return new FlatScope(container, InstructionsetPackage.eINSTANCE.getInstructionParameter(), InstructionsetPackage.eINSTANCE.getInstruction_Parameters());
		}
		
		if (InstructionsetPackage.eINSTANCE.getInstructionSet_Extend().equals(feature)){
			return new IndexerScope(resource, feature.getEReferenceType());
		}
		
		
		return super.getScope(context, feature, terminal, value);
	}
	
	@Override
	public Object resolvePrimitive(EDataType datatype, Terminal terminal,
			String value) {
		if (terminal.equals(BINARY_NUMBER)){
			if (value.toLowerCase().startsWith("0b")){
				long v = Long.parseLong(value.substring(2), 2);
				return super.resolvePrimitive(datatype, terminal, Long.toString(v));
			}
		}
		return super.resolvePrimitive(datatype, terminal, value);
	}

}
