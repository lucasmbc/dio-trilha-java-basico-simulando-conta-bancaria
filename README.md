# Desafio: Simulando uma conta bancária através do terminal/console - Bootcamp Bradesco Java Cloud Native

Este repositório contém a solução para o desafio **Simulando uma conta bancária através do terminal/console**, parte do **Bootcamp Bradesco Java Cloud Native** na plataforma **[DIO (Digital Innovation One)](https://www.dio.me/)**.

## Descrição do Desafio

O desafio propõe a criação de um programa Java que simula a interação com um terminal bancário. O usuário deve informar:
- O número da conta;
- O número da agência;
- O nome completo do cliente.

Em seguida, o programa exibe uma mensagem confirmando a criação da conta e informando o saldo inicial.

## Implementação

A classe `ContaTerminal` utiliza a classe `Scanner` para capturar os dados do usuário via entrada padrao (`System.in`). Para garantir que o nome completo seja capturado corretamente, utilizamos `scanner.nextLine()`.

## Como Executar o Programa

1. Clone este repositório.
2. Compile o arquivo com o seguinte comando:
   ```sh
   javac ContaTerminal.java
   ```
3. Execute o programa:
   ```sh
   java ContaTerminal
   ```
4. Insira os dados solicitados pelo terminal.

## Tecnologias Utilizadas

- Java 21
- IDE recomendada: IntelliJ IDEA, VS Code ou Eclipse

## Autor
Desafio proposto pelo Bootcamp **Bradesco Java Cloud Native** na plataforma **DIO**.

---

Qualquer sugestão ou melhoria é bem-vinda! 🚀

