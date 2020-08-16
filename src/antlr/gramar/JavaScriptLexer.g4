
lexer grammar JavaScriptLexer;

MULTI_LINE_COMMENT:               '/*' .*? '*/'             -> skip;
SINGLE_LINE_COMMENT:              '//' ~[\r\n\u2028\u2029]* -> skip;

// keywords
CONSOLE_LOG: 'console.log';
VAR: 'var';

ASSIGN      : '=';
PLUS        : '+';
MINUS       : '-';
DIVIDE      : '/';
MULTIPLY    : '*';
OPEN_PAREN  : '(';
CLOSE_PAREN : ')';

BOOLEAN: 'true'
       | 'false'
       ;

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

// Identifier
IDENTIFIER
  : [A-Za-z_][A-Za-z0-9_]*
  ;

// String 
STRING
  : '"' DoubleStringCharacter* '"'
  | '\'' SingleStringCharacter* '\''
  ;

fragment DoubleStringCharacter
    : ~["\\\r\n]
    | '\\' SingleEscapeCharacter
    | LineContinuation
    ;

fragment SingleStringCharacter
    : ~['\\\r\n]
    | '\\' SingleEscapeCharacter
    | LineContinuation
    ;

fragment SingleEscapeCharacter
    : ['"\\bfnrtv]
    ;

fragment LineContinuation
    : '\\' [\r\n\u2028\u2029]
    ;

// whites paces

EOL
  : [\r\n\u2028\u2029]+
  ;

WHITE_SPACES
  : [\t\u000B\u000C\u0020\u00A0]+ -> skip
  ;
