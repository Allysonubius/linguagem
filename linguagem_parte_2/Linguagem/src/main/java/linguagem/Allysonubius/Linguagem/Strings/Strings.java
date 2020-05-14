package linguagem.Allysonubius.Linguagem.Strings;

public class Strings {

    public static void main(String[] args){

        var nome = "Allyson ";
        var Sobrenome = " Oliveira";
        final var nomeCompleto = nome + Sobrenome;

        System.out.println (nome);
        System.out.println ("Nome do CLiente: " + nome);
        System.out.println ("Nome completo do cliente: " + nomeCompleto);
        var string = new String ("Minha String");

        System.out.println ("Char na posicaoo: " + string.charAt(5));
        System.out.println ("Quantidade: "+ string.length());
        System.out.println ("Sem trim [" + string +"]");
        System.out.println ("Com trim [" + string.trim()+"]");
        System.out.println ("Lower "+ string.toLowerCase());
        System.out.println ("Upper "+ string.toUpperCase());
        System.out.println ("Contem M? "+ string.contains("M"));
        System.out.println ("Contem X " +string.contains("X"));

        //System.out.println ("Replace "+ string.replace(charSequence: "n", charSequencce1: "$"));
        System.out.println ("Equals "+ string.equals(" Minha String"));
        System.out.println ("EqualsIgnoreCase? " + string.equalsIgnoreCase("minha sTrinG"));
        System.out.println ("Substring(1,6)= "+string.substring(1,6));

    }
}
