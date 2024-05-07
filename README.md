# Banco Digital em Java

Este é um projeto simples de um banco digital implementado em Java, utilizando conceitos de Programação Orientada a Objetos (POO).

## Descrição

O projeto consiste em um sistema bancário básico com funcionalidades como abertura de conta, depósito, saque e exibição de informações da conta.

## Funcionalidades

- Abrir conta bancária
- Realizar depósito
- Realizar saque
- Exibir informações da conta

## Como usar

1. Clone o repositório para a sua máquina local.
2. Abra o projeto em sua IDE favorita (Eclipse, IntelliJ, etc.).
3. Execute a classe `Main.java`.
4. Siga as instruções no console para interagir com o sistema.

## Exemplo de uso

```java
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.abrirConta(123456, "João", 1000.0);
        banco.depositar(123456, 500.0);
        banco.sacar(123456, 200.0);
        banco.exibirInformacoesConta(123456);
    }
}

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para propor melhorias, correções de bugs ou implementar novas funcionalidades. Basta abrir uma issue ou enviar um pull request.

