/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.de.pkgsuper.força;

import java.util.Scanner;

/**
 *
 * @author felipe
 */
public class CalculadoraDeSuperForça {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Cálculo da força do Super-Homem");
        double forca = 1.0D;
        double distVis = 0.0D;
        double aux = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias que ele está na terra: ");
        int dias = scanner.nextInt();
        if (dias <= 365) {
            System.out.println("Não adquiriu força devido a adaptação!");
            System.out.println("Força: " + forca + " Humano(s) e a distância que sua visão de calor atinge (cm) " + distVis);
        } else {
            dias = dias - 365;
            int j;
            for (j = 0; j < dias; ++j){
                 aux = forca * 0.03;
                 forca = aux + forca;
                if (forca >= 10.0D) {
                    if(distVis == 0){
                    distVis = 10.0D;}
                  distVis +=  distVis *0.02;
                }
            }
        }

        System.out.printf("Força: %.4f Humano(s) %n", forca);
        System.out.printf("Distância que sua visão de calor atinge: %.4f cm", distVis);

    }

}
