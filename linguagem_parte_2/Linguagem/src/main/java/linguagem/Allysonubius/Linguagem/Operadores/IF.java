package linguagem.Allysonubius.Linguagem.Operadores;

public class IF {

    public static void main(String[]args){

        final var condicao = true;

        if(condicao){
            System.out.println ("A condicao e veraddeira");
        }else{
            System.out.println ("A condicao e false");
        }

        if(condicao)
            System.out.println ("Uma unica linha...");

        final var ternario = condicao ? " A condicao e verdadeira " : " A condicao e falsa ";

        System.out.println (ternario);
    }
}
