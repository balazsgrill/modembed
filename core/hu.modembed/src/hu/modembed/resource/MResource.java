/**
 * 
 */
package hu.modembed.resource;

import hu.modembed.resource.scope.MFeatureResolver;
import hu.textualmodeler.grammar.GrammarModel;
import hu.textualmodeler.parser.AbstractTextualResource;
import hu.textualmodeler.parser.IFeatureResolver;
import hu.textualmodeler.parser.grammar.GrammarRegistry;

import org.eclipse.emf.common.util.URI;

/**
 * @author balazs.grill
 *
 */
public class MResource extends AbstractTextualResource {

	/**
	 * @param uri
	 */
	public MResource(URI uri) {
		super(uri);
	}

	/* (non-Javadoc)
	 * @see hu.textualmodeler.parser.AbstractTextualResource#createFeatureResolver()
	 */
	@Override
	protected IFeatureResolver createFeatureResolver() {
		return new MFeatureResolver(this, getGrammar());
	}

	@Override
	protected GrammarModel loadGrammar() {
		return GrammarRegistry.getInstance().getGrammar("modembed");
	}

}
