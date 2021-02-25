package com.fhfelipefh;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Cálculo da força do Super-Homem");
        double forca=1;
        double aux;
        double aux2;
        double distVis=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias que ele está na terra: ");
        int dias = scanner.nextInt();
        if(dias<=365)
        {
            System.out.println("Não adquiriu força devido a adaptação!");
            System.out.println("Força: "+forca+" Humano(s) e a distância que sua visão de calor atinge (cm) "+distVis);
        }
        else{
            dias = dias - 365;
            for(int i = 0; i<dias; ++i){
                aux = forca*0.03;
                forca += forca*0.03;
            }
            if(forca>=10)
            {
                distVis = 10;
                for(int j = 0; j<dias; j++)
                {
                    aux2 = distVis*0.02;
                    distVis=distVis+aux2;

                }
            }
        }
        System.out.printf("Força: %.4f Humano(s) %n",forca);
        System.out.printf("Distância que sua visão de calor atinge: %.4f cm",distVis);
}
}
