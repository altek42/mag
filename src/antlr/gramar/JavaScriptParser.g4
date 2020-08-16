parser grammar JavaScriptParser;

options {
    tokenVocab=JavaScriptLexer;
}

parse
  : instructions;

instructions
  : instructionLine+
  ;

instructionLine
  : instruction EOL
  | instruction EOF
  | EOL
  ;

instruction
  : variableDeclaratiion
  | assignOperation
  | writeStdOutput
  ;

writeStdOutput
  : writeStdOutputContant
  | writeStdOutputIdentifier
  | writeStdOutputArithmeticOperation
  ;

writeStdOutputContant
  : CONSOLE_LOG OPEN_PAREN constantValue CLOSE_PAREN
  ;
writeStdOutputIdentifier
  : CONSOLE_LOG OPEN_PAREN identifierValue CLOSE_PAREN
  ;
writeStdOutputArithmeticOperation
  : CONSOLE_LOG OPEN_PAREN arithmeticOperation CLOSE_PAREN
  ;

arithmeticOperation
  : numberValue arithmeticSign numberValue
  | numberValue arithmeticSign identifierValue
  | identifierValue arithmeticSign numberValue
  | identifierValue arithmeticSign identifierValue
  ;

arithmeticSign
  : PLUS
  | MINUS
  | MULTIPLY
  | DIVIDE
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
  ;
