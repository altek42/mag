
lexer grammar JavaScriptLexer;

MULTI_LINE_COMMENT:               '/*' .*? '*/'             -> skip;
SINGLE_LINE_COMMENT:              '//' (~[\r\n\u2028\u2029])*;

// keywords
CONSOLE_LOG: 'console.log';
VAR:         'var';
CONTINUE:    'continue';
FOR:         'for';
WHILE:       'while';
FUNCTION:    'function';
LENGTH:      'length';
RETURN:      'return';

OPEN_BRACKET: '[';
CLOSE_BRACKET:']';
OPEN_BRACE  : '{';
CLOSE_BRACE : '}';
DOT         : '.';
COMMA       : ',';
SEMI_COLON  : ';';
ASSIGN      : '=';
NOT         : '!';
PLUS_PLUS   : '++';
PLUS        : '+';
MINUS       : '-';
DIVIDE      : '/';
MULTIPLY    : '*';
OPEN_PAREN  : '(';
CLOSE_PAREN : ')';
LESS_THAN:           '<';
MORE_THAN:           '>';
LESS_THAN_EQUALS:    '<=';
GREATER_THAN_EQUALS: '>=';
EQUALS:              '==';
NOT_EQUALS:          '!=';
IDENTITY_EQUALS:     '===';
IDENTITY_NOT_EQUALS: '!==';
AND:                 '&&';
OR:                  '||';

BOOLEAN: 'true'
       | 'false'
       ;

IF:    'if';
ELSE:  'else';

// literals

NUMBER
  : INTEGER_NUMBER '.' [0-9] [0-9_]*
  | '.' [0-9] [0-9_]*
  | INTEGER_NUMBER
  ;

fragment INTEGER_NUMBER
  : '0'
  | '-'?[1-9] [0-9_]*
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
  : [;]* [\r\n\u2028\u2029]+
  ;

WHITE_SPACES
  : [\t\u000B\u000C\u0020\u00A0]+ -> skip
  ;
