# Desafio ONE: Conversor de Moedas

Este projeto faz parte do programa [Oracle Next Education](https://www.alura.com.br/oracle-next-education) em parceria com a Alura.

## 💡 Sobre o projeto

Aplicação em Java para conversão de moedas em tempo real utilizando a API [ExchangeRate API](https://apilayer.com/marketplace/exchangerates_data-api).

O sistema é executado via console e permite escolher entre diferentes tipos de conversão, inserindo o valor desejado para obter o valor convertido com base nas taxas atualizadas.

## 🛠️ Tecnologias e ferramentas

- Java 17
- API pública ExchangeRate
- Gson (para desserialização JSON)
- IntelliJ IDEA
- Git & GitHub

## 🔁 Conversões disponíveis

- Real para Dólar
- Dólar para Real
- Euro para Real
- Real para Euro
- Libra para Dólar
- Dólar para Peso Mexicano  
*(você pode adicionar mais)*

## 🚀 Como executar

1. Clone o repositório  
`git clone https://github.com/seu-usuario/conversor-moedas-java`

2. Obtenha sua API Key no site da [ExchangeRate API](https://apilayer.com/marketplace/exchangerates_data-api)

3. Execute o programa pelo IntelliJ ou terminal.

## 📂 Organização

O projeto está dividido em:
- `Menu.java`: interface inicial
- `ClienteAPI.java`: faz a requisição HTTP
- `Conversao.java`: representa os dados da conversão
- `ConversorMoeda.java`: lógica principal

## 📝 Extras

- Histórico de conversões com data/hora *(se você implementar)*
- Tratamento de erros com mensagens amigáveis

## 🔗 Link útil

[Documentação da API](https://apilayer.com/marketplace/exchangerates_data-api)

---

Desenvolvido com 💻 por Valéria para o Challenge ONE - Alura + Oracle
