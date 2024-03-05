import java.util.InputMismatchException;
import java.util.Scanner;

// "Faça um sistema que peça 3 valores, some os 3 e mostre o total."

public class Atividade3_1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double valor1;
        double valor2;
        double valor3;
        double soma;
        try {
            while (true) {
                System.out.println("# Soma de 3 valores #");
                System.out.println("Insira o primeiro valor: ");
                valor1 = getValor();
                System.out.println("Insira o segundo valor: ");
                valor2 = getValor();
                System.out.println("Insira o terceiro valor: ");
                valor3 = getValor();

                soma = valor1 + valor2 + valor3;
                System.out.println("Soma = " + soma);

                System.out.println("Deseja somar novamente?");
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

    private static double getValor() {
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
