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

public class Produto {

    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        quantidadeEmEstoque = quantidadeEmEstoque + quantidade;
        System.out.println("Quantidade atualizada com sucesso!");
    }

    public void removerEstoque(int quantidade) {
        if(quantidade > quantidadeEmEstoque) {
            System.out.println("# ERRO #");
            System.out.println("A quantidade em estoque é menor que a quantidade informada!");
        } else {
            quantidadeEmEstoque = quantidadeEmEstoque - quantidade;
            System.out.println("Quantidade atualizada com sucesso!");
        }
    }
}
