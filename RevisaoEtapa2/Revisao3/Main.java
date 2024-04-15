package RevisaoEtapa2.Revisao3;

import java.util.InputMismatchException;
import java.util.Scanner;

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

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final int TOTAL_PRODUTOS = 10;
    private static Produto[] produto = new Produto[TOTAL_PRODUTOS];
    private static int contadorProdutos = 0;
    private static boolean temProdutos = false;

    public static void main(String[] args) {
        try {
            int opcao;
            do {
                exibirMenu();
                opcao = solicitarInt("Escolha uma opção: ");
                processarMenu(opcao);
            } while(opcao != 4);
        } finally {
            scanner.close();
        }
    }

    //Método para exibir o menu
    private static void exibirMenu() {
        System.out.println("# Menu #");
        System.out.println("1 - Adicionar um novo produto");
        System.out.println("2 - Atualizar preço ou quantidade de um produto");
        System.out.println("3 - Exibir os detalhes de um produto");
        System.out.println("4 - Sair");
    }

    //Método para processar o menu
    private static void processarMenu(int opcao) {
        switch (opcao) {
            case 1:
                adicionar();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                exibir();
                break;
            case 4:
                System.out.println("Programa encerrado.");
                break;
            default:
                System.out.println("Insira uma opção válida.");
        }
    }

    //Método para adicionar produtos
    private static void adicionar() {
        if(contadorProdutos < TOTAL_PRODUTOS) {
            System.out.println("# Cadastro de Produtos #");
            String nome = solicitarEntrada("Nome: ");
            if(!existeProduto(nome)) {
                produto[contadorProdutos] = new Produto();
                double preco = solicitarDouble("Preço: ");
                int quantidadeEmEstoque = solicitarInt("Quantidade em estoque: ");
                produto[contadorProdutos].setNome(nome);
                produto[contadorProdutos].setPreco(preco);
                produto[contadorProdutos].setQuantidadeEmEstoque(quantidadeEmEstoque);
                contadorProdutos++;
                System.out.println("Produto Adicionado com sucesso!");
            } else {
                System.out.println("Produdo com este nome já cadastrado.");
            }
        } else {
            System.out.println("Máximo de produtos atingido.");
        }
    }

    private static boolean existeProduto(String nome) {
        for(int i = 0; i < contadorProdutos; i++) {
            if(produto[i] != null && produto[i].getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    //Método para atualizar detalhes do produto
    private static void atualizar() {
        if(contadorProdutos > 0) {
            String nome = solicitarEntrada("Insira o nome do produto que deseja atualizar: ");
            Produto produtoParaAtualizar = buscarProduto(nome);
            if(produtoParaAtualizar != null) {
                System.out.println("Digite 'preco' para alterar o preço ou 'quantidade' para alterar a quantidade do produto");
                while (true) {
                    String opcao = scanner.nextLine().toLowerCase();
                    if (opcao.equals("preco")) {
                        System.out.println("Preço atual: R$" + produtoParaAtualizar.getPreco());

                        produtoParaAtualizar.setPreco(solicitarDouble("Novo preço: R$"));
                        System.out.println("Preço atualizado com sucesso!");
                        break;
                    } else if (opcao.equals("quantidade")) {
                        System.out.println("Quantidade atual: " + produtoParaAtualizar.getQuantidadeEmEstoque());
                        produtoParaAtualizar.setQuantidadeEmEstoque(solicitarInt("Nova quantidade: "));
                        System.out.println("Quantidade atualizada com sucesso!");
                        break;
                    } else {
                        System.out.println("Opção inválida. Por favor, insira 'preco' ou 'quantidade'.");
                    }
                }
            } else {
                System.out.println("Produto não encontrado.");
            }
        } else {
            System.out.println("Não há produtos cadastrados.");
        }
    }

    private static Produto buscarProduto(String nome) {
        for(int i = 0; i < contadorProdutos; i++) {
            if (produto[i] != null && produto[i].getNome().equalsIgnoreCase(nome)) {
                return produto[i];
            }
        }
        return null;
    }

    //Método para exibir detalhes de um produto específico
    private static void exibir() {
        if(contadorProdutos > 0) {
            String nome = solicitarEntrada("Insira o nome do produto que deseja visualizar: ");
            Produto produtoParaExibir = buscarProduto(nome);
            if(produtoParaExibir != null) {
                System.out.println("Nome: " + produtoParaExibir.getNome());
                System.out.println("Preço: R$" + produtoParaExibir.getPreco());
                System.out.println("Quantidade em Estoque: " + produtoParaExibir.getQuantidadeEmEstoque());
            } else {
                System.out.println("Produto não encontrado.");
            }
        } else {
            System.out.println("Não há produtos cadastrados.");
        }
    }

    //Método para coletar String
    private static String solicitarEntrada(String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }

    //Método para coletar valor inteiro
    private static int solicitarInt(String mensagem) {
        int inteiro = 0;
        while(true) {
            try {
                System.out.print(mensagem);
                inteiro = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
            }
            if(inteiro <= 0) {
                System.out.println("Insira um número válido.");
            } else {
                break;
            }
        }
        return inteiro;
    }

    //Método para coletar valor double
    private static double solicitarDouble(String mensagem) {
        double flutuante = 0;
        while(true) {
            try {
                System.out.print(mensagem);
                flutuante = scanner.nextDouble();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
            }
            if(flutuante <= 0) {
                System.out.println("Insira um número válido.");
            } else {
                break;
            }
        }
        return flutuante;
    }
}
