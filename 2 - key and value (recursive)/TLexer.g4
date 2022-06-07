lexer grammar TLexer;

@lexer::postinclude {
	#ifndef _WIN32
	#pragma GCC diagnostic ignored "-Wunused-parameter"
	#endif
}

/* Tokens. */
STRING 		: '"' .*? '"' ;
NUMBER 		: [0-9]+ 	  ;
OPEN 		: '{'		  ;
CLOSE 		: '}'		  ;
ATTR 		: ':' 		  ;
SEPARATOR 	: ','		  ;

/* Ignora-os... */
SPACETABS : (' ' | '\t' | '\r' | '\n' ) -> skip;

/* Tokens desconhecidos. */
UNKNOWN	: . ;


