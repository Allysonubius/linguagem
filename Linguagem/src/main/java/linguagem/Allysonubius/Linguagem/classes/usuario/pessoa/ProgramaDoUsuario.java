package linguagem.Allysonubius.Linguagem.classes.usuario.pessoa;

import linguagem.Allysonubius.Linguagem.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[]args){


        final var batmam = new SuperUsuario ("batmam","123456");

        batmam.getLogin ();

       //batmam.getSenha();  //ERROR

        //String nomeDoCliente = Batmam.nome;       //ERROR

    }
}
