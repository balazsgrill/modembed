package hu.e.parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.e.parser.eSyntax.ArrayTypeDef;
import hu.e.parser.eSyntax.CompileContextVariable;
import hu.e.parser.eSyntax.ConfigVariable;
import hu.e.parser.eSyntax.ConstantBinarySection;
import hu.e.parser.eSyntax.ConstantVariable;
import hu.e.parser.eSyntax.DataTypeDef;
import hu.e.parser.eSyntax.ESyntaxPackage;
import hu.e.parser.eSyntax.FunctionBinarySection;
import hu.e.parser.eSyntax.FunctionMemory;
import hu.e.parser.eSyntax.InstanceConfig;
import hu.e.parser.eSyntax.InstanceReference;
import hu.e.parser.eSyntax.InstructionWord;
import hu.e.parser.eSyntax.Label;
import hu.e.parser.eSyntax.Library;
import hu.e.parser.eSyntax.LinkedBinary;
import hu.e.parser.eSyntax.LinkedInstance;
import hu.e.parser.eSyntax.LiteralValue;
import hu.e.parser.eSyntax.Module;
import hu.e.parser.eSyntax.Operation;
import hu.e.parser.eSyntax.OperationBlock;
import hu.e.parser.eSyntax.OperationCall;
import hu.e.parser.eSyntax.OperatorDefinition;
import hu.e.parser.eSyntax.ParameterVariable;
import hu.e.parser.eSyntax.PointerTypeDef;
import hu.e.parser.eSyntax.RefTypeDef;
import hu.e.parser.eSyntax.ReferenceBinarySection;
import hu.e.parser.eSyntax.ReferenceLink;
import hu.e.parser.eSyntax.RegisterVariable;
import hu.e.parser.eSyntax.StructTypeDef;
import hu.e.parser.eSyntax.StructTypeDefMember;
import hu.e.parser.eSyntax.Type;
import hu.e.parser.eSyntax.Variable;
import hu.e.parser.eSyntax.VariableReference;
import hu.e.parser.eSyntax.XExpression0;
import hu.e.parser.eSyntax.XExpression1;
import hu.e.parser.eSyntax.XExpression2;
import hu.e.parser.eSyntax.XExpression3;
import hu.e.parser.eSyntax.XExpression4;
import hu.e.parser.eSyntax.XExpression5;
import hu.e.parser.eSyntax.XExpression6;
import hu.e.parser.eSyntax.XExpressionLiteral;
import hu.e.parser.eSyntax.XExpressionM1;
import hu.e.parser.eSyntax.XIfExpression;
import hu.e.parser.eSyntax.XIsLiteralExpression;
import hu.e.parser.eSyntax.XParenthesizedExpression;
import hu.e.parser.eSyntax.XSizeOfExpression;
import hu.e.parser.eSyntax.XStructExpression;
import hu.e.parser.eSyntax.XWhileExpression;
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
			case ESyntaxPackage.ARRAY_TYPE_DEF:
				if(context == grammarAccess.getArrayTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_ArrayTypeDef(context, (ArrayTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.COMPILE_CONTEXT_VARIABLE:
				if(context == grammarAccess.getCompileContextVariableRule() ||
				   context == grammarAccess.getLibraryItemRule()) {
					sequence_CompileContextVariable(context, (CompileContextVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.CONFIG_VARIABLE:
				if(context == grammarAccess.getClassItemRule() ||
				   context == grammarAccess.getConfigVariableRule()) {
					sequence_ConfigVariable(context, (ConfigVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.CONSTANT_BINARY_SECTION:
				if(context == grammarAccess.getBinarySectionRule()) {
					sequence_BinarySection(context, (ConstantBinarySection) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstantBinarySectionRule()) {
					sequence_ConstantBinarySection(context, (ConstantBinarySection) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.CONSTANT_VARIABLE:
				if(context == grammarAccess.getClassItemRule() ||
				   context == grammarAccess.getConstantVariableRule() ||
				   context == grammarAccess.getLibraryItemRule()) {
					sequence_ConstantVariable(context, (ConstantVariable) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.DATA_TYPE_DEF:
				if(context == grammarAccess.getDataTypeDefRule() ||
				   context == grammarAccess.getTypeDefRule()) {
					sequence_DataTypeDef(context, (DataTypeDef) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.FUNCTION_BINARY_SECTION:
				if(context == grammarAccess.getBinarySectionRule()) {
					sequence_BinarySection(context, (FunctionBinarySection) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunctionBinarySectionRule()) {
					sequence_FunctionBinarySection(context, (FunctionBinarySection) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.FUNCTION_MEMORY:
				if(context == grammarAccess.getFunctionMemoryRule()) {
					sequence_FunctionMemory(context, (FunctionMemory) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSTANCE_CONFIG:
				if(context == grammarAccess.getInstanceConfigRule()) {
					sequence_InstanceConfig(context, (InstanceConfig) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSTANCE_REFERENCE:
				if(context == grammarAccess.getClassItemRule() ||
				   context == grammarAccess.getInstanceReferenceRule()) {
					sequence_InstanceReference(context, (InstanceReference) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.INSTRUCTION_WORD:
				if(context == grammarAccess.getInstructionWordRule() ||
				   context == grammarAccess.getOperationStepRule()) {
					sequence_InstructionWord(context, (InstructionWord) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LABEL:
				if(context == grammarAccess.getLabelRule() ||
				   context == grammarAccess.getOperationStepRule()) {
					sequence_Label(context, (Label) semanticObject); 
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
			case ESyntaxPackage.LINKED_BINARY:
				if(context == grammarAccess.getCompilationUnitRule() ||
				   context == grammarAccess.getLinkedBinaryRule()) {
					sequence_LinkedBinary(context, (LinkedBinary) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LINKED_INSTANCE:
				if(context == grammarAccess.getLinkedInstanceRule()) {
					sequence_LinkedInstance(context, (LinkedInstance) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.LITERAL_VALUE:
				if(context == grammarAccess.getLiteralValueRule()) {
					sequence_LiteralValue(context, (LiteralValue) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getWordSectionRule()) {
					sequence_WordSection(context, (LiteralValue) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.MODULE:
				if(context == grammarAccess.getCompilationUnitRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION:
				if(context == grammarAccess.getClassItemRule() ||
				   context == grammarAccess.getLibraryItemRule() ||
				   context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.OPERATION_BLOCK:
				if(context == grammarAccess.getOperationBlockRule()) {
					sequence_OperationBlock(context, (OperationBlock) semanticObject); 
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
			case ESyntaxPackage.OPERATOR_DEFINITION:
				if(context == grammarAccess.getLibraryItemRule() ||
				   context == grammarAccess.getOperatorDefinitionRule()) {
					sequence_OperatorDefinition(context, (OperatorDefinition) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.PARAMETER_VARIABLE:
				if(context == grammarAccess.getParameterVariableRule()) {
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
			case ESyntaxPackage.REFERENCE_BINARY_SECTION:
				if(context == grammarAccess.getBinarySectionRule()) {
					sequence_BinarySection(context, (ReferenceBinarySection) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getReferenceBinarySectionRule()) {
					sequence_ReferenceBinarySection(context, (ReferenceBinarySection) semanticObject); 
					return; 
				}
				else break;
			case ESyntaxPackage.REFERENCE_LINK:
				if(context == grammarAccess.getReferenceLinkRule()) {
					sequence_ReferenceLink(context, (ReferenceLink) semanticObject); 
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
			case ESyntaxPackage.VARIABLE:
				if(context == grammarAccess.getClassItemRule() ||
				   context == grammarAccess.getLibraryItemRule() ||
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
				else if(context == grammarAccess.getWordSectionRule()) {
					sequence_WordSection(context, (VariableReference) semanticObject); 
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
				if(context == grammarAccess.getOperationCallParameterRule() ||
				   context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getXExpressionRule() ||
				   context == grammarAccess.getXExpression6Rule() ||
				   context == grammarAccess.getXTopLevelExpressionRule()) {
					sequence_XExpression6(context, (XExpression6) semanticObject); 
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
			case ESyntaxPackage.XIF_EXPRESSION:
				if(context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getXIfExpressionRule() ||
				   context == grammarAccess.getXTopLevelExpressionRule()) {
					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
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
			case ESyntaxPackage.XWHILE_EXPRESSION:
				if(context == grammarAccess.getOperationStepRule() ||
				   context == grammarAccess.getXTopLevelExpressionRule() ||
				   context == grammarAccess.getXWhileExpressionRule()) {
					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (size=XExpression def=TypeDef)
	 *
	 * Features:
	 *    size[1, 1]
	 *    def[1, 1]
	 */
	protected void sequence_ArrayTypeDef(EObject context, ArrayTypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.ARRAY_TYPE_DEF__SIZE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.ARRAY_TYPE_DEF__SIZE));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.ARRAY_TYPE_DEF__DEF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.ARRAY_TYPE_DEF__DEF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArrayTypeDefAccess().getSizeXExpressionParserRuleCall_2_0(), semanticObject.getSize());
		feeder.accept(grammarAccess.getArrayTypeDefAccess().getDefTypeDefParserRuleCall_5_0(), semanticObject.getDef());
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
	protected void sequence_BinarySection(EObject context, ConstantBinarySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         memwidth=LITERAL 
	 *         pointersize=LITERAL 
	 *         mems+=FunctionMemory+ 
	 *         (lib+=[Library|QualifiedName] | instances+=LinkedInstance)* 
	 *         do=OperationBlock 
	 *         start=XExpression
	 *     )
	 *
	 * Features:
	 *    start[1, 1]
	 *    memwidth[1, 1]
	 *    pointersize[1, 1]
	 *    mems[1, *]
	 *    lib[0, *]
	 *    instances[0, *]
	 *    do[1, 1]
	 */
	protected void sequence_BinarySection(EObject context, FunctionBinarySection semanticObject) {
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
	protected void sequence_BinarySection(EObject context, ReferenceBinarySection semanticObject) {
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
	protected void sequence_CompileContextVariable(EObject context, CompileContextVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeDef name=ID)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_ConfigVariable(EObject context, ConfigVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.VARIABLE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConfigVariableAccess().getTypeTypeDefParserRuleCall_2_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConfigVariableAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     data+=XExpression+
	 *
	 * Features:
	 *    data[1, *]
	 */
	protected void sequence_ConstantBinarySection(EObject context, ConstantBinarySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeDef name=ID value=XExpression)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_ConstantVariable(EObject context, ConstantVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME));
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
	 *     (kind=PrimitiveKind bits=INT)
	 *
	 * Features:
	 *    kind[1, 1]
	 *    bits[1, 1]
	 */
	protected void sequence_DataTypeDef(EObject context, DataTypeDef semanticObject) {
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
	 *     (memwidth=LITERAL pointersize=LITERAL mems+=FunctionMemory+ (lib+=[Library|QualifiedName] | instances+=LinkedInstance)* do=OperationBlock)
	 *
	 * Features:
	 *    memwidth[1, 1]
	 *    pointersize[1, 1]
	 *    mems[1, *]
	 *    lib[0, *]
	 *    instances[0, *]
	 *    do[1, 1]
	 */
	protected void sequence_FunctionBinarySection(EObject context, FunctionBinarySection semanticObject) {
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
	protected void sequence_FunctionMemory(EObject context, FunctionMemory semanticObject) {
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
	 *     (conf=[ConfigVariable|ID] value=XExpression)
	 *
	 * Features:
	 *    conf[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_InstanceConfig(EObject context, InstanceConfig semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.INSTANCE_CONFIG__CONF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.INSTANCE_CONFIG__CONF));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.INSTANCE_CONFIG__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.INSTANCE_CONFIG__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceConfigAccess().getConfConfigVariableIDTerminalRuleCall_0_0_1(), semanticObject.getConf());
		feeder.accept(grammarAccess.getInstanceConfigAccess().getValueXExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Module|ReferenceID] name=ID)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_InstanceReference(EObject context, InstanceReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.INSTANCE_REFERENCE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.INSTANCE_REFERENCE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceReferenceAccess().getTypeModuleReferenceIDParserRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getInstanceReferenceAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     sections+=WordSection+
	 *
	 * Features:
	 *    sections[1, *]
	 */
	protected void sequence_InstructionWord(EObject context, InstructionWord semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName (overrides+=[Library|QualifiedName] overrides+=[Library|QualifiedName]*)? use+=[Library|QualifiedName]* items+=LibraryItem*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    use[0, *]
	 *    overrides[0, *]
	 *    items[0, *]
	 */
	protected void sequence_Library(EObject context, Library semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName type=BinaryType? use+=[Library|QualifiedName]* sections+=BinarySection*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    use[0, *]
	 *    type[0, 1]
	 *    sections[0, *]
	 */
	protected void sequence_LinkedBinary(EObject context, LinkedBinary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[Module|QualifiedName] name=ID (links+=ReferenceLink | confs+=InstanceConfig)*)
	 *
	 * Features:
	 *    type[1, 1]
	 *    name[1, 1]
	 *    links[0, *]
	 *    confs[0, *]
	 */
	protected void sequence_LinkedInstance(EObject context, LinkedInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=LITERAL
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_LiteralValue(EObject context, LiteralValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName (extends+=[Module|QualifiedName] extends+=[Module|QualifiedName]*)? use+=[Library|QualifiedName]* items+=ClassItem*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    use[0, *]
	 *    extends[0, *]
	 *    items[0, *]
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (steps+=OperationStep*)
	 *
	 * Features:
	 *    steps[0, *]
	 */
	protected void sequence_OperationBlock(EObject context, OperationBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operation=[Operation|ReferenceID] (params+=OperationCallParameter params+=OperationCallParameter*)?)
	 *
	 * Features:
	 *    operation[1, 1]
	 *    params[0, *]
	 */
	protected void sequence_OperationCall(EObject context, OperationCall semanticObject) {
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
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (role=OperationRole candidate+=[Operation|ReferenceID] candidate+=[Operation|ReferenceID]*)
	 *
	 * Features:
	 *    role[1, 1]
	 *    candidate[1, *]
	 */
	protected void sequence_OperatorDefinition(EObject context, OperatorDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (kind=ParameterKind? type=TypeDef name=ID default=LITERAL?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    kind[0, 1]
	 *    default[0, 1]
	 */
	protected void sequence_ParameterVariable(EObject context, ParameterVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     def=TypeDef
	 *
	 * Features:
	 *    def[1, 1]
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
	 *     type=[Type|ReferenceID]
	 *
	 * Features:
	 *    type[1, 1]
	 */
	protected void sequence_RefTypeDef(EObject context, RefTypeDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.REF_TYPE_DEF__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.REF_TYPE_DEF__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRefTypeDefAccess().getTypeTypeReferenceIDParserRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     inc=[LinkedBinary|QualifiedName]
	 *
	 * Features:
	 *    inc[1, 1]
	 */
	protected void sequence_ReferenceBinarySection(EObject context, ReferenceBinarySection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[InstanceReference|ID] inst=[LinkedInstance|ID])
	 *
	 * Features:
	 *    ref[1, 1]
	 *    inst[1, 1]
	 */
	protected void sequence_ReferenceLink(EObject context, ReferenceLink semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.REFERENCE_LINK__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.REFERENCE_LINK__REF));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.REFERENCE_LINK__INST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.REFERENCE_LINK__INST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceLinkAccess().getRefInstanceReferenceIDTerminalRuleCall_0_0_1(), semanticObject.getRef());
		feeder.accept(grammarAccess.getReferenceLinkAccess().getInstLinkedInstanceIDTerminalRuleCall_2_0_1(), semanticObject.getInst());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeDef name=ID addr=XExpression)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 *    addr[1, 1]
	 */
	protected void sequence_RegisterVariable(EObject context, RegisterVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME));
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
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_StructTypeDefMember(EObject context, StructTypeDefMember semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME));
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
	 *
	 * Features:
	 *    members[1, *]
	 */
	protected void sequence_StructTypeDef(EObject context, StructTypeDef semanticObject) {
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
	protected void sequence_Type(EObject context, Type semanticObject) {
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
	 *     var=[Variable|ReferenceID]
	 *
	 * Features:
	 *    var[1, 1]
	 */
	protected void sequence_VariableReference(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeDef name=ID)
	 *
	 * Features:
	 *    name[1, 1]
	 *    type[1, 1]
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.CLASS_ITEM__NAME));
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
	 *     (value=LITERAL size=INT shift=INT?)
	 *
	 * Features:
	 *    size[1, 1]
	 *    shift[0, 1]
	 *    value[1, 1]
	 */
	protected void sequence_WordSection(EObject context, LiteralValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=[Variable|ReferenceID] size=INT shift=INT?)
	 *
	 * Features:
	 *    size[1, 1]
	 *    shift[0, 1]
	 *    var[1, 1]
	 */
	protected void sequence_WordSection(EObject context, VariableReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (a=XExpressionM1 member+=ID*)
	 *
	 * Features:
	 *    a[1, 1]
	 *    member[0, *]
	 */
	protected void sequence_XExpression0(EObject context, XExpression0 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator+=UNARY_OPERATOR* a=XExpression0)
	 *
	 * Features:
	 *    operator[0, *]
	 *    a[1, 1]
	 */
	protected void sequence_XExpression1(EObject context, XExpression1 semanticObject) {
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
	protected void sequence_XExpression2(EObject context, XExpression2 semanticObject) {
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
	protected void sequence_XExpression3(EObject context, XExpression3 semanticObject) {
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
	protected void sequence_XExpression4(EObject context, XExpression4 semanticObject) {
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
	protected void sequence_XExpression5(EObject context, XExpression5 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref+=VariableReference* a=XExpression5)
	 *
	 * Features:
	 *    ref[0, *]
	 *    a[1, 1]
	 */
	protected void sequence_XExpression6(EObject context, XExpression6 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=LITERAL
	 *
	 * Features:
	 *    value[1, 1]
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
	 *
	 * Features:
	 *    a[1, 1]
	 *    index[0, *]
	 */
	protected void sequence_XExpressionM1(EObject context, XExpressionM1 semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	protected void sequence_XIfExpression(EObject context, XIfExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=VariableReference
	 *
	 * Features:
	 *    ref[1, 1]
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
	 *
	 * Features:
	 *    a[1, 1]
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
	 *
	 * Features:
	 *    type[1, 1]
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
	 *     (type=[Type|ReferenceID] values+=XExpression values+=XExpression*)
	 *
	 * Features:
	 *    type[1, 1]
	 *    values[1, *]
	 */
	protected void sequence_XStructExpression(EObject context, XStructExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cond=XExpression do=OperationBlock)
	 *
	 * Features:
	 *    cond[1, 1]
	 *    do[1, 1]
	 */
	protected void sequence_XWhileExpression(EObject context, XWhileExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XWHILE_EXPRESSION__COND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XWHILE_EXPRESSION__COND));
			if(transientValues.isValueTransient(semanticObject, ESyntaxPackage.Literals.XWHILE_EXPRESSION__DO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ESyntaxPackage.Literals.XWHILE_EXPRESSION__DO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXWhileExpressionAccess().getCondXExpressionParserRuleCall_2_0(), semanticObject.getCond());
		feeder.accept(grammarAccess.getXWhileExpressionAccess().getDoOperationBlockParserRuleCall_5_0(), semanticObject.getDo());
		feeder.finish();
	}
}
