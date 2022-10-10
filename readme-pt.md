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

Após a compilação, o binário chamado <b>parsing</b> é executado imediatamente, onde o arquivo de sintaxe existente no respectivo diretório é passado como parâmetro.

Desta maneira é possível alterar os arquivos de teste Lexer, Parser e Syntax, bem como o arquivo <b>main.cpp</b> em seus respectivos diretórios.

<b>Breve descrição dos scripts:</b>
- <b>clean.sh</b> - Limpa arquivos de compilações anteriores do projeto base. <b>Obs:</b> este script não precisa de parâmetros.
- <b>clean-and-build.sh</b> - Recompila 100% do projeto base.
- <b>re-compile.sh</b> - Compila o projeto base sem ter que compilar 100% do projeto.

<b>Obs:</b> o arquivo compilado pelo projeto base está localizado dentro do diretório <b>project</b>, com o nome <b>parsing</b>.

<br>

:smiley: Author
---

Patrocinar: [melchisedech333](https://github.com/sponsors/melchisedech333)<br>
YouTube: [Melchisedech](https://www.youtube.com/channel/UC4Sh4wxncr5arnydpUfWPKw)<br>
Twitter: [Melchisedech333](https://twitter.com/Melchisedech333)<br>
Blog: [melchisedech333.github.io](https://melchisedech333.github.io/)<br>
LinkedIn: [Melchisedech Rex](https://www.linkedin.com/in/melchisedech-rex-724152235/)

<img src="https://github.com/melchisedech333.png?size=200" height="100" />

<br>

:scroll: Licença
---

[ BSD-3-Clause license](./license)


