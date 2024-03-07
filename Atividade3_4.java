import java.util.InputMismatchException;
import java.util.Scanner;

//"Faça um sistema que peça 4 notas divida por 4;"

public class Atividade3_4 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        double media;
        try {
            while(true) {

                System.out.println("# Calculo de Média #");
                System.out.println("Insira a primeira nota: ");
                nota1 = getNota();
                System.out.println("Insira a segunda nota: ");
                nota2 = getNota();
                System.out.println("Insira a terceira nota: ");
                nota3 = getNota();
                System.out.println("Insira a quarta nota: ");
                nota4 = getNota();

                media = (nota1 + nota2 + nota3 + nota4)/4;
                System.out.println("A sua média é: " + media);

                if(media >= 6) {
                    System.out.println("O aluno foi aprovado!");
                } else {
                    System.out.println("O aluno foi reprovado!");
                }

                System.out.println("Deseja calcular novamente?");
                System.out.println("1 - Sim");
                System.out.println("2 - Não");
                double sair = getNota();
                if (sair == 2) {
                    System.out.println("Programa encerrado. Obrigado!");
                    break;
                }
            }
        } finally {
            scanner.close();
        }
    }
