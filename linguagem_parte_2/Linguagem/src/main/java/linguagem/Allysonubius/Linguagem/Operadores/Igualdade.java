package linguagem.Allysonubius.Linguagem.Operadores;

public class Igualdade {

    public static void main(String[] args) {

        final var numero = 9;

        if (numero == 10){
            System.out.println ("O numero e 10!");
        }else{
            System.out.println ("O numero nao e 10!");
        }

        if(numero != 10){
            System.out.println ("O numero nao e 10!");
        }else{
            System.out.println ("O numero e 10!");
        }

        if(numero >= 10){
            System.out.println ("O numero e maior ou igual a 10.");
        }else{
            System.out.println ("O numero e menor que 10!");
        }

        if(numero <= 10){
            System.out.println ("O numero e menor ou igual a 10.");
        }else{
            System.out.println ("O numero e maior que 10!");
        }

        final var letra = "C";

        if("A".equals(letra)){
            System.out.println ("E a letra A !");
        }else{
            System.out.println ("E a letra B !");
        }

        if(!letra.equals ("A")){
            System.out.println ("Nao e a letra B !");
        }else{
            System.out.println ("E a letra A !");
        }

    }
}
