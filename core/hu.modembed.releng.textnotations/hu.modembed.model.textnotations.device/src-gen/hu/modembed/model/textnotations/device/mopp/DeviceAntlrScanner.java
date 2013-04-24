/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package hu.modembed.model.textnotations.device.mopp;

public class DeviceAntlrScanner implements hu.modembed.model.textnotations.device.IDeviceTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public DeviceAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public hu.modembed.model.textnotations.device.IDeviceTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		hu.modembed.model.textnotations.device.IDeviceTextToken result = new hu.modembed.model.textnotations.device.mopp.DeviceANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
