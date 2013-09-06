/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.syntax.persistence.build.IModelBuildStep;

import java.util.List;

/**
 * @author balazs.grill
 *
 */
public interface IParser {

	public IGrammar getGrammar();
	
	public List<IModelBuildStep> parse(IParserInput input, IParserContext context, int start);
	
}
