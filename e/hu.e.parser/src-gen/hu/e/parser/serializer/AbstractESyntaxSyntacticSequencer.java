package hu.e.parser.serializer;

import com.google.inject.Inject;
import hu.e.parser.services.ESyntaxGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractESyntaxSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ESyntaxGrammarAccess grammarAccess;
	protected AbstractElementAlias match_OperatorDefinition_CommaKeyword_5_q;
	protected AbstractElementAlias match_XStructExpression_CommaKeyword_4_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ESyntaxGrammarAccess) access;
		match_OperatorDefinition_CommaKeyword_5_q = new TokenAlias(true, false, grammarAccess.getOperatorDefinitionAccess().getCommaKeyword_5());
		match_XStructExpression_CommaKeyword_4_q = new TokenAlias(true, false, grammarAccess.getXStructExpressionAccess().getCommaKeyword_4());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getOpSingleAssignRule())
			return getOpSingleAssignToken(ruleCall, node);
		return "";
	}
	
	protected String getOpSingleAssignToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_OperatorDefinition_CommaKeyword_5_q.equals(transition.getAmbiguousSyntax()))
			emit_OperatorDefinition_CommaKeyword_5_q(semanticObject, transition, fromNode, toNode);
		else if(match_XStructExpression_CommaKeyword_4_q.equals(transition.getAmbiguousSyntax()))
			emit_XStructExpression_CommaKeyword_4_q(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_OperatorDefinition_CommaKeyword_5_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_XStructExpression_CommaKeyword_4_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
