# 💱 Conversor de Moedas

![Java](https://img.shields.io/badge/Java-17-orange)
![Status](https://img.shields.io/badge/Status-Concluído-success)
![License](https://img.shields.io/badge/License-MIT-blue)

> Projeto desenvolvido como parte do desafio do programa Oracle Next Education (ONE) em parceria com a Alura.

## 📋 Índice

- [Sobre o Projeto](#-sobre-o-projeto)
- [Funcionalidades](#-funcionalidades)
- [Demonstração](#-demonstração)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Como Executar](#-como-executar)
- [API Utilizada](#-api-utilizada)
- [Desafios Enfrentados](#-desafios-enfrentados)
- [Melhorias Futuras](#-melhorias-futuras)
- [Licença](#-licença)
- [Contato](#-contato)

## 🚀 Sobre o Projeto

O Conversor de Moedas é uma aplicação Java que permite realizar conversões entre diferentes moedas utilizando taxas de câmbio em tempo real. O projeto foi desenvolvido como parte do desafio do programa Oracle Next Education (ONE), com o objetivo de aplicar conceitos de programação orientada a objetos, consumo de APIs e tratamento de exceções.

A aplicação consulta a [ExchangeRate API](https://apilayer.com/marketplace/exchangerates_data-api) para obter as taxas de câmbio atualizadas, garantindo que as conversões sejam precisas e baseadas nos valores de mercado.

## ✨ Funcionalidades

- **Conversão de Moedas em Tempo Real**: Utiliza a API ExchangeRate para obter taxas de câmbio atualizadas
- **Interface via Console**: Menu interativo para seleção de opções de conversão
- **Múltiplas Moedas**: Suporte para conversão entre diferentes moedas:
  - Real (BRL) para Dólar (USD)
  - Dólar (USD) para Real (BRL)
  - Euro (EUR) para Real (BRL)
  - Real (BRL) para Euro (EUR)
  - Libra (GBP) para Dólar (USD)
  - Dólar (USD) para Peso Mexicano (MXN)
- **Tratamento de Erros**: Mensagens amigáveis para o usuário em caso de falhas na API ou entradas inválidas

## 📸 Demonstração

```
=== Conversor de Moedas ===
1 - Real para Dólar
2 - Dólar para Real
0 - Sair
Escolha a opção: 1
Digite o valor: 100
💰 Resultado: 20.15 USD
```

## 🛠️ Tecnologias Utilizadas

- **Java 17**: Linguagem de programação principal
- **HttpClient**: Para realizar requisições HTTP à API
- **Gson**: Biblioteca para desserialização de JSON
- **ExchangeRate API**: API externa para obtenção de taxas de câmbio
- **Maven**: Gerenciamento de dependências
- **Git & GitHub**: Controle de versão e hospedagem do código

## 📂 Estrutura do Projeto

```
src/
├── br/
│   └── com/
│       └── valeria/
│           └── conversormoedas/
│               ├── Main.java                # Ponto de entrada da aplicação
│               ├── model/
│               │   └── Conversao.java       # Modelo de dados para a resposta da API
│               └── service/
│                   └── ConversorService.java # Serviço para comunicação com a API
```

### Descrição dos Componentes:

- **Main.java**: Contém a interface do usuário via console e o fluxo principal da aplicação
- **Conversao.java**: Modelo de dados que representa a resposta da API de conversão
- **ConversorService.java**: Serviço responsável pela comunicação com a API ExchangeRate

## 🚀 Como Executar

### Pré-requisitos

- Java 17 ou superior
- Maven (opcional, para gerenciamento de dependências)
- Chave de API da [ExchangeRate API](https://apilayer.com/marketplace/exchangerates_data-api)

### Passos para Execução

1. **Clone o repositório**
   ```bash
   git clone https://github.com/ValeriaRoyal/ConversorMoedas.git
   cd ConversorMoedas
   ```

2. **Compile o projeto**
   ```bash
   mvn clean compile
   ```
   Ou compile manualmente com o javac.

3. **Execute a aplicação**
   ```bash
   mvn exec:java -Dexec.mainClass="br.com.valeria.conversormoedas.Main"
   ```
   Ou execute diretamente:
   ```bash
   java -cp target/classes br.com.valeria.conversormoedas.Main
   ```

4. **Insira sua API Key quando solicitado**
   A aplicação solicitará sua chave de API da ExchangeRate no início da execução.

## 🔑 API Utilizada

O projeto utiliza a [ExchangeRate API](https://apilayer.com/marketplace/exchangerates_data-api) para obter taxas de câmbio em tempo real. Para utilizar a aplicação, você precisará:

1. Criar uma conta no site da API
2. Obter uma chave de API gratuita
3. Inserir a chave quando solicitado pela aplicação

A API oferece:
- Taxas de câmbio atualizadas para mais de 170 moedas
- Dados históricos de taxas de câmbio
- Conversão entre qualquer par de moedas

## 🧩 Desafios Enfrentados

Durante o desenvolvimento deste projeto, alguns dos principais desafios incluíram:

- **Consumo de API Externa**: Implementação da comunicação HTTP e tratamento das respostas
- **Desserialização de JSON**: Conversão da resposta da API para objetos Java
- **Tratamento de Erros**: Lidar com falhas na API e entradas inválidas do usuário
- **Design da Interface**: Criar uma experiência de usuário intuitiva mesmo em ambiente de console

## 🔮 Melhorias Futuras

Algumas melhorias planejadas para versões futuras:

- **Interface Gráfica**: Implementação de uma GUI usando JavaFX ou Swing
- **Histórico de Conversões**: Armazenamento das conversões realizadas com data e hora
- **Suporte a Mais Moedas**: Adicionar mais opções de moedas para conversão
- **Gráficos de Variação**: Exibir gráficos de variação das taxas de câmbio ao longo do tempo
- **Modo Offline**: Permitir conversões aproximadas mesmo sem conexão com a internet

## 📄 Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 📬 Contato

Valéria Regina - [GitHub](https://github.com/ValeriaRoyal) - [LinkedIn](https://www.linkedin.com/in/valeria-regina)

---

Desenvolvido com ❤️ como parte do programa Oracle Next Education (ONE) em parceria com a Alura.
