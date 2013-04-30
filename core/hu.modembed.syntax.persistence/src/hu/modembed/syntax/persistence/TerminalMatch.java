/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.syntax.Terminal;

/**
 * @author balazs.grill
 *
 */
public class TerminalMatch {

	public final Terminal terminal;
	public final String match;
	
	public TerminalMatch(Terminal terminal, String match) {
		this.terminal = terminal;
		this.match = match;
	}
	
}
