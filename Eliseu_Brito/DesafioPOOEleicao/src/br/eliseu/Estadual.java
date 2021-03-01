package br.eliseu;

public class Estadual extends Deputado {


    public Estadual(Eleicao candidato) {
        super(candidato);
    }

    public void tipoDeputado() {
        System.out.println("Número digitado é de um candidato a Deputado Estadual");
    }

}
