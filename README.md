# Nome do Microserviçooooo
sboot-atomico-mcp-serve
## Descrição
Este microserviço é dedicado a uma única responsabilidade ou funcionalidade específica, que seria salvar arquivos enviados em um file system e consumir serviço do microserviço atômico em python e da LLMs.
## Tecnologias Utilizadas
- **Spring Boot**: Versão utilizada (ex: 3.5.4).
- **Java**: Versão utilizada (ex: Java 21).
- **MAVEN**: Gerenciador de dependencia.
- **Outras Tecnologias**: Outras bibliotecas ou frameworks utilizados (ex: Spring web,Spring profiles,Spring Security,JWT, lombok, modelmapper, gson, easy-random-core,logging via Logback,validation, etc.).

## Uso do logging via Logback

| Configuração                    | O que será mostrado                     |
|---------------------------------|-----------------------------------------|
| `<root level="INFO">`           | INFO, WARN, ERROR                      |
| `<root level="DEBUG">`          | DEBUG, INFO, WARN, ERROR              |
| `<root level="WARN">`           | WARN, ERROR                          |

## Tipos de tets unitarios a serem implementados 
Tests de camada de Service e de Controller

## Relatório de Cobertura de Testes com jacoco
Após executar os testes, o relatório de cobertura está disponível em:

## plaintext
sboot-atomico-rag/target/site/jacoco/index.html

## Relatório de Cobertura de Verificação de Vunerabilidades de libs com Maven OWASP Dependency-Check
sboot-atomico-rag/target/dependency-check-report.html

## Banco de dados do OWASP Dependency-Check
https://raw.githubusercontent.com/Retirejs/retire.js/master/repository/jsrepository.json


## Pré-requisitos
Antes de executar o projeto, certifique-se de que você tem os seguintes pré-requisitos instalados:

- [Java JDK](https://download.oracle.com/java/21/latest/jdk-21_windows-x64_bin.exe) (versão 21 ou superior).
- [Maven](https://maven.apache.org/download.cgi) (ou Gradle, dependendo do seu projeto).

## Verificar hierarquias de dependencias do projeto. Executar o comando abaixo no gitbash
mvn dependency:tree -DoutputFile=dependencias.txt -Dverbose

## Como Rodar o Projeto
## Antes de rodar os comandos docker. Dei o (sudo su) no Linux e digite sua senha de administrador
sudo su
## Construir a imagem Docker: No terminal, na pasta do seu projeto, execute:
docker build -t minha-microservice .

## Rodar sua aplicação em um container:
docker run -p 8080:8080 minha-microservice

### Você rodar sua aplicação, chamando a classe main() de seu projeto via IDE e em modo debug.

### Clonar o repositório

```bash
git clone https://gitlab.pe.gov.br/fabio.mamorim/sboot-atomico-rag.git
cd nome-do-repo
