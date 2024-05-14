package br.unipar.overriding;

public class CachorroOverriding extends AnimalOverriding {

    @Override
    public String fazerSom() {
        return "~auau~";
    }

    //O método fazerSom é sobreescrito para o caso específico do cachorro
    //Utiliza-se a anotação "@Override" para indicar métodos sobreescritos.
}
