import java.util.Scanner;

public class Estrutura2902 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        int contadorPilha = 0;
        int[] pilha = new int[8];

        while (menu != 5) {
            System.out.println("# Menu Principal #");
            System.out.println("1 - Empilhar");
            System.out.println("2 - Desempilhar");
            System.out.println("3 - Topo");
            System.out.println("4 - Listar");
            System.out.println("5 - Sair");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    if (contadorPilha < 8) {
                        System.out.println("Inserir número na posição " + (contadorPilha + 1) + ": ");
                        pilha[contadorPilha] = scanner.nextInt();
                        contadorPilha++;
                    } else {
                        System.out.println("Pilha cheia!");
                    }
                    System.out.println();
                    break;
                case 2:
                    if (contadorPilha > 0) {
                    System.out.println("Zerando posição " + contadorPilha + "...");
                    contadorPilha--;
                    pilha[contadorPilha] = 0;
                    } else {
                        System.out.println("Pilha zerada!");
                    }
                    System.out.println();
                    break;
                case 3:
                    if (contadorPilha > 0) {
                        System.out.println("Ultimo input: " + pilha[contadorPilha - 1] + " na posição " + contadorPilha);
                    } else {
                        System.out.println("Pilha zerada!");
                    }
                    System.out.println();
                    break;
                case 4:
                    if (contadorPilha > 0) {
                        for (int contador = 0; contador < contadorPilha; contador++) {
                            System.out.println((contador + 1) + ": " + pilha[contador]);
                        }
                    } else {
                        System.out.println("Pilha zerada!");
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    System.out.println();
            }
        }
    }
}
