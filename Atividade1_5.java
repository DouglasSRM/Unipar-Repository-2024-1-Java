/**
 *  "Vamos praticar a criação de variáveis, inicialização e exibição dos dados em Java!
 *  Abaixo está um contexto onde você precisará criar variáveis para representar informações sobre
 *  produtos em um estoque, inicializá-las com valores específicos e, em seguida, exibir esses dados."
 *  Contexto:
 *  "Você está desenvolvendo um programa de controle de estoque para uma loja de eletrônicos.
 *  A loja possui diversos produtos em estoque, e você precisa criar variáveis para armazenar informações sobre alguns desses produtos."
 *  Tarefas:
 *  "Declare as variáveis necessárias para representar informações sobre os seguintes produtos:"
 *  - Smartphone
 *  - Laptop
 *  - Fone de Ouvido Bluetooth
 *  "Inicialize cada variável com valores específicos para representar os seguintes dados:"
 *  - Nome do produto
 *  - Marca do produto
 *  - Preço do produto
 *  - Quantidade em estoque
 *  "Após a inicialização, exiba os dados de cada produto no console, como por exemplo:"
 
 *      System.out.println("Dados do Smartphone:");
 *      System.out.println("Nome: " + nomeSmartphone);
 */

public class Atividade1_5 {
    public static void main(String[] args){
        String nomeSmartphone = "Redmi 12";
        String nomeLaptop = "Aspire 5";
        String nomeFoneBluetooth = "AirPods Pro";
        String marcaSmartphone = "Xiaomi";
        String marcaLaptop = "Acer";
        String marcaFoneBluetooth = "Apple";
        double precoSmartphone = 1200;
        double precoLaptop = 3000;
        double precoFoneBluetooth = 229.99;
        int estoqueSmartphone = 24;
        int estoqueLaptop = 17;
        int estoqueFoneBluetooth = 36;

        System.out.println("Dados do Smartphone:");
        System.out.println("Nome: " + nomeSmartphone);
        System.out.println("Marca: " + marcaSmartphone);
        System.out.println("Preço: " + precoSmartphone);
        System.out.println("Quantidade em estoque: " + estoqueSmartphone);
        System.out.println("");
        System.out.println("Dados do Laptop:");
        System.out.println("Nome: " + nomeLaptop);
        System.out.println("Marca: " + marcaLaptop);
        System.out.println("Preço: " + precoLaptop);
        System.out.println("Quandidade em estoque: " + estoqueLaptop);
        System.out.println("");
        System.out.println("Dados do Fone Bluetooth:");
        System.out.println("Nome: " + nomeFoneBluetooth);
        System.out.println("Marca: " + marcaFoneBluetooth);
        System.out.println("Preço: " + precoFoneBluetooth);
        System.out.println("Quantidade em estoque: " + estoqueFoneBluetooth);
    }
}
