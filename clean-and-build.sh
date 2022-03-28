
rm -rf project/project/demo/TLexer.g4
rm -rf project/project/demo/TParser.g4
rm -rf project/project/demo/Linux/main.cpp

cp "$1/TLexer.g4" project/project/demo/
cp "$1/TParser.g4" project/project/demo/
cp "$1/main.cpp" project/project/demo/Linux/

cd project
chmod +x clean-and-build.sh
./clean-and-build.sh

./parsing "../$1/syntax.txt"


