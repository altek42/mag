
lexer grammar JavaScriptLexer;

PLUS  : '+';
ASSIGN: '=';

// literals

NUMBER
  : INTEGER_NUMBER '.' [0-9] [0-9_]*
  | '.' [0-9] [0-9_]*
  | INTEGER_NUMBER
  ;

fragment INTEGER_NUMBER
  : '0'
  | [1-9] [0-9_]*
  ;

// keywords

VAR
  : 'var'
  ;

// Identifier
IDENTIFIER
  : [A-Za-z_][A-Za-z0-9_]*
  ;

// whites paces

EOL: [\n]+;

WHITE_SPACES
  : [\t\u000B\u000C\u0020\u00A0]+ -> skip
  ;
