public class DeputadoEstadual extends Candidato{

    private String cargo = "Você votou em um candidato ao cargo de Deputado Estadual de número: ";

    public DeputadoEstadual(int numero) {
        super(numero);
    }

    public String getCargo() {
        return cargo;
    }
}
