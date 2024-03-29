parser grammar JavaScriptParser;

options {
    tokenVocab=JavaScriptLexer;
}

parse : instructions* EOF?;

instructions
  : instructionLine+
  ;

instructionLine
  : instruction EOL?
  ;

instruction
  : variableDeclaratiion
  | variableDeclarationList
  | assignOperation
  | writeStdOutput
  | ifStatement
  | loops
  | functionDeclaration
  | functionCall
  | returnStatement
  | incrementVariable
  | SINGLE_LINE_COMMENT
  ;

instructionBlock
  : EOL* OPEN_BRACE EOL* instructions EOL* CLOSE_BRACE EOL*
  ;

returnStatement
  : RETURN value
  | RETURN functionCall
  ;

writeStdOutput
  : CONSOLE_LOG OPEN_PAREN constantValue CLOSE_PAREN
  | CONSOLE_LOG OPEN_PAREN identifierValue CLOSE_PAREN
  | CONSOLE_LOG OPEN_PAREN arithmeticOperation CLOSE_PAREN
  | CONSOLE_LOG OPEN_PAREN functionCall CLOSE_PAREN
  ;

arithmeticOperation
  : arithmeticOperation arithmeticAdditiveSign arithmeticOperationHigher
  | arithmeticOperationHigher
  ;

arithmeticOperationHigher
  : arithmeticOperationHigher arithmeticMultiplpicativeSign value
  | value
  ;

conditionOperation
  : arithmeticOperation conditionSign conditionOperation
  | arithmeticOperation
  ;

arithmeticAdditiveSign
  : PLUS
  | MINUS
  ;

arithmeticMultiplpicativeSign
  : MULTIPLY
  | DIVIDE
  ;

value
  : constantValue
  | identifierValue
  | arrayLength
  | notStatement
  ;

notStatement
  : NOT value
  ;

arrayLength
  : IDENTIFIER DOT LENGTH
  ;

constantValue
  : booleanValue
  | stringValue
  | numberValue
  ;

booleanValue
  : BOOLEAN
  ;

stringValue
  : STRING
  ;

numberValue
  : NUMBER
  ;

identifierValue
  : IDENTIFIER
  | IDENTIFIER OPEN_BRACKET (numberValue | identifierValue | arithmeticOperation) CLOSE_BRACKET
  ;

variableDeclaratiion
  : VAR IDENTIFIER
  ;

variableDeclarationList
  : VAR variableDeclarationListElement (commaSeparator variableDeclarationListElement)+
  ;

variableDeclarationListElement
  : singleAssignOperation
  | IDENTIFIER
  ;

conditionSign
  : LESS_THAN
  | MORE_THAN
  | LESS_THAN_EQUALS
  | GREATER_THAN_EQUALS
  | EQUALS
  | NOT_EQUALS
  | IDENTITY_EQUALS
  | IDENTITY_NOT_EQUALS
  ;

assignOperation
  : variableDeclaratiion ASSIGN assignValue
  | singleAssignOperation
  ;

singleAssignOperation
  : identifierValue ASSIGN assignValue
  ;

assignValue
  : singleExpression
  | arrayLiteral
  ;

singleExpression
  : arithmeticOperation
  | conditionOperation
  | value
  | functionCall
  ;

ifStatement
  : IF '(' ifStatementConditionOperation ')' instructionBlock elseStatement?
  ;

ifStatementConditionOperation
  : conditionOperation
  ;

elseStatement
  : ELSE instructionBlock
  ;

loops
  : whileLoop
  | forLoop
  ;

whileLoop
  : WHILE '(' whileStatementConditionOperation ')' instructionBlock
  ;

whileStatementConditionOperation
  : conditionOperation
  ;


forLoop
  : FOR '(' forAssignSection? ';' forStatementConditionOperation ';' forExpression? ')' instructionBlock
  ;

forAssignSection
  : assignOperation (COMMA+ assignOperation)*
  ;

forStatementConditionOperation
  : conditionOperation
  ;

forExpression
  : forExpressionAssign
  | incrementVariable
  ;

forExpressionAssign
  : identifierValue ASSIGN assignValue
  ;

arrayLiteral
  : (OPEN_BRACKET elementList CLOSE_BRACKET)
  ;

elementList
  : COMMA* arrayElement? (COMMA+ arrayElement)* COMMA* // Yes, everything is optional
  ;

commaSeparator
  : EOL* COMMA EOL*
  ;

arrayElement
  : singleExpression
  ;

functionDeclaration
  : FUNCTION IDENTIFIER '(' formalParameterList? ')' instructionBlock
  ;

formalParameterList
  : formalParameterArg (',' formalParameterArg)*
  ;

formalParameterArg
  : IDENTIFIER
  ;

functionCall
  : IDENTIFIER arguments
  ;

arguments
  : '('(argument (',' argument)* ','?)?')'
  ;

argument
  : assignValue
  ;

incrementVariable
  : identifierValue PLUS_PLUS
  ;
