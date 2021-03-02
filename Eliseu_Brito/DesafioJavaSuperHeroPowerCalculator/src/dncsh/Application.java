package dncsh;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Para saber a força e a distância de visão de calor do Super-Homem, digite o número de dias que ele esta na Terra:");
        int numeroDiasNaTerra = sc.nextInt();
        Calculator calculator = new Calculator();
        calculator.forcaSuperHomem(numeroDiasNaTerra);
    }

}
