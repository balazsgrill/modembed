package hu.e.parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.e.parser.eSyntax.ArrayRef;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.CompileContextVariable;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.LabelReference;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.LiteralValue;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperatorDefinition;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.ReferenceBinarySection;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.StructRef;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.XAddressOfVar;
import hu.e.parser.eSyntax.XAssignment;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;
import hu.e.parser.eSyntax.XExpression3;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;
import hu.e.parser.eSyntax.XExpressionLiteral;
import hu.e.parser.eSyntax.XIfExpression;
import hu.e.parser.eSyntax.XIsLiteralExpression;
import hu.e.parser.eSyntax.XParenthesizedExpression;
import hu.e.parser.eSyntax.XSizeOfExpression;
import hu.e.parser.eSyntax.XStructExpression;
import hu.e.parser.services.ESyntaxGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractESyntaxSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected ESyntaxGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ESyntaxPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ESyntaxPackage.ARRAY_REF:
				if(context == grammarAccess.getVariableRefSectionRule() ||
				   context == grammarAccess.getArrayRefRule()) {
					sequence_ArrayRef_ArrayRef(context, (ArrayRef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.ARRAY_TYPE_DEF:
				if(context == grammarAccess.getTypeDefRule() ||
				   context == grammarAccess.getArrayTypeDefRule()) {
					sequence_ArrayTypeDef_ArrayTypeDef(context, (ArrayTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.COMPILE_CONTEXT_VARIABLE:
				if(context == grammarAccess.getTopLevelItemRule() ||
				   context == grammarAccess.getCompileContextVariableRule()) {
					sequence_CompileContextVariable_CompileContextVariable(context, (CompileContextVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.CONSTANT_BINARY_SECTION:
				if(context == grammarAccess.getBinarySectionRule()) {
					sequence_BinarySection_ConstantBinarySection(context, (ConstantBinarySection) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstantBinarySectionRule()) {
					sequence_ConstantBinarySection_ConstantBinarySection(context, (ConstantBinarySection) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.CONSTANT_VARIABLE:
				if(context == grammarAccess.getTopLevelItemRule() ||
				   context == grammarAccess.getConstantVariableRule()) {
					sequence_ConstantVariable_ConstantVariable(context, (ConstantVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.DATA_TYPE_DEF:
				if(context == grammarAccess.getTypeDefRule() ||
				   context == grammarAccess.getDataTypeDefRule()) {
					sequence_DataTypeDef_DataTypeDef(context, (DataTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.FUNCTION_BINARY_SECTION:
				if(context == grammarAccess.getBinarySectionRule()) {
					sequence_BinarySection_FunctionBinarySection(context, (FunctionBinarySection) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunctionBinarySectionRule()) {
					sequence_FunctionBinarySection_FunctionBinarySection(context, (FunctionBinarySection) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.FUNCTION_MEMORY:
				if(context == grammarAccess.getFunctionMemoryRule()) {
					sequence_FunctionMemory_FunctionMemory(context, (FunctionMemory) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSTRUCTION_WORD:
				if(context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getInstructionWordRule()) {
					sequence_InstructionWord_InstructionWord(context, (InstructionWord) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LABEL:
				if(context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getLabelRule()) {
					sequence_Label_Label(context, (Label) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LABEL_REFERENCE:
				if(context == grammarAccess.getLabelReferenceRule() ||
				   context == grammarAccess.getOperationCallParameterRule()) {
					sequence_LabelReference_LabelReference(context, (LabelReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getWordSectionRule()) {
					sequence_WordSection_LabelReference(context, (LabelReference) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LINKED_BINARY:
				if(context == grammarAccess.getTopLevelItemRule() ||
				   context == grammarAccess.getLinkedBinaryRule()) {
					sequence_LinkedBinary_LinkedBinary(context, (LinkedBinary) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LITERAL_VALUE:
				if(context == grammarAccess.getWordSectionRule()) {
					sequence_WordSection_LiteralValue(context, (LiteralValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue_LiteralValue(context, (LiteralValue) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION:
				if(context == grammarAccess.getTopLevelItemRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_Operation_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION_BLOCK:
				if(context == grammarAccess.getOperationBlockRule()) {
					sequence_OperationBlock_OperationBlock(context, (OperationBlock) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION_CALL:
				if(context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getOperationCallRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_OperationCall_OperationCall(context, (OperationCall) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATOR_DEFINITION:
				if(context == grammarAccess.getTopLevelItemRule() ||
				   context == grammarAccess.getOperatorDefinitionRule()) {
					sequence_OperatorDefinition_OperatorDefinition(context, (OperatorDefinition) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package_Package(context, (hu.e.parser.eSyntax.Package) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.PARAMETER_VARIABLE:
				if(context == grammarAccess.getParameterVariableRule()) {
					sequence_ParameterVariable_ParameterVariable(context, (ParameterVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.REFERENCE_BINARY_SECTION:
				if(context == grammarAccess.getReferenceBinarySectionRule()) {
					sequence_ReferenceBinarySection_ReferenceBinarySection(context, (ReferenceBinarySection) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBinarySectionRule()) {
					sequence_BinarySection_ReferenceBinarySection(context, (ReferenceBinarySection) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.REGISTER_VARIABLE:
				if(context == grammarAccess.getTopLevelItemRule() ||
				   context == grammarAccess.getRegisterVariableRule()) {
					sequence_RegisterVariable_RegisterVariable(context, (RegisterVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.STRUCT_REF:
				if(context == grammarAccess.getVariableRefSectionRule() ||
				   context == grammarAccess.getStructRefRule()) {
					sequence_StructRef_StructRef(context, (StructRef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.STRUCT_TYPE_DEF:
				if(context == grammarAccess.getTypeDefRule() ||
				   context == grammarAccess.getStructTypeDefRule()) {
					sequence_StructTypeDef_StructTypeDef(context, (StructTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.STRUCT_TYPE_DEF_MEMBER:
				if(context == grammarAccess.getStructTypeDefMemberRule()) {
					sequence_StructTypeDefMember_StructTypeDefMember(context, (StructTypeDefMember) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.TYPE:
				if(context == grammarAccess.getTopLevelItemRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.VARIABLE:
				if(context == grammarAccess.getTopLevelItemRule() ||
				   context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getWordSectionRule()) {
					sequence_WordSection_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getVariableReferenceRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_VariableReference_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XADDRESS_OF_VAR:
				if(context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXAddressOfVarRule()) {
					sequence_XAddressOfVar_XAddressOfVar(context, (XAddressOfVar) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XASSIGNMENT:
				if(context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getXTopLevelExpressionRule() ||
				   context == grammarAccess.getXAssignmentRule()) {
					sequence_XAssignment_XAssignment(context, (XAssignment) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION1:
				if(context == grammarAccess.getXExpression1Rule()) {
					sequence_XExpression1_XExpression1(context, (XExpression1) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION2:
				if(context == grammarAccess.getXExpression2Rule()) {
					sequence_XExpression2_XExpression2(context, (XExpression2) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION3:
				if(context == grammarAccess.getXExpression3Rule()) {
					sequence_XExpression3_XExpression3(context, (XExpression3) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION4:
				if(context == grammarAccess.getXExpression4Rule()) {
					sequence_XExpression4_XExpression4(context, (XExpression4) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION5:
				if(context == grammarAccess.getOperationCallParameterRule() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpression5Rule()) {
					sequence_XExpression5_XExpression5(context, (XExpression5) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION_LITERAL:
				if(context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXExpressionLiteralRule()) {
					sequence_XExpressionLiteral_XExpressionLiteral(context, (XExpressionLiteral) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XIF_EXPRESSION:
				if(context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getXTopLevelExpressionRule() ||
				   context == grammarAccess.getXIfExpressionRule()) {
					sequence_XIfExpression_XIfExpression(context, (XIfExpression) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XIS_LITERAL_EXPRESSION:
				if(context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXIsLiteralExpressionRule()) {
					sequence_XIsLiteralExpression_XIsLiteralExpression(context, (XIsLiteralExpression) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XPARENTHESIZED_EXPRESSION:
				if(context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXParenthesizedExpressionRule()) {
					sequence_XParenthesizedExpression_XParenthesizedExpression(context, (XParenthesizedExpression) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XSIZE_OF_EXPRESSION:
				if(context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXSizeOfExpressionRule()) {
					sequence_XSizeOfExpression_XSizeOfExpression(context, (XSizeOfExpression) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XSTRUCT_EXPRESSION:
				if(context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXStructExpressionRule()) {
					sequence_XStructExpression_XStructExpression(context, (XStructExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     v=XExpression
	 *
	 * Features:
	 *    v[1, 1]
	 */
	protected void sequence_ArrayRef_ArrayRef(EObject context, ArrayRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.ARRAY_REF__V) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.ARRAY_REF__V));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayRefAccess().getVXExpressionParserRuleCall_1_0(), semanticObject.getV());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|QualifiedName] length=XExpression)
	 *
	 * Features:
	 *    type[1, 1]
	 *    length[1, 1]
	 */
	protected void sequence_ArrayTypeDef_ArrayTypeDef(EObject context, ArrayTypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.ARRAY_TYPE_DEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.ARRAY_TYPE_DEF__TYPE));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.ARRAY_TYPE_DEF__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.ARRAY_TYPE_DEF__LENGTH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayTypeDefAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getArrayTypeDefAccess().getLengthXExpressionParserRuleCall_2_0(), semanticObject.getLength());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (data+=XExpression+ start=XExpression)
	 *
	 * Features:
	 *    start[1, 1]
	 *    data[1, *]
	 */
	protected void sequence_BinarySection_ConstantBinarySection(EObject context, ConstantBinarySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operation=[Operation|QualifiedName] memwidth=LITERAL mems+=FunctionMemory+ start=XExpression)
	 *
	 * Features:
	 *    start[1, 1]
	 *    operation[1, 1]
	 *    memwidth[1, 1]
	 *    mems[1, *]
	 */
	protected void sequence_BinarySection_FunctionBinarySection(EObject context, FunctionBinarySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (inc=[LinkedBinary|QualifiedName] start=XExpression)
	 *
	 * Features:
	 *    start[1, 1]
	 *    inc[1, 1]
	 */
	protected void sequence_BinarySection_ReferenceBinarySection(EObject context, ReferenceBinarySection semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.BINARY_SECTION__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.BINARY_SECTION__START));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.REFERENCE_BINARY_SECTION__INC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.REFERENCE_BINARY_SECTION__INC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceBinarySectionAccess().getIncLinkedBinaryQualifiedNameParserRuleCall_1_0_1(), semanticObject.getInc());
		feeder.accept(grammarAccess.getBinarySectionAccess().getStartXExpressionParserRuleCall_2_0(), semanticObject.getStart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=XExpression?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    value[0, 1]
	 */
	protected void sequence_CompileContextVariable_CompileContextVariable(EObject context, CompileContextVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     data+=XExpression+
	 *
	 * Features:
	 *    data[1, *]
	 */
	protected void sequence_ConstantBinarySection_ConstantBinarySection(EObject context, ConstantBinarySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|QualifiedName] name=ID value=XExpression)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_ConstantVariable_ConstantVariable(EObject context, ConstantVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.CONSTANT_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.CONSTANT_VARIABLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantVariableAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getConstantVariableAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantVariableAccess().getValueXExpressionParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (kind=PrimitiveKind bits=INT)
	 *
	 * Features:
	 *    kind[1, 1]
	 *    bits[1, 1]
	 */
	protected void sequence_DataTypeDef_DataTypeDef(EObject context, DataTypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.DATA_TYPE_DEF__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.DATA_TYPE_DEF__KIND));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.DATA_TYPE_DEF__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.DATA_TYPE_DEF__BITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeDefAccess().getKindPrimitiveKindEnumRuleCall_0_0(), semanticObject.getKind());
		feeder.accept(grammarAccess.getDataTypeDefAccess().getBitsINTTerminalRuleCall_1_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operation=[Operation|QualifiedName] memwidth=LITERAL mems+=FunctionMemory+)
	 *
	 * Features:
	 *    operation[1, 1]
	 *    memwidth[1, 1]
	 *    mems[1, *]
	 */
	protected void sequence_FunctionBinarySection_FunctionBinarySection(EObject context, FunctionBinarySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (start=LITERAL end=LITERAL)
	 *
	 * Features:
	 *    start[1, 1]
	 *    end[1, 1]
	 */
	protected void sequence_FunctionMemory_FunctionMemory(EObject context, FunctionMemory semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.FUNCTION_MEMORY__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.FUNCTION_MEMORY__START));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.FUNCTION_MEMORY__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.FUNCTION_MEMORY__END));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionMemoryAccess().getStartLITERALParserRuleCall_1_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getFunctionMemoryAccess().getEndLITERALParserRuleCall_3_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     sections+=WordSection+
	 *
	 * Features:
	 *    sections[1, *]
	 */
	protected void sequence_InstructionWord_InstructionWord(EObject context, InstructionWord semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     label=[Label|ID]
	 *
	 * Features:
	 *    label[1, 1]
	 */
	protected void sequence_LabelReference_LabelReference(EObject context, LabelReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Label_Label(EObject context, Label semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LABEL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LABEL__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=BinaryType? sections+=BinarySection*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[0, 1]
	 *    sections[0, *]
	 */
	protected void sequence_LinkedBinary_LinkedBinary(EObject context, LinkedBinary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=LITERAL
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_LiteralValue_LiteralValue(EObject context, LiteralValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (steps+=OperationStep*)
	 *
	 * Features:
	 *    steps[0, *]
	 */
	protected void sequence_OperationBlock_OperationBlock(EObject context, OperationBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operation=[Operation|QualifiedName] (params+=OperationCallParameter params+=OperationCallParameter*)?)
	 *
	 * Features:
	 *    operation[1, 1]
	 *    params[0, *]
	 */
	protected void sequence_OperationCall_OperationCall(EObject context, OperationCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (params+=ParameterVariable params+=ParameterVariable*)? block=OperationBlock (return=XExpression | returnvar=Variable)?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    params[0, *]
	 *    block[1, 1]
	 *    return[0, 1]
	 *         EXCLUDE_IF_SET returnvar
	 *    returnvar[0, 1]
	 *         EXCLUDE_IF_SET return
	 */
	protected void sequence_Operation_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (role=OperationRole candidate+=[Operation|QualifiedName] candidate+=[Operation|QualifiedName]*)
	 *
	 * Features:
	 *    role[1, 1]
	 *    candidate[1, *]
	 */
	protected void sequence_OperatorDefinition_OperatorDefinition(EObject context, OperatorDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=NameSpaceName uses+=[Package|NameSpaceName]* items+=TopLevelItem*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    uses[0, *]
	 *    items[0, *]
	 */
	protected void sequence_Package_Package(EObject context, hu.e.parser.eSyntax.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=ParameterKind? var=Variable default=LITERAL?)
	 *
	 * Features:
	 *    kind[0, 1]
	 *    var[1, 1]
	 *    default[0, 1]
	 */
	protected void sequence_ParameterVariable_ParameterVariable(EObject context, ParameterVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     inc=[LinkedBinary|QualifiedName]
	 *
	 * Features:
	 *    inc[1, 1]
	 */
	protected void sequence_ReferenceBinarySection_ReferenceBinarySection(EObject context, ReferenceBinarySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|QualifiedName] name=ID addr=LITERAL)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 *    addr[1, 1]
	 */
	protected void sequence_RegisterVariable_RegisterVariable(EObject context, RegisterVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.REGISTER_VARIABLE__ADDR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.REGISTER_VARIABLE__ADDR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegisterVariableAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getRegisterVariableAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRegisterVariableAccess().getAddrLITERALParserRuleCall_5_0(), semanticObject.getAddr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ref=[StructTypeDefMember|ID]
	 *
	 * Features:
	 *    ref[1, 1]
	 */
	protected void sequence_StructRef_StructRef(EObject context, StructRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.STRUCT_REF__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.STRUCT_REF__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStructRefAccess().getRefStructTypeDefMemberIDTerminalRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|QualifiedName] name=ID)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_StructTypeDefMember_StructTypeDefMember(EObject context, StructTypeDefMember semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.STRUCT_TYPE_DEF_MEMBER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.STRUCT_TYPE_DEF_MEMBER__TYPE));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.STRUCT_TYPE_DEF_MEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.STRUCT_TYPE_DEF_MEMBER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStructTypeDefMemberAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getStructTypeDefMemberAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (members+=StructTypeDefMember members+=StructTypeDefMember*)
	 *
	 * Features:
	 *    members[1, *]
	 */
	protected void sequence_StructTypeDef_StructTypeDef(EObject context, StructTypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID def=TypeDef)
	 *
	 * Features:
	 *    name[1, 1]
	 *    def[1, 1]
	 */
	protected void sequence_Type_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.TYPE__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.TYPE__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.TYPE__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTypeAccess().getDefTypeDefParserRuleCall_3_0(), semanticObject.getDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (var=[Variable|QualifiedName] ref+=VariableRefSection*)
	 *
	 * Features:
	 *    var[1, 1]
	 *    ref[0, *]
	 */
	protected void sequence_VariableReference_VariableReference(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|QualifiedName] name=ID)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_Variable_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getTypeTypeQualifiedNameParserRuleCall_0_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=[Label|ID] size=INT shift=INT?)
	 *
	 * Features:
	 *    size[1, 1]
	 *    shift[0, 1]
	 *    label[1, 1]
	 */
	protected void sequence_WordSection_LabelReference(EObject context, LabelReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=LITERAL size=INT shift=INT?)
	 *
	 * Features:
	 *    size[1, 1]
	 *    shift[0, 1]
	 *    value[1, 1]
	 */
	protected void sequence_WordSection_LiteralValue(EObject context, LiteralValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=[Variable|QualifiedName] ref+=VariableRefSection* size=INT shift=INT?)
	 *
	 * Features:
	 *    size[1, 1]
	 *    shift[0, 1]
	 *    var[1, 1]
	 *    ref[0, *]
	 */
	protected void sequence_WordSection_VariableReference(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=VariableReference
	 *
	 * Features:
	 *    ref[1, 1]
	 */
	protected void sequence_XAddressOfVar_XAddressOfVar(EObject context, XAddressOfVar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XADDRESS_OF_VAR__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XADDRESS_OF_VAR__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXAddressOfVarAccess().getRefVariableReferenceParserRuleCall_2_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ref=VariableReference value=XExpression)
	 *
	 * Features:
	 *    ref[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_XAssignment_XAssignment(EObject context, XAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XASSIGNMENT__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XASSIGNMENT__REF));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXAssignmentAccess().getRefVariableReferenceParserRuleCall_0_0(), semanticObject.getRef());
		feeder.accept(grammarAccess.getXAssignmentAccess().getValueXExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (operator+=UNARY_OPERATOR* a=XPrimaryExpression)
	 *
	 * Features:
	 *    operator[0, *]
	 *    a[1, 1]
	 */
	protected void sequence_XExpression1_XExpression1(EObject context, XExpression1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpression1 (op+=MULTIPLICATIVE_OPERATOR b+=XExpression2)*)
	 *
	 * Features:
	 *    a[1, 1]
	 *    op[0, *]
	 *         SAME b
	 *    b[0, *]
	 *         SAME op
	 */
	protected void sequence_XExpression2_XExpression2(EObject context, XExpression2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpression2 (op+=ADDITIVE_OPERATOR b+=XExpression2)*)
	 *
	 * Features:
	 *    a[1, 1]
	 *    op[0, *]
	 *         SAME b
	 *    b[0, *]
	 *         SAME op
	 */
	protected void sequence_XExpression3_XExpression3(EObject context, XExpression3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpression3 (op+=EQUALITY_OPERATOR b+=XExpression3)*)
	 *
	 * Features:
	 *    a[1, 1]
	 *    op[0, *]
	 *         SAME b
	 *    b[0, *]
	 *         SAME op
	 */
	protected void sequence_XExpression4_XExpression4(EObject context, XExpression4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpression4 (op+=BOOLEAN_OPERATOR b+=XExpression4)*)
	 *
	 * Features:
	 *    a[1, 1]
	 *    op[0, *]
	 *         SAME b
	 *    b[0, *]
	 *         SAME op
	 */
	protected void sequence_XExpression5_XExpression5(EObject context, XExpression5 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=LITERAL
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_XExpressionLiteral_XExpressionLiteral(EObject context, XExpressionLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XEXPRESSION_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XEXPRESSION_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXExpressionLiteralAccess().getValueLITERALParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (if=XExpression then=OperationBlock else=OperationBlock?)
	 *
	 * Features:
	 *    if[1, 1]
	 *    then[1, 1]
	 *    else[0, 1]
	 */
	protected void sequence_XIfExpression_XIfExpression(EObject context, XIfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=VariableReference
	 *
	 * Features:
	 *    ref[1, 1]
	 */
	protected void sequence_XIsLiteralExpression_XIsLiteralExpression(EObject context, XIsLiteralExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XIS_LITERAL_EXPRESSION__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XIS_LITERAL_EXPRESSION__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXIsLiteralExpressionAccess().getRefVariableReferenceParserRuleCall_2_0(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     a=XExpression
	 *
	 * Features:
	 *    a[1, 1]
	 */
	protected void sequence_XParenthesizedExpression_XParenthesizedExpression(EObject context, XParenthesizedExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XPARENTHESIZED_EXPRESSION__A) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XPARENTHESIZED_EXPRESSION__A));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXParenthesizedExpressionAccess().getAXExpressionParserRuleCall_1_0(), semanticObject.getA());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=[Type|QualifiedName]
	 *
	 * Features:
	 *    type[1, 1]
	 */
	protected void sequence_XSizeOfExpression_XSizeOfExpression(EObject context, XSizeOfExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XSIZE_OF_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XSIZE_OF_EXPRESSION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXSizeOfExpressionAccess().getTypeTypeQualifiedNameParserRuleCall_2_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Type|QualifiedName] values+=XExpression values+=XExpression*)
	 *
	 * Features:
	 *    type[1, 1]
	 *    values[1, *]
	 */
	protected void sequence_XStructExpression_XStructExpression(EObject context, XStructExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
