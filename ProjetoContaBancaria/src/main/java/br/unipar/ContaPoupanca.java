package br.unipar;

public class ContaPoupanca extends HerancaContaBancaria{
    @Override
    public boolean saque(Double valor) {
        double verificar = saldo + 5;
        if(verificar >= valor){
            saldo -= valor;
            saldo -= 5;

            return true;
        }
        return false;
    }

    /**
     *  1 - Criar implementação do saque
     *  2 - Quando fizer o saque deve cobrar uma taxa de R$ 5
     *  3 - Implementar teste unitario
     *       - Deposito
     *       - Saque sucesso
     *       - Saque invalido
     */
}
