/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.syntax.Terminal;

/**
 * @author balazs.grill
 *
 */
public interface IParserInput {

	public int length();
	
	public TerminalMatch match(Terminal terminal, int position);
	
	public String substring(int begin, int end);
	
	public int bypassHidden(int position);
	
	public int[] getLineAndColumn(int position);
	
}
