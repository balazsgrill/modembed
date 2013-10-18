/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.syntax.Rule;
import hu.modembed.syntax.Terminal;

import java.util.Collection;

/**
 * @author balazs.grill
 *
 */
public interface IGrammar {

	public Collection<Terminal> terminals();
	
	public Collection<Rule> getRule(String nonTerminal);
	
}
