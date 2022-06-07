<p align='center'>
    <img src="extras/images/Parse_Tree_Derivations.svg" width="500" >
</p>

<p align="center">
    <img src="https://img.shields.io/github/languages/count/melchisedech333/antlr4-experiments?style=for-the-badge" >
    <img src="https://img.shields.io/github/repo-size/melchisedech333/antlr4-experiments?style=for-the-badge" >
</p>

<br>

Aqui estão meus estudos e experimentos utilizando o ANTLR4 (para análise de linguagem). O código alvo neste caso é em C++, e para isto é utilizado um projeto base, que pode ser encontrado aqui:

- https://github.com/melchisedech333/antlr4-demonstration-project

Basta baixar o projeto e deixá-lo no mesmo diretório deste com os experimentos.

<b>Obs: </b> o nome do diretório do projeto base deve ser <b>project</b>, para que os scripts de construção dos testes possam funcionar devidamente.

Para realizar um teste, basta executar o script <b>clean-and-build.sh</b> ou <b>re-compile.sh</b> seguido do nome do diretório de teste, como no exemplo abaixo.

```bash
./clean-and-build.sh "1 - processando tokens (através de visitor)"
./re-compile.sh "1 - processando tokens (através de visitor)"
```

Após compilar, imediatamente é executado o <b>parsing</b>, onde é passado como parâmetro o arquivo <b>syntax</b> existente no respectivo diretório.

Assim é possível ir alterando os arquivos do Lexer, Parser e Syntax de teste, bem como o arquivo main.cpp em seus respectivos diretórios.

<b>Breve descrição dos scripts:</b>
- <b>clean.sh</b> - Limpa arquivos de compilações anteriores do projeto base. Obs: este script <b>não</b> necessita de parâmetros.
- <b>clean-and-build.sh</b> - Recompila 100% do projeto base.
- <b>re-compile.sh</b> - Recompila projeto base nem necessitar recompilar 100% do projeto.

<b>Obs:</b> o arquivo compilado pelo projeto base fica dentro do diretório <b>project</b>, com o nome <b>parsing</b>.


