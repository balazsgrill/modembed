#!syntax
syntax device.syntax <Start>;
import core.syntax;
import type.syntax;

terminal KW_DEVICE "device";
terminal KW_INSTRUCTIONSET "instructionset";
terminal KW_EXTENDS "extends";
terminal KW_MTYPE "mtype";
terminal KW_MEM "mem";
terminal KW_OPERATION "operation";
terminal KW_VOLATILE "volatile";
terminal KW_PROGRAM "program";
terminal KW_DATA "data";
terminal OP_OPEN "\{";
terminal OP_CLOSE "\}";
terminal OP_BOPEN "\(";
terminal OP_BCLOSE "\)";
terminal OP_COMMA "\,";
terminal OP_COLON "\:";
terminal OP_AT "\@";
terminal OP_ATTR "->";
terminal OP_SHIFT "<";
terminal OP_ADD "\+";

<Start> :- KW_DEVICE {"http://modembed.hu/abstraction#DeviceAbstraction" name=QUALIFIEDID <Extends>? <InstructionSetDefinition>? OPERATOR_SEMICOLON 
	<Item>*?	;

<Item> :- <MemoryType> OPERATOR_SEMICOLON ;
<Item> :- <MemoryInstance> OPERATOR_SEMICOLON ;
<Item> :- <Operation> OPERATOR_SEMICOLON ;

<Extends> :- KW_EXTENDS ancestor=QUALIFIEDID ;

<InstructionSetDefinition> :- KW_INSTRUCTIONSET instructionset=QUALIFIEDID ;

<MemoryType> :- KW_MTYPE memoryTypes={"http://modembed.hu/abstraction/memorymodel#MemoryType"
			contentVolatile=KW_VOLATILE? forProgram=KW_PROGRAM? forData=KW_DATA?
			name=IDENTIFIER OP_BOPEN accessCost=DECIMAL_NUMBER OP_BCLOSE <Attributes>? } ;
			
<Attributes> :- OP_OPEN attributes={"http://modembed.hu/infrastructure#AttributeContainerDefinition" <Attribute>* } OP_CLOSE;
<Attribute> :- attributes={"http://modembed.hu/infrastructure#AttributeDefinition" name=IDENTIFIER OPERATOR_SEMICOLON };

<MemoryInstance> :-  KW_MEM memoryInstances={"http://modembed.hu/abstraction/memorymodel#MemoryInstance" type=IDENTIFIER name=IDENTIFIER startAddress=HEXADECIMAL_NUMBER size=HEXADECIMAL_NUMBER } ;
<AttributeValues> :- OP_OPEN attributes={"http://modembed.hu/infrastructure#AttributeValueContainer" <AttributeValue>* } OP_CLOSE;
<AttributeValue> :- values={"http://modembed.hu/infrastructure#AttributeValue" definition=IDENTIFIER OPERATOR_ASSIGN value=DECIMAL_NUMBER };

<Operation> :- KW_OPERATION operation={"http://modembed.hu/abstraction/behavior/platform#OperationDefinition"
				operation=IDENTIFIER 
				OP_BOPEN <OperationArguments>? OP_BCLOSE 
				OP_OPEN <OperationStep>*? OP_CLOSE };

<OperationArguments> :- <OperationArgument> <OperationArguments2>*? ;
<OperationArguments2> :- OP_COMMA <OperationArgument> ;

<OperationArgument> :- arguments={"http://modembed.hu/abstraction/behavior/platform#OperationArgument" name=IDENTIFIER 
					OP_COLON type=<TypeDefinition> OP_BOPEN <MemTypeDefinition>? indirectionLevel=DECIMAL_NUMBER OP_BCLOSE
					};

<MemTypeDefinition> :- memtype=IDENTIFIER OP_AT;

<OperationStep> :- steps={"http://modembed.hu/abstraction/behavior/platform#InstructionCallOperationStep"
						instruction=IDENTIFIER
					 OP_BOPEN <InstructionParameterMappings>? OP_BCLOSE
					} OPERATOR_SEMICOLON;
					
<InstructionParameterMappings> :- <InstructionParameterMapping> <InstructionParameterMappings2>*? ;
<InstructionParameterMappings2> :- OP_COMMA <InstructionParameterMapping>;

<InstructionParameterMapping> :- arguments={"http://modembed.hu/abstraction/behavior/platform#InstructionParameterMapping"
								value=IDENTIFIER 
								<InstructionParameterMapping_Attribute>?
								<InstructionParameterMapping_Shift>?
								<InstructionParameterMapping_Add>?
								};
								
<InstructionParameterMapping_Attribute> :- OP_ATTR attribute=IDENTIFIER ;
<InstructionParameterMapping_Shift> :- OP_SHIFT bitOffset=DECIMAL_NUMBER; 
<InstructionParameterMapping_Add> :- OP_ADD valueOffset=DECIMAL_NUMBER;