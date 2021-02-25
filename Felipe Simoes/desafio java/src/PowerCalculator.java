import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Há quantos dias o Super Man está na terra?");
        int qtdeDias = leitor.nextInt();
        double forca = 1;
        double visao = 0;
        int diasVisao = 0;

        if (qtdeDias > 365) {
            for (int i = qtdeDias - 365; i > 0; i--) {
                forca += forca * 0.03;
                if (forca > 10) {
                    diasVisao++;
                }
            }
            if (diasVisao > 0) {
                visao = 10;
                for (int i = 1; i < diasVisao; i++) {
                    visao += visao*0.02;
                }
            }
            System.out.printf(String.format("A força do Super Man é equivalente à %.2f humanos. \n", forca));
            if (visao > 0) {
                System.out.printf(String.format("E sua visão de calor alcança %.2f cm de distância.", visao));
            } else {
                System.out.println("E ele ainda não possui visão de calor.");
            }
        } else if (qtdeDias < 0) {
            System.out.println("Esse valor não é valido!");
        } else {
            System.out.println("O Super Man ainda tem a mesma força de um humano normal e não possui visão de calor.");
        }
    }
}