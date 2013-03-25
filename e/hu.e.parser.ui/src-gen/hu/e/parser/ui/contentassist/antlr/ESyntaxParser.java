/*
* generated by Xtext
*/
package hu.e.parser.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import hu.e.parser.services.ESyntaxGrammarAccess;

public class ESyntaxParser extends AbstractContentAssistParser {
	
	@Inject
	private ESyntaxGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected hu.e.parser.ui.contentassist.antlr.internal.InternalESyntaxParser createParser() {
		hu.e.parser.ui.contentassist.antlr.internal.InternalESyntaxParser result = new hu.e.parser.ui.contentassist.antlr.internal.InternalESyntaxParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCompilationUnitAccess().getAlternatives(), "rule__CompilationUnit__Alternatives");
					put(grammarAccess.getLITERALAccess().getAlternatives(), "rule__LITERAL__Alternatives");
					put(grammarAccess.getWorkflowStepParameterNotationAccess().getAlternatives_2(), "rule__WorkflowStepParameterNotation__Alternatives_2");
					put(grammarAccess.getInsctructionSectionNotationAccess().getAlternatives_0(), "rule__InsctructionSectionNotation__Alternatives_0");
					put(grammarAccess.getLibraryItemAccess().getAlternatives(), "rule__LibraryItem__Alternatives");
					put(grammarAccess.getTypeDefAccess().getAlternatives(), "rule__TypeDef__Alternatives");
					put(grammarAccess.getDataTypeDefAccess().getAlternatives(), "rule__DataTypeDef__Alternatives");
					put(grammarAccess.getOperationStepAccess().getAlternatives(), "rule__OperationStep__Alternatives");
					put(grammarAccess.getVariableReferenceAccess().getAlternatives(), "rule__VariableReference__Alternatives");
					put(grammarAccess.getOperationParameterAccess().getAlternatives(), "rule__OperationParameter__Alternatives");
					put(grammarAccess.getXPrimaryExpressionAccess().getAlternatives(), "rule__XPrimaryExpression__Alternatives");
					put(grammarAccess.getXTopLevelExpressionAccess().getAlternatives(), "rule__XTopLevelExpression__Alternatives");
					put(grammarAccess.getIntegerKindAccess().getAlternatives(), "rule__IntegerKind__Alternatives");
					put(grammarAccess.getParameterKindAccess().getAlternatives(), "rule__ParameterKind__Alternatives");
					put(grammarAccess.getUNARY_OPERATORAccess().getAlternatives(), "rule__UNARY_OPERATOR__Alternatives");
					put(grammarAccess.getMULTIPLICATIVE_OPERATORAccess().getAlternatives(), "rule__MULTIPLICATIVE_OPERATOR__Alternatives");
					put(grammarAccess.getADDITIVE_OPERATORAccess().getAlternatives(), "rule__ADDITIVE_OPERATOR__Alternatives");
					put(grammarAccess.getEQUALITY_OPERATORAccess().getAlternatives(), "rule__EQUALITY_OPERATOR__Alternatives");
					put(grammarAccess.getBOOLEAN_OPERATORAccess().getAlternatives(), "rule__BOOLEAN_OPERATOR__Alternatives");
					put(grammarAccess.getErrorLevelsAccess().getAlternatives(), "rule__ErrorLevels__Alternatives");
					put(grammarAccess.getOpSingleAssignAccess().getAlternatives(), "rule__OpSingleAssign__Alternatives");
					put(grammarAccess.getLibraryNameAccess().getGroup(), "rule__LibraryName__Group__0");
					put(grammarAccess.getLibraryNameAccess().getGroup_1(), "rule__LibraryName__Group_1__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_0(), "rule__QualifiedName__Group_0__0");
					put(grammarAccess.getAnnotationDefinitionAccess().getGroup(), "rule__AnnotationDefinition__Group__0");
					put(grammarAccess.getAnnotationAccess().getGroup(), "rule__Annotation__Group__0");
					put(grammarAccess.getWorkflowNotationAccess().getGroup(), "rule__WorkflowNotation__Group__0");
					put(grammarAccess.getWorkflowStepNotationAccess().getGroup(), "rule__WorkflowStepNotation__Group__0");
					put(grammarAccess.getWorkflowStepParameterNotationAccess().getGroup(), "rule__WorkflowStepParameterNotation__Group__0");
					put(grammarAccess.getInstructionSetNotationAccess().getGroup(), "rule__InstructionSetNotation__Group__0");
					put(grammarAccess.getInstructionSetNotationAccess().getGroup_2(), "rule__InstructionSetNotation__Group_2__0");
					put(grammarAccess.getInstructionNotationAccess().getGroup(), "rule__InstructionNotation__Group__0");
					put(grammarAccess.getInstructionWordNotationAccess().getGroup(), "rule__InstructionWordNotation__Group__0");
					put(grammarAccess.getInstructionWordConditionNotationAccess().getGroup(), "rule__InstructionWordConditionNotation__Group__0");
					put(grammarAccess.getInstructionParameterNotationAccess().getGroup(), "rule__InstructionParameterNotation__Group__0");
					put(grammarAccess.getInstructionParameterNotationAccess().getGroup_1(), "rule__InstructionParameterNotation__Group_1__0");
					put(grammarAccess.getInsctructionSectionNotationAccess().getGroup(), "rule__InsctructionSectionNotation__Group__0");
					put(grammarAccess.getInsctructionSectionNotationAccess().getGroup_0_0(), "rule__InsctructionSectionNotation__Group_0_0__0");
					put(grammarAccess.getInsctructionSectionNotationAccess().getGroup_3(), "rule__InsctructionSectionNotation__Group_3__0");
					put(grammarAccess.getLibraryAccess().getGroup(), "rule__Library__Group__0");
					put(grammarAccess.getLibraryAccess().getGroup_3(), "rule__Library__Group_3__0");
					put(grammarAccess.getLibraryItemAccess().getGroup_2(), "rule__LibraryItem__Group_2__0");
					put(grammarAccess.getLibraryItemAccess().getGroup_3(), "rule__LibraryItem__Group_3__0");
					put(grammarAccess.getLibraryItemAccess().getGroup_4(), "rule__LibraryItem__Group_4__0");
					put(grammarAccess.getLibraryItemAccess().getGroup_5(), "rule__LibraryItem__Group_5__0");
					put(grammarAccess.getTypeAccess().getGroup(), "rule__Type__Group__0");
					put(grammarAccess.getUnspecifiedTypeDefAccess().getGroup(), "rule__UnspecifiedTypeDef__Group__0");
					put(grammarAccess.getPointerTypeDefAccess().getGroup(), "rule__PointerTypeDef__Group__0");
					put(grammarAccess.getArrayTypeDefAccess().getGroup(), "rule__ArrayTypeDef__Group__0");
					put(grammarAccess.getArrayTypeDefAccess().getGroup_4(), "rule__ArrayTypeDef__Group_4__0");
					put(grammarAccess.getLabelDataTypeDefAccess().getGroup(), "rule__LabelDataTypeDef__Group__0");
					put(grammarAccess.getFixedDataTypeDefAccess().getGroup(), "rule__FixedDataTypeDef__Group__0");
					put(grammarAccess.getIntegerDataTypeDefAccess().getGroup(), "rule__IntegerDataTypeDef__Group__0");
					put(grammarAccess.getStructTypeDefAccess().getGroup(), "rule__StructTypeDef__Group__0");
					put(grammarAccess.getStructTypeDefAccess().getGroup_4(), "rule__StructTypeDef__Group_4__0");
					put(grammarAccess.getStructTypeDefMemberAccess().getGroup(), "rule__StructTypeDefMember__Group__0");
					put(grammarAccess.getConstantVariableAccess().getGroup(), "rule__ConstantVariable__Group__0");
					put(grammarAccess.getRegisterVariableAccess().getGroup(), "rule__RegisterVariable__Group__0");
					put(grammarAccess.getOperationStepAccess().getGroup_0(), "rule__OperationStep__Group_0__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup(), "rule__OperationCall__Group__0");
					put(grammarAccess.getOperationCallAccess().getGroup_2(), "rule__OperationCall__Group_2__0");
					put(grammarAccess.getOperationCallAccess().getGroup_2_1(), "rule__OperationCall__Group_2_1__0");
					put(grammarAccess.getOperationTypeDefAccess().getGroup(), "rule__OperationTypeDef__Group__0");
					put(grammarAccess.getOperationTypeDefAccess().getGroup_2(), "rule__OperationTypeDef__Group_2__0");
					put(grammarAccess.getOperationTypeDefAccess().getGroup_2_1(), "rule__OperationTypeDef__Group_2_1__0");
					put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
					put(grammarAccess.getOperationAccess().getGroup_3(), "rule__Operation__Group_3__0");
					put(grammarAccess.getLazyParameterAccess().getGroup(), "rule__LazyParameter__Group__0");
					put(grammarAccess.getParameterVariableAccess().getGroup(), "rule__ParameterVariable__Group__0");
					put(grammarAccess.getParameterVariableAccess().getGroup_4(), "rule__ParameterVariable__Group_4__0");
					put(grammarAccess.getXExpressionAccess().getGroup(), "rule__XExpression__Group__0");
					put(grammarAccess.getXExpressionAccess().getGroup_1(), "rule__XExpression__Group_1__0");
					put(grammarAccess.getXExpressionBlockAccess().getGroup(), "rule__XExpressionBlock__Group__0");
					put(grammarAccess.getXSizeOfExpressionAccess().getGroup(), "rule__XSizeOfExpression__Group__0");
					put(grammarAccess.getXStructExpressionAccess().getGroup(), "rule__XStructExpression__Group__0");
					put(grammarAccess.getXStructExpressionAccess().getGroup_2(), "rule__XStructExpression__Group_2__0");
					put(grammarAccess.getXExpression1Access().getGroup(), "rule__XExpression1__Group__0");
					put(grammarAccess.getXExpression0Access().getGroup(), "rule__XExpression0__Group__0");
					put(grammarAccess.getXExpression0Access().getGroup_1(), "rule__XExpression0__Group_1__0");
					put(grammarAccess.getXExpressionM1Access().getGroup(), "rule__XExpressionM1__Group__0");
					put(grammarAccess.getXExpressionM1Access().getGroup_1(), "rule__XExpressionM1__Group_1__0");
					put(grammarAccess.getXExpression2Access().getGroup(), "rule__XExpression2__Group__0");
					put(grammarAccess.getXExpression2Access().getGroup_1(), "rule__XExpression2__Group_1__0");
					put(grammarAccess.getXExpression3Access().getGroup(), "rule__XExpression3__Group__0");
					put(grammarAccess.getXExpression3Access().getGroup_1(), "rule__XExpression3__Group_1__0");
					put(grammarAccess.getXExpression4Access().getGroup(), "rule__XExpression4__Group__0");
					put(grammarAccess.getXExpression4Access().getGroup_1(), "rule__XExpression4__Group_1__0");
					put(grammarAccess.getXExpression5Access().getGroup(), "rule__XExpression5__Group__0");
					put(grammarAccess.getXExpression5Access().getGroup_1(), "rule__XExpression5__Group_1__0");
					put(grammarAccess.getXExpression6Access().getGroup(), "rule__XExpression6__Group__0");
					put(grammarAccess.getXExpression6Access().getGroup_0(), "rule__XExpression6__Group_0__0");
					put(grammarAccess.getXTopLevelExpressionAccess().getGroup_0(), "rule__XTopLevelExpression__Group_0__0");
					put(grammarAccess.getXTopLevelExpressionAccess().getGroup_1(), "rule__XTopLevelExpression__Group_1__0");
					put(grammarAccess.getXTopLevelExpressionAccess().getGroup_2(), "rule__XTopLevelExpression__Group_2__0");
					put(grammarAccess.getXErrorExpressionAccess().getGroup(), "rule__XErrorExpression__Group__0");
					put(grammarAccess.getXIsLiteralExpressionAccess().getGroup(), "rule__XIsLiteralExpression__Group__0");
					put(grammarAccess.getXParenthesizedExpressionAccess().getGroup(), "rule__XParenthesizedExpression__Group__0");
					put(grammarAccess.getAnnotationDefinitionAccess().getNameAssignment_1(), "rule__AnnotationDefinition__NameAssignment_1");
					put(grammarAccess.getAnnotationAccess().getDefinitionAssignment_1(), "rule__Annotation__DefinitionAssignment_1");
					put(grammarAccess.getWorkflowNotationAccess().getNameAssignment_1(), "rule__WorkflowNotation__NameAssignment_1");
					put(grammarAccess.getWorkflowNotationAccess().getStepsAssignment_3(), "rule__WorkflowNotation__StepsAssignment_3");
					put(grammarAccess.getWorkflowStepNotationAccess().getTypeAssignment_0(), "rule__WorkflowStepNotation__TypeAssignment_0");
					put(grammarAccess.getWorkflowStepNotationAccess().getParamsAssignment_2(), "rule__WorkflowStepNotation__ParamsAssignment_2");
					put(grammarAccess.getWorkflowStepParameterNotationAccess().getParameterAssignment_0(), "rule__WorkflowStepParameterNotation__ParameterAssignment_0");
					put(grammarAccess.getWorkflowStepParameterNotationAccess().getValueAssignment_2_0(), "rule__WorkflowStepParameterNotation__ValueAssignment_2_0");
					put(grammarAccess.getWorkflowStepParameterNotationAccess().getValueAssignment_2_1(), "rule__WorkflowStepParameterNotation__ValueAssignment_2_1");
					put(grammarAccess.getInstructionSetNotationAccess().getNameAssignment_1(), "rule__InstructionSetNotation__NameAssignment_1");
					put(grammarAccess.getInstructionSetNotationAccess().getExtendsAssignment_2_1(), "rule__InstructionSetNotation__ExtendsAssignment_2_1");
					put(grammarAccess.getInstructionSetNotationAccess().getInstructionsAssignment_4(), "rule__InstructionSetNotation__InstructionsAssignment_4");
					put(grammarAccess.getInstructionNotationAccess().getNameAssignment_0(), "rule__InstructionNotation__NameAssignment_0");
					put(grammarAccess.getInstructionNotationAccess().getParamsAssignment_1(), "rule__InstructionNotation__ParamsAssignment_1");
					put(grammarAccess.getInstructionNotationAccess().getWordsAssignment_2(), "rule__InstructionNotation__WordsAssignment_2");
					put(grammarAccess.getInstructionWordNotationAccess().getSectionsAssignment_1(), "rule__InstructionWordNotation__SectionsAssignment_1");
					put(grammarAccess.getInstructionWordNotationAccess().getConditionsAssignment_3(), "rule__InstructionWordNotation__ConditionsAssignment_3");
					put(grammarAccess.getInstructionWordConditionNotationAccess().getParamAssignment_1(), "rule__InstructionWordConditionNotation__ParamAssignment_1");
					put(grammarAccess.getInstructionWordConditionNotationAccess().getMaskAssignment_3(), "rule__InstructionWordConditionNotation__MaskAssignment_3");
					put(grammarAccess.getInstructionWordConditionNotationAccess().getValueAssignment_5(), "rule__InstructionWordConditionNotation__ValueAssignment_5");
					put(grammarAccess.getInstructionParameterNotationAccess().getNameAssignment_0(), "rule__InstructionParameterNotation__NameAssignment_0");
					put(grammarAccess.getInstructionParameterNotationAccess().getDefaultAssignment_1_1(), "rule__InstructionParameterNotation__DefaultAssignment_1_1");
					put(grammarAccess.getInsctructionSectionNotationAccess().getParamAssignment_0_0_1(), "rule__InsctructionSectionNotation__ParamAssignment_0_0_1");
					put(grammarAccess.getInsctructionSectionNotationAccess().getValueAssignment_0_1(), "rule__InsctructionSectionNotation__ValueAssignment_0_1");
					put(grammarAccess.getInsctructionSectionNotationAccess().getSizeAssignment_2(), "rule__InsctructionSectionNotation__SizeAssignment_2");
					put(grammarAccess.getInsctructionSectionNotationAccess().getShiftAssignment_3_1(), "rule__InsctructionSectionNotation__ShiftAssignment_3_1");
					put(grammarAccess.getLibraryAccess().getNameAssignment_1(), "rule__Library__NameAssignment_1");
					put(grammarAccess.getLibraryAccess().getUseAssignment_3_1(), "rule__Library__UseAssignment_3_1");
					put(grammarAccess.getLibraryAccess().getItemsAssignment_4(), "rule__Library__ItemsAssignment_4");
					put(grammarAccess.getTypeAccess().getNameAssignment_1(), "rule__Type__NameAssignment_1");
					put(grammarAccess.getTypeAccess().getDefAssignment_3(), "rule__Type__DefAssignment_3");
					put(grammarAccess.getPointerTypeDefAccess().getDefAssignment_2(), "rule__PointerTypeDef__DefAssignment_2");
					put(grammarAccess.getArrayTypeDefAccess().getDefAssignment_2(), "rule__ArrayTypeDef__DefAssignment_2");
					put(grammarAccess.getArrayTypeDefAccess().getSizeAssignment_4_1(), "rule__ArrayTypeDef__SizeAssignment_4_1");
					put(grammarAccess.getRefTypeDefAccess().getTypeAssignment(), "rule__RefTypeDef__TypeAssignment");
					put(grammarAccess.getFixedDataTypeDefAccess().getBitsAssignment_1(), "rule__FixedDataTypeDef__BitsAssignment_1");
					put(grammarAccess.getFixedDataTypeDefAccess().getScaleAssignment_5(), "rule__FixedDataTypeDef__ScaleAssignment_5");
					put(grammarAccess.getIntegerDataTypeDefAccess().getKindAssignment_0(), "rule__IntegerDataTypeDef__KindAssignment_0");
					put(grammarAccess.getIntegerDataTypeDefAccess().getBitsAssignment_1(), "rule__IntegerDataTypeDef__BitsAssignment_1");
					put(grammarAccess.getStructTypeDefAccess().getMembersAssignment_3(), "rule__StructTypeDef__MembersAssignment_3");
					put(grammarAccess.getStructTypeDefAccess().getMembersAssignment_4_1(), "rule__StructTypeDef__MembersAssignment_4_1");
					put(grammarAccess.getStructTypeDefMemberAccess().getTypeAssignment_1(), "rule__StructTypeDefMember__TypeAssignment_1");
					put(grammarAccess.getStructTypeDefMemberAccess().getNameAssignment_2(), "rule__StructTypeDefMember__NameAssignment_2");
					put(grammarAccess.getConstantVariableAccess().getTypeAssignment_2(), "rule__ConstantVariable__TypeAssignment_2");
					put(grammarAccess.getConstantVariableAccess().getNameAssignment_3(), "rule__ConstantVariable__NameAssignment_3");
					put(grammarAccess.getConstantVariableAccess().getValueAssignment_5(), "rule__ConstantVariable__ValueAssignment_5");
					put(grammarAccess.getRegisterVariableAccess().getTypeAssignment_2(), "rule__RegisterVariable__TypeAssignment_2");
					put(grammarAccess.getRegisterVariableAccess().getNameAssignment_3(), "rule__RegisterVariable__NameAssignment_3");
					put(grammarAccess.getRegisterVariableAccess().getAddrAssignment_5(), "rule__RegisterVariable__AddrAssignment_5");
					put(grammarAccess.getVariableAccess().getTypeAssignment_0(), "rule__Variable__TypeAssignment_0");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
					put(grammarAccess.getVariableReferenceAccess().getVarAssignment_0(), "rule__VariableReference__VarAssignment_0");
					put(grammarAccess.getVariableReferenceAccess().getVarAssignment_1(), "rule__VariableReference__VarAssignment_1");
					put(grammarAccess.getOperationCallAccess().getOperationAssignment_0(), "rule__OperationCall__OperationAssignment_0");
					put(grammarAccess.getOperationCallAccess().getParamsAssignment_2_0(), "rule__OperationCall__ParamsAssignment_2_0");
					put(grammarAccess.getOperationCallAccess().getParamsAssignment_2_1_1(), "rule__OperationCall__ParamsAssignment_2_1_1");
					put(grammarAccess.getOperationTypeDefAccess().getResultTypeAssignment_0(), "rule__OperationTypeDef__ResultTypeAssignment_0");
					put(grammarAccess.getOperationTypeDefAccess().getParamsAssignment_2_0(), "rule__OperationTypeDef__ParamsAssignment_2_0");
					put(grammarAccess.getOperationTypeDefAccess().getParamsAssignment_2_1_1(), "rule__OperationTypeDef__ParamsAssignment_2_1_1");
					put(grammarAccess.getOperationAccess().getNameAssignment_1(), "rule__Operation__NameAssignment_1");
					put(grammarAccess.getOperationAccess().getTypeAssignment_2(), "rule__Operation__TypeAssignment_2");
					put(grammarAccess.getOperationAccess().getOverridesAssignment_3_1(), "rule__Operation__OverridesAssignment_3_1");
					put(grammarAccess.getOperationAccess().getContentAssignment_4(), "rule__Operation__ContentAssignment_4");
					put(grammarAccess.getLazyParameterAccess().getParamnameAssignment_1(), "rule__LazyParameter__ParamnameAssignment_1");
					put(grammarAccess.getLazyParameterAccess().getTypeAssignment_2(), "rule__LazyParameter__TypeAssignment_2");
					put(grammarAccess.getParameterVariableAccess().getKindAssignment_1(), "rule__ParameterVariable__KindAssignment_1");
					put(grammarAccess.getParameterVariableAccess().getTypeAssignment_2(), "rule__ParameterVariable__TypeAssignment_2");
					put(grammarAccess.getParameterVariableAccess().getNameAssignment_3(), "rule__ParameterVariable__NameAssignment_3");
					put(grammarAccess.getParameterVariableAccess().getDefaultAssignment_4_1(), "rule__ParameterVariable__DefaultAssignment_4_1");
					put(grammarAccess.getXExpressionAccess().getTypeAssignment_1_1(), "rule__XExpression__TypeAssignment_1_1");
					put(grammarAccess.getXExpressionBlockAccess().getStepsAssignment_2(), "rule__XExpressionBlock__StepsAssignment_2");
					put(grammarAccess.getXSizeOfExpressionAccess().getTypeAssignment_2(), "rule__XSizeOfExpression__TypeAssignment_2");
					put(grammarAccess.getXStructExpressionAccess().getValuesAssignment_1(), "rule__XStructExpression__ValuesAssignment_1");
					put(grammarAccess.getXStructExpressionAccess().getValuesAssignment_2_1(), "rule__XStructExpression__ValuesAssignment_2_1");
					put(grammarAccess.getXExpression1Access().getOperatorAssignment_0(), "rule__XExpression1__OperatorAssignment_0");
					put(grammarAccess.getXExpression1Access().getAAssignment_1(), "rule__XExpression1__AAssignment_1");
					put(grammarAccess.getXExpression0Access().getAAssignment_0(), "rule__XExpression0__AAssignment_0");
					put(grammarAccess.getXExpression0Access().getMemberAssignment_1_1(), "rule__XExpression0__MemberAssignment_1_1");
					put(grammarAccess.getXExpressionM1Access().getAAssignment_0(), "rule__XExpressionM1__AAssignment_0");
					put(grammarAccess.getXExpressionM1Access().getIndexAssignment_1_1(), "rule__XExpressionM1__IndexAssignment_1_1");
					put(grammarAccess.getXExpression2Access().getAAssignment_0(), "rule__XExpression2__AAssignment_0");
					put(grammarAccess.getXExpression2Access().getOpAssignment_1_0(), "rule__XExpression2__OpAssignment_1_0");
					put(grammarAccess.getXExpression2Access().getBAssignment_1_1(), "rule__XExpression2__BAssignment_1_1");
					put(grammarAccess.getXExpression3Access().getAAssignment_0(), "rule__XExpression3__AAssignment_0");
					put(grammarAccess.getXExpression3Access().getOpAssignment_1_0(), "rule__XExpression3__OpAssignment_1_0");
					put(grammarAccess.getXExpression3Access().getBAssignment_1_1(), "rule__XExpression3__BAssignment_1_1");
					put(grammarAccess.getXExpression4Access().getAAssignment_0(), "rule__XExpression4__AAssignment_0");
					put(grammarAccess.getXExpression4Access().getOpAssignment_1_0(), "rule__XExpression4__OpAssignment_1_0");
					put(grammarAccess.getXExpression4Access().getBAssignment_1_1(), "rule__XExpression4__BAssignment_1_1");
					put(grammarAccess.getXExpression5Access().getAAssignment_0(), "rule__XExpression5__AAssignment_0");
					put(grammarAccess.getXExpression5Access().getOpAssignment_1_0(), "rule__XExpression5__OpAssignment_1_0");
					put(grammarAccess.getXExpression5Access().getBAssignment_1_1(), "rule__XExpression5__BAssignment_1_1");
					put(grammarAccess.getXExpression6Access().getRefAssignment_0_0(), "rule__XExpression6__RefAssignment_0_0");
					put(grammarAccess.getXExpression6Access().getOpAssignment_0_1(), "rule__XExpression6__OpAssignment_0_1");
					put(grammarAccess.getXExpression6Access().getAAssignment_1(), "rule__XExpression6__AAssignment_1");
					put(grammarAccess.getXExpressionLiteralAccess().getValueAssignment(), "rule__XExpressionLiteral__ValueAssignment");
					put(grammarAccess.getXErrorExpressionAccess().getLevelAssignment_0(), "rule__XErrorExpression__LevelAssignment_0");
					put(grammarAccess.getXErrorExpressionAccess().getMsgAssignment_1(), "rule__XErrorExpression__MsgAssignment_1");
					put(grammarAccess.getXIsLiteralExpressionAccess().getRefAssignment_2(), "rule__XIsLiteralExpression__RefAssignment_2");
					put(grammarAccess.getXParenthesizedExpressionAccess().getAAssignment_1(), "rule__XParenthesizedExpression__AAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			hu.e.parser.ui.contentassist.antlr.internal.InternalESyntaxParser typedParser = (hu.e.parser.ui.contentassist.antlr.internal.InternalESyntaxParser) parser;
			typedParser.entryRuleCompilationUnit();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ESyntaxGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ESyntaxGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
