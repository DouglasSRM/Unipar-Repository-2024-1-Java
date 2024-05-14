package br.unipar.overriding;

public class GatoOverriding extends AnimalOverriding {

    @Override
    public String fazerSom() {
        return "~miau~";
    }
    //O método fazerSom é sobreescrito para o caso específico do gato
    //Utiliza-se a anotação "@Override" para indicar métodos sobreescritos.
}
