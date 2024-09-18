package Atividade5_5;

/**
 * 5. Crie um Objeto chamado Carro, definina quais são as suas caracteristicas e metodos
 *    e crie uma outra classe Chamada CarroTeste para criar o objeto e testar.
 */

public class CarroTeste {

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setNome("Audi R8");
        carro.setAno(2006);
        carro.setMarca("Audi");

        System.out.println(carro.getNome());
        System.out.println(carro.getAno());
        System.out.println(carro.getMarca());

    }
}
