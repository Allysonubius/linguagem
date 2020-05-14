package linguagem.Allysonubius.Linguagem.Pessoa;

import linguagem.Allysonubius.Linguagem.IMC.Calculadora;

public class programa {

    public static void main(String[] args){

        final Pessoa pessoa = new Pessoa("Allyson",1.90,79.0);

        final var calculadora = new Calculadora();
        final var imc = calculadora.calcula (pessoa);

        System.out.println ("IMC= " + imc);
    }
}

