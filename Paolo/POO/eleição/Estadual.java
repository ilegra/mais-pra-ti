/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paolo
 */
public class Estadual extends Candidato{
    String estadual;
    
    public Estadual(int num,String est){ 
        super(num);
        this.estadual = est;       
    }
    public String getEstadual(){ 
        return estadual;
    }
    public void setEstadual(String estadual){
        this.estadual = estadual;
    }
    public void MostraE(){ 
        super.toString();
        System.out.println("Estadual - - "+this.getNumero());
    }
        
}
