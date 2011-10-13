/*
* generated by Xtext
*/
package hu.e.parser.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import hu.e.parser.services.ESyntaxGrammarAccess;

public class ESyntaxParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ESyntaxGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected hu.e.parser.parser.antlr.internal.InternalESyntaxParser createParser(XtextTokenStream stream) {
		return new hu.e.parser.parser.antlr.internal.InternalESyntaxParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Package";
	}
	
	public ESyntaxGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ESyntaxGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}