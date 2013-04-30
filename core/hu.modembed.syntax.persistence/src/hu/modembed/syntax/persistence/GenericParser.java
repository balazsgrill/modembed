/**
 * 
 */
package hu.modembed.syntax.persistence;

import hu.modembed.syntax.Rule;
import hu.modembed.syntax.SyntaxModel;
import hu.modembed.syntax.Terminal;
import hu.modembed.syntax.persistence.impl.DefaultFeatureResolver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author balazs.grill
 *
 */
public class GenericParser {
	
	private final Map<Terminal, Pattern> terminals = new LinkedHashMap<>();
	private final Map<String, List<Rule>> rules = new LinkedHashMap<>();
	private final String start;

	private final IFeatureResolver featureResolver = new DefaultFeatureResolver();
	
	public TerminalMatch matchHiddenTerminals(String data, int index){
		TerminalMatch result = null;
		for(Terminal term : terminals.keySet()) if (term.isHide()){
			TerminalMatch match = matchTerminal(term, data, index);
			if (match != null){
				if (result == null || result.match.length() < match.match.length()){
					result = match;
				}
			}
		}
		return result;
	}
	
	public IFeatureResolver getFeatureResolver() {
		return featureResolver;
	}
	
	public TerminalMatch matchTerminal(Terminal terminal, String data, int index){
		Pattern pattern = terminals.get(terminal);
		String input = data.substring(index);
		Matcher matcher = pattern.matcher(input);
		if (matcher.find()){
			int start = matcher.start();
			int end = matcher.end();
			if (start == 0){
				return new TerminalMatch(terminal, input.substring(start, end));
			}
		}
		return null;
	}
	
	public ParserState getStartState(String data, int index){
		return new ParserState(this, start, data, index);
	}
	
	public Collection<Rule> findRules(String nonTerminal){
		List<Rule> rules = this.rules.get(nonTerminal);
		if (rules == null){
			rules = Collections.emptyList();
		}
		return rules;
	}
	
	private void process(Set<SyntaxModel> visited, SyntaxModel syntaxModel){
		if (visited.contains(syntaxModel)) return;
		for(Terminal terminal : syntaxModel.getTerminals()){
			terminals.put(terminal, Pattern.compile("^"+terminal.getRegex()));
		}
		for(Rule rule : syntaxModel.getRules()){
			String nonterm = rule.getNonTerminal();
			List<Rule> ruleList = rules.get(nonterm);
			if (ruleList == null){
				ruleList = new ArrayList<>();
				rules.put(nonterm, ruleList);
			}
			ruleList.add(rule);
		}
		for(SyntaxModel sm : syntaxModel.getImport()){
			process(visited, sm);
		}
	}
	
	public GenericParser(SyntaxModel syntaxModel) {
		Set<SyntaxModel> visited = new HashSet<>();
		process(visited, syntaxModel);
		
		start = syntaxModel.getStartItem();
	}
	
}
