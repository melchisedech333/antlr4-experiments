parser grammar TParser;

options {
	tokenVocab = TLexer;
}

@parser::postinclude {
  #ifndef _WIN32
  #pragma GCC diagnostic ignored "-Wunused-parameter"
  #endif
}

main
  : sentence EOF
  ;

sentence
  : sentence token
  |
  ;

token
  : WORD
  | STRING
  | UNKNOWN
  ;


