package RevisaoEtapa2.Revisao1;

/**
 * 1 - Você deve criar uma classe em Java para representar um carro. A classe deve conter atributos privados para armazenar
 *     a marca, o modelo, o ano e a cor do carro. Além disso, você deve implementar métodos públicos para acessar e modificar
 *     esses atributos, garantindo o encapsulamento da classe. Por fim, crie um método para exibir as informações do carro.
 *     Após criar a classe, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as informações dos carros criados.
 *     Lembre-se de utilizar o encapsulamento adequado para proteger os atributos da classe e garantir o acesso seguro aos mesmos através dos métodos públicos.
 */

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.setMarca("Ford");
        carro2.setMarca("Chevrolet");

        carro1.setModelo("Fusion");
        carro2.setModelo("Onix");

        carro1.setAno(2021);
        carro2.setAno(2022);

        carro1.setCor("Vermelho");
        carro2.setCor("Branco");

        System.out.println("# Carro 1 #");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Cor: " + carro1.getCor());

        System.out.println("# Carro 2 #");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Cor: " + carro2.getCor());
    }
}
