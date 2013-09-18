#!platform:/resource/e.core/syntax/syntax.model
syntax device.syntax <Start>;
import core.syntax;
import type.syntax;
import expressions.syntax;

terminal KW_DEVICE "device";
terminal KW_INSTRUCTIONSET "instructionset";
terminal KW_EXTENDS "extends";
terminal KW_MTYPE "mtype";
terminal KW_MEM "mem";
terminal KW_OPERATION "operation";
terminal KW_VOLATILE "volatile";
terminal KW_PROGRAM "program";
terminal KW_DATA "data";
terminal KW_IF "if";
terminal OP_OPEN "\{";
terminal OP_CLOSE "\}";
terminal OP_COMMA "\,";
terminal OP_COLON "\:";
terminal OP_AT "\@";
terminal OP_ATTR "->";

terminal OP_POINTERSIZE "pointerSize";

<Start> :- KW_DEVICE {"http://modembed.hu/abstraction#DeviceAbstraction" name=QUALIFIEDID <Extends>? <InstructionSetDefinition>? OPERATOR_SEMICOLON 
	<Item>*?	;

<Item> :- <MemoryType> OPERATOR_SEMICOLON ;
<Item> :- <MemoryInstance> OPERATOR_SEMICOLON ;
<Item> :- <Operation> ;
<Item> :- OP_POINTERSIZE sizeOfPointer=DECIMAL_NUMBER OPERATOR_SEMICOLON;

<Extends> :- KW_EXTENDS ancestor=QUALIFIEDID ;

<InstructionSetDefinition> :- KW_INSTRUCTIONSET instructionset=QUALIFIEDID ;

<MemoryType> :- KW_MTYPE memoryTypes={"http://modembed.hu/abstraction/memorymodel#MemoryType"
			contentVolatile=KW_VOLATILE? forProgram=KW_PROGRAM? forData=KW_DATA?
			name=IDENTIFIER BRACKET_OPEN accessCost=DECIMAL_NUMBER BRACKET_CLOSE <Attributes>? } ;
			
<Attributes> :- OP_OPEN attributes={"http://modembed.hu/infrastructure#AttributeContainerDefinition" <Attribute>* } OP_CLOSE;
<Attribute> :- attributes={"http://modembed.hu/infrastructure#AttributeDefinition" name=IDENTIFIER OPERATOR_SEMICOLON };

<MemoryInstance> :-  KW_MEM memoryInstances={"http://modembed.hu/abstraction/memorymodel#MemoryInstance" type=IDENTIFIER name=IDENTIFIER startAddress=HEXADECIMAL_NUMBER size=HEXADECIMAL_NUMBER <AttributeValues>? } ;
<AttributeValues> :- OP_OPEN attributes={"http://modembed.hu/infrastructure#AttributeValueContainer" <AttributeValue>* } OP_CLOSE;
<AttributeValue> :- values={"http://modembed.hu/infrastructure#AttributeValue" definition=IDENTIFIER OPERATOR_ASSIGN <AValue> };

<AValue> :- value=DECIMAL_NUMBER;
<AValue> :- value=HEXADECIMAL_NUMBER;

<Operation> :- KW_OPERATION operation={"http://modembed.hu/abstraction/behavior/platform#OperationDefinition"
				operation=IDENTIFIER 
				BRACKET_OPEN <OperationArguments>? BRACKET_CLOSE 
				OP_OPEN <OperationStep>*? OP_CLOSE };

<OperationArguments> :- <OperationArgument> <OperationArguments2>*? ;
<OperationArguments2> :- OP_COMMA <OperationArgument> ;

<OperationArgument> :- arguments={"http://modembed.hu/abstraction/behavior/platform#OperationArgument" name=IDENTIFIER 
					OP_COLON type=<TypeDefinition> <MemTypeDefinition>? 
					};

<MemTypeDefinition> :- OP_AT memType=IDENTIFIER ;

<OperationStep> :- steps={"http://modembed.hu/abstraction/behavior/platform#InstructionCallOperationStep"
						instruction=IDENTIFIER
					 BRACKET_OPEN <InstructionParameterMappings>? BRACKET_CLOSE
					} OPERATOR_SEMICOLON;
					
<OperationStep> :- steps={"http://modembed.hu/abstraction/behavior/platform#OperationLocalLabel" name=IDENTIFIER OP_COLON };					
					
<OperationStep> :- KW_IF steps={"http://modembed.hu/abstraction/behavior/platform#ConditionalOperation" condition=<Expression> OP_OPEN <OperationStep>*? OP_CLOSE };

<InstructionParameterMappings> :- arguments=<Expression> <InstructionParameterMappings2>*? ;
<InstructionParameterMappings2> :- OP_COMMA arguments=<Expression>;

<Expression0> :- OP_AT {"http://modembed.hu/abstraction/behavior/platform#LabelParameterValue" label=IDENTIFIER };

<Expression0> :- {"http://modembed.hu/abstraction/behavior/platform#InstructionParameterMapping" value=IDENTIFIER <ParameterAttribute>? };
<ParameterAttribute> :- OP_ATTR attribute=IDENTIFIER ;
