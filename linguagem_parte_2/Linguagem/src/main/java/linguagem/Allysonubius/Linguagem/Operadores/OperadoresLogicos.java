package linguagem.Allysonubius.Linguagem.Operadores;

public class OperadoresLogicos {

    public static void main(String[] args){

        final var numero = 2;
        final var letra = "A";

        //Sort Circuit
        if(numero < 5 && letra.equals ("A")){
            System.out.println ("Atendeu a condicao");// O numero 2 e igual a 2 e a letra a  e igual a A entao atende a condicao.
        }

        if(numero < 5 || letra.equals ("A")){
            System.out.println ("Atendeu a outra condicao");//o numero 2 e menor que 5 sendo que a e igual a A atende as duas condições.
        }

        if((10-5) > 1 && (5-3) > 1){
            System.out.println ("Logica maluca...");//sendo que 10-5 e 5 e maior que 1, sendo que tambem 5-3 e maior que 1 sendo true a condicao logica maluca.
        }

        //Non Sort Circuit
        /*if(verifica(15) | verifica("A")){
            System.out.println ("OK");
        }else{
            System.out.println ("Nao OK");
        }*/


    }


}
