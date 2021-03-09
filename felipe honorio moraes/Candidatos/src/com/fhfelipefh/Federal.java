package com.fhfelipefh;

public class Federal extends Candidatos{
    public Federal(int numero, String nome){
        super("Federal", numero, nome);
    }

    @Override
    public void verificar(int entrada){
        if (entrada == getNumero()) {
            System.out.println(toString());
        }

    }
}

