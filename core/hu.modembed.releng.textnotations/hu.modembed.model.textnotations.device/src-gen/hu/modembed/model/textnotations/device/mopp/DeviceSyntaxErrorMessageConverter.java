/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceSyntaxErrorMessageConverter {
	
	private String[] tokenNames;
	
	public DeviceSyntaxErrorMessageConverter(String[] tokenNames) {
		this.tokenNames = tokenNames;
	}
	
	/**
	 * Translates errors thrown by the lexer into human readable messages.
	 */
	public hu.modembed.model.textnotations.device.mopp.DeviceLocalizedMessage translateLexicalError(org.antlr.runtime3_4_0.RecognitionException e, java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions, java.util.List<Integer> lexerExceptionPositions)  {
		String message = getMessage(e);
		return new hu.modembed.model.textnotations.device.mopp.DeviceLocalizedMessage(message, e.charPositionInLine, e.line, lexerExceptionPositions.get(lexerExceptions.indexOf(e)), lexerExceptionPositions.get(lexerExceptions.indexOf(e)));
	}
	
	/**
	 * Translates errors thrown by the parser into human readable messages.
	 */
	public hu.modembed.model.textnotations.device.mopp.DeviceLocalizedMessage translateParseError(org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = getMessage(e);
		
		if (e.token instanceof org.antlr.runtime3_4_0.CommonToken) {
			org.antlr.runtime3_4_0.CommonToken ct = (org.antlr.runtime3_4_0.CommonToken) e.token;
			return new hu.modembed.model.textnotations.device.mopp.DeviceLocalizedMessage(message, ct.getCharPositionInLine(), ct.getLine(), ct.getStartIndex(), ct.getStopIndex());
		} else {
			int position = 1;
			int line = 1;
			if (e.token != null) {
				position = e.token.getCharPositionInLine();
				line = e.token.getLine();
			}
			return new hu.modembed.model.textnotations.device.mopp.DeviceLocalizedMessage(message, position, line, 1, 5);
		}
	}
	
	protected String getMessage(org.antlr.runtime3_4_0.RecognitionException e)  {
		String message = e.getMessage();
		if (e instanceof org.antlr.runtime3_4_0.MismatchedTokenException) {
			org.antlr.runtime3_4_0.MismatchedTokenException mte = (org.antlr.runtime3_4_0.MismatchedTokenException) e;
			String expectedTokenName = getTokenName(mte.expecting);
			message = "Syntax error on token \"" + toString(e.token) + "\" ";
			message += "Expected: \"" + expectedTokenName + "\".";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedTreeNodeException) {
			org.antlr.runtime3_4_0.MismatchedTreeNodeException mtne = (org.antlr.runtime3_4_0.MismatchedTreeNodeException) e;
			String expectedTokenName = getTokenName(mtne.expecting);
			String actualTokenName = getTokenName(mtne.getUnexpectedType());
			message = "Mismatched tree node: \"" + actualTokenName + "\". Expected: \"" + expectedTokenName + "\"";
		} else if (e instanceof org.antlr.runtime3_4_0.NoViableAltException) {
			message = "Syntax error on token \"" + toString(e.token) + "\". Check following tokens.";
		} else if (e instanceof org.antlr.runtime3_4_0.EarlyExitException) {
			message = "Syntax error on token \"" + toString(e.token) + "\". Delete this token.";
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedSetException) {
			org.antlr.runtime3_4_0.MismatchedSetException mse = (org.antlr.runtime3_4_0.MismatchedSetException) e;
			message = "Mismatched token: " + toString(e.token) + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedNotSetException) {
			org.antlr.runtime3_4_0.MismatchedNotSetException mse = (org.antlr.runtime3_4_0.MismatchedNotSetException) e;
			message = "Mismatched token: " +  toString(e.token) + "; expecting set " + mse.expecting;
		} else if (e instanceof org.antlr.runtime3_4_0.MismatchedRangeException) {
			message = "Mismatched token: " + toString(e.token) + "; expecting range";
		} else if (e instanceof org.antlr.runtime3_4_0.FailedPredicateException) {
			org.antlr.runtime3_4_0.FailedPredicateException fpe = (org.antlr.runtime3_4_0.FailedPredicateException) e;
			message = "Rule " + fpe.ruleName + " failed. Predicate: {" +  fpe.predicateText + "}?";
		}
		
		return message;
	}
	
	protected String toString(org.antlr.runtime3_4_0.Token token)  {
		if (token == null) {
			return "<UNKNOWN>";
		}
		
		StringBuilder result = new StringBuilder();
		String tokenName = getTokenName(token.getType());
		String tokenText = token.getText();
		result.append(tokenText);
		// We mention the name of the actual token only if it differs from the actual
		// token text to reduce confusion in error messages.
		if (tokenText != null && !tokenText.equals(tokenName)) {
			result.append(" (");
			result.append(tokenName);
			result.append(")");
		}
		return result.toString();
	}
	
	protected String getTokenName(int tokenType)  {
		String tokenName = "<unknown>";
		if (tokenType < 0) {
			tokenName = "EOF";
		} else {
			if (tokenType >= tokenNames.length) {
				return tokenName;
			}
			tokenName = tokenNames[tokenType];
			tokenName = hu.modembed.model.textnotations.device.util.DeviceStringUtil.formatTokenName(tokenName);
		}
		return tokenName;
	}
	
}
