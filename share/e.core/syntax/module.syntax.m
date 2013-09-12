#!platform:/resource/e.core/syntax/syntax.model
syntax module.syntax <Module>;
import core.syntax;
import type.syntax;
import expressions.syntax;

terminal KW_VAR "var";
terminal KW_MODULE "module";
terminal KW_USE "use";
terminal KW_CONST "const";
terminal KW_GLOBAL "global";
terminal OP_COMMA ",";

terminal KW_LOOP "loop";
terminal KW_WHILE "while";
terminal KW_UNTIL "until";
terminal KW_RETURN "return";
terminal KW_IF "if";
terminal KW_ELSE "else";

terminal OP_BEGIN "\{";
terminal OP_END "\}";

<Module> :- KW_MODULE {"http://modembed.hu/structured#StructuredModule" name=QUALIFIEDID OPERATOR_SEMICOLON <ModuleItem>*? ;


<ModuleItem> :- variables=<VariableDeclaration> OPERATOR_SEMICOLON;
<ModuleItem> :- functions=<Function>;
<ModuleItem> :- <UsesDeclaration>;

<UsesDeclaration> :- KW_USE uses=QUALIFIEDID OPERATOR_SEMICOLON;
<VariableDeclaration> :- {"http://modembed.hu/structured#VariableDeclaration" 
						global=KW_GLOBAL? const=KW_CONST? type=<TypeDefinition> name=IDENTIFIER <VariableInitValue>? };
<VariableInitValue> :- OPERATOR_ASSIGN initValue=<Expression> ;

<Function> :- {"http://modembed.hu/structured#StructuredFunction" global=KW_GLOBAL? resultType=<TypeDefinition> name=IDENTIFIER 
	BRACKET_OPEN <FunctionParameters>? BRACKET_CLOSE <FunctionImplementation> };						
						
<FunctionParameters> :- <FunctionParameter>;
<FunctionParameters> :- <FunctionParameter> OP_COMMA <FunctionParameters>;
<FunctionParameter> :- parameters=<VariableDeclaration>;

<FunctionImplementation> :- implementation=<Operation>;
<FunctionImplementation> :- OPERATOR_SEMICOLON;

/*
 * OPERATIONS
 */
<Operation> :- KW_RETURN {"http://modembed.hu/structured#ReturnOperation" result=<Expression> } OPERATOR_SEMICOLON; 
<Operation> :- OP_BEGIN {"http://modembed.hu/structured#OperationBlock" <OperationBlock_item>*? } OP_END;
<OperationBlock_item> :- steps=<Operation> ;
<OperationBlock_item> :- KW_VAR variables=<VariableDeclaration> OPERATOR_SEMICOLON;
<Operation> :- KW_IF {"http://modembed.hu/structured#ConditionalOperation" condition=<Expression> trueBranch=<Operation> <ElseBranch>? };
<ElseBranch> :- KW_ELSE falseBranch=<Operation> ;

<Operation> :- KW_LOOP {"http://modembed.hu/structured#LoopOperation" <LoopEntry>? body=<Operation> <LoopExit>? };
<LoopEntry> :- KW_WHILE entryCondition=<Expression>;
<LoopExit> :- KW_UNTIL exitCondition=<Expression> OPERATOR_SEMICOLON ;

<Operation> :- {"http://modembed.hu/structured#ExpressionOperation" expression=<Expression> } OPERATOR_SEMICOLON;

/*
 * EXPRESSIONS
 */
<Expression0> :- <VariableReferenceExpression>;
<VariableReferenceExpression> :- {"http://modembed.hu/structured#VariableReferenceExpression" variable=IDENTIFIER };

<Expression0> :- <FunctionCallExpression>;
<FunctionCallExpression> :- {"http://modembed.hu/structured#FunctionCallExpression" function=IDENTIFIER 
					BRACKET_OPEN <FunctionCallExpression_arguments>? BRACKET_CLOSE };
<FunctionCallExpression_arguments> :- arguments=<Expression> ;
<FunctionCallExpression_arguments> :- arguments=<Expression> OP_COMMA <FunctionCallExpression_arguments>;