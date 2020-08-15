parser grammar JavaScriptParser;

options {
    tokenVocab=JavaScriptLexer;
}

parse: operation;

operation: INTEGER_NUMBER PLUS INTEGER_NUMBER
         | INTEGER_NUMBER PLUS PLUS
         ;
