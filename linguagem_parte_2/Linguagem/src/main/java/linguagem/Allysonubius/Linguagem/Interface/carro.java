package linguagem.Allysonubius.Linguagem.Interface;

public interface carro extends automovel {

    String marca();
    default void ligar(){
        System.out.println ("Ligando o carro!");
    }

    default String codigoRenavan(){
        return " 123456";
    }
}
