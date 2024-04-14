package RevisaoEtapa2.Revisao3;

/**
 * 3 - Você deve implementar um programa em Java para gerenciar o estoque de uma loja. Para isso, crie uma classe "Produto" que representará os produtos disponíveis na loja.
 *     Esta classe deve possuir atributos privados para armazenar o nome, o preço e a quantidade em estoque do produto.
 *     Em seguida, implemente métodos públicos na classe "Produto" para acessar e modificar esses atributos, garantindo o encapsulamento adequado da classe.
 *     Após criar a classe "Produto", desenvolva um programa principal que permita ao usuário realizar as seguintes operações:
 *     1. Adicionar um novo produto ao estoque, fornecendo o nome, o preço e a quantidade em estoque.
 *     2. Atualizar o preço ou a quantidade em estoque de um produto existente.
 *     3. Exibir os detalhes de um produto específico, incluindo seu nome, preço e quantidade em estoque.
 *     Certifique-se de utilizar o encapsulamento de forma correta na classe "Produto", protegendo os atributos da classe e garantindo o acesso seguro a eles através dos métodos públicos disponibilizados.
 */

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}
