/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paolo
 */
public class Federal extends Candidato {
    String federal;
    
    public Federal(int num,String fed){ 
        super(num);
        this.federal = fed;
        
    }
    public String getEstadual(){ 
        return federal;
    }
    public void setEstadual(String estadual){
        this.federal = estadual;
    }
    public void MostraF(){ 
        super.toString();
        System.out.println("Federal - - " + +this.getNumero());
    }
}
