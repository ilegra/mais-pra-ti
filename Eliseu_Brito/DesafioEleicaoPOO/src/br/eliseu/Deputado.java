package br.eliseu;

public abstract class Deputado {

    Eleicao candidato;

    public Deputado(Eleicao candidato) {
        this.candidato = candidato;
    }

    public abstract void tipoDeputado();
}
