
#include <iostream>

#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"

using namespace antlrcpptest;
using namespace antlr4;

//
// Performs access to the nodes of the syntax tree.
//
class  MyTParserBaseVisitor : public TParserBaseVisitor {
public:

  antlrcpp::Any visitToken(TParser::TokenContext *ctx) {

    if (ctx->WORD()) 
      std::cout << "WORD -> value: " << ctx->WORD()->getText() << std::endl;
    else if (ctx->STRING()) 
      std::cout << "STRING -> value: " << ctx->STRING()->getText() << std::endl;
    else if (ctx->UNKNOWN()) 
      std::cout << "UNKNOWN -> value: " << ctx->UNKNOWN()->getText() << std::endl;

    return visitChildren(ctx);
  }
};

int main(int argc, const char **argv) {

  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;

  std::ifstream infile(argv[1]);
  std::vector<char> buffer;

  infile.seekg(0, infile.end);
  size_t length = infile.tellg();
  infile.seekg(0, infile.beg);

  if (length > 0) {
    buffer.resize(length);    
    infile.read(&buffer[0], length);
  }

  for (auto i: buffer)
    std::cout << i;
  std::cout << std::endl;

  std::ifstream stream;
  stream.open(argv[1]);
  
  ANTLRInputStream input(stream);
  TLexer lexer(&input);
  CommonTokenStream tokens(&lexer);

  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;
  
  tokens.fill();
  for (auto token : tokens.getTokens()) {
    std::cout << token->toString() << std::endl;
  }

  std::cout << "\n+++++++++++++++++++++++++++" << std::endl;

  TParser parser(&tokens);
  MyTParserBaseVisitor visitor;
  TParser::MainContext* treeVisit = parser.main();
  visitor.visitMain(treeVisit);

  return 0;
}


