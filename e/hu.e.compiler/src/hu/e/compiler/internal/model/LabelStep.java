/**
 * 
 */
package hu.e.compiler.internal.model;

import hu.e.parser.eSyntax.Label;

/**
 * @author balazs.grill
 *
 */
public class LabelStep implements IProgramStep {

	public final Label label;
	
	public LabelStep(Label label) {
		this.label = label;
	}
	
}
