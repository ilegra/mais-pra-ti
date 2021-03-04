package com.fhfelipefh;

public class Estadual extends Candidatos{
    public Estadual(int numero,String nome) {
        super("Estadual", numero, nome);
    }

    @Override
    public void verificar(int entrada){
        if (entrada == getNumero())
            System.out.println(toString());
    }
}
