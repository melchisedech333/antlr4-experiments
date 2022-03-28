
#include <iostream>

#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"

using namespace antlrcpptest;
using namespace antlr4;

//
// Realiza acesso aos nodes da árvore.
//
class  MyTParserBaseVisitor : public TParserBaseVisitor {
public:
  
  antlrcpp::Any visitDefinition(TParser::DefinitionContext *ctx) {
    std::cout << "definition -> " << ctx->getText() << std::endl;
    return visitChildren(ctx);
  }

  antlrcpp::Any visitValue(TParser::ValueContext *ctx) {
    std::cout << "value -> type.: ";

    if (ctx->STRING())
      std::cout << "STRING";
    else if (ctx->INTEGER())
      std::cout << "INTEGER";
    else if (ctx->VARIABLE())
      std::cout << "VARIABLE";

    std::cout << " - value: " << ctx->getText() << std::endl << std::endl;
    
    return visitChildren(ctx);
  }
};

int main(int argc, const char **argv) {

  // Realiza leitura de arquivo (syntax.txt).
  std::ifstream stream;
  stream.open(argv[1]);
  
  // Processa tokens.
  ANTLRInputStream input(stream);
  TLexer lexer(&input);
  CommonTokenStream tokens(&lexer);

  // Acessa lista de tokens.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;
  
  tokens.fill();
  for (auto token : tokens.getTokens()) {
    std::cout << token->toString() << std::endl;
  }

  // Acessa lista de tokens através de visitor / árvore.
  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;

  TParser parser(&tokens);
  MyTParserBaseVisitor visitor;
  TParser::MainContext* treeVisit = parser.main();
  visitor.visitMain(treeVisit);

  return 0;
}


