
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cadastro de participantes
       Candidato candF1 = new DeptFederal("Roberto",1259);
       Candidato candF2 = new DeptFederal("Luiz",1879);
       Candidato candE1 = new DeptEstadual("João",195);
       Candidato candE2 = new DeptEstadual("Wallace",15);

       //Criação da lista de partipantes
       List<Candidato> candidatosEleicao = new ArrayList<>();


       //Inserindo participantes nas listas
       candidatosEleicao.add(candF1);
       candidatosEleicao.add(candF2);
       candidatosEleicao.add(candE1);
       candidatosEleicao.add(candE2);


       //Variáveis para definir ganhador
        int eleitoE = 0;
        int eleitoF = 0;
        int maiorE = 0;
        int maiorF = 0;

       //Variáveis para informações da eleição
       int TotalVotos = 0;
       Scanner leituraVoto = new Scanner(System.in);
       int voto;
       boolean verificacaoCand = false;

       //Variável para encontrar o ganhador
       int j = 0;

        System.out.println("Eleição acaba no momento em que for digitado '0'\n");
        for(int i = 0; i < candidatosEleicao.size(); i++ ) {
         if (candidatosEleicao.get(i) instanceof DeptFederal){
             System.out.println("Candidato à Deputado Federal: " + candidatosEleicao.get(i).getNome() +
                     "\n" + "Código: " + candidatosEleicao.get(i).getCodCandidato() + "\n");
         }else{
             System.out.println("Candidato à Deputado Estadual: " + candidatosEleicao.get(i).getNome() +
                     "\n" + "Código: " + candidatosEleicao.get(i).getCodCandidato() + "\n");
         }

        }
       do{
           do{
               System.out.println("Digite o código do candidato: ");
               voto = leituraVoto.nextInt();

                for(int i = 0; i < candidatosEleicao.size(); i++ ) {
                    if (voto == candidatosEleicao.get(i).getCodCandidato()) {
                        System.out.println(candidatosEleicao.get(i).Info());
                        candidatosEleicao.get(i).recebendoVotos();

                        verificacaoCand = true;
                    }
                }
               if(!verificacaoCand && voto!=0) {
                   System.out.println("Código não cadastrado\n");
               }
            }while(!verificacaoCand && voto!=0);

           verificacaoCand = false;
            if(voto!=0 && voto > 0)
                TotalVotos++;
       }while(voto!=0);

        System.out.println("Total de votos " + TotalVotos+ "\n");

        for(int i = 0; i < candidatosEleicao.size(); i++ ) {
            if (candidatosEleicao.get(i) instanceof DeptEstadual) {
                if (candidatosEleicao.get(i).getNumVotos() > maiorE) {
                    maiorE = candidatosEleicao.get(i).getNumVotos();
                    eleitoE = candidatosEleicao.get(i).getCodCandidato();
                }
            } else {
                if (candidatosEleicao.get(i).getNumVotos() > maiorF) {
                    maiorF = candidatosEleicao.get(i).getNumVotos();
                    eleitoF = candidatosEleicao.get(i).getCodCandidato();

                }
            }
        }

        while(eleitoE!=candidatosEleicao.get(j).getCodCandidato()){
            j++;
        }
        System.out.println("O deputado estadual eleito foi : " + candidatosEleicao.get(j).getNome() +
                " com " + candidatosEleicao.get(j).getNumVotos() + " voto(s)");
        j = 0;
        while(eleitoF!=candidatosEleicao.get(j).getCodCandidato()){
            j++;
        }
        System.out.println("O deputado Federal eleito foi : " + candidatosEleicao.get(j).getNome() +
                " com " + candidatosEleicao.get(j).getNumVotos() + " voto(s)");
    }
}


