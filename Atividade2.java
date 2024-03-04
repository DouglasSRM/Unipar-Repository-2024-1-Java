import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double peso;

        System.out.println("Informe seus dados:  ");

        System.out.println("Idade: ");
        while(true) {
            try {
                idade = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                System.out.println("Idade: ");
                scanner.nextLine();
            }
        }

        System.out.println("Peso: ");
        while(true) {
            try {
                peso = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                System.out.println("Peso: ");
                scanner.nextLine();
            }
        }

        System.out.println("Nome: ");
        scanner.nextLine();
        nome = scanner.nextLine();

        scanner.close();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}
