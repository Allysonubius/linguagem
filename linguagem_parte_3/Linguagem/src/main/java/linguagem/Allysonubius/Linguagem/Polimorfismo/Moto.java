package linguagem.Allysonubius.Linguagem.Polimorfismo;

public class Moto extends Veiculo {

    private String cilindradas;

    public String getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(String cilindradas){
        this.cilindradas = cilindradas;
    }

    public double Imposto(){
        return this.getValorVenal () * 0.03;
    }

}
