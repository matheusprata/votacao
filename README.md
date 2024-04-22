# Sistema de Votação Cooperativa
Sistema de Cooperativa de pautas para votação

## Sobre o Projeto
Este sistema é um back-end desenvolvido em Java Spring Boot para gerenciar sessões de votação em cooperativas. Ele permite o cadastramento de pautas, abertura de sessões de votação, recebimento e contabilização de votos dos associados, e fornece os resultados das votações. O sistema opera na nuvem e é acessível via API REST.

### Link de acesso ao swagger
```
http://localhost:8080/votacao/public/swagger-ui
```
### Link para Importação no postman
```
{"openapi":"3.0.1","info":{"title":"OpenAPI definition","version":"v0"},"servers":[{"url":"http://localhost:8080/votacao","description":"Generated server url"}],"paths":{"/sessao/{idSessao}/voto":{"post":{"tags":["sessao-votacao-controller"],"operationId":"recebeVoto","parameters":[{"name":"idSessao","in":"path","required":true,"schema":{"type":"string","format":"uuid"}}],"requestBody":{"content":{"application/json":{"schema":{"$ref":"#/components/schemas/VotoRequest"}}},"required":true},"responses":{"201":{"description":"Created","content":{"*/*":{"schema":{"$ref":"#/components/schemas/VotoResponse"}}}}}}},"/sessao/abertura":{"post":{"tags":["sessao-votacao-controller"],"operationId":"abreSessao","requestBody":{"content":{"application/json":{"schema":{"$ref":"#/components/schemas/SessaoAberturaRequest"}}},"required":true},"responses":{"201":{"description":"Created","content":{"*/*":{"schema":{"$ref":"#/components/schemas/SessaoAberturaResponse"}}}}}}},"/pauta":{"post":{"tags":["pauta-controller"],"operationId":"cadastraPauta","requestBody":{"content":{"application/json":{"schema":{"$ref":"#/components/schemas/NovaPautaRequest"}}},"required":true},"responses":{"201":{"description":"Created","content":{"*/*":{"schema":{"$ref":"#/components/schemas/PautaCadastradaResponse"}}}}}}},"/sessao/{idSessao}/resultado":{"get":{"tags":["sessao-votacao-controller"],"operationId":"obtemResultado","parameters":[{"name":"idSessao","in":"path","required":true,"schema":{"type":"string","format":"uuid"}}],"responses":{"200":{"description":"OK","content":{"*/*":{"schema":{"$ref":"#/components/schemas/ResultadoSessaoResponse"}}}}}}},"/":{"get":{"tags":["votacao-application"],"operationId":"testeHome","responses":{"200":{"description":"OK","content":{"*/*":{"schema":{"type":"string"}}}}}}}},"components":{"schemas":{"VotoRequest":{"type":"object","properties":{"cpfAssociado":{"type":"string"},"opcao":{"type":"string","enum":["SIM","NAO"]}}},"VotoResponse":{"type":"object","properties":{"id":{"type":"string","format":"uuid"},"idSessao":{"type":"string","format":"uuid"},"cpfAssociado":{"type":"string"},"momentoVoto":{"type":"string","format":"date-time"}}},"SessaoAberturaRequest":{"required":["idPauta"],"type":"object","properties":{"idPauta":{"type":"string","format":"uuid"},"tempoDuracao":{"type":"integer","format":"int32"}}},"SessaoAberturaResponse":{"type":"object","properties":{"idSessao":{"type":"string","format":"uuid"}}},"NovaPautaRequest":{"required":["descricao","idAssociadoAutor","titulo"],"type":"object","properties":{"titulo":{"type":"string"},"descricao":{"type":"string"},"idAssociadoAutor":{"type":"string","format":"uuid"}}},"PautaCadastradaResponse":{"type":"object","properties":{"id":{"type":"string","format":"uuid"}}},"ResultadoSessaoResponse":{"type":"object","properties":{"id":{"type":"string","format":"uuid"},"idPauta":{"type":"string","format":"uuid"},"status":{"type":"string","enum":["ABERTA","FECHADA"]},"momentoAbertura":{"type":"string","format":"date-time"},"momentoEncerramento":{"type":"string","format":"date-time"},"totalVotos":{"type":"integer","format":"int64"},"totalSim":{"type":"integer","format":"int64"},"totalNao":{"type":"integer","format":"int64"}}}}}}
```

## Architecture Haiku
### Objetivos do Negócio
- Facilitar a gestão democrática em cooperativas.
- Assegurar a integridade e confiabilidade dos votos.
- Prover resultados rápidos e precisos das votações.

### Restrições
- Operação na nuvem.
- Persistência de dados.
- Foco no back-end.

### Atributos de Qualidade
Segurança > Disponibilidade > Escalabilidade

### Decisões de Design
- Java Spring Boot, Maven, Docker Compose.
- API RESTful.
- Integração com sistema externo para validação de CPF.
- Mensageria para divulgação de resultados.
- Estratégia de versionamento da API.

## Pré-Requisitos
- Java 11
- Maven
- Docker e Docker Compose

## Como Executar o Projeto
1. Clone o repositório: git clone https://github.com/matheusprata/votacao.git
2. Navegue até a pasta do projeto: cd votacao
3. Construa o projeto com Maven: mvn clean install
4. Inicie os serviços usando Docker Compose: docker-compose up
5. O sistema estará rodando e acessível.

## Testando a Aplicação
- Importe a collection do Postman fornecida para testar as APIs.
