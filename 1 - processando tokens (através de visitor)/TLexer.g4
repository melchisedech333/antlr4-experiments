lexer grammar TLexer;

@lexer::postinclude {
	#ifndef _WIN32
	#pragma GCC diagnostic ignored "-Wunused-parameter"
	#endif
}

/* Filtra identificadores. */
IDENTIFIER
	: [a-zA-Z][a-zA-Z0-9]+
	;

/* Filtra números. */
NUMBER
    : [0-9]+
    ;

/* Filtra nova linha. */
NEWLINE
	: ('\r' ? '\n' | '\r')+
	;

/* Ignora todos os espaços e tabs. */
SPACETABS
	: (' ' | '\t' ) -> skip
	;

/* Trata caracteres desconhecidos. */
UNKNOWN
	: . 
	;


