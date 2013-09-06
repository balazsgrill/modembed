/**
 * 
 */
package hu.modembed.syntax.persistence.impl;

import hu.modembed.syntax.Rule;
import hu.modembed.syntax.SyntaxModel;
import hu.modembed.syntax.Terminal;
import hu.modembed.syntax.persistence.IGrammar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class Grammar implements IGrammar {

	private final List<Terminal> terminals = new ArrayList<Terminal>();
	private final Map<String, List<Rule>> rules = new LinkedHashMap<String, List<Rule>>();
	
	private void process(Set<SyntaxModel> visited, SyntaxModel syntaxModel){

		if (visited.contains(syntaxModel)) return;
		for(Terminal terminal : syntaxModel.getTerminals()){
			terminals.add(terminal);
		}
		for(Rule rule : syntaxModel.getRules()){
			String nonterm = rule.getNonTerminal();
			List<Rule> ruleList = rules.get(nonterm);
			if (ruleList == null){
				ruleList = new ArrayList<Rule>();
				rules.put(nonterm, ruleList);
			}
			ruleList.add(rule);
		}
		for(SyntaxModel sm : syntaxModel.getImport()){
			process(visited, sm);
		}
	}

	public Grammar(SyntaxModel syntaxModel) {
		Set<SyntaxModel> visited = new HashSet<SyntaxModel>();
		process(visited, syntaxModel);
	}

	@Override
	public Collection<Terminal> terminals() {
		return terminals;
	}

	@Override
	public Collection<Rule> getRule(String nonTerminal) {
		List<Rule> r = rules.get(nonTerminal);
		return r == null ? Collections.<Rule>emptyList() : r;
	}

}
