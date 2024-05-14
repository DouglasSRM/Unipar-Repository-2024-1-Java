package br.unipar;

//Podemos usar uma calculadora como exemplo de sobrecarga
//Os métodos de adição e subtração, por exemplo, podem ter multiplos parametros

public class CalculadoraOverloading {

    public int adicionar(int num1, int num2) {
        return num1 + num2;
    }

    public double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public int adicionar(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    //Podemos perceber que o metodo foi sobrecarregado em duas diferentes situações
    //É possível modificar tanto o tipo to método como a quantidade de parametros.

}
