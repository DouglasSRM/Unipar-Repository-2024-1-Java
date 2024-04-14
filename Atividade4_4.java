import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  4. Verificação de maior número:
 *  Escreva um programa Java que solicita ao usuário inserir dois números inteiros.
 *  O programa deve então determinar qual dos dois números é o maior e imprimir essa informação.
 */

public class Atividade4_4 {
    private static final Scanner scanner = new Scanner(System.in);
    private static int numero1;
    private static int numero2;
    private static boolean repetir = true;

    //Método principal.
    public static void main(String[] args) {
        try {
            System.out.println("# COMPARAÇÃO DE NÚMEROS #");
            System.out.println("Insira dois números inteiros e o programa irá te dizer qual é o maior.");
            while(repetir) {
                System.out.println("Insira o primeiro número:");
                numero1 = getNumero();
                System.out.println("Insira o segundo número: ");
                numero2 = getNumero();

                if (numero1 > numero2) {
                    System.out.println("O número '" + numero1 + "' é maior que o número '" + numero2 + "'.");
                } else if (numero2 > numero1) {
                    System.out.println("O número '" + numero2 + "' é maior que o número '" + numero1 + "'.");
                } else {
                    System.out.println("Os números '" + numero1 + "' e '" + numero2 + "' são iguais.");
                }
                repetir = pegarRepetir();
            }
        } finally {
            scanner.close();
        }
    }

    //Método para coletar número.
    private static int getNumero() {
        while(true) {
            try {
                return scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Insira um número válido: ");
                scanner.nextLine();
            }
        }
    }

    //Método para repetir o sistema.
    private static boolean pegarRepetir() {
        while(true) {
            try {
                System.out.println("Deseja repetir o programa?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                if (scanner.nextInt() == 2) {
                    return false;
                } else {
                    return true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                scanner.nextLine();
            }
        }
    }
}
