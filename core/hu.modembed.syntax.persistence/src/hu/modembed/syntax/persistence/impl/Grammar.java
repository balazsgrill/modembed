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
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 * @author balazs.grill
 *
 */
public class Grammar implements IGrammar {

	private final List<Terminal> terminals = new ArrayList<Terminal>();
	private final Map<String, List<Rule>> rules = new LinkedHashMap<String, List<Rule>>();
	
	private void process(SyntaxModel syntaxModel){
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
	}

	public Grammar(SyntaxModel syntaxModel) {
		Set<SyntaxModel> visited = new HashSet<SyntaxModel>();
		
		Queue<SyntaxModel> queue = new LinkedList<SyntaxModel>();
		queue.add(syntaxModel);
		while(!queue.isEmpty()){
			
			SyntaxModel sm = queue.poll();
			if (!visited.contains(sm)){
				visited.add(sm);
				process(sm);
				
				queue.addAll(sm.getImport());
			}
			
		}
		
		
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
