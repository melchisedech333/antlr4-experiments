<p align='center'>
    <img src="extras/images/Parse_Tree_Derivations.svg" width="500" >
</p>

<p align="center">
    <img src="https://img.shields.io/github/languages/count/melchisedech333/antlr4-experiments?style=for-the-badge" >
    <img src="https://img.shields.io/github/repo-size/melchisedech333/antlr4-experiments?style=for-the-badge" >
</p>

<br>

Language: <a href="readme.md">EN-US</a>

Aqui estão meus estudos e experimentos utilizando o ANTLR4 (para análise de gramáticas livre de contexto). O runtime para o ANTLR4 utilizado é voltado para C++, e para isso é utilizado um projeto base, que pode ser encontrado aqui:

- https://github.com/melchisedech333/antlr4-demonstration-project

Basta baixar o projeto e deixá-lo no mesmo diretório dos experimentos.

<b>Obs:</b> o nome do diretório do projeto base deve ser <b>project</b>, para que os script de compilação funcionem corretamente.

**Se meu código te ajudou em algo, considere [me patrocinar](https://github.com/sponsors/melchisedech333) :blue_heart:** 

<br>

:bookmark_tabs: Sumário
-----
* [Instruções](#hammer_and_wrench-instruções)
* [Autor](#smiley-author)
* [Licença](#scroll-licença)
-----

<br>

:hammer_and_wrench: Instruções
---

Para executar um teste, basta executar o script <b>clean-and-build.sh</b> ou <b>re-compile.sh</b> seguido do nome do diretório de teste, como no exemplo abaixo.

```bash
./clean-and-build.sh "1 - processing tokens (through visitor)"
./re-compile.sh "1 - processing tokens (through visitor)"
```



After compiling, <b>parsing</b> is immediately executed, where the syntax file existing in the respective directory is passed as a parameter.

Thus, it is possible to change the test Lexer, Parser and Syntax files, as well as the <b>main.cpp</b> file in their respective directories.

<b>Brief description of the scripts:</b>
- <b>clean.sh</b> - Cleans files from previous builds from the base project. <b>Note:</b> this script does not need parameters.
- <b>clean-and-build.sh</b> - Recompiles 100% of the base project.
- <b>re-compile.sh</b> - Recompile base project or need to recompile 100% of the project.

<b>Note:</b> the file compiled by the base project is located inside the <b>project</b> directory, with the name <b>parsing</b>.

<br>

:smiley: Author
---

Sponsor: [melchisedech333](https://github.com/sponsors/melchisedech333)<br>
YouTube: [Melchisedech](https://www.youtube.com/channel/UC4Sh4wxncr5arnydpUfWPKw)<br>
Twitter: [Melchisedech333](https://twitter.com/Melchisedech333)<br>
Blog: [melchisedech333.github.io](https://melchisedech333.github.io/)<br>
LinkedIn: [Melchisedech Rex](https://www.linkedin.com/in/melchisedech-rex-724152235/)

<img src="https://github.com/melchisedech333.png?size=200" height="100" />

<br>

:scroll: Licença
---

[ BSD-3-Clause license](./license)


