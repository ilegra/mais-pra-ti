package dncsh;

import java.text.DecimalFormat;

public class Calculator {

    private double forca = 1;
    private double distancia = 10;
    private int diaInicioVisaoCalor;
    private DecimalFormat df = new DecimalFormat("0.00");
    private String forcaFormatada;
    private String distanciaFormatada;

    public void forcaSuperHomem(int numerosDiasNaTerra) {
        for (int i = 366; i <= numerosDiasNaTerra; i++) {
            forca = forca * 1.03;
            forcaFormatada = df.format(forca);
            System.out.println("Força:  " + forcaFormatada + " no dia " + i);
            if (forca == 10) {
                diaInicioVisaoCalor = i;
            }
            if (forca >= 10) {
                distancia = distancia * 1.02;
                distanciaFormatada = df.format(distancia);
                System.out.println("Distancia: " + distanciaFormatada + " no dia " + i);
            }
        }

        System.out.println("========== Resumo Final ==========");
        System.out.println("O Super Homem nos " + numerosDiasNaTerra + " dias que viveu na Terra atingiu os seguites valores:");

        if (numerosDiasNaTerra > 365) {
            System.out.println("Força de " + forcaFormatada + " humanos");
        } else {
            System.out.println("Força de 1 humano");
        }

        if (forca >= 10.0) {
            System.out.println("Distância que a Visão de Calor atinge é de " + distanciaFormatada +  " cm");
        } else {
            System.out.println("O Super Homem ainda não viveu na Terra o número de dias suficientes para desenvolver a Visão de Calor!");
        }

    }
}
