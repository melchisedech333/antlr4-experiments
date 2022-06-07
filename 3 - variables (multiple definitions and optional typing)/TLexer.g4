lexer grammar TLexer;

@lexer::postinclude {
	#ifndef _WIN32
	#pragma GCC diagnostic ignored "-Wunused-parameter"
	#endif
}

/* Tokens. */
STRING 		: '"' .*? '"' 	;
INTEGER		: [0-9]+ 	  	;
VAR  		: 'var'			;
TYPE		: [:][a-zA-Z]+	;
VARIABLE	: [a-zA-Z]+	  	;
ATTR 		: '=' 		  	;
SEPARATOR 	: ','		  	;
END 		: ';'		  	;


/* Ignore... */
SPACETABS : (' ' | '\t' | '\r' | '\n' ) -> skip;

/* Unknown tokens. */
UNKNOWN	: . ;


