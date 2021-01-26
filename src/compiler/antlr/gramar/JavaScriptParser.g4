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
  : variableDeclaratiion ASSIGN arithmeticOperation
  | variableDeclaratiion ASSIGN conditionOperation
  | variableDeclaratiion ASSIGN value
  ;
