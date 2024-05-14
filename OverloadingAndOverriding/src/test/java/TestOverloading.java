import br.unipar.CalculadoraOverloading;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOverloading {

    @Test  //Adição de 2 números inteiros
    public void testAdicionarDoisInteiros() {
        CalculadoraOverloading calc = new CalculadoraOverloading();
        int resultado = calc.adicionar(7, 11);
        assertEquals(18, resultado);
    }

    @Test  //Adição de 2 números quebrados
    public void testAdicionarDoisDoubles() {
        CalculadoraOverloading calc = new CalculadoraOverloading();
        double resultado = calc.adicionar(4.2, 9.7);
        assertEquals(13.9, resultado, 0.001);
    }

    @Test  //Adição de 3 números inteiros
    public void testAdicionarTresInteiros() {
        CalculadoraOverloading calc = new CalculadoraOverloading();
        int resultado = calc.adicionar(4, 5, 6);
        assertEquals(15, resultado);
    }

    @Test  //Adição um int e um double (Utiliza-se o mesmo método para adicionar 2 doubles)
    public void testAdicionarIntEDouble() {
        CalculadoraOverloading calc = new CalculadoraOverloading();
        double resultado = calc.adicionar(3, 11.19);
        assertEquals(14.19, resultado, 0.001);
    }
}
