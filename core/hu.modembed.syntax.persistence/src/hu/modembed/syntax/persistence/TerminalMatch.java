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
public class TerminalMatch implements IStringValue{

	public final Terminal terminal;
	private final String match;
	public final int position;
	public final int size;
	
	public TerminalMatch(Terminal terminal, String match, int position, int size) {
		this.terminal = terminal;
		this.match = match;
		this.position = position;
		this.size = size;
	}
	
	@Override
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

	public String getMatch() {
		return match;
	}
	
	@Override
	public String getOriginalValue() {
		return match;
	}
	
}
