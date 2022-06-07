lexer grammar TLexer;

@lexer::postinclude {
	/* lexer postinclude section */
	#ifndef _WIN32
	#pragma GCC diagnostic ignored "-Wunused-parameter"
	#endif
}

WORD : [a-zA-Z\u0080-\u{10FFFF}]+;

STRING: '"' .*? '"';

SPACETABS : (' ' | '\t' | '\r' | '\n' ) -> skip;

UNKNOWN	: . ;


