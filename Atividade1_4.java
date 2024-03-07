/**
 *    "Você foi contratado para desenvolver um programa simples em Java para gerenciar o estoque de uma loja de conveniência.
 *    A loja vende uma variedade de produtos, incluindo alimentos, bebidas e produtos de higiene.
 *    Seu objetivo é criar um sistema para acompanhar a quantidade de cada produto em estoque."
 *    Tarefas:
 *    1. Identifique os diferentes tipos de informações que precisamos armazenar para cada produto.
 *    2. Declare as variáveis necessárias para representar essas informações.
 *    3. Considere os tipos de dados apropriados para cada variável.
 *    Informações a serem armazenadas para cada produto:
 *    - Nome do produto
 *    - Categoria do produto (ex: alimentos, bebidas, higiene)
 *    - Preço unitário do produto
 *    - Quantidade em estoque do produto
 *    "Sua tarefa é identificar e declarar as variáveis necessárias para representar essas informações.
 *    Escreva as declarações de variáveis dentro do escopo a seguir:

 *     public class ControleEstoque {
 *         public static void main(String[] args) {
 *             // Declaração das variáveis aqui
 *         }
 *     }

 *    "Lembre-se de escolher nomes significativos para suas variáveis e utilizar os tipos de dados apropriados para cada informação.
 *     Após declarar as variáveis, você pode pensar em como utilizar essas variáveis em operações futuras, como adicionar ou remover itens do estoque."
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeDoProduto;
        String categoriaDoProduto;
        double precoUnitarioProduto;
        int quantidadeEstoque;

        System.out.println("# Cadastro de produtos #");
        System.out.println("Digite o nome do produto: ");
        nomeDoProduto = scanner.nextLine();
        System.out.println("Digite a categoria do produto: ");
        categoriaDoProduto = scanner.nextLine();
        System.out.println("Digite o preçõ da unidade do produto: ");
        while(true) {
            try {
                precoUnitarioProduto = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                scanner.nextLine();
            }
        }
        System.out.println("Digite a quantidade em estoque do produto: ");
        while(true) {
            try {
                quantidadeEstoque = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira uma quantidade válida.");
                scanner.nextLine();
            }
        }

        System.out.println("Produto #1");
        System.out.println("Nome: " + nomeDoProduto);
        System.out.println("Categoria: " + categoriaDoProduto);
        System.out.println("Preço: " + precoUnitarioProduto);
        System.out.println("Estoque: " + quantidadeEstoque);
    }
}
