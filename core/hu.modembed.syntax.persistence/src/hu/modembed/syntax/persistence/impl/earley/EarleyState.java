/**
 * 
 */
package hu.modembed.syntax.persistence.impl.earley;

import java.util.List;

import hu.modembed.syntax.Rule;
import hu.modembed.syntax.persistence.build.IModelBuildStep;

/**
 * @author balazs.grill
 *
 */
public class EarleyState {

	private final Rule currentRule;
	private final int index;
	private final int position;
	private final List<IModelBuildStep> steps;
	private final EarleyState origin;
	
	/**
	 * 
	 */
	public EarleyState(Rule currentRule, int index, int position, List<IModelBuildStep> steps, EarleyState origin) {
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

}
