package Atividade5_6;

/**
 * 6. Crie uma classe Java chamada "ContaBancaria" que represente uma conta bancária simples. A classe deve ter os seguintes atributos privados:
 *     - "saldo", do tipo "double", representando o saldo atual da conta.
 *     - "numeroConta", do tipo "String", representando o número da conta bancária.
 *
 *     A classe "ContaBancaria" deve ter os seguintes métodos públicos:
 *
 *     1 - Um método chamado "depositar(double valor)" que recebe um valor como parâmetro e adiciona esse valor ao saldo da conta.
 *     2 - Um método chamado "sacar(double valor)" que recebe um valor como parâmetro e subtrai esse valor do saldo da conta, desde que haja saldo suficiente. Caso contrário, deve exibir uma mensagem de erro.
 *     3 - Um método chamado "consultarSaldo()" que retorna o saldo atual da conta.
 */

//Adicionais para treino.
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Conta: " + conta.consultarNumeroConta());

        System.out.println("Saldo: R$" + conta.consultarSaldo());
        conta.depositar(500);
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        conta.sacar(200);
        System.out.println("Saldo: R$" + conta.consultarSaldo());
        conta.sacar(600);

        conta.definirNumeroConta("3123-1");

        System.out.println("Conta: " + conta.consultarNumeroConta());
        System.out.println("Saldo: R$" + conta.consultarSaldo());
    }
}
