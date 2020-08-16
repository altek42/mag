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

assignOperation
  : variableDeclaratiion ASSIGN arithmeticOperation
  | variableDeclaratiion ASSIGN value
  ;
