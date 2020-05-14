package linguagem.Allysonubius.Linguagem.Polimorfismo;

public class Programa {

    public static void main(String[]args){
    Veiculo generico = new Veiculo ();
    generico.setValorVenal (100.0);
    System.out.println (generico.Imposto ());//10.00

    Veiculo carro = new Carro();
    carro.setValorVenal (1000.0);
    System.out.println (carro.Imposto ());//70.00

    Veiculo moto = new Moto();
    moto.setValorVenal (1000.0);
    System.out.println (moto.Imposto ());//30.00
    }
}
