#!syntax
syntax module.syntax <Module>;
import core.syntax;
import type.syntax;

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
terminal OP_ADD "\+";
terminal OP_MULTIPLY "\*";
terminal OP_MINUS "-";
terminal OP_BEGIN "\{";
terminal OP_END "\}";

<Module> :- KW_MODULE {"http://modembed.hu/structured#StructuredModule" name=QUALIFIEDID OPERATOR_SEMICOLON <ModuleItem>*? ;

<ModuleItem> :- <UsesDeclaration>;
<ModuleItem> :- variables=<VariableDeclaration> OPERATOR_SEMICOLON;
<ModuleItem> :- functions=<Function>;

<UsesDeclaration> :- KW_USE uses=QUALIFIEDID OPERATOR_SEMICOLON;
<VariableDeclaration> :- {"http://modembed.hu/structured#VariableDeclaration" 
						global=KW_GLOBAL? const=KW_CONST? type=<TypeDefinition> name=IDENTIFIER <VariableInitValue>? };
<VariableInitValue> :- OPERATOR_ASSIGN initValue=<Expression> ;

<Function> :- {"http://modembed.hu/structured#StructuredFunction" resultType=<TypeDefinition> name=IDENTIFIER 
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
<OperationBlock_item> :- variables=<VariableDeclaration> OPERATOR_SEMICOLON;
<Operation> :- KW_IF condition=<Expression> {"http://modembed.hu/structured#ConditionalOperation" trueBranch=<Operation> <ElseBranch>? };
<ElseBranch> :- KW_ELSE falseBranch=<Operation> ;

<Operation> :- KW_LOOP {"http://modembed.hu/structured#LoopOperation" <LoopEntry>? body=<Operation> <LoopExit>? };
<LoopEntry> :- KW_WHILE entryCondition=<Expression>;
<LoopExit> :- KW_UNTI exitCondition=<Expression>;

<Operation> :- {"http://modembed.hu/structured#ExpressionOperation" expression=<Expression> } OPERATOR_SEMICOLON;

/*
 * EXPRESSIONS
 */
<Expression0> :- BRACKET_OPEN <Expression> BRACKET_CLOSE;
 
<Expression0> :- <IntegerConstExpression>; 
<IntegerConstExpression> :- {"http://modembed.hu/structured#IntegerConstExpression" <IntegerConstExpression_value> };
<IntegerConstExpression_value> :- value=DECIMAL_NUMBER;
<IntegerConstExpression_value> :- value=BINARY_NUMBER;
<IntegerConstExpression_value> :- value=HEXADECIMAL_NUMBER;

<Expression0> :- <VariableReferenceExpression>;
<VariableReferenceExpression> :- {"http://modembed.hu/structured#VariableReferenceExpression" variable=IDENTIFIER };

<Expression0> :- <FunctionCallExpression>;
<FunctionCallExpression> :- {"http://modembed.hu/structured#FunctionCallExpression" function=IDENTIFIER 
					BRACKET_OPEN <FunctionCallExpression_arguments>? BRACKET_CLOSE };
<FunctionCallExpression_arguments> :- arguments=<Expression> ;
<FunctionCallExpression_arguments> :- arguments=<Expression> OP_COMMA <FunctionCallExpression_arguments>;

<Expression> :- <Expression6>;

/* Assign expressions */
<Expression6> :- <Expression5>;
<Expression6> :- {"http://modembed.hu/structured#OperationExpression" arguments=<Expression5> <E6> arguments=<Expression6> };
<E6> :- OPERATOR_ASSIGN operation="assign";

/* Additive expressions */
<Expression5> :- <Expression4>;
<Expression5> :- {"http://modembed.hu/structured#OperationExpression" arguments=<Expression4> <E5> arguments=<Expression5> };
<E5> :- OP_ADD operation="add";
<E6> :- OP_MINUS operation="subtract";

/* Multiplicative expressions */
<Expression4> :- <Expression3>;
<Expression4> :- {"http://modembed.hu/structured#OperationExpression" arguments=<Expression3> <E4> arguments=<Expression4> };
<E4> :- OP_MULTIPLY operation="multiply";

/* Shift expressions */
<Expression3> :- <Expression2>;

<Expression2> :- <Expression1>;

/* Unary expressions */
<Expression1> :- <Expression0>;
<Expression1> :- {"http://modembed.hu/structured#OperationExpression" <E1> arguments=<Expression1> };
<E1> :- OP_MINUS operation="minus";
