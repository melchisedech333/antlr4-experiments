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
  : object
  ;

object
  : OPEN members CLOSE
  ;

members
  : pair
  | pair SEPARATOR members
  ;

pair
  : STRING ATTR value
  ;

value
  : STRING
  | NUMBER 
  | object
  ;


