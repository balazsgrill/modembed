#!syntax
syntax sequential.syntax <Root>;
import core.syntax;
import type.syntax;

terminal KW_MODULE "module";
terminal KW_DEVICE "device";
terminal KW_SEQUENCE "sequence";
terminal OP_COLON ":";
terminal OP_COMMA ",";
terminal OP_AT "\@";
terminal OP_START "\{";
terminal OP_END "\}";

<Root> :- <Module> ;
<Root> :- <RootSequence> ;

<Module> :- KW_MODULE {"http://modembed.hu/abstraction/behavior#SequentialBehaviorModule" name=QUALIFIEDID 
					<DeviceSelection>? OPERATOR_SEMICOLON <Item>*?;

<RootSequence> :- KW_SEQUENCE {"http://modembed.hu/abstraction/behavior#RootSequentialBehavior" name=QUALIFIEDID 
					<DeviceSelection>? OPERATOR_SEMICOLON <LocalItem>*? ;

<DeviceSelection> :- KW_DEVICE device=QUALIFIEDID ;

<LocalItem> :- localSymbols=<SymbolAssignment> OPERATOR_SEMICOLON;
<LocalItem> :- <Action>;

<Item> :- symbolMappings=<SymbolAssignment> OPERATOR_SEMICOLON;
<Item> :- <SequentialBehavior> ;

<SymbolAssignment> :- {"http://modembed.hu/abstraction/behavior#SymbolAllocation" type=<TypeDefinition> symbol=IDENTIFIER } ;
<SymbolAssignment> :- {"http://modembed.hu/abstraction/behavior#SymbolValueAssignment" type=<TypeDefinition> symbol=IDENTIFIER 
							OPERATOR_ASSIGN <SymbolValue> } ;
<SymbolAssignment> :- {"http://modembed.hu/abstraction/behavior#SymbolAddressAssignment" type=<TypeDefinition> symbol=IDENTIFIER 
							OPERATOR_ASSIGN <SymbolValue> OP_AT memoryInstance=IDENTIFIER } ;

<SymbolValue> :- value=DECIMAL_NUMBER;
<SymbolValue> :- value=BINARY_NUMBER;
<SymbolValue> :- value=HEXADECIMAL_NUMBER;

<SequentialBehavior> :- behaviorModels={"http://modembed.hu/abstraction/behavior#SequentialBehaviorPart" name=IDENTIFIER 
						BRACKET_OPEN <Parameters>? BRACKET_CLOSE OP_START <LocalItem>*? OP_END};

<Parameters> :- <Parameter> <Parameters2>*?;
<Parameters2> :- OP_COMMA <Parameter>;
<Parameter> :- parameters=IDENTIFIER;

<Action> :- actions=<CodeSymbolPlacement>;
<Action> :- actions=<AtomicOperation>;

<CodeSymbolPlacement> :- actions={"http://modembed.hu/abstraction/behavior#CodeSymbolPlacement" symbol=IDENTIFIER OP_COLON} ;		
		
<AtomicOperation> :- actions={"http://modembed.hu/abstraction/behavior#OperationExecution" operation=IDENTIFIER BRACKET_OPEN <AtomicOperationArguments>? BRACKET_CLOSE};
<AtomicOperationArguments> :- <AtomicOperationArgument> <AtomicOperationArguments2>*? ;
<AtomicOperationArguments2> :- OP_COMMA  <AtomicOperationArgument> ; 
<AtomicOperationArgument> :- arguments=IDENTIFIER ;
