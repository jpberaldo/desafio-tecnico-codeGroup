## Desafio Técnico - Testes Automatizados na Página Inicial da Amazon
Este é um repositório de automação de testes, com o objetivo de realizar o desafio técnico proposto.
### Tecnologias/frameworks utilizados
- Java 17 - https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
- Maven - https://maven.apache.org/
- Junit 4 - https://github.com/junit-team/junit4/wiki/Download-and-Install
- Selenium - https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.18.1
- Cucumber - https://cucumber.io/docs/installation/java/
- GitHub Actions par CI/CD

### Documentações
- Arquivo com planilha de Testes: [Cenários de Teste.xlsx](Cenarios-de-Teste.xlsx)

### Notas Gerais

Para o desenvolvimento do projeto, está sendo utilizado alguns padrões de desenvolvimento de códigos (Design Pattern):
- Como o Page Objects, onde seu objetivo é abstrair uma página que será automatizada para a sua classe, trazendo alguns benefícios como maior independência dos testes, facilidade na manutenção e um código mais limpo.
E também, utilizando o Fluent Pages onde seu objetivo é encadear as ações executadas pelo usuário na página que será automatizada, tornando o código mais legível e simples de ser usado.

### Execução de Testes via Pipeline
[![Pipeline para execução dos testes](https://github.com/jpberaldo/desafio-tecnico-codeGroup/actions/workflows/pipeline-exec-de-testes.yaml/badge.svg?branch=master)](https://github.com/jpberaldo/desafio-tecnico-codeGroup/actions/workflows/pipeline-exec-de-testes.yaml)
