
lexer grammar JavaScriptLexer;

PLUS: '+';


INTEGER_NUMBER: '0'
              | [1-9] [0-9_]*
              ;


WHITE_SPACES: [\t\u000B\u000C\u0020\u00A0]+ -> skip;
