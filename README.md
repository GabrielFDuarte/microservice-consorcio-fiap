# Microservice Consórcio - FIAP
Microsserviço feito para a NuBank como relaização da Atividade da Fase 5 da FIAP.

## Sobre o Microsserviço
Microsserviço que implementa a listagem de consórcios cadastrados em banco para a feature pensada como solução da atividade que é o suporte a consórcios pela plataforma NuBank.

![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/GabrielFDuarte/microservice-consorcio-fiap)

## Endpoint
Essa API provê o seguinte endpoint:

### Consórcio
- Listagem de consórcios: `GET/consorcio`

## Detalhes
Exemplos de requisições para o endpoint listado anteriormente:

`GET/consorcio`

**Params:**
```json
/consorcio?categoria=CARROS
```
Realiza a busca dos consórcios existentes para a categoria CARROS.

```json
/consorcio?categoria=MOTOS
```
Realiza a busca dos consórcios existentes para a categoria MOTOS.

```json
/consorcio?categoria=PESADOS
```
Realiza a busca dos consórcios existentes para a categoria PESADOS.

```json
/consorcio?categoria=IMOVEIS
```
Realiza a busca dos consórcios existentes para a categoria IMOVEIS.

**Response:**
```json
{
    "id": 13,
    "dt_vencimento": 20,
    "taxa_admin": 16.8,
    "tipo_grupo": "ANDAMENTO",
    "credito": 191053.16,
    "qtd_parcelas": 102,
    "valor_parcela": 2225.2073929411763
}
```
As informações retornadas quando itens são encontrados na categoria são as seguintes:
- `id`: Id do item cadastrado
- `dt_vencimento`: Dia de vencimento do pagamento
- `taxa_admin`: Taxa de administração do consórcio
- `tipo_grupo`: Se "em andamento" ou "em formação"
- `credito`: Valor total do crédito para o consórcio
- `qtd_parcelas`: Quantidade de parcelas esperadas para o pagamento
- `valor_parcela`: Valor da parcela com taxas já calculadas e incluídas

## Tecnologias
Projeto desenvolvido com as seguintes tecnologias:
- Java 8
- Spring Boot
- Maven

## Package
A API foi desenvolvida para ser executada a partir de um jar. Para que o jar seja gerado, o seguinte comando pode ser executado na pasta do projeto:
```bash
mvn package
```

## Execução
Para executar a API, o jar pode ser executado normalmente ou com o seguinte comando na pasta do projeto:
```bash
mvn spring-boot:run
```
