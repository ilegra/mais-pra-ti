public class DeptEstadual extends Candidato{
<<<<<<< Updated upstream
    private int NumVotos;
    private int CodCandidato;

    public int getCodCandidato() {
        return CodCandidato;
    }

    public void setCodCandidato(int codCandidato) {
        CodCandidato = codCandidato;
    }

    public DeptEstadual(String nome, int CodCandidato){
        super(nome);
        this.CodCandidato = CodCandidato;
        this.NumVotos = 0;
=======


    public DeptEstadual(String nome, int codCandidato){
        super(nome,codCandidato);
>>>>>>> Stashed changes
    }

    @Override
    public String Info(){
        return "Candidato a Deputado Estadual";
    }


<<<<<<< Updated upstream
    private void setNumVotos(int NumVotos){
        this.NumVotos=NumVotos;
    }
    public void recebendoVotos(){
        this.NumVotos ++;
    }
    public int getNumVotos(){
        return NumVotos;
    }
=======

>>>>>>> Stashed changes

}
