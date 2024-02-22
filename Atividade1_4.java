import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeDoProduto;
        String categoriaDoProduto;
        double precoUnitarioProduto;
        int quantidadeEstoque;

        System.out.println("# Cadastro de produtos #");
        System.out.println("Digite o nome do produto: ");
        nomeDoProduto = scanner.next();
        System.out.println("Digite a categoria do produto: ");
        categoriaDoProduto = scanner.next();
        System.out.println("Digite o preçõ da unidade do produto: ");
        precoUnitarioProduto = scanner.nextDouble();
        System.out.println("Digite a quantidade em estoque do produto: ");
        quantidadeEstoque = scanner.nextInt();

        System.out.println("Produto #1");
        System.out.println("Nome: "+nomeDoProduto);
        System.out.println("Categoria: "+categoriaDoProduto);
        System.out.println("Preço: "+precoUnitarioProduto);
        System.out.println("Estoque: "+quantidadeEstoque);
    }
}
