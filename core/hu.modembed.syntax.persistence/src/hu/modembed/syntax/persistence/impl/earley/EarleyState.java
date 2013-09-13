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
import hu.modembed.syntax.Terminal;
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
import hu.modembed.syntax.persistence.impl.ConcatenatedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
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
	private final int origin;
	
	public static EarleyState create(Rule startRule, int startPosition){
		return new EarleyState(startRule, 0, startPosition, Collections.<IModelBuildStep>emptyList(), -1);
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
			return other.origin == origin;
		}
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(position);
		sb.append(":");
		sb.append(origin);
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
				Terminal term = ((TerminalItem) item).getTerminal();
				if (term == null){
					sb.append("[UNKNOWN TERMINAL]");
				}else{
					sb.append(term.getName());
				}
				sb.append(" ");
			}
			if (item instanceof Push){
				sb.append("{ ");
			}
			if (item instanceof Pop){
				sb.append("} ");
			}
			if (item instanceof SetValue){
				sb.append("#SETVALUE# ");
			}
			index++;
		}
		if (this.index == currentRule.getBody().size()){
			sb.append("@");
		}
		return sb.toString();
	}
	
	/**
	 * 
	 */
	private EarleyState(Rule currentRule, int index, int position, List<IModelBuildStep> steps, int origin) {
		Assert.isNotNull(steps);
		this.currentRule = currentRule;
		
		this.index = index;
		this.position = position;
		this.steps = steps;
		this.origin = origin;
	}
	
	public boolean silent(){
		return isSilent(nextItem(currentRule, index));
	}
	
	public EarleyState consumeSilent(){
		if (silent()){
			RuleItem item = getNextItem();
			List<IModelBuildStep> steps = this.steps;
			if (item instanceof Pop){
				steps = new AppendedList<IModelBuildStep>(steps, new PopBuildStep(position));
			}else
			if (item instanceof Push){
				Push push = (Push)item;
				steps = new AppendedList<IModelBuildStep>(steps, new CreateObjectBuildStep(push.getEclassURI(), push.getFeatureName(), position));
			}else
			if (item instanceof SetValue){
				SetValue setValue = (SetValue)item;
				steps = new AppendedList<IModelBuildStep>(steps, new SetFeatureBuildStep(setValue.getFeatureName(), new StringValue(setValue.getValue()), position));
			}else{
				throw new RuntimeException("Unexpected silent element: "+item);
			}
			return new EarleyState(currentRule, index+1, position, steps, origin);
		}
		return null;
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
	
	public int getOrigin() {
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
		return getNextItem() instanceof TerminalItem;
	}
	
	public List<EarleyState> predict(int level, IGrammar grammar){
		RuleItem next = getNextItem();
		if (next instanceof NonTerminalItem){
			NonTerminalItem nonterm = (NonTerminalItem)next;
			
			List<EarleyState> predicted = new LinkedList<EarleyState>();
			
			if (nonterm.isOptional()){
				/* Skip prediction */
				predicted.add(new EarleyState(currentRule, index+1, position, steps, origin));
			}
			List<IModelBuildStep> steps = Collections.emptyList();
			
//			String featurename = nonterm.getFeatureName();
			
//			if (featurename != null){
//				steps = Collections.<IModelBuildStep>singletonList(new SetNextFeature(featurename));
//			}
			Collection<Rule> rules = grammar.getRule(((NonTerminalItem) next).getNonTerminal());
			
			for(Rule rule : rules){
				predicted.add(new EarleyState(rule, 0, position, steps, level));
			}
			return predicted;
		}
		return Collections.emptyList();
	}
	
	public List<EarleyState> complete(ParserTable table){
		if (completion() && origin != -1){
			List<EarleyState> completions = new LinkedList<EarleyState>();
			ParserLevel originLevel = table.get(origin);
			
			for(EarleyState p : originLevel.getStates()){
				if (p.prediction()){
					NonTerminalItem nonterm = ((NonTerminalItem)p.getNextItem());
					if ((nonterm.getNonTerminal().equals(currentRule.getNonTerminal()))){
						List<IModelBuildStep> parentSteps = p.steps;
						List<IModelBuildStep> childSteps = steps;
						
						if (nonterm.getFeatureName() != null){
							List<IModelBuildStep> setNextFeature = Collections.<IModelBuildStep>singletonList(new SetNextFeature(nonterm.getFeatureName())); 
							if (childSteps.isEmpty()){
								childSteps = setNextFeature;
							}else{
								childSteps = new ConcatenatedList<IModelBuildStep>(
									setNextFeature, 
									childSteps);
							}
						}
						
						List<IModelBuildStep> steps = null;
						if (parentSteps.isEmpty()){
							steps = childSteps;
						}else if (childSteps.isEmpty()){
							steps = parentSteps;
						}else{
							steps = new ConcatenatedList<IModelBuildStep>(parentSteps, childSteps);
						}
						
						
						
						completions.add(new EarleyState(p.getCurrentRule(), p.index+1, position, steps, p.origin));
						if (nonterm.isMany()){
							completions.add(new EarleyState(p.getCurrentRule(), p.index, position, steps, p.origin));
						}
					}
				}
				
			}
			
			return completions;
		}
		return Collections.emptyList();
	}
	
	public boolean isCompleted(){
		return completion() && origin == -1;
	}
	
	public List<EarleyState> scan(IParserInput input, IGrammar grammar){
		if (scanning()){
			RuleItem item = getNextItem();
			
			if (item instanceof TerminalItem){
				TerminalItem terminal = (TerminalItem)item;
				int position = input.bypassHidden(this.position);
				List<EarleyState> states = new LinkedList<EarleyState>();
				
				TerminalMatch match = input.match(terminal.getTerminal(), position);
				if (match != null){
				
					List<IModelBuildStep> steps = this.steps;
					String feature = terminal.getFeatureName();
					if (feature != null){
						steps = new AppendedList<IModelBuildStep>(steps, new SetFeatureBuildStep(feature, match, match.position));
					}
					
					int length = match.size;
					states.add(new EarleyState(currentRule, index+1, position+length, steps, origin));
					if (terminal.isMany()){
						states.add(new EarleyState(currentRule, index, position+length, steps, origin));
					}
					
				}else{
					if (terminal.isOptional()){
						states.add(new EarleyState(currentRule, index+1, position, steps, origin));
					}
				}
				
				return states;
			}
		}
		return Collections.emptyList();
	}
	
}
