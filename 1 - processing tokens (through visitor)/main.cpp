
#include <iostream>

#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"

using namespace antlrcpptest;
using namespace antlr4;

//
// Performs access to the nodes of the tree.
//
class  MyTParserBaseVisitor : public TParserBaseVisitor {
public:
  
  antlrcpp::Any visitMain(TParser::MainContext *ctx) {
    return visitChildren(ctx);
  }

  antlrcpp::Any visitSentence(TParser::SentenceContext *ctx) {
    return visitChildren(ctx);
  }

  //
  // Process found tokens.
  //
  antlrcpp::Any visitToken(TParser::TokenContext *ctx) {

    std::cout << "type.: ";

    if (ctx->IDENTIFIER())
      std::cout << "IDENTIFIER" << std::endl;
    else if (ctx->NUMBER())
      std::cout << "NUMBER" << std::endl;
    else if (ctx->NEWLINE())
      std::cout << "NEWLINE" << std::endl;
    else if (ctx->SPACETABS())
      std::cout << "SPACETABS" << std::endl;
    else if (ctx->UNKNOWN())
      std::cout << "UNKNOWN" << std::endl;
    else
      std::cout << "INVALID - FATAL ERROR" << std::endl;

    if (ctx->NEWLINE())
      std::cout << "value: \\n | \\r\\n" << std::endl << std::endl;
    else
      std::cout << "value: " << ctx->getText() << std::endl << std::endl;
    
    return visitChildren(ctx);
  }
};

int main(int argc, const char **argv) {

  // Performs file reading (syntax.txt).
  std::ifstream stream;
  stream.open(argv[1]);
  
  // Process tokens.
  ANTLRInputStream input(stream);
  TLexer lexer(&input);
  CommonTokenStream tokens(&lexer);

  // Access list of tokens.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;
  
  tokens.fill();
  for (auto token : tokens.getTokens()) {
    std::cout << token->toString() << std::endl;
  }

  // Access list of tokens through visitor / tree.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;

  TParser parser(&tokens);
  MyTParserBaseVisitor visitor;
  TParser::MainContext* treeVisit = parser.main();
  visitor.visitMain(treeVisit);

  return 0;
}


