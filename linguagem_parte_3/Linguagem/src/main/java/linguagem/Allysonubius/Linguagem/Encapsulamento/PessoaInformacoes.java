package linguagem.Allysonubius.Linguagem.Encapsulamento;

public class PessoaInformacoes {

    public  static void main(String[] args){

        Pessoa eu = new Pessoa ("Allyson",15,07,1998);

        System.out.println (eu.getNome ());
        System.out.println (eu.getDataNascimento ());
        System.out.println (eu.calculaIdade ());

        eu.setNome ("Allyson de Oliveira");

        System.out.println (eu.getNome ());
    }
}
