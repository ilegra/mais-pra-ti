public class DeputadoFederal extends Candidato{

    private String cargo = "Você votou em um candidato ao cargo de Deputado Federal de número: ";

    public DeputadoFederal(int numero) {
        super(numero);
    }

    public String getCargo() {
        return cargo;
    }
}
