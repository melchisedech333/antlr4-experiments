lexer grammar TLexer;

@lexer::postinclude {
	#ifndef _WIN32
	#pragma GCC diagnostic ignored "-Wunused-parameter"
	#endif
}

STRING 		: '"' .*? '"' 	;
INTEGER		: [0-9]+ 	  	;
VAR  		: 'var'			;
TYPE		: [:][a-zA-Z]+	;
VARIABLE	: [a-zA-Z]+	  	;
ATTR 		: '=' 		  	;
SEPARATOR 	: ','		  	;
END 		: ';'		  	;

SPACETABS : (' ' | '\t' | '\r' | '\n' ) -> skip;

UNKNOWN	: . ;


