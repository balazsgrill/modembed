/*
* generated by Xtext
*/
grammar InternalModularASM;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package hu.cubussapiens.modembed.modularasm.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package hu.cubussapiens.modembed.modularasm.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import hu.cubussapiens.modembed.modularasm.services.ModularASMGrammarAccess;

}

@parser::members {
 
 	private ModularASMGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(ModularASMGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleModule
entryRuleModule 
@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
}
:
{ before(grammarAccess.getModuleRule()); }
	 ruleModule
{ after(grammarAccess.getModuleRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Module
ruleModule
    @init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleAccess().getGroup()); }
(rule__Module__Group__0)
{ after(grammarAccess.getModuleAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}



// Entry rule entryRuleModuleParam
entryRuleModuleParam 
:
{ before(grammarAccess.getModuleParamRule()); }
	 ruleModuleParam
{ after(grammarAccess.getModuleParamRule()); } 
	 EOF 
;

// Rule ModuleParam
ruleModuleParam
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleParamAccess().getGroup()); }
(rule__ModuleParam__Group__0)
{ after(grammarAccess.getModuleParamAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleModuleParamType
entryRuleModuleParamType 
:
{ before(grammarAccess.getModuleParamTypeRule()); }
	 ruleModuleParamType
{ after(grammarAccess.getModuleParamTypeRule()); } 
	 EOF 
;

// Rule ModuleParamType
ruleModuleParamType
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleParamTypeAccess().getAlternatives()); }
(rule__ModuleParamType__Alternatives)
{ after(grammarAccess.getModuleParamTypeAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleQualifiedID
entryRuleQualifiedID 
:
{ before(grammarAccess.getQualifiedIDRule()); }
	 ruleQualifiedID
{ after(grammarAccess.getQualifiedIDRule()); } 
	 EOF 
;

// Rule QualifiedID
ruleQualifiedID
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getQualifiedIDAccess().getGroup()); }
(rule__QualifiedID__Group__0)
{ after(grammarAccess.getQualifiedIDAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleModuleItem
entryRuleModuleItem 
:
{ before(grammarAccess.getModuleItemRule()); }
	 ruleModuleItem
{ after(grammarAccess.getModuleItemRule()); } 
	 EOF 
;

// Rule ModuleItem
ruleModuleItem
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModuleItemAccess().getGroup()); }
(rule__ModuleItem__Group__0)
{ after(grammarAccess.getModuleItemAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleModifier
entryRuleModifier 
:
{ before(grammarAccess.getModifierRule()); }
	 ruleModifier
{ after(grammarAccess.getModifierRule()); } 
	 EOF 
;

// Rule Modifier
ruleModifier
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModifierAccess().getPublicKeyword()); }

	'public' 

{ after(grammarAccess.getModifierAccess().getPublicKeyword()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariableDecl
entryRuleVariableDecl 
:
{ before(grammarAccess.getVariableDeclRule()); }
	 ruleVariableDecl
{ after(grammarAccess.getVariableDeclRule()); } 
	 EOF 
;

// Rule VariableDecl
ruleVariableDecl
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableDeclAccess().getGroup()); }
(rule__VariableDecl__Group__0)
{ after(grammarAccess.getVariableDeclAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleVariable
entryRuleVariable 
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getVariableAccess().getGroup()); }
(rule__Variable__Group__0)
{ after(grammarAccess.getVariableAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInstance
entryRuleInstance 
:
{ before(grammarAccess.getInstanceRule()); }
	 ruleInstance
{ after(grammarAccess.getInstanceRule()); } 
	 EOF 
;

// Rule Instance
ruleInstance
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInstanceAccess().getGroup()); }
(rule__Instance__Group__0)
{ after(grammarAccess.getInstanceAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleFunction
entryRuleFunction 
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getFunctionAccess().getGroup()); }
(rule__Function__Group__0)
{ after(grammarAccess.getFunctionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStep
entryRuleStep 
:
{ before(grammarAccess.getStepRule()); }
	 ruleStep
{ after(grammarAccess.getStepRule()); } 
	 EOF 
;

// Rule Step
ruleStep
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStepAccess().getAlternatives()); }
(rule__Step__Alternatives)
{ after(grammarAccess.getStepAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLabel
entryRuleLabel 
:
{ before(grammarAccess.getLabelRule()); }
	 ruleLabel
{ after(grammarAccess.getLabelRule()); } 
	 EOF 
;

// Rule Label
ruleLabel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLabelAccess().getGroup()); }
(rule__Label__Group__0)
{ after(grammarAccess.getLabelAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleInstruction
entryRuleInstruction 
:
{ before(grammarAccess.getInstructionRule()); }
	 ruleInstruction
{ after(grammarAccess.getInstructionRule()); } 
	 EOF 
;

// Rule Instruction
ruleInstruction
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getInstructionAccess().getGroup()); }
(rule__Instruction__Group__0)
{ after(grammarAccess.getInstructionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleParam
entryRuleParam 
:
{ before(grammarAccess.getParamRule()); }
	 ruleParam
{ after(grammarAccess.getParamRule()); } 
	 EOF 
;

// Rule Param
ruleParam
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getParamAccess().getAlternatives()); }
(rule__Param__Alternatives)
{ after(grammarAccess.getParamAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleLiteralParam
entryRuleLiteralParam 
:
{ before(grammarAccess.getLiteralParamRule()); }
	 ruleLiteralParam
{ after(grammarAccess.getLiteralParamRule()); } 
	 EOF 
;

// Rule LiteralParam
ruleLiteralParam
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getLiteralParamAccess().getAlternatives()); }
(rule__LiteralParam__Alternatives)
{ after(grammarAccess.getLiteralParamAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRefParam
entryRuleRefParam 
:
{ before(grammarAccess.getRefParamRule()); }
	 ruleRefParam
{ after(grammarAccess.getRefParamRule()); } 
	 EOF 
;

// Rule RefParam
ruleRefParam
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRefParamAccess().getRefAssignment()); }
(rule__RefParam__RefAssignment)
{ after(grammarAccess.getRefParamAccess().getRefAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__ModuleParamType__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleParamTypeAccess().getLiteralKeyword_0()); }

	'literal' 

{ after(grammarAccess.getModuleParamTypeAccess().getLiteralKeyword_0()); }
)

    |(
{ before(grammarAccess.getModuleParamTypeAccess().getCallbackKeyword_1()); }

	'callback' 

{ after(grammarAccess.getModuleParamTypeAccess().getCallbackKeyword_1()); }
)

    |(
{ before(grammarAccess.getModuleParamTypeAccess().getAddressKeyword_2()); }

	'address' 

{ after(grammarAccess.getModuleParamTypeAccess().getAddressKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleItem__Alternatives_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleItemAccess().getVariableDeclParserRuleCall_0_0()); }
	ruleVariableDecl
{ after(grammarAccess.getModuleItemAccess().getVariableDeclParserRuleCall_0_0()); }
)

    |(
{ before(grammarAccess.getModuleItemAccess().getInstanceParserRuleCall_0_1()); }
	ruleInstance
{ after(grammarAccess.getModuleItemAccess().getInstanceParserRuleCall_0_1()); }
)

    |(
{ before(grammarAccess.getModuleItemAccess().getFunctionParserRuleCall_0_2()); }
	ruleFunction
{ after(grammarAccess.getModuleItemAccess().getFunctionParserRuleCall_0_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Step__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStepAccess().getInstructionParserRuleCall_0()); }
	ruleInstruction
{ after(grammarAccess.getStepAccess().getInstructionParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getStepAccess().getLabelParserRuleCall_1()); }
	ruleLabel
{ after(grammarAccess.getStepAccess().getLabelParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getParamAccess().getLiteralParamParserRuleCall_0()); }
	ruleLiteralParam
{ after(grammarAccess.getParamAccess().getLiteralParamParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getParamAccess().getRefParamParserRuleCall_1()); }
	ruleRefParam
{ after(grammarAccess.getParamAccess().getRefParamParserRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralParam__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLiteralParamAccess().getValueAssignment_0()); }
(rule__LiteralParam__ValueAssignment_0)
{ after(grammarAccess.getLiteralParamAccess().getValueAssignment_0()); }
)

    |(
{ before(grammarAccess.getLiteralParamAccess().getValueAssignment_1()); }
(rule__LiteralParam__ValueAssignment_1)
{ after(grammarAccess.getLiteralParamAccess().getValueAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Module__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__0__Impl
	rule__Module__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getModuleKeyword_0()); }

	'module' 

{ after(grammarAccess.getModuleAccess().getModuleKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__1__Impl
	rule__Module__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNameAssignment_1()); }
(rule__Module__NameAssignment_1)
{ after(grammarAccess.getModuleAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__2__Impl
	rule__Module__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getTargetKeyword_2()); }

	'target' 

{ after(grammarAccess.getModuleAccess().getTargetKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__3__Impl
	rule__Module__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getTargetAssignment_3()); }
(rule__Module__TargetAssignment_3)
{ after(grammarAccess.getModuleAccess().getTargetAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__4__Impl
	rule__Module__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4()); }

	'{' 

{ after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__5__Impl
	rule__Module__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getItemsAssignment_5()); }
(rule__Module__ItemsAssignment_5)*
{ after(grammarAccess.getModuleAccess().getItemsAssignment_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__6__Impl
	rule__Module__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getGroup_6()); }
(rule__Module__Group_6__0)?
{ after(grammarAccess.getModuleAccess().getGroup_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group__7
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group__7__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7()); }

	'}' 

{ after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_7()); }
)

;
finally {
	restoreStackSize(stackSize);
}


















rule__Module__Group_6__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_6__0__Impl
	rule__Module__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_6__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_6_0()); }

	'(' 

{ after(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_6_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_6__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_6__1__Impl
	rule__Module__Group_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_6__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getParamsAssignment_6_1()); }
(rule__Module__ParamsAssignment_6_1)*
{ after(grammarAccess.getModuleAccess().getParamsAssignment_6_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Module__Group_6__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Module__Group_6__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Module__Group_6__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_6_2()); }

	')' 

{ after(grammarAccess.getModuleAccess().getRightParenthesisKeyword_6_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__ModuleParam__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleParam__Group__0__Impl
	rule__ModuleParam__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleParam__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleParamAccess().getTypeAssignment_0()); }
(rule__ModuleParam__TypeAssignment_0)
{ after(grammarAccess.getModuleParamAccess().getTypeAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleParam__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleParam__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleParam__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleParamAccess().getNameAssignment_1()); }
(rule__ModuleParam__NameAssignment_1)
{ after(grammarAccess.getModuleParamAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedID__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedID__Group__0__Impl
	rule__QualifiedID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedIDAccess().getSegmentsAssignment_0()); }
(rule__QualifiedID__SegmentsAssignment_0)
{ after(grammarAccess.getQualifiedIDAccess().getSegmentsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedID__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedID__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedIDAccess().getGroup_1()); }
(rule__QualifiedID__Group_1__0)?
{ after(grammarAccess.getQualifiedIDAccess().getGroup_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__QualifiedID__Group_1__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedID__Group_1__0__Impl
	rule__QualifiedID__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group_1__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); }

	'.' 

{ after(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedID__Group_1__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__QualifiedID__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group_1__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedIDAccess().getSegmentsAssignment_1_1()); }
(rule__QualifiedID__SegmentsAssignment_1_1)
{ after(grammarAccess.getQualifiedIDAccess().getSegmentsAssignment_1_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ModuleItem__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleItem__Group__0__Impl
	rule__ModuleItem__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleItem__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleItemAccess().getAlternatives_0()); }
(rule__ModuleItem__Alternatives_0)
{ after(grammarAccess.getModuleItemAccess().getAlternatives_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleItem__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModuleItem__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleItem__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleItemAccess().getSemicolonKeyword_1()); }

	';' 

{ after(grammarAccess.getModuleItemAccess().getSemicolonKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__VariableDecl__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableDecl__Group__0__Impl
	rule__VariableDecl__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDecl__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableDeclAccess().getModifierAssignment_0()); }
(rule__VariableDecl__ModifierAssignment_0)*
{ after(grammarAccess.getVariableDeclAccess().getModifierAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__VariableDecl__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__VariableDecl__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDecl__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableDeclAccess().getVariableAssignment_1()); }
(rule__VariableDecl__VariableAssignment_1)
{ after(grammarAccess.getVariableDeclAccess().getVariableAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Variable__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__0__Impl
	rule__Variable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getVarKeyword_0()); }

	'var' 

{ after(grammarAccess.getVariableAccess().getVarKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Variable__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Variable__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getNameAssignment_1()); }
(rule__Variable__NameAssignment_1)
{ after(grammarAccess.getVariableAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Instance__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instance__Group__0__Impl
	rule__Instance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); }

	'instance' 

{ after(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instance__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instance__Group__1__Impl
	rule__Instance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getTypeAssignment_1()); }
(rule__Instance__TypeAssignment_1)
{ after(grammarAccess.getInstanceAccess().getTypeAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instance__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instance__Group__2__Impl
	rule__Instance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getNameAssignment_2()); }
(rule__Instance__NameAssignment_2)
{ after(grammarAccess.getInstanceAccess().getNameAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instance__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instance__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getGroup_3()); }
(rule__Instance__Group_3__0)?
{ after(grammarAccess.getInstanceAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}










rule__Instance__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instance__Group_3__0__Impl
	rule__Instance__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3_0()); }

	'(' 

{ after(grammarAccess.getInstanceAccess().getLeftParenthesisKeyword_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instance__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instance__Group_3__1__Impl
	rule__Instance__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getParamsAssignment_3_1()); }
(rule__Instance__ParamsAssignment_3_1)*
{ after(grammarAccess.getInstanceAccess().getParamsAssignment_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instance__Group_3__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instance__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group_3__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_3_2()); }

	')' 

{ after(grammarAccess.getInstanceAccess().getRightParenthesisKeyword_3_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}








rule__Function__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Function__Group__0__Impl
	rule__Function__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getFuncKeyword_0()); }

	'func' 

{ after(grammarAccess.getFunctionAccess().getFuncKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Function__Group__1__Impl
	rule__Function__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getNameAssignment_1()); }
(rule__Function__NameAssignment_1)
{ after(grammarAccess.getFunctionAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Function__Group__2__Impl
	rule__Function__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Function__Group__3__Impl
	rule__Function__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getGroup_3()); }
(rule__Function__Group_3__0)*
{ after(grammarAccess.getFunctionAccess().getGroup_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Function__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Function__Group_3__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Function__Group_3__0__Impl
	rule__Function__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_3__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getStepAssignment_3_0()); }
(rule__Function__StepAssignment_3_0)
{ after(grammarAccess.getFunctionAccess().getStepAssignment_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_3__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Function__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_3__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getSemicolonKeyword_3_1()); }

	';' 

{ after(grammarAccess.getFunctionAccess().getSemicolonKeyword_3_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Label__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group__0__Impl
	rule__Label__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getLabelKeyword_0()); }

	'label' 

{ after(grammarAccess.getLabelAccess().getLabelKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Label__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Label__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Label__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getNameAssignment_1()); }
(rule__Label__NameAssignment_1)
{ after(grammarAccess.getLabelAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__Instruction__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instruction__Group__0__Impl
	rule__Instruction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstructionAccess().getInsAssignment_0()); }
(rule__Instruction__InsAssignment_0)
{ after(grammarAccess.getInstructionAccess().getInsAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Instruction__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Instruction__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstructionAccess().getParamsAssignment_1()); }
(rule__Instruction__ParamsAssignment_1)*
{ after(grammarAccess.getInstructionAccess().getParamsAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}







rule__Module__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__TargetAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getTargetQualifiedIDParserRuleCall_3_0()); }
	ruleQualifiedID{ after(grammarAccess.getModuleAccess().getTargetQualifiedIDParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__ItemsAssignment_5
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getItemsModuleItemParserRuleCall_5_0()); }
	ruleModuleItem{ after(grammarAccess.getModuleAccess().getItemsModuleItemParserRuleCall_5_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Module__ParamsAssignment_6_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleAccess().getParamsModuleParamParserRuleCall_6_1_0()); }
	ruleModuleParam{ after(grammarAccess.getModuleAccess().getParamsModuleParamParserRuleCall_6_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleParam__TypeAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleParamAccess().getTypeModuleParamTypeParserRuleCall_0_0()); }
	ruleModuleParamType{ after(grammarAccess.getModuleParamAccess().getTypeModuleParamTypeParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleParam__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModuleParamAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getModuleParamAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__SegmentsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__SegmentsAssignment_1_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_1_1_0()); }
	RULE_ID{ after(grammarAccess.getQualifiedIDAccess().getSegmentsIDTerminalRuleCall_1_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDecl__ModifierAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableDeclAccess().getModifierModifierParserRuleCall_0_0()); }
	ruleModifier{ after(grammarAccess.getVariableDeclAccess().getModifierModifierParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__VariableDecl__VariableAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableDeclAccess().getVariableVariableParserRuleCall_1_0()); }
	ruleVariable{ after(grammarAccess.getVariableDeclAccess().getVariableVariableParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__TypeAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getTypeQualifiedIDParserRuleCall_1_0()); }
	ruleQualifiedID{ after(grammarAccess.getInstanceAccess().getTypeQualifiedIDParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__NameAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); }
	RULE_ID{ after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__ParamsAssignment_3_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstanceAccess().getParamsModuleParamParserRuleCall_3_1_0()); }
	ruleModuleParam{ after(grammarAccess.getInstanceAccess().getParamsModuleParamParserRuleCall_3_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Function__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Function__StepAssignment_3_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getFunctionAccess().getStepStepParserRuleCall_3_0_0()); }
	ruleStep{ after(grammarAccess.getFunctionAccess().getStepStepParserRuleCall_3_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Label__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); }
	RULE_ID{ after(grammarAccess.getLabelAccess().getNameIDTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__InsAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstructionAccess().getInsIDTerminalRuleCall_0_0()); }
	RULE_ID{ after(grammarAccess.getInstructionAccess().getInsIDTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Instruction__ParamsAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getInstructionAccess().getParamsParamParserRuleCall_1_0()); }
	ruleParam{ after(grammarAccess.getInstructionAccess().getParamsParamParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralParam__ValueAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLiteralParamAccess().getValueINTTerminalRuleCall_0_0()); }
	RULE_INT{ after(grammarAccess.getLiteralParamAccess().getValueINTTerminalRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__LiteralParam__ValueAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getLiteralParamAccess().getValueHEXINTTerminalRuleCall_1_0()); }
	RULE_HEXINT{ after(grammarAccess.getLiteralParamAccess().getValueHEXINTTerminalRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RefParam__RefAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRefParamAccess().getRefQualifiedIDParserRuleCall_0()); }
	ruleQualifiedID{ after(grammarAccess.getRefParamAccess().getRefQualifiedIDParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_HEXINT : '0x' ('0'..'9'|'A'..'F'|'a'..'f')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


