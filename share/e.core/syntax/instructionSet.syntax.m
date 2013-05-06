#!syntax
syntax instructionSet.syntax <Start>;
import core.syntax;

terminal KEYWORD_INSTRUCTIONSET "instructionset";
terminal KEYWORD_EXTENDS "extends";
terminal BRACKET_OPEN "\(";
terminal BRACKET_CLOSE "\)";
terminal WORD_START "<";
terminal WORD_END ">";
terminal OPERATOR_EQUAL "=";
terminal OPERATOR_SET ":";

<Start> :- KEYWORD_INSTRUCTIONSET {"http://modembed.hu/core/instructionset#InstructionSet" name=QUALIFIEDID <Extends>? OPERATOR_SEMICOLON <Instruction>*?; 
 
<Extends> :- KEYWORD_EXTENDS extend=QUALIFIEDID;

<Instruction> :- instructions={"http://modembed.hu/core/instructionset#Instruction" name=IDENTIFIER BRACKET_OPEN <InstructionParameter>*? BRACKET_CLOSE <Word>* } OPERATOR_SEMICOLON;

<InstructionParameter> :- parameters={"http://modembed.hu/core/instructionset#InstructionParameter" name=IDENTIFIER <defaultValue>? };

<defaultValue> :- OPERATOR_EQUAL defaultValue=DECIMAL_NUMBER ;

<sectionOptions> :- OPERATOR_SET size=DECIMAL_NUMBER <sectionShift>?;

<sectionShift> :- OPERATOR_SET shift=DECIMAL_NUMBER ;

<Word> :- WORD_START words={"http://modembed.hu/core/instructionset#InstructionWord" <Section>* } WORD_END ;

<Section> :- sections={"http://modembed.hu/core/instructionset#ConstantSection" value=BINARY_NUMBER <sectionOptions> } ;

<Section> :- sections={"http://modembed.hu/core/instructionset#ParameterSection" parameter=IDENTIFIER <sectionOptions> } ;
