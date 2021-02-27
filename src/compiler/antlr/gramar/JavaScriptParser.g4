parser grammar JavaScriptParser;

options {
    tokenVocab=JavaScriptLexer;
}

parse : instructions* EOF?;

instructions
  : instructionLine+
  ;

instructionLine
  : instruction EOL
  ;

instruction
  : variableDeclaratiion
  | assignOperation
  | writeStdOutput
  | ifStatement
  | loops
  | functionDeclaration
  | functionCall
  ;

instructionBlock
  : EOL* OPEN_BRACE EOL* instructions EOL* CLOSE_BRACE EOL*
  ;

writeStdOutput
  : writeStdOutputConstant
  | writeStdOutputIdentifier
  | writeStdOutputArithmeticOperation
  ;

writeStdOutputConstant
  : CONSOLE_LOG OPEN_PAREN constantValue CLOSE_PAREN
  ;
writeStdOutputIdentifier
  : CONSOLE_LOG OPEN_PAREN identifierValue CLOSE_PAREN
  ;
writeStdOutputArithmeticOperation
  : CONSOLE_LOG OPEN_PAREN arithmeticOperation CLOSE_PAREN
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
  | IDENTIFIER OPEN_BRACKET (numberValue | identifierValue) CLOSE_BRACKET
  ;

variableDeclaratiion
  : VAR IDENTIFIER
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
  | identifierValue ASSIGN assignValue
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
  : FOR '(' assignOperation? ';' forStatementConditionOperation ';' forExpression? ')' instructionBlock
  ;

forStatementConditionOperation
  : conditionOperation
  ;

forExpression
  : identifierValue ASSIGN assignValue
  ;

arrayLiteral
  : (OPEN_BRACKET elementList CLOSE_BRACKET)
  ;

elementList
  : COMMA* arrayElement? (COMMA+ arrayElement)* COMMA* // Yes, everything is optional
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
  : singleExpression
  ;

