parser grammar TParser;

options {
	tokenVocab = TLexer;
}

@parser::postinclude {
  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif
}

// Grammar.

main
  : sentence EOF
  ;

sentence
  : sentence expression
  |
  ;

expression
  : VAR variables END
  ;

variables
  : definition
  | definition SEPARATOR variables
  ;

definition
  : VARIABLE ATTR value
  | VARIABLE TYPE ATTR value
  ;

array
  : ARRAY_OPEN ARRAY_CLOSE
  | ARRAY_OPEN elements ARRAY_CLOSE
  ;

elements
  : value
  | value TYPE
  | value SEPARATOR elements
  | value TYPE SEPARATOR elements
  ;

value
  : VARIABLE
  | STRING
  | INTEGER
  | array
  ;


