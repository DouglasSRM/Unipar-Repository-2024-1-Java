package RevisaoEtapa2.Revisao2;

/**
 * 2 - Desenvolva uma classe em Java para representar um objeto do tipo Produto. Essa classe deve possuir atributos privados para armazenar o nome,
 *     o preço e a quantidade em estoque do produto. Implemente métodos públicos para acessar e modificar esses atributos, garantindo o encapsulamento adequado da classe.
 *     Após criar a classe Produto, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as informações dos produtos criados.
 *     Certifique-se de utilizar o encapsulamento de forma correta, protegendo os atributos da classe e garantindo o acesso seguro a eles através dos métodos públicos disponibilizados.
 */

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

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
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
