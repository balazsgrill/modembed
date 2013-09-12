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
	public final IParserInput input;
	
	public TerminalMatch(Terminal terminal, IParserInput input, int position, int size) {
		this.terminal = terminal;
		this.match = input.substring(position, position+size);
		this.position = position;
		this.size = size;
		this.input = input;
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

	@Override
	public int[] getLineAndColumn() {
		return input.getLineAndColumn(position);
	}
	
}
