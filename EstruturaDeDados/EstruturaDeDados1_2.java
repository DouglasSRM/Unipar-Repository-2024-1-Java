import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crie um progreama para inverter a ordem dos elementos em uma pilha.
 *
 * (Exercício 1_1 com adição da função inverter)
 */

public class EstruturaDeDados1_2 {
    private static final int TAMANHO_PILHA = 8;
    private static final int[] pilha = new int[TAMANHO_PILHA];
    private static int menu = 0;
    private static int contadorPilha = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while (menu != 6) {
                exibirMenu();

                while(true) {
                    try {
                        menu = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor, insira um número válido.");
                        scanner.nextLine();
                    }
                }

                switch (menu) {
                    case 1:
                        empilhar();
                        break;
                    case 2:
                        desempilhar();
                        break;
                    case 3:
                        topo();
                        break;
                    case 4:
                        listar();
                        break;
                    case 5:
                        inverter();
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
    public static void exibirMenu() {
        System.out.println("# Menu Principal #");
        System.out.println("1 - Empilhar");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Topo");
        System.out.println("4 - Listar");
        System.out.println("5 - Inverter");
        System.out.println("6 - Sair");
    }

    //Método empilhar
    private static void empilhar() {
        if(contadorPilha < TAMANHO_PILHA) {
            System.out.println("Inserindo elemento na posição " + (contadorPilha + 1) + ": ");
            while(true) {
                try {
                    pilha[contadorPilha] = scanner.nextInt();
                    break;
                } catch(InputMismatchException e) {
                    System.out.println("Por favor, insira um número válido.");
                    scanner.nextLine();
                }
            }
            contadorPilha++;
        } else {
            System.out.println("Pilha cheia!");
        }
        System.out.println();
    }

    //Método desempilhar
    private static void desempilhar() {
        if(contadorPilha > 0) {
            System.out.println("Removendo elemento da posição " + contadorPilha + "...");
            contadorPilha--;
            pilha[contadorPilha] = 0;
        } else {
            System.out.println("Pilha zerada!");
        }
        System.out.println();
    }

    //Método topo
    private static void topo() {
        if(contadorPilha > 0) {
            System.out.println("Ultimo elemento: " + pilha[contadorPilha - 1] + " na posição " + contadorPilha);
        } else {
            System.out.println("Pilha zerada!");
        }
        System.out.println();
    }

    //Método listar
    private static void listar() {
        if(contadorPilha > 0) {
            for(int contador = 0; contador < contadorPilha; contador++)
                System.out.println("Posição " + (contador + 1) + ": " + pilha[contador]);
        } else {
            System.out.println("Pilha zerada!");
        }
        System.out.println();
    }

    // Médoto inverter
    // Criação de uma nova array, que terá o tamanho correspondente ao número de elementos atualmante na pilha.
    // A seguir, os elementos serão copiados para a nova array, em uma ordem inversa.
    // Por fim, utiliza-se o arraycopy para copiar os elementos da pilha temporária para a pilha definitiva.
    private static void inverter() {
        if(contadorPilha > 0) {
            int[] tempPilha = new int[contadorPilha];

            for(int contador = 0; contador < contadorPilha; contador++) {
                tempPilha[contador] = pilha[contadorPilha - 1 - contador];
            }

            System.arraycopy(tempPilha, 0, pilha, 0, contadorPilha);

            System.out.println("Pilha invertida!");
        } else {
            System.out.println("Pilha zerada!");
        }
        System.out.println();
    }

}
