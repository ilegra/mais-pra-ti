/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paolo
 */
public class teste {
    public static void main(String[] args) {
        Candidato rwe = new Candidato(1);
        Estadual ee = new Estadual(1,"estadual");
        Federal ff = new Federal(2,"estadual");
        Federal ff2 = new Federal(4,"estadual");
        Federal ff3 = new Federal(5,"estadual");
        Estadual ee2 = new Estadual(65,"estadual");
        Estadual ee1 = new Estadual(55,"estadual");
        ee.MostraE();
        ff.MostraF();
        ff3.MostraF();
        ff2.MostraF();
        ee2.MostraE();
        ee1.MostraE();
      
        
    }
}
