public class Estadual extends Candidato {
    private String estado;
    public Estadual (String nome, int numero, String estado){
        super(nome, numero);
        this.estado = estado;
    }

}
