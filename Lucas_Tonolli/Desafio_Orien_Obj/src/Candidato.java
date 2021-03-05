public abstract class Candidato {
    private String nome;
<<<<<<< Updated upstream


    public Candidato(String nome){
        this.nome = nome;
=======
    public int codCandidato;
    public int numVotos;

    public Candidato(String nome,int codCandidato){
        this.nome = nome;
        this.codCandidato = codCandidato;
        this.numVotos = 0;
>>>>>>> Stashed changes
    }

    public abstract String Info();

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

<<<<<<< Updated upstream
=======
    public int getCodCandidato() {
        return codCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        this.codCandidato = codCandidato;
    }
    private void setNumVotos(int numVotos){
        this.numVotos=numVotos;
    }
    public void recebendoVotos(){
        this.numVotos ++;
    }
    public int getNumVotos(){
        return numVotos;
    }

>>>>>>> Stashed changes
}
