
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
  int tabCounter = 0;

  void printTab () {
    for (int a=0; a<tabCounter; a++)
      std::cout << "    ";
  }

  antlrcpp::Any visitDefinition(TParser::DefinitionContext *ctx) {
    std::string variableDataType = "undefined";

    if (ctx->TYPE()) 
      variableDataType = ctx->TYPE()->getText();

    std::cout << "variable name -> " << ctx->VARIABLE()->getText() << std::endl;
    std::cout << "variable data type -> " << variableDataType << std::endl;
    std::cout << "variable elements ->" << std::endl;
    
    tabCounter++;
    antlrcpp::Any result = visitChildren(ctx);
    tabCounter--;

    std::cout << std::endl;
    return result;
  }

  antlrcpp::Any visitValue(TParser::ValueContext *ctx) {
    antlrcpp::Any result;
    bool arrayValue = false;
    std::string valueDataType = "undefined";

    if (ctx->TYPE())
      valueDataType = ctx->TYPE()->getText();

    if (ctx->VARIABLE()) {
      printTab();
      std::cout << "type: VARIABLE";
      std::cout << " - data type: "<< valueDataType;
      std::cout << " - value: " << ctx->VARIABLE()->getText() << std::endl;
    } else if (ctx->STRING()) {
      printTab();
      std::cout << "type: STRING";
      std::cout << " - data type: "<< valueDataType;
      std::cout << " - value: " << ctx->STRING()->getText() << std::endl;
    } else if (ctx->INTEGER()) {
      printTab();
      std::cout << "type: INTEGER";
      std::cout << " - data type: "<< valueDataType;
      std::cout << " - value: " << ctx->INTEGER()->getText() << std::endl;
    } else if (ctx->array()) {
      printTab();
      std::cout << "type: ARRAY" << std::endl;
      printTab();
      std::cout << "elements:" << std::endl;
      arrayValue = true;
    }

    if (arrayValue) {
      tabCounter++;
      result = visitChildren(ctx);
      tabCounter--;
    } else
      result = visitChildren(ctx);

    return result;
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


