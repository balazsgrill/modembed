/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetBracketInformationProvider {
	
	public class BracketPair implements hu.modembed.model.textnotations.instructionset.IInstructionsetBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetBracketPair> getBracketPairs() {
		java.util.Collection<hu.modembed.model.textnotations.instructionset.IInstructionsetBracketPair> result = new java.util.ArrayList<hu.modembed.model.textnotations.instructionset.IInstructionsetBracketPair>();
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("<", ">", true));
		return result;
	}
	
}
