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

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
		//this.grammar = new FlattenedGrammar(syntax);
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

		ParserTable table = new ParserTable();
		int currentLevel = 0;
		table.get(currentLevel).add(EarleyState.create(startRule, start));
		
		boolean done = false;
		List<EarleyState> finished = new LinkedList<EarleyState>();
		
		while(!done){
			
			Queue<EarleyState> queue = table.get(currentLevel).getQueue();
			done = queue.isEmpty();
//			System.out.println("---StartLevel "+currentLevel +" ("+input.length()+")");
			
			while(!queue.isEmpty()){
				
				EarleyState state = queue.poll();
//				System.out.println("Considering: "+ state);
				
				if (state.isCompleted()){
					int consumed = state.getPosition();
					consumed = input.bypassHidden(consumed);
					if (consumed == input.length()){
						finished.add(state);
					}else{
//						System.out.println("Early finish, dropped: "+consumed);
					}
				}else
				if (state.prediction()){
					for(EarleyState s : state.predict(currentLevel, grammar)){
						table.get(currentLevel).add(s);
					}
				}else
				if (state.scanning()){
//					int scan =0;
					for(EarleyState s : state.scan(input, grammar)){
						int level = (s.getPosition() > state.getPosition()) ? 1 : 0;
						table.get(currentLevel+level).add(s);
//						scan++;
					}
//					System.out.println("Scanned: "+scan+" {"+input.substring(state.getPosition(), state.getPosition()+20));
				}else
				if (state.completion()){
					for(EarleyState s : state.complete(table)){
						if (!table.get(currentLevel).add(s)){
							System.out.println("Dropped completed state: "+s);
						}
					}
				}else
				if (state.silent()){
					EarleyState s = state.consumeSilent();
					if (s != null) {
						table.get(currentLevel).add(s);
					}
				}
				
			}
			table.get(currentLevel).queueFinished();
			currentLevel++;
			
		}
		
		if (finished.isEmpty()){
			System.out.println("Syntax error");
		}else{
			System.out.println("Success!");
		}
		
		return finished.isEmpty() ? null : finished.get(0).getSteps();
	}

}
