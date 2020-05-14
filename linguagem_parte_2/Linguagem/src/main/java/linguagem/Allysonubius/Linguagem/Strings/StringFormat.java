package linguagem.Allysonubius.Linguagem.Strings;

public class StringFormat {

    public static void main(String[] args){

        var nome = " Allyson ";
        var Sobrenome = " Oliveira ";
        final var nomeCompleto = nome + Sobrenome;

        System.out.println (nome);
        System.out.println ("None do cliente: "+ nome);
        System.out.println ("Nome completo do cliente: "+ nomeCompleto);
        final var mensagem = String.format ("O cliente "+ nome+" possui sobrenome "+Sobrenome);
        System.out.println (mensagem);

        System.out.println (String.format("Numero","210"));
    }
}
