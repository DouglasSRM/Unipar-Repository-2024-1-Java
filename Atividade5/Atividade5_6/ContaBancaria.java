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

public class ContaBancaria {

    private double saldo;
    private String numeroConta;

    //Requerimento 1
    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Valor depositado com sucesso!");
    }

    //Requerimento 2
    public void sacar(double valor) {
        if(valor > saldo) {
            System.out.println("# ERRO #");
            System.out.println("Saldo insuficiente!");
        } else {
            saldo = saldo - valor;
            System.out.println("Valor sacado com sucesso!");
        }
    }

    //Requerimento 3
    public double consultarSaldo() {
        return saldo;
    }

    //Métodos adicionais para treino
    public ContaBancaria() {
        saldo = 0;
        numeroConta = "0000-0";
    }
    public void definirNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String consultarNumeroConta() {
        return numeroConta;
    }

}
