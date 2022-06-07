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
  : sentence token
  |
  ;

token
  : IDENTIFIER
  | NUMBER 
  | NEWLINE 
  | SPACETABS 
  | UNKNOWN 
  ;


