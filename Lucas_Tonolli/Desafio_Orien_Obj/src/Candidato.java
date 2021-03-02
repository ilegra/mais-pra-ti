public abstract class Candidato {
    private String nome;


    public Candidato(String nome){
        this.nome = nome;
    }

    public abstract String Info();

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

}
