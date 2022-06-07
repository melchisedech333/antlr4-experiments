lexer grammar TLexer;

@lexer::postinclude {
	#ifndef _WIN32
	#pragma GCC diagnostic ignored "-Wunused-parameter"
	#endif
}

/* Identifiers. */
IDENTIFIER
	: [a-zA-Z][a-zA-Z0-9]+
	;

/* Numbers. */
NUMBER
    : [0-9]+
    ;

/* New line. */
NEWLINE
	: ('\r' ? '\n' | '\r')+
	;

/* Ignore all spaces and tabs. */
SPACETABS
	: (' ' | '\t' ) -> skip
	;

/* Handles unknown characters. */
UNKNOWN
	: . 
	;


