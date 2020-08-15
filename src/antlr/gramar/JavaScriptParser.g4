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
  : EOL
  | instruction EOL
  | instruction EOF
  ;

instruction
  : variableDeclaratiion
  | assignOperation
  | writeStdOutput
  ;

writeStdOutput
  : CONSOLE_LOG OPEN_PAREN STRING CLOSE_PAREN
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
