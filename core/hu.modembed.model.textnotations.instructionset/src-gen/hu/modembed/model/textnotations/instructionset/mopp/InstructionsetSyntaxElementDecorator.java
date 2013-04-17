/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private InstructionsetSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public InstructionsetSyntaxElementDecorator(hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement decoratedElement, InstructionsetSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public hu.modembed.model.textnotations.instructionset.grammar.InstructionsetSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public InstructionsetSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
