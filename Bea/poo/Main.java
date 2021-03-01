import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        int numero,i;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o numero do candidato:");
        numero = ler.nextInt();
        System.out.println(numero);
        Candidato c1 = new Estadual("bea", 21, "RS");
        Candidato c2 = new Federal("girafa", 22);
        Candidato c3 = new Estadual("abacaxi", 23, "MG");
        ArrayList<Candidato> candidatos = new ArrayList<Candidato>();
        candidatos.add(c1);
        candidatos.add(c2);
        candidatos.add(c3);
//        System.out.println(candidatos.get(0).getNumero());
        i=0;
        while(i<candidatos.size()){
            if(candidatos.get(i).getNumero() == numero){
                System.out.println(candidatos.get(i).getClass());
            }
            i=i+1;
        }




        }
}
