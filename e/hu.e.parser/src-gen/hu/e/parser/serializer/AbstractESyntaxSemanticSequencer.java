package hu.e.parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.e.parser.eSyntax.Annotation;
import hu.e.parser.eSyntax.AnnotationDefinition;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.FixedDataTypeDef;
import hu.e.parser.eSyntax.InsctructionSectionNotation;
import hu.e.parser.eSyntax.InstructionNotation;
import hu.e.parser.eSyntax.InstructionParameterNotation;
import hu.e.parser.eSyntax.InstructionSetNotation;
import hu.e.parser.eSyntax.InstructionWordNotation;
import hu.e.parser.eSyntax.IntegerDataTypeDef;
import hu.e.parser.eSyntax.LabelDataTypeDef;
import hu.e.parser.eSyntax.LazyParameter;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperationTypeDef;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.PointerTypeDef;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.UnspecifiedTypeDef;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.WorkflowNotation;
import hu.e.parser.eSyntax.WorkflowStepNotation;
import hu.e.parser.eSyntax.WorkflowStepParameterNotation;
import hu.e.parser.eSyntax.XErrorExpression;
import hu.e.parser.eSyntax.XExpression0;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;
import hu.e.parser.eSyntax.XExpression3;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;
import hu.e.parser.eSyntax.XExpression6;
import hu.e.parser.eSyntax.XExpressionLiteral;
import hu.e.parser.eSyntax.XExpressionM1;
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
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractESyntaxSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ESyntaxGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ESyntaxPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ESyntaxPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getXTopLevelExpressionRule()) {
					sequence_Annotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.ANNOTATION_DEFINITION:
				if(context == grammarAccess.getAnnotationDefinitionRule() ||
				   context == grammarAccess.getLibraryItemRule()) {
					sequence_AnnotationDefinition(context, (AnnotationDefinition) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.ARRAY_TYPE_DEF:
				if(context == grammarAccess.getArrayTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_ArrayTypeDef(context, (ArrayTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.CONSTANT_VARIABLE:
				if(context == grammarAccess.getConstantVariableRule() ||
				   context == grammarAccess.getLibraryItemRule()) {
					sequence_ConstantVariable(context, (ConstantVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.FIXED_DATA_TYPE_DEF:
				if(context == grammarAccess.getDataTypeDefRule() ||
				   context == grammarAccess.getFixedDataTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_FixedDataTypeDef(context, (FixedDataTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSCTRUCTION_SECTION_NOTATION:
				if(context == grammarAccess.getInsctructionSectionNotationRule()) {
					sequence_InsctructionSectionNotation(context, (InsctructionSectionNotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSTRUCTION_NOTATION:
				if(context == grammarAccess.getInstructionNotationRule()) {
					sequence_InstructionNotation(context, (InstructionNotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSTRUCTION_PARAMETER_NOTATION:
				if(context == grammarAccess.getInstructionParameterNotationRule()) {
					sequence_InstructionParameterNotation(context, (InstructionParameterNotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSTRUCTION_SET_NOTATION:
				if(context == grammarAccess.getCompilationUnitRule() ||
				   context == grammarAccess.getInstructionSetNotationRule()) {
					sequence_InstructionSetNotation(context, (InstructionSetNotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSTRUCTION_WORD_NOTATION:
				if(context == grammarAccess.getInstructionWordNotationRule()) {
					sequence_InstructionWordNotation(context, (InstructionWordNotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INTEGER_DATA_TYPE_DEF:
				if(context == grammarAccess.getDataTypeDefRule() ||
				   context == grammarAccess.getIntegerDataTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_IntegerDataTypeDef(context, (IntegerDataTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LABEL_DATA_TYPE_DEF:
				if(context == grammarAccess.getDataTypeDefRule() ||
				   context == grammarAccess.getLabelDataTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_LabelDataTypeDef(context, (LabelDataTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LAZY_PARAMETER:
				if(context == grammarAccess.getLazyParameterRule() ||
				   context == grammarAccess.getOperationParameterRule()) {
					sequence_LazyParameter(context, (LazyParameter) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LIBRARY:
				if(context == grammarAccess.getCompilationUnitRule() ||
				   context == grammarAccess.getLibraryRule()) {
					sequence_Library(context, (Library) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION:
				if(context == grammarAccess.getLibraryItemRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION_BLOCK:
				if(context == grammarAccess.getXExpressionBlockRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_XExpressionBlock(context, (OperationBlock) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION_CALL:
				if(context == grammarAccess.getOperationCallRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_OperationCall(context, (OperationCall) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION_TYPE_DEF:
				if(context == grammarAccess.getOperationTypeDefRule()) {
					sequence_OperationTypeDef(context, (OperationTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.PARAMETER_VARIABLE:
				if(context == grammarAccess.getOperationParameterRule() ||
				   context == grammarAccess.getParameterVariableRule()) {
					sequence_ParameterVariable(context, (ParameterVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.POINTER_TYPE_DEF:
				if(context == grammarAccess.getPointerTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_PointerTypeDef(context, (PointerTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.REF_TYPE_DEF:
				if(context == grammarAccess.getRefTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_RefTypeDef(context, (RefTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.REGISTER_VARIABLE:
				if(context == grammarAccess.getLibraryItemRule() ||
				   context == grammarAccess.getRegisterVariableRule()) {
					sequence_RegisterVariable(context, (RegisterVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.STRUCT_TYPE_DEF:
				if(context == grammarAccess.getStructTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_StructTypeDef(context, (StructTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.STRUCT_TYPE_DEF_MEMBER:
				if(context == grammarAccess.getStructTypeDefMemberRule()) {
					sequence_StructTypeDefMember(context, (StructTypeDefMember) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.TYPE:
				if(context == grammarAccess.getLibraryItemRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.UNSPECIFIED_TYPE_DEF:
				if(context == grammarAccess.getTypeDefRule() ||
				   context == grammarAccess.getUnspecifiedTypeDefRule()) {
					sequence_UnspecifiedTypeDef(context, (UnspecifiedTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.VARIABLE:
				if(context == grammarAccess.getLibraryItemRule() ||
				   context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.VARIABLE_REFERENCE:
				if(context == grammarAccess.getVariableReferenceRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_VariableReference(context, (VariableReference) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.WORKFLOW_NOTATION:
				if(context == grammarAccess.getCompilationUnitRule() ||
				   context == grammarAccess.getWorkflowNotationRule()) {
					sequence_WorkflowNotation(context, (WorkflowNotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.WORKFLOW_STEP_NOTATION:
				if(context == grammarAccess.getWorkflowStepNotationRule()) {
					sequence_WorkflowStepNotation(context, (WorkflowStepNotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.WORKFLOW_STEP_PARAMETER_NOTATION:
				if(context == grammarAccess.getWorkflowStepParameterNotationRule()) {
					sequence_WorkflowStepParameterNotation(context, (WorkflowStepParameterNotation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XERROR_EXPRESSION:
				if(context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getXErrorExpressionRule() ||
				   context == grammarAccess.getXTopLevelExpressionRule()) {
					sequence_XErrorExpression(context, (XErrorExpression) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION0:
				if(context == grammarAccess.getXExpression0Rule()) {
					sequence_XExpression0(context, (XExpression0) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION1:
				if(context == grammarAccess.getXExpression1Rule()) {
					sequence_XExpression1(context, (XExpression1) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION2:
				if(context == grammarAccess.getXExpression2Rule()) {
					sequence_XExpression2(context, (XExpression2) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION3:
				if(context == grammarAccess.getXExpression3Rule()) {
					sequence_XExpression3(context, (XExpression3) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION4:
				if(context == grammarAccess.getXExpression4Rule()) {
					sequence_XExpression4(context, (XExpression4) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION5:
				if(context == grammarAccess.getXExpression5Rule()) {
					sequence_XExpression5(context, (XExpression5) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION6:
				if(context == grammarAccess.getXExpression6Rule()) {
					sequence_XExpression6(context, (XExpression6) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getOperationCallParameterRule() ||
				   context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXTopLevelExpressionRule()) {
					sequence_XExpression_XExpression6(context, (XExpression6) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION_LITERAL:
				if(context == grammarAccess.getXExpressionLiteralRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_XExpressionLiteral(context, (XExpressionLiteral) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XEXPRESSION_M1:
				if(context == grammarAccess.getXExpressionM1Rule()) {
					sequence_XExpressionM1(context, (XExpressionM1) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XIS_LITERAL_EXPRESSION:
				if(context == grammarAccess.getXIsLiteralExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_XIsLiteralExpression(context, (XIsLiteralExpression) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XPARENTHESIZED_EXPRESSION:
				if(context == grammarAccess.getXParenthesizedExpressionRule() ||
				   context == grammarAccess.getXPrimaryExpressionRule()) {
					sequence_XParenthesizedExpression(context, (XParenthesizedExpression) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XSIZE_OF_EXPRESSION:
				if(context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXSizeOfExpressionRule()) {
					sequence_XSizeOfExpression(context, (XSizeOfExpression) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.XSTRUCT_EXPRESSION:
				if(context == grammarAccess.getXPrimaryExpressionRule() ||
				   context == grammarAccess.getXStructExpressionRule()) {
					sequence_XStructExpression(context, (XStructExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_AnnotationDefinition(EObject context, AnnotationDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotationDefinitionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     definition=ID
	 */
	protected void sequence_Annotation(EObject context, Annotation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.ANNOTATION__DEFINITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.ANNOTATION__DEFINITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAnnotationAccess().getDefinitionIDTerminalRuleCall_1_0(), semanticObject.getDefinition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (def=TypeDef size=XExpression?)
	 */
	protected void sequence_ArrayTypeDef(EObject context, ArrayTypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeDef name=ID value=XExpression)
	 */
	protected void sequence_ConstantVariable(EObject context, ConstantVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.CONSTANT_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.CONSTANT_VARIABLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantVariableAccess().getTypeTypeDefParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConstantVariableAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantVariableAccess().getValueXExpressionParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (bits=INT scale=REAL)
	 */
	protected void sequence_FixedDataTypeDef(EObject context, FixedDataTypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.FIXED_DATA_TYPE_DEF__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.FIXED_DATA_TYPE_DEF__BITS));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.FIXED_DATA_TYPE_DEF__SCALE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.FIXED_DATA_TYPE_DEF__SCALE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFixedDataTypeDefAccess().getBitsINTTerminalRuleCall_1_0(), semanticObject.getBits());
		feeder.accept(grammarAccess.getFixedDataTypeDefAccess().getScaleREALTerminalRuleCall_5_0(), semanticObject.getScale());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((param=ID | value=LITERAL) size=LITERAL shift=LITERAL?)
	 */
	protected void sequence_InsctructionSectionNotation(EObject context, InsctructionSectionNotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID params+=InstructionParameterNotation* words+=InstructionWordNotation+)
	 */
	protected void sequence_InstructionNotation(EObject context, InstructionNotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID default=LITERAL?)
	 */
	protected void sequence_InstructionParameterNotation(EObject context, InstructionParameterNotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=LibraryName extends=LibraryName? instructions+=InstructionNotation*)
	 */
	protected void sequence_InstructionSetNotation(EObject context, InstructionSetNotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sections+=InsctructionSectionNotation+
	 */
	protected void sequence_InstructionWordNotation(EObject context, InstructionWordNotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=IntegerKind bits=INT)
	 */
	protected void sequence_IntegerDataTypeDef(EObject context, IntegerDataTypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.INTEGER_DATA_TYPE_DEF__KIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.INTEGER_DATA_TYPE_DEF__KIND));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.INTEGER_DATA_TYPE_DEF__BITS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.INTEGER_DATA_TYPE_DEF__BITS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntegerDataTypeDefAccess().getKindIntegerKindEnumRuleCall_0_0(), semanticObject.getKind());
		feeder.accept(grammarAccess.getIntegerDataTypeDefAccess().getBitsINTTerminalRuleCall_1_0(), semanticObject.getBits());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {LabelDataTypeDef}
	 */
	protected void sequence_LabelDataTypeDef(EObject context, LabelDataTypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (paramname=ID type=OperationTypeDef)
	 */
	protected void sequence_LazyParameter(EObject context, LazyParameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LAZY_PARAMETER__PARAMNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LAZY_PARAMETER__PARAMNAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LAZY_PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LAZY_PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLazyParameterAccess().getParamnameIDTerminalRuleCall_1_0(), semanticObject.getParamname());
		feeder.accept(grammarAccess.getLazyParameterAccess().getTypeOperationTypeDefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=LibraryName use+=LibraryName* items+=LibraryItem*)
	 */
	protected void sequence_Library(EObject context, Library semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operation=QualifiedName (params+=OperationCallParameter params+=OperationCallParameter*)?)
	 */
	protected void sequence_OperationCall(EObject context, OperationCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resultType=TypeDef (params+=OperationParameter params+=OperationParameter*)?)
	 */
	protected void sequence_OperationTypeDef(EObject context, OperationTypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=OperationTypeDef overrides=QualifiedName? content=XExpression)
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=ParameterKind? type=TypeDef name=ID default=LITERAL?)
	 */
	protected void sequence_ParameterVariable(EObject context, ParameterVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     def=TypeDef
	 */
	protected void sequence_PointerTypeDef(EObject context, PointerTypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.POINTER_TYPE_DEF__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.POINTER_TYPE_DEF__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPointerTypeDefAccess().getDefTypeDefParserRuleCall_2_0(), semanticObject.getDef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=QualifiedName
	 */
	protected void sequence_RefTypeDef(EObject context, RefTypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.REF_TYPE_DEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.REF_TYPE_DEF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefTypeDefAccess().getTypeQualifiedNameParserRuleCall_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeDef name=ID addr=XExpression)
	 */
	protected void sequence_RegisterVariable(EObject context, RegisterVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.REGISTER_VARIABLE__ADDR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.REGISTER_VARIABLE__ADDR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegisterVariableAccess().getTypeTypeDefParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getRegisterVariableAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRegisterVariableAccess().getAddrXExpressionParserRuleCall_5_0(), semanticObject.getAddr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeDef name=ID)
	 */
	protected void sequence_StructTypeDefMember(EObject context, StructTypeDefMember semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStructTypeDefMemberAccess().getTypeTypeDefParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getStructTypeDefMemberAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (members+=StructTypeDefMember members+=StructTypeDefMember*)
	 */
	protected void sequence_StructTypeDef(EObject context, StructTypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID def=TypeDef)
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME));
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
	 *     {UnspecifiedTypeDef}
	 */
	protected void sequence_UnspecifiedTypeDef(EObject context, UnspecifiedTypeDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     var=QualifiedName
	 */
	protected void sequence_VariableReference(EObject context, VariableReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE_REFERENCE__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE_REFERENCE__VAR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableReferenceAccess().getVarQualifiedNameParserRuleCall_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeDef name=ID)
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.LIBRARY_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getTypeTypeDefParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=LibraryName steps+=WorkflowStepNotation*)
	 */
	protected void sequence_WorkflowNotation(EObject context, WorkflowNotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=LibraryName params+=WorkflowStepParameterNotation*)
	 */
	protected void sequence_WorkflowStepNotation(EObject context, WorkflowStepNotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=ID (value=STRING | value=LibraryName))
	 */
	protected void sequence_WorkflowStepParameterNotation(EObject context, WorkflowStepParameterNotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (level=ErrorLevels msg=STRING)
	 */
	protected void sequence_XErrorExpression(EObject context, XErrorExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XERROR_EXPRESSION__LEVEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XERROR_EXPRESSION__LEVEL));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XERROR_EXPRESSION__MSG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XERROR_EXPRESSION__MSG));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXErrorExpressionAccess().getLevelErrorLevelsEnumRuleCall_0_0(), semanticObject.getLevel());
		feeder.accept(grammarAccess.getXErrorExpressionAccess().getMsgSTRINGTerminalRuleCall_1_0(), semanticObject.getMsg());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpressionM1 member+=ID*)
	 */
	protected void sequence_XExpression0(EObject context, XExpression0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator+=UNARY_OPERATOR* a=XExpression0)
	 */
	protected void sequence_XExpression1(EObject context, XExpression1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpression1 (op+=MULTIPLICATIVE_OPERATOR b+=XExpression2)*)
	 */
	protected void sequence_XExpression2(EObject context, XExpression2 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpression2 (op+=ADDITIVE_OPERATOR b+=XExpression2)*)
	 */
	protected void sequence_XExpression3(EObject context, XExpression3 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpression3 (op+=EQUALITY_OPERATOR b+=XExpression3)*)
	 */
	protected void sequence_XExpression4(EObject context, XExpression4 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpression4 (op+=BOOLEAN_OPERATOR b+=XExpression4)*)
	 */
	protected void sequence_XExpression5(EObject context, XExpression5 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((ref=VariableReference op=OpSingleAssign)? a=XExpression5)
	 */
	protected void sequence_XExpression6(EObject context, XExpression6 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (steps+=OperationStep*)
	 */
	protected void sequence_XExpressionBlock(EObject context, OperationBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=LITERAL
	 */
	protected void sequence_XExpressionLiteral(EObject context, XExpressionLiteral semanticObject) {
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
	 *     (a=XPrimaryExpression index+=XExpression*)
	 */
	protected void sequence_XExpressionM1(EObject context, XExpressionM1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((ref=VariableReference op=OpSingleAssign)? a=XExpression5 type=TypeDef?)
	 */
	protected void sequence_XExpression_XExpression6(EObject context, XExpression6 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=VariableReference
	 */
	protected void sequence_XIsLiteralExpression(EObject context, XIsLiteralExpression semanticObject) {
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
	 */
	protected void sequence_XParenthesizedExpression(EObject context, XParenthesizedExpression semanticObject) {
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
	 *     type=TypeDef
	 */
	protected void sequence_XSizeOfExpression(EObject context, XSizeOfExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XSIZE_OF_EXPRESSION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XSIZE_OF_EXPRESSION__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXSizeOfExpressionAccess().getTypeTypeDefParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=XExpression values+=XExpression*)
	 */
	protected void sequence_XStructExpression(EObject context, XStructExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
