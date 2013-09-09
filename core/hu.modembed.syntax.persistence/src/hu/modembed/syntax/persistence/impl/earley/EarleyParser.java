/**
 * 
 */
package hu.modembed.syntax.persistence.impl.earley;

import hu.modembed.syntax.NonTerminalItem;
import hu.modembed.syntax.Rule;
import hu.modembed.syntax.SyntaxFactory;
import hu.modembed.syntax.SyntaxModel;
import hu.modembed.syntax.persistence.IGrammar;
import hu.modembed.syntax.persistence.IParser;
import hu.modembed.syntax.persistence.IParserContext;
import hu.modembed.syntax.persistence.IParserInput;
import hu.modembed.syntax.persistence.build.IModelBuildStep;
import hu.modembed.syntax.persistence.impl.Grammar;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class EarleyParser implements IParser {
	
	private final IGrammar grammar;
	private final Rule startRule;
	
	/**
	 * 
	 */
	public EarleyParser(SyntaxModel syntax) {
		this.grammar = new Grammar(syntax);
		startRule = SyntaxFactory.eINSTANCE.createRule();
		NonTerminalItem nonterm = SyntaxFactory.eINSTANCE.createNonTerminalItem();
		nonterm.setNonTerminal(syntax.getStartItem());
		startRule.getBody().add(nonterm);
	}

	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IParser#getGrammar()
	 */
	@Override
	public IGrammar getGrammar() {
		return grammar;
	}

	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IParser#parse(hu.modembed.syntax.persistence.IParserInput, hu.modembed.syntax.persistence.IParserContext, int)
	 */
	@Override
	public List<IModelBuildStep> parse(IParserInput input,
			IParserContext context, int start) {

		Set<EarleyState> currentSet = new HashSet<EarleyState>();
		Queue<EarleyState> current = new LinkedList<EarleyState>();  
		current.add(EarleyState.create(startRule, start));
		Queue<EarleyState> next = new LinkedList<EarleyState>();
		Set<EarleyState> nextSet = new HashSet<EarleyState>();

		EarleyState finished = null;
		
		while(finished == null && !current.isEmpty()){
			
			EarleyState state = current.poll();
			
			if (state.isCompleted()){
				int consumed = state.getPosition();
				consumed = input.bypassHidden(consumed);
				if (consumed == input.length()){
					finished = state; //Parser consumed whole input
				}else{
					//Finished early, drop
				}
			}else if (state.prediction()){
				for(EarleyState s : state.predict(grammar)){
					if (!currentSet.contains(s)){
						current.add(s);
						currentSet.add(s);
					}
				}
			}else if (state.scanning()){
				for(EarleyState s : state.scan(input, grammar)){
					if (!nextSet.contains(s)){
						next.add(s);
						nextSet.add(s);
					}
				}
			}else if (state.completion()){
				for(EarleyState s : state.complete()){
					if (!currentSet.contains(s)){
						current.add(s);
						currentSet.add(s);
					}
				}
			}
			
			if (current.isEmpty()){
				current = next;
				next = new LinkedList<EarleyState>();
				currentSet = nextSet;
				nextSet = new HashSet<EarleyState>();
			}
			
		}		
		return finished == null ? null : finished.getSteps();
	}
	
	private Collection<EarleyState> predict(Collection<EarleyState> states){
		Collection<EarleyState> newStates = createCollection();
		for(EarleyState s : states){
			if (s.prediction()){
				newStates.addAll(s.predict(grammar));
			}else{
				newStates.add(s);
			}
		}
		return newStates;
	}
	
	private Collection<EarleyState> scan(Collection<EarleyState> states, IParserInput input){
		Collection<EarleyState> newStates = createCollection();
		for(EarleyState s : states){
			if (s.scanning()){
				newStates.addAll(s.scan(input, grammar));
			}else{
				newStates.add(s);
			}
		}
		return newStates;
	}
	
	private Collection<EarleyState> complete(Collection<EarleyState> states){
		Collection<EarleyState> newStates = createCollection();
		for(EarleyState s : states){
			if (s.completion()){
				newStates.addAll(s.complete());
			}else{
				newStates.add(s);
			}
		}
		return newStates;
	}
	
	private static Collection<EarleyState> createCollection(){
		return new HashSet<EarleyState>();
	}
	
}
