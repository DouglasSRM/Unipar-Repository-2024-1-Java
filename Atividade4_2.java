import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  2. Verificação de número par ou ímpar:
 *  Escreva um programa Java que solicita ao usuário inserir um número inteiro.
 *  O programa deve então verificar se o número é par ou ímpar e imprimir a mensagem correspondente.
 */

public class Atividade4_2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static boolean repetir = true;
    private static int numero;
    public static void main(String[] args) {
        try {
            while(repetir) {
                numero = pegarNumero();
                //Par
                if (numero % 2 == 0) {
                    System.out.println("O número é par!");
                }
                //Impar
                if (numero % 2 == 1) {
                    System.out.println("O número é impar!");
                }
                repetir = pegarRepetir();
            }
        } finally {
            scanner.close();
        }
    }
    public static int pegarNumero() {
        while (true) {
            try {
                System.out.println("Digite um número inteiro: ");
                return numero = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                scanner.nextLine();
            }
        }
    }
    private static boolean pegarRepetir() {
        while(true) {
            try {
                System.out.println("Deseja repetir o programa?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                if (scanner.nextInt() == 2) {
                    return repetir = false;
                } else {
                    return repetir = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                scanner.nextLine();
            }
        }
    }
}
