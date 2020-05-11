package classe;

public class perfil {

    private Integer idade;
    private Float peso;

    public  perfil(Float peso){

    }

    public perfil(final Integer idade) {this.idade = idade;}

    public perfil() {
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public Float getPeso(){
        return this.peso;
    }

    protected  String relatorio(){
        return "Idade:  $idade e Peso: $peso";
    }

}
