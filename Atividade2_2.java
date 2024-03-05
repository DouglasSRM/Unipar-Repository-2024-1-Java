import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade2_2 {

    private static Scanner scanner = new Scanner(System.in);
    private static double valorCelsius = 0.0;
    private static double valorFahrenheit = 0.0;
    private static int menu = 0;

    public static void main(String[] args) {
        try {
            while (menu != 3) {
                menu = getMenu();
                switch (menu) {
                    case 1:
                        celciusParaFahrenheit();
                        break;
                    case 2:
                        fahrenheitParaCelcius();
                        break;
                    case 3:
                        System.out.println("Programa encerrado com sucesso.");
                        break;
                    default:
                        System.out.println("Por favor, insira uma opção válida.");
                        System.out.println();
                }
            }
        } finally {
            scanner.close();
        }
    }

    private static int getMenu(){
        System.out.println("# Selecionar #");
        System.out.println("1 - Celcius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celcius");
        System.out.println("3 - Sair");
        while (true) {
            try {
                return menu = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira uma opção válida.");
                scanner.nextLine();
            }
        }
    }

    private static void celciusParaFahrenheit() {
        System.out.println("Informe a temperatura em Celsius: ");
        while (true) {
            try {
                valorCelsius = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                scanner.nextLine();
            }
        }
        valorFahrenheit = (valorCelsius * 9 / 5) + 32;
        System.out.println("Valor em Fahrenheit " + valorFahrenheit);
        System.out.println();
    }

    private static void fahrenheitParaCelcius() {
        System.out.println("Informe a temperatura em Fahrenheit: ");
        while (true) {
            try {
                valorFahrenheit = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido.");
                scanner.nextLine();
            }
        }
        valorCelsius = (valorFahrenheit - 32) / 1.8;
        System.out.println("Valor em Celcius " + valorCelsius);
        System.out.println();
    }
}
