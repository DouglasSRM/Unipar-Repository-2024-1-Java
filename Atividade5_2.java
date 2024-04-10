import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2. **Programa em Java dos patinhos da Xuxa**
 *     Xuxa, a rainha dos baixinhos, criou uma música que tem o segunte formato:
 *
 *     *n patinhos foram passear, Além das montanhas Para brincar A mamãe gritou: Quá, quá, quá, quá*
 *     *Mas só n-1 patinhos voltaram de lá*
 *
 *     Que se repete até nenhum patinho voltar de lá.
 *     Ao final, todos os patinhos voltam:
 *
 *     *A mamãe patinha foi procurar Além das montanhas Na beira do mar
 *     A mamãe gritou:Quá, quá, quá, quá E os n patinhos voltaram de lá.*
 *
 *     Crie um programa em Java que recebe um inteiro positivo do usuário e exibe a música inteira na tela,
 *     onde o inteiro recebido representa o número inicial n de patinhos que foram passear.
 */

public class Atividade5_2 {

    private static final Scanner scanner = new Scanner(System.in);
    private static int patinhos = 0;

    public static void main(String[] args) {
        try {
            patinhos = pegarPatinhos();

            for(int contador = 1; contador < patinhos-1; contador++) {
                int atualPatinhos = patinhos + 1 - contador;
                System.out.println(atualPatinhos + " patinhos foram passear, Além das montanhas Para brincar");
                System.out.println("A mamãe gritou: Quá, quá, quá, quá. Mas só " + (atualPatinhos - 1) +" patinhos voltaram de lá.");
            }
            System.out.println(1 + " patinho foi passear, Além das montanhas Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá. Mas nenhum patinho voltou de lá.");
            System.out.println("A mamãe patinha foi procurar Além das montanhas Na beira do mar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá. E os " + patinhos + " patinhos voltaram de lá.");

        } finally {
            scanner.close();
        }
    }

    static int pegarPatinhos() {
        while(true) {
            try {
                System.out.println("Quantos patinhos foram passear? ");
                patinhos = scanner.nextInt();
                scanner.nextLine();
            } catch(InputMismatchException e) {
                scanner.nextLine();
            }
            if(patinhos <= 0) {
                System.out.println("Por favor, insira uma quantidade válida.");
            }
            if(patinhos > 0) {
                break;
            }
        }
        return patinhos;
    }
}
