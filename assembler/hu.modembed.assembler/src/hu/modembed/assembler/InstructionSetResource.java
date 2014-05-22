/**
 * 
 */
package hu.modembed.assembler;

import org.eclipse.emf.common.util.URI;

import hu.temon.grammar.GrammarModel;
import hu.temon.parser.AbstractTextualResource;
import hu.temon.parser.IFeatureResolver;
import hu.temon.parser.grammar.GrammarRegistry;

/**
 * @author balazs.grill
 *
 */
public class InstructionSetResource extends AbstractTextualResource {

	private static final String GRAMMAR_ID = "modembed.instructionSet";
	
	/**
	 * @param uri
	 */
	public InstructionSetResource(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.AbstractTextualResource#loadGrammar()
	 */
	@Override
	protected GrammarModel loadGrammar() {
		return GrammarRegistry.getInstance().getGrammar(GRAMMAR_ID);
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.AbstractTextualResource#createFeatureResolver()
	 */
	@Override
	protected IFeatureResolver createFeatureResolver() {
		return new InstructionSetFeatureResolver(getResourceSet());
	}

}
