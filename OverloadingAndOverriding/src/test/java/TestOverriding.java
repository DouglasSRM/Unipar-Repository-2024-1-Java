import br.unipar.overriding.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOverriding {

    @Test //Resposta padrão para qualquer animal genérico
    public void testSomAnimal() {
        AnimalOverriding animal = new AnimalOverriding();
        assertEquals("~algum som genérico de animal~", animal.fazerSom());
    }

    @Test //Resposta para som do cachorro
    public void testSomCachorro() {
        AnimalOverriding cachorro = new CachorroOverriding();
        assertEquals("~auau~", cachorro.fazerSom());
    }

    @Test //Resposta para som do gato
    public void testSomGato() {
        AnimalOverriding gato = new GatoOverriding();
        assertEquals("~miau~", gato.fazerSom());
    }
}
