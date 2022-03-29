parser grammar TParser;

options {
	tokenVocab = TLexer;
}

@parser::postinclude {
  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif
}

// Gramática.

main
  : sentence EOF
  ;

sentence
  : sentence expression
  |
  ;

expression
  : VAR variables END
  | expressionErrors
  ;

expressionErrors
  : VAR variables {
    notifyErrorListeners("Verbum Divinus");
  }
  ;

variables
  : definition
  | definition SEPARATOR variables
  ;

definition
  : VARIABLE ATTR value
  | VARIABLE TYPE ATTR value
  ;
  
value
  : VARIABLE
  | STRING
  | INTEGER
  ;


