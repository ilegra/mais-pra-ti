package br.eliseu;

public abstract class Deputado {

    private Eleicao candidato;

    public Deputado(Eleicao candidato) {
        this.candidato = candidato;
    }

    public abstract void tipoDeputado();
}
