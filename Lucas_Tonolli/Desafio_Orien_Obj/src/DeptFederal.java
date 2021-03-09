public class DeptFederal extends Candidato{
<<<<<<< Updated upstream
    private int CodCandidato;
    private int NumVotos;

    public DeptFederal(String nome, int CodCandidato){
        super(nome);
        this.CodCandidato = CodCandidato;
        this.NumVotos = 0;
=======

    public DeptFederal(String nome, int codCandidato){
        super(nome,codCandidato);
>>>>>>> Stashed changes
    }

    @Override
    public String Info(){
        return "Candidato a Deputado Federal";
    }
<<<<<<< Updated upstream

    public int getCodCandidato() {
        return CodCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        CodCandidato = codCandidato;
    }

    public int getNumVotos() {
        return NumVotos;
    }

    public void recebendoVotos(){
        this.NumVotos ++;
    }

    private void setNumVotos(int NumVotos) {
        NumVotos = NumVotos;
    }

=======
>>>>>>> Stashed changes
}
