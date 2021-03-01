package br.eliseu;

public class Federal extends Deputado {


    public Federal(Eleicao candidato) {
        super(candidato);
    }

    public void tipoDeputado() {
        System.out.println("Número digitado é de um candidato a Deputado Federal");
    }


}
