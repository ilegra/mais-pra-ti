public class DeptFederal extends Candidato{
    private int CodCandidato;
    private int NumVotos;

    public DeptFederal(String nome, int CodCandidato){
        super(nome);
        this.CodCandidato = CodCandidato;
        this.NumVotos = 0;
    }

    @Override
    public String Info(){
        return "Candidato a Deputado Federal";
    }

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

}
