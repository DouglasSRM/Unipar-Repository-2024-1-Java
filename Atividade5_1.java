/**
 * Escreva um programa que imprima os números de 1 a 50.
 * Se o número for divisível por 3, imprima "Fizz".
 * Se for divisível por 5, imprima "Buzz".
 * Se for divisível por ambos, imprima "FizzBuzz".
 */

public class Atividade5_1 {

    public static void main(String[] args) {
        for(int numero = 1; numero <= 50; numero++) {
            System.out.print(numero);
            if(numero % 3 == 0) {
                System.out.print(" Fizz");
            }
            if(numero % 5 == 0) {
                System.out.print(" Buzz");
            }
            System.out.println();
        }
    }
}
