package linguagem.Allysonubius.Linguagem.ForsWhile;

public class While {

    public static void main(String[] args){

        var x = 0;

        //Testa a condicao antes
        while (x < 1){
            System.out.println ("Dentro do While.");
            x++;
        }

        var y = 0;

        //Testa a condicao depois
        do{
            System.out.println ("Dentro do do/while...");
        }while(y++ < 1);
    }
}
