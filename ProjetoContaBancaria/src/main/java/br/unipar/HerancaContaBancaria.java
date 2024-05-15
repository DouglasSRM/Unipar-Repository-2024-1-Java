package br.unipar;

import java.util.UUID;

abstract class HerancaContaBancaria implements InterfaceContaBancaria{

    protected Double saldo;
    private String numeroConta;


    public HerancaContaBancaria() {
        this.saldo = 0d;
        this.numeroConta = UUID.randomUUID().toString();
    }

    @Override
    public Double obterSaldo() {
        return saldo;
    }

    @Override
    public void depoistar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public String retornarNumeroConta() {
        return numeroConta;
    }
}
