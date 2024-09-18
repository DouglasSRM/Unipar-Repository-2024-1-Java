import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * "Faça um sistema que o usuario vai informar 2 numeros.
 * O sistema deve retornar a soma, subtração, divisão e multiplicação dos dois numeros."
 */

public class Atividade3_5 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double valor1;
        double valor2;
        double adicao;
        double subtracao;
        double divisao;
        double multiplicacao;

        try {
            while (true) {
                System.out.println("# Operações Básicas #");
                System.out.println("Insira o primeiro valor: ");
                valor1 = getValor();
                System.out.println("Insira o segundo valor: ");
                valor2 = getValor();

                adicao = valor1 + valor2;
                subtracao = valor1 - valor2;
                divisao = valor1 / valor2;
                multiplicacao = valor1 * valor2;

                System.out.println("O resultado da adição é: " + adicao);
                System.out.println("O resultado da subtração é: " + subtracao);
                System.out.println("O resultado da divisão é: " + divisao);
                System.out.println("O resultado da multiplicação é: " + multiplicacao);

                System.out.println("Deseja subtrair novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                double sair = getValor();
                if (sair == 2) {
                    System.out.println("Programa encerrado. Obrigado!");
                    break;
                }
            }
        } finally {
            scanner.close();
        }
    }

    public static double getValor() {
        while(true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }
    }
}
