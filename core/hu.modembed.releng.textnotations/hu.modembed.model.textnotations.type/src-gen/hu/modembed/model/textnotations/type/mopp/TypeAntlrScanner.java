/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.type.mopp;

public class TypeAntlrScanner implements hu.modembed.model.textnotations.type.ITypeTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public TypeAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public hu.modembed.model.textnotations.type.ITypeTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		hu.modembed.model.textnotations.type.ITypeTextToken result = new hu.modembed.model.textnotations.type.mopp.TypeANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
