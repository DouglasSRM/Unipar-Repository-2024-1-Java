package br.unipar;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depoistar(1000d);

        System.out.println("Saldo é: " + contaCorrente.obterSaldo());
        System.out.println("Numero da conta é: " + contaCorrente.retornarNumeroConta());
    }
}
