package linguagem.Allysonubius.Linguagem.cliente;

public class ProgramaCliente {

    public static void main(String[] args){

        final var cliente = new cliente (18);

        cliente.getIdade();
        cliente.getPeso();

        System.out.println(cliente.relatorio());
    }
}
