/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.syntax.Replace;
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
	
	public String getProcessedValue(){
		String value = match;
		for(Replace r : terminal.getReplace()){
			String regex = r.getSearch();
			String replacement = r.getReplace();
			if (replacement == null) replacement= "";
			value = value.replaceAll(regex, replacement);
		}
		return value;
	}
	
}
