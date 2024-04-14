package RevisaoEtapa2.Revisao2;

/**
 * 2 - Desenvolva uma classe em Java para representar um objeto do tipo Produto. Essa classe deve possuir atributos privados para armazenar o nome,
 *     o preço e a quantidade em estoque do produto. Implemente métodos públicos para acessar e modificar esses atributos, garantindo o encapsulamento adequado da classe.
 *     Após criar a classe Produto, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as informações dos produtos criados.
 *     Certifique-se de utilizar o encapsulamento de forma correta, protegendo os atributos da classe e garantindo o acesso seguro a eles através dos métodos públicos disponibilizados.
 */

public class Main {
    private static Produto produto = new Produto();

    public static void main(String[] args) {
        produto.setNome("Água");
        produto.setPreco(2.99);
        produto.setQuantidadeEstoque(10);

        mostrarProduto();

        produto.setPreco(2.49);
        produto.setQuantidadeEstoque(40);

        mostrarProduto();
    }

    private static void mostrarProduto(){
        System.out.println("# Produto 1 #");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
    }
}
