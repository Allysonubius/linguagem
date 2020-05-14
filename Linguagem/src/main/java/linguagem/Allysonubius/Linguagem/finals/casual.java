package linguagem.Allysonubius.Linguagem.finals;

public class casual extends gamer{

    @Override
    public String keyboard(){
        return "Simple keyboard...";
    }

    /*@Override
    public String mouse(){
        return super.mouse();
    }*/

    public String play(final String game){

        //game = "Wow";

        return "Jogando " + game;
    }
}
