import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Desenvolva um algoritmo para verificar se uma fila está vazia ou não.
 *
 * (Fila do exercício 2_1 com adição do método "verificar")
 */

public class EstruturaDeDados2_2 {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int TAMANHO_FILA = 5;
    private static final int[] fila = new int[TAMANHO_FILA];
    private static int totalFila = 0;
    private static int menu = 0;

    //Método principal
    public static void main(String[] args) {
        try {
            while(menu != 6) {
                menu = pegarMenu();
                switch (menu) {
                    case 1:
                        adicionar();
                        break;
                    case 2:
                        remover();
                        break;
                    case 3:
                        topo();
                        break;
                    case 4:
                        listar();
                        break;
                    case 5:
                        verificar();
                        break;
                    case 6:
                        System.out.println("Programa encerrado. Obrigado!");
                        break;
                    default:
                        System.out.println("Por favor, insira um número válido.");
                        System.out.println();
                }
            }
        } finally {
            scanner.close();
        }
    }

    //Método menu
    public static int pegarMenu(){
        System.out.println("# Menu Principal #");
        System.out.println("1 - Adicionar");
        System.out.println("2 - Remover");
        System.out.println("3 - Topo");
        System.out.println("4 - Listar");
        System.out.println("5 - Verificar");
        System.out.println("6 - Sair");
        while(true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine();
            }
        }
    }

    //Método adicionar.
    private static void adicionar() {
        if (totalFila < TAMANHO_FILA) {
            System.out.println("Inserindo elemento na posição " + (totalFila + 1) + ": ");
            while(true) {
                try {
                    fila[totalFila] = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Por favor, insira um número válido.");
                    scanner.nextLine();
                }
            }
            totalFila++;
        } else {
            System.out.println("Fila cheia!");
        }
        System.out.println();
    }

    //Método remover
    private static void remover(){
        if (totalFila > 0) {
            System.out.println("Removendo elemento da primeira posição...");
            /**for (int i = 0; i < totalFila - 1; i++) {
             fila[i] = fila[i + 1];
             } **/
            System.arraycopy(fila, 1, fila, 0, (totalFila-1));
            totalFila--;
        } else {
            System.out.println("Fila zerada!");
        }
        System.out.println();
    }

    //Método topo
    private static void topo(){
        if (totalFila > 0) {
            System.out.println("Ultimo elemento: " + fila[totalFila - 1] + " na posição " + totalFila);
        } else {
            System.out.println("Fila zerada!");
        }
        System.out.println();
    }

    //Método listar
    private static void listar(){
        if (totalFila > 0) {
            for (int contador = 0; contador < totalFila; contador++)
                System.out.println("Posição " + (contador + 1) + ": " + fila[contador]);
        } else {
            System.out.println("Fila zerada!");
        }
        System.out.println();
    }

    //Método para verificar se a fila está vazia ou não
    private static void verificar() {
        if (totalFila > 0) {
            System.out.println("A fila não está vazia! No momento ela contém " + totalFila + " elemento(s)!");
        } else {
            System.out.println("A fila está vazia!");
        }
        System.out.println();
    }
}
