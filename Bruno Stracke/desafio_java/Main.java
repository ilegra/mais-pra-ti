import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de dias que o kriptoniano está na Terra: ");

        Kripto kripto = new Kripto(scan.nextInt());

        System.out.println("Força de " + kripto.calculaForca() + " humano(s).");
        System.out.println("Visao de calor atinge " + kripto.calculaVisao() + "cm.");
    }
}
