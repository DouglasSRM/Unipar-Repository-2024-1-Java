import br.unipar.ContaCorrente;
import br.unipar.ContaPoupanca;
import org.junit.jupiter.api.Test;

import java.util.spi.CalendarDataProvider;

import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {

    @Test
    public void testDepositoContaCorrente() {

        ContaCorrente conta = new ContaCorrente();
        conta.depoistar(5000d);

        assertEquals(conta.obterSaldo(), 5000);
    }

    @Test
    public void testSaqueContaCorrente() {

        ContaCorrente conta = new ContaCorrente();

        conta.depoistar(3000d);
        boolean validacao = conta.saque(1500d);

        assertTrue(validacao);
        assertEquals(conta.obterSaldo(), 1500);
    }

    @Test
    public void testSaqueMaiorSaldoContaCorrente() {

        ContaCorrente conta = new ContaCorrente();

        conta.depoistar(3000d);
        boolean validacao = conta.saque(4500d);

        assertFalse(validacao);
        assertEquals(conta.obterSaldo(), 3000);
    }

    @Test
    public void testDepositoContaPoupanca() {

        ContaPoupanca conta = new ContaPoupanca();
        conta.depoistar(5000d);

        assertEquals(conta.obterSaldo(), 5000);
    }

    @Test
    public void testSaqueContaPoupanca() {

        ContaPoupanca conta = new ContaPoupanca();

        conta.depoistar(3000d);
        boolean validacao = conta.saque(1500d);

        assertTrue(validacao);
        assertEquals(conta.obterSaldo(), 1495);
    }

    @Test
    public void testSaqueMaiorSaldoContaPoupanca() {

        ContaPoupanca conta = new ContaPoupanca();

        conta.depoistar(300d);
        boolean validacao = conta.saque(500d);

        assertFalse(validacao);
        assertEquals(conta.obterSaldo(), 300);
    }
}
