
public class DeptEstadual extends Candidato{

public class DeptEstadual extends Candidato{

    public DeptEstadual(String nome, int codCandidato){
        super(nome,codCandidato);
    }

    @Override
    public String Info(){
        return "Candidato a Deputado Estadual";
    }
}

