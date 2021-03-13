package com.fhfelipefh;

public abstract class Candidatos implements Verificacao{
    private final String tipo;
    private final int numero;
    private final String nome;

    public Candidatos(String tipo, int numero, String nome) {
        this.tipo = tipo;
        this.numero = numero;
        this.nome = nome;
    }

    public int getNumero() {

        return numero;
    }


    @Override
    public String toString() {
        return "Candidatos{" +
                "tipo='" + tipo + '\'' +
                ", numero=" + numero +
                ", nome='" + nome + '\'' +
                '}';
    }
}
