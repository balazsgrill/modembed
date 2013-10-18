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
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author balazs.grill
 *
 */
public class StringInput implements IParserInput {

	private final Map<Terminal, Pattern> terminals = new LinkedHashMap<Terminal, Pattern>();
	private final Map<Terminal, Set<Terminal>> overrides = new HashMap<Terminal, Set<Terminal>>();
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
		for(Terminal terminal : terminals){
			Pattern p = this.terminals.get(terminal);
			Set<Terminal> list = new HashSet<Terminal>();
			if (p != null){
				for(Terminal t : terminals) if (!t.equals(terminal)){
					Matcher m = p.matcher(t.getRegex());
					if (m.lookingAt() && (m.end()-m.start()) == t.getRegex().length()){
						//t is a constant instance of terminal
						list.add(t);
					}
				}
			}
			if (!list.isEmpty()){
				overrides.put(terminal, list);
			}
		}
//		System.out.println("-------------------------");
//		for(Entry<Terminal, Set<Terminal>> o : overrides.entrySet()){
//			StringBuilder sb = new StringBuilder();
//			sb.append(o.getKey().getName());
//			sb.append(" -> ");
//			for(Terminal t : o.getValue()){
//				sb.append(t.getName());
//				sb.append(" ");
//			}
//			System.out.println(sb.toString());
//		}
//		System.out.println();
	}

	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IParserInput#length()
	 */
	@Override
	public int length() {
		return data.length();
	}

	private TerminalMatch doMatch(Terminal terminal, int index){
		Pattern pattern = terminals.get(terminal);
		if (pattern == null){
			throw new IllegalArgumentException("Terminal is unknown: "+terminal);
		}
		Matcher matcher = pattern.matcher(data);
		matcher.region(index, data.length());
		if (matcher.lookingAt()){
			int start = matcher.start();
			int end = matcher.end();
			if (start == index){
				return new TerminalMatch(terminal, this, start, end-start);
			}
		}
		return null;
	}
	
	/* (non-Javadoc)
	 * @see hu.modembed.syntax.persistence.IParserInput#match(hu.modembed.syntax.Terminal, int)
	 */
	@Override
	public TerminalMatch match(Terminal terminal, int index) {
		TerminalMatch match = doMatch(terminal, index);
		//Only allow match, if there is no other pattern can match a longer string
		if (match != null){
			Set<Terminal> overrides = this.overrides.get(terminal);
			int length = match.size;
			for(Terminal t : terminals.keySet()) if (!t.isHide() && !terminal.equals(t)){
				TerminalMatch other = doMatch(t, index);
				if (other != null){
					if (other.size > length) {
						return null;
					}
					if (other.size == length && overrides != null && overrides.contains(t)){
						return null;
					}
				}
			}
		}
		return match;
	}

	@Override
	public String substring(int begin, int end) {
		end = Math.min(end, data.length());
		return data.substring(begin, end);
	}
	
	private TerminalMatch matchHiddenTerminals(int index){
		TerminalMatch result = null;
		for(Terminal term : terminals.keySet()) if (term.isHide()){
			TerminalMatch match = doMatch(term, index);
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
		int line = 1;
		int last = 0;
		Pattern p = Pattern.compile("\n");
		Matcher m = p.matcher(data);
		while(m.find()){
			int pos = m.end();
			if (pos <= index){
				line++;
				last = pos;
			}
		}
		int column = index-last;
		return new int[]{line, column};
	}
	
}
