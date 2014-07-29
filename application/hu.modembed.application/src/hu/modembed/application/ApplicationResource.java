/**
 * 
 */
package hu.modembed.application;

import org.eclipse.emf.common.util.URI;

import hu.temon.grammar.GrammarModel;
import hu.temon.parser.AbstractTextualResource;
import hu.temon.parser.IFeatureResolver;
import hu.temon.parser.grammar.GrammarRegistry;

/**
 * @author balazs.grill
 *
 */
public class ApplicationResource extends AbstractTextualResource {

	/**
	 * @param uri
	 */
	public ApplicationResource(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.AbstractTextualResource#loadGrammar()
	 */
	@Override
	protected GrammarModel loadGrammar() {
		return GrammarRegistry.getInstance().getGrammar("modembed.application");
	}

	/* (non-Javadoc)
	 * @see hu.temon.parser.AbstractTextualResource#createFeatureResolver()
	 */
	@Override
	protected IFeatureResolver createFeatureResolver() {
		// TODO Auto-generated method stub
		return null;
	}

}
