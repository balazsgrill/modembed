/**
 * 
 */
package hu.modembed.syntax.persistence.naive;

import hu.modembed.syntax.NonTerminalItem;
import hu.modembed.syntax.Pop;
import hu.modembed.syntax.Push;
import hu.modembed.syntax.Rule;
import hu.modembed.syntax.RuleItem;
import hu.modembed.syntax.SetValue;
import hu.modembed.syntax.SyntaxFactory;
import hu.modembed.syntax.SyntaxItem;
import hu.modembed.syntax.Terminal;
import hu.modembed.syntax.TerminalItem;
import hu.modembed.syntax.persistence.IParserInput;
import hu.modembed.syntax.persistence.StringValue;
import hu.modembed.syntax.persistence.TerminalMatch;
import hu.modembed.syntax.persistence.build.CreateObjectBuildStep;
import hu.modembed.syntax.persistence.build.IModelBuildStep;
import hu.modembed.syntax.persistence.build.PopBuildStep;
import hu.modembed.syntax.persistence.build.SetFeatureBuildStep;
import hu.modembed.syntax.persistence.build.SetNextFeature;
import hu.modembed.syntax.persistence.impl.AppendedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author balazs.grill
 *
 */
public class ParserState {
	
	private final GenericParser parser;
	private final IParserInput data;
	private final int index;
	private final List<RuleItem> grammarStack;
	private final List<IModelBuildStep> modelBuild;
	
	/**
	 * Apply rule to state
	 * @param parent
	 * @param rule
	 */
	private ParserState(GenericParser parser, IParserInput data, int index, List<RuleItem> grammarStack, List<IModelBuildStep> modelBuild){
		this.parser = parser;
		this.data = data;
		this.index = data.bypassHidden(index);
		this.grammarStack = grammarStack;
		this.modelBuild = modelBuild;
	}
	
	public List<IModelBuildStep> getModelBuild() {
		return modelBuild;
	}
	
	/**
	 * Remove first grammar item
	 * @return
	 */
	private ParserState removeFirst(){
		List<RuleItem> less = new ArrayList<RuleItem>(grammarStack.size()-1);
		for(int i=1;i<grammarStack.size();i++){
			less.add(grammarStack.get(i));
		}
		return new ParserState(parser, data, index, less, modelBuild);
	}
	
	public boolean shouldBeCut(){
		if (modelBuild.size() > index) return true;
		return false;
	}
	
	/**
	 * Add grammar items to the beginning of the grammar stack
	 * @param items
	 * @return
	 */
	private ParserState add(List<RuleItem> items){
		if (items.isEmpty()) return this;
		List<RuleItem> more = new ArrayList<RuleItem>(grammarStack.size()+items.size());
		more.addAll(items);
		more.addAll(grammarStack);
		return new ParserState(parser, data, index, more, modelBuild);
	}
	
	private ParserState match(TerminalItem terminal, TerminalMatch match){
		List<IModelBuildStep> steps = modelBuild;
		if (terminal.getFeatureName() != null){
			steps = new AppendedList<IModelBuildStep>(
					steps, new SetFeatureBuildStep(terminal.getFeatureName(), match));
		}
		int newindex = index+match.size;
		return new ParserState(parser, data, newindex, grammarStack, steps);
	}
	
	private ParserState addBuildStep(IModelBuildStep step){
		if (step == null) return this;
		List<IModelBuildStep> steps = new AppendedList<IModelBuildStep>(modelBuild, step);
		return new ParserState(parser, data, index, grammarStack, steps);
	}
	
	public ParserState(GenericParser parser, String start, IParserInput data, int index) {
		this.parser = parser;
		NonTerminalItem startItem = SyntaxFactory.eINSTANCE.createNonTerminalItem();
		startItem.setNonTerminal(start);
		startItem.setMany(false);
		startItem.setOptional(false);
		grammarStack = Collections.<RuleItem>singletonList(startItem);
		modelBuild = Collections.emptyList();
		this.data = data;
		this.index = index;
	}
	
	public boolean done(){
		return index == data.length() && grammarStack.isEmpty();
	}
	
	public String expectedItem(){
		RuleItem item = nextGrammarItem();
		if (item instanceof NonTerminalItem){
			return "<"+((NonTerminalItem) item).getNonTerminal()+">";
		}
		if (item instanceof TerminalItem){
			Terminal term = ((TerminalItem) item).getTerminal();
			if (term == null) return "[Unknown Terminal]";
			return term.getName()+"[\""+term.getRegex()+"\"]";
		}
		return "EOF";
	}
	
	public String followupText(int length){
		return data.substring(index, Math.min(index+length, data.length()));
	}
	
	public RuleItem nextGrammarItem(){
		if (grammarStack.isEmpty()) return null;
		return grammarStack.get(0);
	}
	
	public Collection<ParserState> getValidFollowingStates(){
		RuleItem grammarItem = nextGrammarItem();
		List<ParserState> followups = new LinkedList<ParserState>();
		if(grammarItem instanceof NonTerminalItem){
			// Non-terminal
			/* Replace first item with body */
			NonTerminalItem nonterm = (NonTerminalItem)grammarItem;
			ParserState removed = removeFirst();
			if (nonterm.isOptional()){
				followups.add(removed);
				// if optional: alternative 0 - just remove non-terminal
			}
			
			IModelBuildStep setNextFeature = null;
			if (nonterm.getFeatureName() != null){
				setNextFeature = new SetNextFeature(nonterm.getFeatureName());
			}
			for(Rule rule : parser.findRules(nonterm.getNonTerminal())){
				List<RuleItem> body = rule.getBody();
				followups.add(removed.addBuildStep(setNextFeature).add(body));
				if (nonterm.isMany()){
					followups.add(addBuildStep(setNextFeature).add(body));
					// if many: alternative 2 - apply rule, but don't remove non-terminal
				}
			}
			
		}
		if (grammarItem instanceof TerminalItem){
			// Terminal
			TerminalItem term = (TerminalItem)grammarItem;
			ParserState removed = removeFirst();
			if (term.isOptional()){
				followups.add(removed);
				// if optional: alternative 0 - just remove non-terminal
			}
			
			Terminal terminal = term.getTerminal();
			if (terminal != null){
				TerminalMatch match = data.match(terminal, index);
				if (match != null){
					followups.add(removed.match(term, match));
					if (term.isMany()){
						// if many: alternative 2 - apply rule, but don't remove non-terminal
						followups.add(match(term, match));
					}
				}
			}
		}
		if (grammarItem instanceof Push){
			Push push = (Push)grammarItem;
			//Push model
			followups.add(removeFirst().addBuildStep(new CreateObjectBuildStep(push.getEclassURI(), push.getFeatureName())));
		}
		if (grammarItem instanceof Pop){
			//Pop model
			followups.add(removeFirst().addBuildStep(new PopBuildStep()));
		}
		if (grammarItem instanceof SetValue){
			//Set value to constant
			String featureName = ((SetValue) grammarItem).getFeatureName();
			String value = ((SetValue) grammarItem).getValue();
			followups.add(removeFirst().addBuildStep(new SetFeatureBuildStep(featureName, new StringValue(value))));
		}
		
		return followups;
	}
	
	public int getIndex() {
		return index;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(index);sb.append("/");sb.append(data.length());
		sb.append(" [");
		boolean first = true;
		for(RuleItem item : grammarStack){
			if (first) first=false;
			else sb.append(", ");
			
			if (item instanceof SyntaxItem){
				if (item instanceof NonTerminalItem){
					sb.append(((NonTerminalItem) item).getNonTerminal());
				}
				if (item instanceof TerminalItem){
					sb.append(((TerminalItem) item).getTerminal().getName());
				}
				if (((SyntaxItem) item).isMany()){
					if (((SyntaxItem) item).isOptional()) sb.append("*");
					else sb.append("+");
				}else{
					if (((SyntaxItem) item).isOptional()) sb.append("?");
				}
			}
			if (item instanceof Push){
				sb.append("{");
				sb.append(((Push) item).getEclassURI());
				sb.append("}");
			}
			if (item instanceof Pop){
				sb.append("{}");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
}
