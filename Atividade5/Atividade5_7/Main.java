package Atividade5_7;

/**
 * 7. Crie uma classe Java chamada "Produto" que represente um produto em um sistema de estoque. A classe deve ter os seguintes atributos privados:
 *     - "codigo", do tipo "int", representando o código do produto.
 *     - "descricao", do tipo "String", representando a descrição do produto.
 *     - "preco", do tipo "double", representando o preço unitário do produto.
 *     - "quantidadeEmEstoque", do tipo "int", representando a quantidade disponível em estoque do produto.
 *
 *     A classe "Produto" deve ter os seguintes métodos públicos:
 *
 *     - Um construtor que recebe como parâmetros o código, a descrição, o preço e a quantidade inicial em estoque do produto.
 *     - Métodos de acesso (getters) para todos os atributos da classe.
 *     - Um método chamado "adicionarEstoque(int quantidade)" que recebe uma quantidade como parâmetro e adiciona essa quantidade ao estoque do produto.
 *     - Um método chamado "removerEstoque(int quantidade)" que recebe uma quantidade como parâmetro e remove essa quantidade do estoque do produto, desde que haja estoque suficiente. Caso contrário, deve exibir uma mensagem de erro.
 */

public class Main {

    public static void main(String[] args) {
        Produto produto1 = new Produto(123, "Água", 2.99, 20);

        System.out.println(produto1.getCodigo());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getPreco());
        System.out.println(produto1.getQuantidadeEmEstoque());

        produto1.adicionarEstoque(10);

        System.out.println(produto1.getQuantidadeEmEstoque());

        produto1.removerEstoque(40);

        produto1.removerEstoque(5);

        System.out.println(produto1.getQuantidadeEmEstoque());

        Produto produto2 = new Produto(124, "Pão", 5.99, 80);

        System.out.println(produto2.getQuantidadeEmEstoque());

        produto2.removerEstoque(59);

        System.out.println(produto2.getQuantidadeEmEstoque());
    }

}
