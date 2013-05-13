#!syntax
syntax sequential.syntax <Module>;
import core.syntax;
import type.syntax;

terminal KW_MODULE "module";
terminal KW_DEVICE "device";
terminal OP_COLON ":";
terminal OP_COMMA ",";
terminal OP_AT "\@";
terminal OP_START "\{";
terminal OP_END "\}";


<Module> :- KW_MODULE {"http://modembed.hu/abstraction/behavior#SequentialBehaviorModule" name=QUALIFIEDID OPERATOR_SEMICOLON 
					<DeviceSelection>? <Item>*?;

<DeviceSelection> :- KW_DEVICE device=QUALIFIEDID ;

<Item> :- <SymbolMapping> OPERATOR_SEMICOLON;
<Item> :- <SequentialBehavior> ;

<SymbolMapping> :- symbolMappings={"http://modembed.hu/abstraction/behavior#SymbolValueAssignment" 
					symbol=IDENTIFIER OP_COLON type=<TypeDefinition> <Indirection>*? OPERATOR_ASSIGN <SymbolValue> };
<SymbolValue> :- value=DECIMAL_NUMBER;
<SymbolValue> :- value=BINARY_NUMBER;
<SymbolValue> :- value=HEXADECIMAL_NUMBER;
<Indirection> :- OP_AT indirection=IDENTIFIER;

<SequentialBehavior> :- behaviorModels={"http://modembed.hu/abstraction/behavior#SequentialBehavior" name=IDENTIFIER OP_START actions=<Action>*? OP_END};

<Action> :- <CodeSymbolPlacement>;
<Action> :- <AtomicOperation>;
<Action> :- <BehaviorCall>;

<CodeSymbolPlacement> :- actions={"http://modembed.hu/abstraction/behavior#CodeSymbolPlacement" symbol=IDENTIFIER OP_COLON} ;		
		
<AtomicOperation> :- actions={"http://modembed.hu/abstraction/behavior#AtomicOperationExecution" operation=IDENTIFIER BRACKET_OPEN <AtomicOperationArguments>? BRACKET_CLOSE};
<AtomicOperationArguments> :- <AtomicOperationArgument> <AtomicOperationArguments2>*? ;
<AtomicOperationArguments2> :- OP_COMMA  <AtomicOperationArgument> ; 
<AtomicOperationArgument> :- arguments=IDENTIFIER ;

<BehaviorCall> :- actions={"http://modembed.hu/abstraction/behavior#BehaviorCall" reference=IDENTIFIER OPERATOR_SEMICOLON};
