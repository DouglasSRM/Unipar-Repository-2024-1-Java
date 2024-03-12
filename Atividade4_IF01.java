import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  1. Verificação de idade:
 *  Escreva um programa Java que pede ao usuário para inserir sua idade.
 *  O programa deve então verificar se a idade é maior ou igual a 18.
 *  Se for, deve imprimir "Você é maior de idade". Caso contrário, deve imprimir "Você é menor de idade".
 */

public class Atividade4_IF01 {

    private static final Scanner scanner = new Scanner(System.in);
    private static int idade;
    private static boolean repetir = true;

    //Método principal
    public static void main(String[] args) {

        try {
            while(repetir) {
                idade = pegarIdade();
                if (idade >= 18) {
                    System.out.println("Você é maior de idade!");
                } else {
                    System.out.println("Você é menor de idade!");
                }
                repetir = pegarRepetir();
            }
        } finally {
            scanner.close();
        }
    }

    //Método para coletar a idade
    private static int pegarIdade() {
        while (true) {
            try {
                System.out.println("Insira sua idade: ");
                return idade = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                scanner.nextLine();
            }
        }
    }

    //Método para repetir o sistema
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
