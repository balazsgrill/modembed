/*
* generated by Xtext
*/

package hu.cubussapiens.modembed.modularasm.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class ModularASMGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Module");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cTargetKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTargetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTargetQualifiedIDParserRuleCall_3_0 = (RuleCall)cTargetAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cItemsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cItemsModuleItemParserRuleCall_5_0 = (RuleCall)cItemsAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cLeftParenthesisKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cParamsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cParamsModuleParamParserRuleCall_6_1_0 = (RuleCall)cParamsAssignment_6_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Module:
		//	"module" name=ID "target" target=QualifiedID "{" items+=ModuleItem* ("(" params+=ModuleParam* ")")? "}";
		public ParserRule getRule() { return rule; }

		//"module" name=ID "target" target=QualifiedID "{" items+=ModuleItem* ("(" params+=ModuleParam* ")")? "}"
		public Group getGroup() { return cGroup; }

		//"module"
		public Keyword getModuleKeyword_0() { return cModuleKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"target"
		public Keyword getTargetKeyword_2() { return cTargetKeyword_2; }

		//target=QualifiedID
		public Assignment getTargetAssignment_3() { return cTargetAssignment_3; }

		//QualifiedID
		public RuleCall getTargetQualifiedIDParserRuleCall_3_0() { return cTargetQualifiedIDParserRuleCall_3_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//items+=ModuleItem*
		public Assignment getItemsAssignment_5() { return cItemsAssignment_5; }

		//ModuleItem
		public RuleCall getItemsModuleItemParserRuleCall_5_0() { return cItemsModuleItemParserRuleCall_5_0; }

		//("(" params+=ModuleParam* ")")?
		public Group getGroup_6() { return cGroup_6; }

		//"("
		public Keyword getLeftParenthesisKeyword_6_0() { return cLeftParenthesisKeyword_6_0; }

		//params+=ModuleParam*
		public Assignment getParamsAssignment_6_1() { return cParamsAssignment_6_1; }

		//ModuleParam
		public RuleCall getParamsModuleParamParserRuleCall_6_1_0() { return cParamsModuleParamParserRuleCall_6_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_6_2() { return cRightParenthesisKeyword_6_2; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}

	public class ModuleParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModuleParam");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTypeModuleParamTypeParserRuleCall_0_0 = (RuleCall)cTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//ModuleParam:
		//	type=ModuleParamType name=ID;
		public ParserRule getRule() { return rule; }

		//type=ModuleParamType name=ID
		public Group getGroup() { return cGroup; }

		//type=ModuleParamType
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }

		//ModuleParamType
		public RuleCall getTypeModuleParamTypeParserRuleCall_0_0() { return cTypeModuleParamTypeParserRuleCall_0_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class ModuleParamTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModuleParamType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cLiteralKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cCallbackKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cAddressKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//ModuleParamType returns ecore::EString:
		//	"literal" | "callback" | "address";
		public ParserRule getRule() { return rule; }

		//"literal" | "callback" | "address"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"literal"
		public Keyword getLiteralKeyword_0() { return cLiteralKeyword_0; }

		//"callback"
		public Keyword getCallbackKeyword_1() { return cCallbackKeyword_1; }

		//"address"
		public Keyword getAddressKeyword_2() { return cAddressKeyword_2; }
	}

	public class QualifiedIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QualifiedID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSegmentsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSegmentsIDTerminalRuleCall_0_0 = (RuleCall)cSegmentsAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSegmentsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSegmentsIDTerminalRuleCall_1_1_0 = (RuleCall)cSegmentsAssignment_1_1.eContents().get(0);
		
		//QualifiedID:
		//	segments+=ID ("." segments+=ID)?;
		public ParserRule getRule() { return rule; }

		//segments+=ID ("." segments+=ID)?
		public Group getGroup() { return cGroup; }

		//segments+=ID
		public Assignment getSegmentsAssignment_0() { return cSegmentsAssignment_0; }

		//ID
		public RuleCall getSegmentsIDTerminalRuleCall_0_0() { return cSegmentsIDTerminalRuleCall_0_0; }

		//("." segments+=ID)?
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//segments+=ID
		public Assignment getSegmentsAssignment_1_1() { return cSegmentsAssignment_1_1; }

		//ID
		public RuleCall getSegmentsIDTerminalRuleCall_1_1_0() { return cSegmentsIDTerminalRuleCall_1_1_0; }
	}

	public class ModuleItemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ModuleItem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cVariableDeclParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cInstanceParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cFunctionParserRuleCall_0_2 = (RuleCall)cAlternatives_0.eContents().get(2);
		private final Keyword cSemicolonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//ModuleItem:
		//	(VariableDecl | Instance | Function) ";";
		public ParserRule getRule() { return rule; }

		//(VariableDecl | Instance | Function) ";"
		public Group getGroup() { return cGroup; }

		//VariableDecl | Instance | Function
		public Alternatives getAlternatives_0() { return cAlternatives_0; }

		//VariableDecl
		public RuleCall getVariableDeclParserRuleCall_0_0() { return cVariableDeclParserRuleCall_0_0; }

		//Instance
		public RuleCall getInstanceParserRuleCall_0_1() { return cInstanceParserRuleCall_0_1; }

		//Function
		public RuleCall getFunctionParserRuleCall_0_2() { return cFunctionParserRuleCall_0_2; }

		//";"
		public Keyword getSemicolonKeyword_1() { return cSemicolonKeyword_1; }
	}

	public class ModifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Modifier");
		private final Keyword cPublicKeyword = (Keyword)rule.eContents().get(1);
		
		//Modifier returns ecore::EString:
		//	"public";
		public ParserRule getRule() { return rule; }

		//"public"
		public Keyword getPublicKeyword() { return cPublicKeyword; }
	}

	public class VariableDeclElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "VariableDecl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cModifierAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cModifierModifierParserRuleCall_0_0 = (RuleCall)cModifierAssignment_0.eContents().get(0);
		private final Assignment cVariableAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cVariableVariableParserRuleCall_1_0 = (RuleCall)cVariableAssignment_1.eContents().get(0);
		
		//VariableDecl:
		//	modifier+=Modifier* variable=Variable;
		public ParserRule getRule() { return rule; }

		//modifier+=Modifier* variable=Variable
		public Group getGroup() { return cGroup; }

		//modifier+=Modifier*
		public Assignment getModifierAssignment_0() { return cModifierAssignment_0; }

		//Modifier
		public RuleCall getModifierModifierParserRuleCall_0_0() { return cModifierModifierParserRuleCall_0_0; }

		//variable=Variable
		public Assignment getVariableAssignment_1() { return cVariableAssignment_1; }

		//Variable
		public RuleCall getVariableVariableParserRuleCall_1_0() { return cVariableVariableParserRuleCall_1_0; }
	}

	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Variable:
		//	"var" name=ID;
		public ParserRule getRule() { return rule; }

		//"var" name=ID
		public Group getGroup() { return cGroup; }

		//"var"
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class InstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Instance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeQualifiedIDParserRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cParamsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cParamsModuleParamParserRuleCall_3_1_0 = (RuleCall)cParamsAssignment_3_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		
		//Instance:
		//	"instance" type=QualifiedID name=ID ("(" params+=ModuleParam* ")")?;
		public ParserRule getRule() { return rule; }

		//"instance" type=QualifiedID name=ID ("(" params+=ModuleParam* ")")?
		public Group getGroup() { return cGroup; }

		//"instance"
		public Keyword getInstanceKeyword_0() { return cInstanceKeyword_0; }

		//type=QualifiedID
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//QualifiedID
		public RuleCall getTypeQualifiedIDParserRuleCall_1_0() { return cTypeQualifiedIDParserRuleCall_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//("(" params+=ModuleParam* ")")?
		public Group getGroup_3() { return cGroup_3; }

		//"("
		public Keyword getLeftParenthesisKeyword_3_0() { return cLeftParenthesisKeyword_3_0; }

		//params+=ModuleParam*
		public Assignment getParamsAssignment_3_1() { return cParamsAssignment_3_1; }

		//ModuleParam
		public RuleCall getParamsModuleParamParserRuleCall_3_1_0() { return cParamsModuleParamParserRuleCall_3_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3_2() { return cRightParenthesisKeyword_3_2; }
	}

	public class FunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Function");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFuncKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cStepAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cStepStepParserRuleCall_3_0_0 = (RuleCall)cStepAssignment_3_0.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Function:
		//	"func" name=ID "{" (step+=Step ";")* "}";
		public ParserRule getRule() { return rule; }

		//"func" name=ID "{" (step+=Step ";")* "}"
		public Group getGroup() { return cGroup; }

		//"func"
		public Keyword getFuncKeyword_0() { return cFuncKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(step+=Step ";")*
		public Group getGroup_3() { return cGroup_3; }

		//step+=Step
		public Assignment getStepAssignment_3_0() { return cStepAssignment_3_0; }

		//Step
		public RuleCall getStepStepParserRuleCall_3_0_0() { return cStepStepParserRuleCall_3_0_0; }

		//";"
		public Keyword getSemicolonKeyword_3_1() { return cSemicolonKeyword_3_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class StepElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Step");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cInstructionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLabelParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Step:
		//	Instruction | Label;
		public ParserRule getRule() { return rule; }

		//Instruction | Label
		public Alternatives getAlternatives() { return cAlternatives; }

		//Instruction
		public RuleCall getInstructionParserRuleCall_0() { return cInstructionParserRuleCall_0; }

		//Label
		public RuleCall getLabelParserRuleCall_1() { return cLabelParserRuleCall_1; }
	}

	public class LabelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Label");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLabelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Label:
		//	"label" name=ID;
		public ParserRule getRule() { return rule; }

		//"label" name=ID
		public Group getGroup() { return cGroup; }

		//"label"
		public Keyword getLabelKeyword_0() { return cLabelKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class InstructionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Instruction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cInsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cInsIDTerminalRuleCall_0_0 = (RuleCall)cInsAssignment_0.eContents().get(0);
		private final Assignment cParamsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cParamsParamParserRuleCall_1_0 = (RuleCall)cParamsAssignment_1.eContents().get(0);
		
		//Instruction:
		//	ins=ID params+=Param*;
		public ParserRule getRule() { return rule; }

		//ins=ID params+=Param*
		public Group getGroup() { return cGroup; }

		//ins=ID
		public Assignment getInsAssignment_0() { return cInsAssignment_0; }

		//ID
		public RuleCall getInsIDTerminalRuleCall_0_0() { return cInsIDTerminalRuleCall_0_0; }

		//params+=Param*
		public Assignment getParamsAssignment_1() { return cParamsAssignment_1; }

		//Param
		public RuleCall getParamsParamParserRuleCall_1_0() { return cParamsParamParserRuleCall_1_0; }
	}

	public class ParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Param");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cLiteralParamParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRefParamParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Param:
		//	LiteralParam | RefParam;
		public ParserRule getRule() { return rule; }

		//LiteralParam | RefParam
		public Alternatives getAlternatives() { return cAlternatives; }

		//LiteralParam
		public RuleCall getLiteralParamParserRuleCall_0() { return cLiteralParamParserRuleCall_0; }

		//RefParam
		public RuleCall getRefParamParserRuleCall_1() { return cRefParamParserRuleCall_1; }
	}

	public class LiteralParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LiteralParam");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cValueINTTerminalRuleCall_0_0 = (RuleCall)cValueAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cValueHEXINTTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//LiteralParam:
		//	value=INT | value=HEXINT;
		public ParserRule getRule() { return rule; }

		//value=INT | value=HEXINT
		public Alternatives getAlternatives() { return cAlternatives; }

		//value=INT
		public Assignment getValueAssignment_0() { return cValueAssignment_0; }

		//INT
		public RuleCall getValueINTTerminalRuleCall_0_0() { return cValueINTTerminalRuleCall_0_0; }

		//value=HEXINT
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }

		//HEXINT
		public RuleCall getValueHEXINTTerminalRuleCall_1_0() { return cValueHEXINTTerminalRuleCall_1_0; }
	}

	public class RefParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RefParam");
		private final Assignment cRefAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cRefQualifiedIDParserRuleCall_0 = (RuleCall)cRefAssignment.eContents().get(0);
		
		//RefParam:
		//	ref=QualifiedID;
		public ParserRule getRule() { return rule; }

		//ref=QualifiedID
		public Assignment getRefAssignment() { return cRefAssignment; }

		//QualifiedID
		public RuleCall getRefQualifiedIDParserRuleCall_0() { return cRefQualifiedIDParserRuleCall_0; }
	}
	
	
	private ModuleElements pModule;
	private ModuleParamElements pModuleParam;
	private ModuleParamTypeElements pModuleParamType;
	private QualifiedIDElements pQualifiedID;
	private ModuleItemElements pModuleItem;
	private ModifierElements pModifier;
	private VariableDeclElements pVariableDecl;
	private VariableElements pVariable;
	private InstanceElements pInstance;
	private FunctionElements pFunction;
	private StepElements pStep;
	private LabelElements pLabel;
	private InstructionElements pInstruction;
	private ParamElements pParam;
	private TerminalRule tHEXINT;
	private LiteralParamElements pLiteralParam;
	private RefParamElements pRefParam;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public ModularASMGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Module:
	//	"module" name=ID "target" target=QualifiedID "{" items+=ModuleItem* ("(" params+=ModuleParam* ")")? "}";
	public ModuleElements getModuleAccess() {
		return (pModule != null) ? pModule : (pModule = new ModuleElements());
	}
	
	public ParserRule getModuleRule() {
		return getModuleAccess().getRule();
	}

	//ModuleParam:
	//	type=ModuleParamType name=ID;
	public ModuleParamElements getModuleParamAccess() {
		return (pModuleParam != null) ? pModuleParam : (pModuleParam = new ModuleParamElements());
	}
	
	public ParserRule getModuleParamRule() {
		return getModuleParamAccess().getRule();
	}

	//ModuleParamType returns ecore::EString:
	//	"literal" | "callback" | "address";
	public ModuleParamTypeElements getModuleParamTypeAccess() {
		return (pModuleParamType != null) ? pModuleParamType : (pModuleParamType = new ModuleParamTypeElements());
	}
	
	public ParserRule getModuleParamTypeRule() {
		return getModuleParamTypeAccess().getRule();
	}

	//QualifiedID:
	//	segments+=ID ("." segments+=ID)?;
	public QualifiedIDElements getQualifiedIDAccess() {
		return (pQualifiedID != null) ? pQualifiedID : (pQualifiedID = new QualifiedIDElements());
	}
	
	public ParserRule getQualifiedIDRule() {
		return getQualifiedIDAccess().getRule();
	}

	//ModuleItem:
	//	(VariableDecl | Instance | Function) ";";
	public ModuleItemElements getModuleItemAccess() {
		return (pModuleItem != null) ? pModuleItem : (pModuleItem = new ModuleItemElements());
	}
	
	public ParserRule getModuleItemRule() {
		return getModuleItemAccess().getRule();
	}

	//Modifier returns ecore::EString:
	//	"public";
	public ModifierElements getModifierAccess() {
		return (pModifier != null) ? pModifier : (pModifier = new ModifierElements());
	}
	
	public ParserRule getModifierRule() {
		return getModifierAccess().getRule();
	}

	//VariableDecl:
	//	modifier+=Modifier* variable=Variable;
	public VariableDeclElements getVariableDeclAccess() {
		return (pVariableDecl != null) ? pVariableDecl : (pVariableDecl = new VariableDeclElements());
	}
	
	public ParserRule getVariableDeclRule() {
		return getVariableDeclAccess().getRule();
	}

	//Variable:
	//	"var" name=ID;
	public VariableElements getVariableAccess() {
		return (pVariable != null) ? pVariable : (pVariable = new VariableElements());
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}

	//Instance:
	//	"instance" type=QualifiedID name=ID ("(" params+=ModuleParam* ")")?;
	public InstanceElements getInstanceAccess() {
		return (pInstance != null) ? pInstance : (pInstance = new InstanceElements());
	}
	
	public ParserRule getInstanceRule() {
		return getInstanceAccess().getRule();
	}

	//Function:
	//	"func" name=ID "{" (step+=Step ";")* "}";
	public FunctionElements getFunctionAccess() {
		return (pFunction != null) ? pFunction : (pFunction = new FunctionElements());
	}
	
	public ParserRule getFunctionRule() {
		return getFunctionAccess().getRule();
	}

	//Step:
	//	Instruction | Label;
	public StepElements getStepAccess() {
		return (pStep != null) ? pStep : (pStep = new StepElements());
	}
	
	public ParserRule getStepRule() {
		return getStepAccess().getRule();
	}

	//Label:
	//	"label" name=ID;
	public LabelElements getLabelAccess() {
		return (pLabel != null) ? pLabel : (pLabel = new LabelElements());
	}
	
	public ParserRule getLabelRule() {
		return getLabelAccess().getRule();
	}

	//Instruction:
	//	ins=ID params+=Param*;
	public InstructionElements getInstructionAccess() {
		return (pInstruction != null) ? pInstruction : (pInstruction = new InstructionElements());
	}
	
	public ParserRule getInstructionRule() {
		return getInstructionAccess().getRule();
	}

	//Param:
	//	LiteralParam | RefParam;
	public ParamElements getParamAccess() {
		return (pParam != null) ? pParam : (pParam = new ParamElements());
	}
	
	public ParserRule getParamRule() {
		return getParamAccess().getRule();
	}

	//terminal HEXINT returns ecore::EInt:
	//	"0x" ("0".."9" | "A".."F" | "a".."f")+;
	public TerminalRule getHEXINTRule() {
		return (tHEXINT != null) ? tHEXINT : (tHEXINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "HEXINT"));
	} 

	//LiteralParam:
	//	value=INT | value=HEXINT;
	public LiteralParamElements getLiteralParamAccess() {
		return (pLiteralParam != null) ? pLiteralParam : (pLiteralParam = new LiteralParamElements());
	}
	
	public ParserRule getLiteralParamRule() {
		return getLiteralParamAccess().getRule();
	}

	//RefParam:
	//	ref=QualifiedID;
	public RefParamElements getRefParamAccess() {
		return (pRefParam != null) ? pRefParam : (pRefParam = new RefParamElements());
	}
	
	public ParserRule getRefParamRule() {
		return getRefParamAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
