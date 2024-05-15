package br.unipar;

public interface InterfaceContaBancaria {
    Double obterSaldo();
    void depoistar(Double valor);
    String retornarNumeroConta();
    boolean saque(Double valor);
}
