package linguagem.Allysonubius.Linguagem.Interface;

public class Programa {

    public static void main(String[] args){

        final Gol gol = new Gol();
        System.out.println ("marca do Gol: "+ gol.marca ());
        gol.ligar ();

        final Trator trator = new Trator();
        System.out.println ("Registro do Trator" + trator.registro());

        final Fiesta fiesta = new Fiesta();

        System.out.println ("Marca do Fiesta" + fiesta.marca( ));
        System.out.println ("Registro do Fiesta" + fiesta.registro( ) );

    }
}
