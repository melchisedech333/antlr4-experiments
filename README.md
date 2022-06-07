<p align='center'>
    <img src="extras/images/Parse_Tree_Derivations.svg" width="500" >
</p>

<p align="center">
    <img src="https://img.shields.io/github/languages/count/melchisedech333/antlr4-experiments?style=for-the-badge" >
    <img src="https://img.shields.io/github/repo-size/melchisedech333/antlr4-experiments?style=for-the-badge" >
</p>

<br>

Here are my studies and experiments using ANTLR4 (for language analysis). The target code in this case is in C++, and for this a base project is used, which can be found here:

- https://github.com/melchisedech333/antlr4-demonstration-project

Just download the project and leave it in the same directory with the experiments.

<b>Note:</b> the base project directory name must be <b>project</b>, so that the test build scripts can work properly.

<br>

:bookmark_tabs: Table of Contents
-----
* [Instructions](#hammer_and_wrench-instructions)
* [Author](#smiley-author)
* [License](#scroll-license)
-----

<br>

:hammer_and_wrench: Instructions
---

To run a test, just run the script <b>clean-and-build.sh</b> or <b>re-compile.sh</b> followed by the name of the test directory, as in the example below.

```bash
./clean-and-build.sh "1 - processing tokens (through visitor)"
./re-compile.sh "1 - processing tokens (through visitor)"
```

Após compilar, imediatamente é executado o <b>parsing</b>, onde é passado como parâmetro o arquivo <b>syntax</b> existente no respectivo diretório.

Assim é possível ir alterando os arquivos do Lexer, Parser e Syntax de teste, bem como o arquivo main.cpp em seus respectivos diretórios.

<b>Breve descrição dos scripts:</b>
- <b>clean.sh</b> - Limpa arquivos de compilações anteriores do projeto base. Obs: este script <b>não</b> necessita de parâmetros.
- <b>clean-and-build.sh</b> - Recompila 100% do projeto base.
- <b>re-compile.sh</b> - Recompila projeto base nem necessitar recompilar 100% do projeto.

<b>Obs:</b> o arquivo compilado pelo projeto base fica dentro do diretório <b>project</b>, com o nome <b>parsing</b>.

<br>

:smiley: Author
---

YouTube: [Melchisedech](https://www.youtube.com/channel/UC4Sh4wxncr5arnydpUfWPKw)<br>
Twitter: [Melchisedech333](https://twitter.com/Melchisedech333)<br>
Blog: [melchisedech333.github.io](https://melchisedech333.github.io/)<br>
LinkedIn: [Melchisedech Rex](https://www.linkedin.com/in/melchisedech-rex-724152235/)

<img src="https://github.com/melchisedech333.png?size=200" height="100" />

<br>

:scroll: License
---

[ BSD-3-Clause license](./LICENSE.txt)


