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
import hu.modembed.syntax.persistence.IGrammar;
import hu.modembed.syntax.persistence.IParserInput;
import hu.modembed.syntax.persistence.StringValue;
import hu.modembed.syntax.persistence.build.CreateObjectBuildStep;
import hu.modembed.syntax.persistence.build.IModelBuildStep;
import hu.modembed.syntax.persistence.build.PopBuildStep;
import hu.modembed.syntax.persistence.build.SetFeatureBuildStep;
import hu.modembed.syntax.persistence.build.SetNextFeature;
import hu.modembed.syntax.persistence.impl.AppendedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
	
	/**
	 * 
	 */
	private EarleyState(Rule currentRule, int index, int position, List<IModelBuildStep> steps, EarleyState origin) {
		this.currentRule = currentRule;
		this.index = index;
		this.position = position;
		this.steps = steps;
		this.origin = origin;
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

	public RuleItem getNextItem(){
		final EList<RuleItem> body = currentRule.getBody();
		if (body.size() > index){
			return body.get(index);
		}
		return null;
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
			String featurename = ((NonTerminalItem) next).getFeatureName();
			List<IModelBuildStep> steps = this.steps;
			if (featurename != null){
				steps = new AppendedList<IModelBuildStep>(steps, new SetNextFeature(featurename));
			}
			Collection<Rule> rules = grammar.getRule(((NonTerminalItem) next).getNonTerminal());
			List<EarleyState> predicted = new ArrayList<EarleyState>(rules.size());
			for(Rule rule : rules){
				predicted.add(new EarleyState(rule, 0, position, steps, this));
			}
			return predicted;
		}
		return Collections.emptyList();
	}
	
	public EarleyState complete(){
		if (completion() && origin != null){
			return new EarleyState(origin.currentRule, origin.index+1, position, steps, origin.origin);
		}
		return null;
	}
	
	public boolean isCompleted(){
		return completion() && origin == null;
	}
	
	public List<EarleyState> scan(IParserInput input, IGrammar grammar){
		if (scanning()){
			RuleItem item = getNextItem();
			if (item instanceof Pop){
				return Collections.singletonList(
						new EarleyState(currentRule, index+1, position,
								new AppendedList<IModelBuildStep>(steps, new PopBuildStep())
								, origin)
						);
			}
			if (item instanceof Push){
				Push push = (Push)item;
				return Collections.singletonList(
						new EarleyState(currentRule, index+1, position,
								new AppendedList<IModelBuildStep>(steps, new CreateObjectBuildStep(push.getEclassURI(), push.getFeatureName()))
								, origin)
						);
			}
			if (item instanceof SetValue){
				SetValue setValue = (SetValue)item;
				return Collections.singletonList(
						new EarleyState(currentRule, index+1, position,
								new AppendedList<IModelBuildStep>(steps, new SetFeatureBuildStep(setValue.getFeatureName(), new StringValue(setValue.getValue())))
								, origin)
						);
			}
			if (item instanceof NonTerminalItem){
				
			}
		}
		return Collections.emptyList();
	}
	
}
