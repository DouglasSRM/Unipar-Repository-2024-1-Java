package RevisaoEtapa2.Revisao1;

/**
 * 1 - Você deve criar uma classe em Java para representar um carro. A classe deve conter atributos privados para armazenar
 *     a marca, o modelo, o ano e a cor do carro. Além disso, você deve implementar métodos públicos para acessar e modificar
 *     esses atributos, garantindo o encapsulamento da classe. Por fim, crie um método para exibir as informações do carro.
 *     Após criar a classe, crie objetos dessa classe e teste os métodos implementados, modificando e exibindo as informações dos carros criados.
 *     Lembre-se de utilizar o encapsulamento adequado para proteger os atributos da classe e garantir o acesso seguro aos mesmos através dos métodos públicos.
 */

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getAno() {
        return ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
}
