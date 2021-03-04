import java.util.ArrayList;
import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número do seu candidato:");

        int numVotado = sc.nextInt();

        ArrayList<Candidato> candidatos = new ArrayList<>();

        if (numVotado >= 10000 && numVotado <= 99999) {
            Candidato estadual = new DeputadoEstadual(numVotado);
            candidatos.add(estadual);
        } else if (numVotado >= 1000 && numVotado <= 9999) {
            Candidato federal = new DeputadoFederal(numVotado);
            candidatos.add(federal);
        } else {
            System.out.println("Número votado é inválido.");
        }

        for (int i = 0; i < candidatos.size(); i++) {
            if (candidatos.get(i) instanceof DeputadoFederal) {
                System.out.println(((DeputadoFederal) candidatos.get(i)).getCargo() + candidatos.get(i).getNumero());
            } else {
                System.out.println(((DeputadoEstadual) candidatos.get(i)).getCargo() + candidatos.get(i).getNumero());
            }

        }
    }
}
