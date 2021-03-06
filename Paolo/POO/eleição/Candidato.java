/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paolo
 */
public class Candidato {
    private int numero;
    
    public Candidato(int num){
        this.numero = num;
    }
    
    public int getNumero(){ 
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    @Override
    public String toString(){
        return "Candidato{"+
        "numero="+numero+ '\''+'}';
    }
}
