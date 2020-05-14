package linguagem.Allysonubius.Linguagem.Operadores;

public class Relacionais {

    public static void main(String[]args){

        final var numero = 10;

        if(numero > 20){
            System.out.println ("O numero e maior que 20! ");//O numero e maior que 20 ?
        }else if(numero >=10){
            System.out.println ("O numero e maior ou igual a 10! ");//O numero e maior ou igual a 10 ?
        }else if(numero <= 5){
            System.out.println ("O numero e menor ou igual a 5! ");//O numero e menor ou igual a 5 ?
        }else{
            System.out.println ("Nenhuma das anteriores !");//sem resposta
        }
    }
}
