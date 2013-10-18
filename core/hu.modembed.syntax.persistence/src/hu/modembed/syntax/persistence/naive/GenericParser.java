/**
 * 
 */
package hu.modembed.syntax.persistence.naive;

import hu.modembed.syntax.Rule;
import hu.modembed.syntax.SyntaxModel;
import hu.modembed.syntax.persistence.IGrammar;
import hu.modembed.syntax.persistence.IParser;
import hu.modembed.syntax.persistence.IParserContext;
import hu.modembed.syntax.persistence.IParserInput;
import hu.modembed.syntax.persistence.ParsingError;
import hu.modembed.syntax.persistence.build.IModelBuildStep;
import hu.modembed.syntax.persistence.impl.Grammar;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

/**
 * @author balazs.grill
 *
 */
public class GenericParser implements IParser{
	
	private final IGrammar grammar;
	private final String start;
	public final List<Diagnostic> errors = new LinkedList<Resource.Diagnostic>();
	
	public ParserState getStartState(IParserInput data, int index){
		return new ParserState(this, start, data, index);
	}
	
	public Collection<Rule> findRules(String nonTerminal){
		return grammar.getRule(nonTerminal);
	}
	
	public GenericParser(SyntaxModel syntaxModel) {
		this.grammar = new Grammar(syntaxModel);
		
		start = syntaxModel.getStartItem();
	}

	@Override
	public IGrammar getGrammar() {
		return grammar;
	}
	
	private void error(IParserContext context, String message, IParserInput data, int index){
		int[] pos = data.getLineAndColumn(index);
		context.logError(new ParsingError(message, "", pos[0], pos[1]));
	}
	
	@Override
	public List<IModelBuildStep> parse(IParserInput input, IParserContext context, int start) {
		ParserState startState = getStartState(input, start);
		LinkedList<ParserState> states = new LinkedList<ParserState>();
		ParserState finishedState = null;
		ParserState bestState = null;
		states.add(startState);

		while(finishedState == null && !states.isEmpty()){
			ParserState current = states.pollFirst();

			if (current.done()){
				finishedState = current;
			}else{

				if (bestState == null || bestState.getIndex() <= current.getIndex()){
					bestState = current;
				}

				/* Step */
				for(ParserState followup : current.getValidFollowingStates()){
					/* Deep-first search */
					if (!followup.shouldBeCut()){
						states.addFirst(followup);
					}
				}
			}
		}

		if (finishedState == null){
			if (bestState != null){
				error(context, "Syntax error: expected "+bestState.expectedItem()+" here: \""+bestState.followupText(20)+"...\"", input, bestState.getIndex());
			}else{
				error(context, "Syntax error!", input, 0);
			}
			return Collections.emptyList();
		}
		return finishedState.getModelBuild();
	}
	
}
