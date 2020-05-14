package linguagem.Allysonubius.Linguagem.Interface;

public class Fiesta implements carro,Veiculo{

    @Override
    public String marca(){
        return "Ford";
    }

    /*@Override
    public Double valor(){
        return null;
    }*/

    @Override
    public String registro(){
        return " 123456";
    }

    @Override
    public void ligar(){
        carro.super.ligar ();

        Veiculo.super.ligar ();
    }
}
