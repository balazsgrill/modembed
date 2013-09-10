/**
 * 
 */
package hu.modembed.syntax.persistence.impl;

import hu.modembed.syntax.Terminal;
import hu.modembed.syntax.persistence.IParserContext;
import hu.modembed.syntax.persistence.IParserInput;
import hu.modembed.syntax.persistence.ParsingError;
import hu.modembed.syntax.persistence.TerminalMatch;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.Assert;

/**
 * @author balazs.grill
 *
 */
public class StringInput implements IParserInput {

	private final Map<Terminal, Pattern> terminals = new LinkedHashMap<Terminal, Pattern>();
	private final String data;
	
	/**
	 * 
	 */
	public StringInput(String data, Collection<Terminal> terminals, IParserContext context) {
		this.data = data;
		for(Terminal terminal : terminals){
			try{
				this.terminals.put(terminal, Pattern.compile(terminal.getRegex()));
			}catch(Exception e){
				context.logError(new ParsingError(e.getMessage(), ""));
			}
		}
	}

	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IParserInput#length()
	 */
	@Override
	public int length() {
		return data.length();
	}

	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IParserInput#match(hu.modembed.syntax.Terminal, int)
	 */
	@Override
	public TerminalMatch match(Terminal terminal, int index) {
		Pattern pattern = terminals.get(terminal);
		Assert.isNotNull(pattern, "Terminal is unknown: "+terminal);
		Matcher matcher = pattern.matcher(data);
		matcher.region(index, data.length());
		if (matcher.lookingAt()){
			int start = matcher.start();
			int end = matcher.end();
			if (start == index){
				return new TerminalMatch(terminal, data.substring(start, end), start, end-start);
			}
		}
		return null;
	}

	@Override
	public String substring(int begin, int end) {
		end = Math.min(end, data.length());
		return data.substring(begin, end);
	}
	
	private TerminalMatch matchHiddenTerminals(int index){
		TerminalMatch result = null;
		for(Terminal term : terminals.keySet()) if (term.isHide()){
			TerminalMatch match = match(term, index);
			if (match != null){
				if (result == null || result.size < match.size){
					result = match;
				}
			}
		}
		return result;
	}
	
	@Override
	public int bypassHidden(int position) {
		TerminalMatch match = null;
		int current = position;
		while((match = matchHiddenTerminals(current)) != null){
			current += match.size;
		}
		return current;
	}
	
	@Override
	public int[] getLineAndColumn(int index) {
		int line = 0;
		int last = 0;
		Pattern p = Pattern.compile("\n");
		Matcher m = p.matcher(data);
		while(m.find()){
			int pos = m.start();
			if (pos <= index){
				line++;
				last = pos;
			}
		}
		int column = index-last;
		return new int[]{line, column};
	}
	
}
