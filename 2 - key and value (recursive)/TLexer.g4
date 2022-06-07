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

/* Ignore... */
SPACETABS : (' ' | '\t' | '\r' | '\n' ) -> skip;

/* Unknown tokens. */
UNKNOWN	: . ;


