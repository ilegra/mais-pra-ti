import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Cadastro de participantes
       DeptFederal candF1 = new DeptFederal("Roberto",1259);
       DeptFederal candF2 = new DeptFederal("Luiz",1879);
       DeptEstadual candE1 = new DeptEstadual("João",195);
       DeptEstadual candE2 = new DeptEstadual("Wallace",15);

       //Criação da lista de partipantes
       List<DeptFederal> candDeptFed = new ArrayList<>();
       List<DeptEstadual> candDeptEst = new ArrayList<>();

       //Inserindo participantes nas listas
       candDeptEst.add(candE1);
       candDeptEst.add(candE2);
       candDeptFed.add(candF1);
       candDeptFed.add(candF2);

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
       int j = 0;

        System.out.println("Eleição acaba no momento em que for digitado '0'\n");
        for(int i = 0; i < candDeptEst.size(); i++ ) {
            System.out.println("Candidato Estadual: " + candDeptEst.get(i).getNome() +
                    " Código: " + candDeptEst.get(i).getCodCandidato() +"\n");
        }
        for(int i = 0; i < candDeptEst.size(); i++ ) {
            System.out.println("Candidato Federal: " + candDeptFed.get(i).getNome() +
                    " Código: " + candDeptFed.get(i).getCodCandidato() +"\n");
        }
       do{
           do{
               System.out.println("Digite o código do candidato: ");
               voto = leituraVoto.nextInt();

                for(int i = 0; i < candDeptEst.size(); i++ ) {
                    if (voto == candDeptEst.get(i).getCodCandidato()) {
                        System.out.println(candDeptEst.get(i).Info());
                        candDeptEst.get(i).recebendoVotos();
                        verificacaoCand = true;
                    }else if (voto == candDeptFed.get(i).getCodCandidato()) {
                        System.out.println(candDeptFed.get(i).Info());
                        candDeptFed.get(i).recebendoVotos();
                        verificacaoCand = true;
                    }
                }
               if(!verificacaoCand && voto!=0) {
                   System.out.println("Código não cadastrado\n");
               }
            }while(!verificacaoCand && voto!=0);
           verificacaoCand = false;
            if(voto!=0)
                TotalVotos++;
       }while(voto!=0);

        System.out.println("Total de votos " + TotalVotos+ "\n");

        for(int i = 0; i < candDeptEst.size(); i++ ){
            if(candDeptEst.get(i).getNumVotos()>maiorE){
              eleitoE = candDeptEst.get(i).getCodCandidato();
              maiorE = candDeptEst.get(i).getNumVotos();
            }
            System.out.println("Candidato Estadual: " + candDeptEst.get(i).getNome() +
                    " recebeu " +candDeptEst.get(i).getNumVotos() +" votos\n");
        }
        for(int i = 0; i < candDeptFed.size(); i++ ){
            if(candDeptFed.get(i).getNumVotos()>maiorF){
                eleitoF = candDeptFed.get(i).getCodCandidato();
                maiorF = candDeptFed.get(i).getNumVotos();
            }
            System.out.println("Candidato Federal: " + candDeptFed.get(i).getNome() +
                    " recebeu " +candDeptFed.get(i).getNumVotos() +" votos\n");
        }
        while(eleitoE!=candDeptEst.get(j).getCodCandidato()){
            j++;
        }
        System.out.println("O deputado estadual eleito foi : " + candDeptEst.get(j).getNome());
        j = 0;
        while(eleitoF!=candDeptFed.get(j).getCodCandidato()){
            j++;
        }
        System.out.println("O deputado Federal eleito foi : " + candDeptFed.get(j).getNome());


    }
}
