
lexer grammar JavaScriptLexer;

MULTI_LINE_COMMENT:               '/*' .*? '*/'             -> skip;
SINGLE_LINE_COMMENT:              '//' ~[\r\n\u2028\u2029]* -> skip;

ASSIGN      : '=';
PLUS        : '+';
MINUS       : '-';
DIVIDE      : '/';
MULTIPLY    : '*';
OPEN_PAREN  : '(';
CLOSE_PAREN : ')';

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

VAR: 'var';
CONSOLE_LOG: 'console.log';

// Identifier
IDENTIFIER
  : [A-Za-z_][A-Za-z0-9_]*
  ;

// String 
STRING
  : '"' CHARACTER* '"'
  | '\'' CHARACTER* '\''
  ;

fragment CHARACTER
  : .
  | '.'
  | '\\'['"\\bfnrtv]
  ;

// whites paces

EOL: [\n]+;

WHITE_SPACES
  : [\t\u000B\u000C\u0020\u00A0]+ -> skip
  ;
