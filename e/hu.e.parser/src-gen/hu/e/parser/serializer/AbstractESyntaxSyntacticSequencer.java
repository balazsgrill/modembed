package hu.e.parser.serializer;

import com.google.inject.Inject;
import hu.e.parser.services.ESyntaxGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractESyntaxSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ESyntaxGrammarAccess grammarAccess;
	protected AbstractElementAlias match_OperatorDefinition_CommaKeyword_5_q;
	protected AbstractElementAlias match_XStructExpression_CommaKeyword_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ESyntaxGrammarAccess) access;
		match_OperatorDefinition_CommaKeyword_5_q = new TokenAlias(false, true, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_5());
		match_XStructExpression_CommaKeyword_4_q = new TokenAlias(false, true, grammarAccess.getXStructExpressionAccess().getCommaKeyword_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_OperatorDefinition_CommaKeyword_5_q.equals(syntax))
				emit_OperatorDefinition_CommaKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_XStructExpression_CommaKeyword_4_q.equals(syntax))
				emit_XStructExpression_CommaKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_OperatorDefinition_CommaKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_XStructExpression_CommaKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
