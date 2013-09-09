/**
 * 
 */
package hu.modembed.syntax.persistence.impl.earley;

import hu.modembed.syntax.NonTerminalItem;
import hu.modembed.syntax.Pop;
import hu.modembed.syntax.Push;
import hu.modembed.syntax.Rule;
import hu.modembed.syntax.RuleItem;
import hu.modembed.syntax.SetValue;
import hu.modembed.syntax.SyntaxItem;
import hu.modembed.syntax.TerminalItem;
import hu.modembed.syntax.persistence.IGrammar;
import hu.modembed.syntax.persistence.IParserInput;
import hu.modembed.syntax.persistence.StringValue;
import hu.modembed.syntax.persistence.TerminalMatch;
import hu.modembed.syntax.persistence.build.CreateObjectBuildStep;
import hu.modembed.syntax.persistence.build.IModelBuildStep;
import hu.modembed.syntax.persistence.build.PopBuildStep;
import hu.modembed.syntax.persistence.build.SetFeatureBuildStep;
import hu.modembed.syntax.persistence.build.SetNextFeature;
import hu.modembed.syntax.persistence.impl.AppendedList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * @author balazs.grill
 *
 */
public class EarleyState {

	private final Rule currentRule;
	/* Current position in rule*/
	private final int index;
	
	/* Current position in input */
	private final int position;
	private final List<IModelBuildStep> steps;
	private final EarleyState origin;
	
	public static EarleyState create(Rule startRule, int startPosition){
		return new EarleyState(startRule, 0, startPosition, Collections.<IModelBuildStep>emptyList(), null);
	}
	
	@Override
	public int hashCode() {
		return currentRule.hashCode() + index + position;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof EarleyState){
			EarleyState other = (EarleyState)obj;
			if (other.position != position) return false;
			if (other.index != index) return false;
			if (!currentRule.equals(other.currentRule)) return false;
			//return true;
			if (origin == null) return other.origin == null;
			return origin.equals(other.origin);
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(position);
		sb.append("] ");
		int index = 0;
		for(RuleItem item : currentRule.getBody()){
			if (index == this.index){
				sb.append("@ ");
			}
			if (item instanceof NonTerminalItem){
				sb.append("<");sb.append(((NonTerminalItem) item).getNonTerminal());sb.append("> ");
			}
			if (item instanceof TerminalItem){
				sb.append(((TerminalItem) item).getTerminal().getName());
				sb.append(" ");
			}
			index++;
		}
		return sb.toString();
	}
	
	/**
	 * 
	 */
	private EarleyState(Rule currentRule, int index, int position, List<IModelBuildStep> steps, EarleyState origin) {
		this.currentRule = currentRule;
		
		/* Process any silent rule items */
		while(isSilent(nextItem(currentRule, index))){
			RuleItem item = nextItem(currentRule, index);
			if (item instanceof Pop){
				steps = new AppendedList<IModelBuildStep>(steps, new PopBuildStep());
			}else
			if (item instanceof Push){
				Push push = (Push)item;
				steps = new AppendedList<IModelBuildStep>(steps, new CreateObjectBuildStep(push.getEclassURI(), push.getFeatureName()));
			}else
			if (item instanceof SetValue){
				SetValue setValue = (SetValue)item;
				steps = new AppendedList<IModelBuildStep>(steps, new SetFeatureBuildStep(setValue.getFeatureName(), new StringValue(setValue.getValue())));
			}else{
				throw new RuntimeException("Unexpected silent element: "+item);
			}
			
			index++;
		}
		
		this.index = index;
		this.position = position;
		this.steps = steps;
		this.origin = origin;
	}
	
	private static boolean isSilent(RuleItem item){
		return (item != null) && !(item instanceof SyntaxItem);
	}
	
	public Rule getCurrentRule() {
		return currentRule;
	}
	
	public int getIndex() {
		return index;
	}
	
	public int getPosition() {
		return position;
	}
	
	public List<IModelBuildStep> getSteps() {
		return steps;
	}
	
	public EarleyState getOrigin() {
		return origin;
	}

	private static RuleItem nextItem(Rule rule, int index){
		final EList<RuleItem> body = rule.getBody();
		if (body.size() > index){
			return body.get(index);
		}
		return null;
	}
	
	public RuleItem getNextItem(){
		return nextItem(currentRule, index);
	}
	
	public boolean prediction(){
		return getNextItem() instanceof NonTerminalItem;
	}
	
	public boolean completion(){
		return getNextItem() == null;
	}
	
	public boolean scanning(){
		return !completion() && !prediction();
	}
	
	public List<EarleyState> predict(IGrammar grammar){
		RuleItem next = getNextItem();
		if (next instanceof NonTerminalItem){
			NonTerminalItem nonterm = (NonTerminalItem)next;
			
			List<EarleyState> predicted = new LinkedList<EarleyState>();
			
			if (nonterm.isOptional()){
				predicted.add(new EarleyState(currentRule, index+1, position, steps, origin));
			}
			
			String featurename = nonterm.getFeatureName();
			
			List<IModelBuildStep> steps = this.steps;
			if (featurename != null){
				steps = new AppendedList<IModelBuildStep>(steps, new SetNextFeature(featurename));
			}
			Collection<Rule> rules = grammar.getRule(((NonTerminalItem) next).getNonTerminal());
			
			for(Rule rule : rules){
				predicted.add(new EarleyState(rule, 0, position, steps, this));
			}
			return predicted;
		}
		return Collections.emptyList();
	}
	
	public List<EarleyState> complete(){
		if (completion() && origin != null){
			EarleyState completed = new EarleyState(origin.currentRule, origin.index+1, position, steps, origin.origin);
			RuleItem ri = origin.getNextItem();
			if (ri instanceof NonTerminalItem){
				if (((NonTerminalItem) ri).isMany()){
					return Arrays.asList(completed,
							new EarleyState(origin.currentRule, origin.index, position, steps, origin.origin)
							);
				}
			}
			
			return Collections.singletonList(completed);
		}
		return Collections.emptyList();
	}
	
	public boolean isCompleted(){
		return completion() && origin == null;
	}
	
	public List<EarleyState> scan(IParserInput input, IGrammar grammar){
		if (scanning()){
			RuleItem item = getNextItem();
			
			if (item instanceof TerminalItem){
				TerminalItem terminal = (TerminalItem)item;
				int position = input.bypassHidden(this.position);
				
//				System.out.println("Scanning "+terminal.getTerminal().getName()+" here: '"+input.substring(position, position+20)+"..");
				TerminalMatch match = input.match(terminal.getTerminal(), position);
				if (match != null){
				
					List<IModelBuildStep> steps = this.steps;
					String feature = terminal.getFeatureName();
					if (feature != null){
						steps = new AppendedList<IModelBuildStep>(steps, new SetFeatureBuildStep(feature, match));
					}
					
					int length = match.size;
					EarleyState nextState = new EarleyState(currentRule, index+1, position+length, steps, origin);
					if (terminal.isMany()){
						return Arrays.asList(nextState,
								new EarleyState(currentRule, index, position+length, steps, origin)
								);
					}else{
						return Collections.singletonList(nextState);
					}
					
				}else if (terminal.isOptional()){
					return Collections.singletonList(new EarleyState(currentRule, index+1, position, steps, origin));
				}
			}
		}
		return Collections.emptyList();
	}
	
}
