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
  : NUMBER PLUS NUMBER
  | NUMBER PLUS IDENTIFIER
  | IDENTIFIER PLUS NUMBER
  | IDENTIFIER PLUS IDENTIFIER
  ;

variableDeclaratiion
  : VAR IDENTIFIER
  ;

assignOperation
  : variableDeclaratiion ASSIGN arithmeticOperation
  ;