#!syntax
syntax sequential.syntax <Sequential>;
import core.syntax;
import type.syntax;

terminal KW_PROGRAM "program";
terminal KW_SYMBOL "symbol";
terminal KW_EXTERNAL "external";
terminal OP_COLON ":";
terminal OP_COMMA ",";


<Sequential> :- KW_PROGRAM {"http://modembed.hu/abstraction/behavior#SequentialBehavior" name=QUALIFIEDID OPERATOR_SEMICOLON <Item>*?;

<Item> :- <Symbol> OPERATOR_SEMICOLON;
<Item> :- <AtomicOperation> OPERATOR_SEMICOLON ;
<Item> :- <CodeSymbolPlacement> ;

<Symbol> :- KW_SYMBOL symbols={"http://modembed.hu/abstraction/behavior#Symbol" external=KW_EXTERNAL? 
		name=IDENTIFIER OP_COLON type=<TypeDefinition> };

<CodeSymbolPlacement> :- actions={"http://modembed.hu/abstraction/behavior#CodeSymbolPlacement" symbol=IDENTIFIER OP_COLON} ;		
		
<AtomicOperation> :- actions={"http://modembed.hu/abstraction/behavior#AtomicOperationExecution" operation=IDENTIFIER BRACKET_OPEN <AtomicOperationArguments>? BRACKET_CLOSE};
<AtomicOperationArguments> :- <AtomicOperationArgument> <AtomicOperationArguments2>*? ;
<AtomicOperationArguments2> :- OP_COMMA  <AtomicOperationArgument> ; 
<AtomicOperationArgument> :- symbol=IDENTIFIER ;

