import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número dos candidatos. Digite 0 para encerrar.");

        List<Deputado> list = new ArrayList<Deputado>();

        while(true){
            int numero = scan.nextInt();

            if(numero == 0){
                break;
            } else if(numero < 1000 || numero > 99999) {
                System.out.println("Número inválido");
            } else if(numero > 9999){
                Deputado deputado = new Estadual(numero);
                list.add(deputado);
            } else {
                Deputado deputado = new Federal(numero);
                list.add(deputado);
            }
        }

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Federal){
                System.out.println(list.get(i).getNumero() + ": Deputado Federal");
            }
            else{
                System.out.println(list.get(i).getNumero() + ": Deputado Estadual");
            }


        }



    }
}
