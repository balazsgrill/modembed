/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.instructionset.mopp;

public class InstructionsetAntlrScanner implements hu.modembed.model.textnotations.instructionset.IInstructionsetTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public InstructionsetAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		hu.modembed.model.textnotations.instructionset.IInstructionsetTextToken result = new hu.modembed.model.textnotations.instructionset.mopp.InstructionsetANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
