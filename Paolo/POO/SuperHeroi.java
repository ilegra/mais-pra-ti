
import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class SuperHeroi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int dia;
        double forca, visao;
        System.out.println("Quantidade de dias: ");
        dia = sc.nextInt();
        forca = 1;
        visao = 10;
        
        if(dia > 365){ 
            dia -= 365;
            for(int i =1; i <= dia; i++){
                forca = forca + (forca * 0.3);
                if(forca > 10){
                    visao = visao + (visao * 0.2);
                }
            }
            System.out.println("Quantidade de força: "+forca);
            System.out.println("Distancia de visão que atinge: "+visao);
        }else{ 
            System.out.println("Quantidade de força: "+forca);
            System.out.println("Sua distância de visão de raio x será 0 cm  pois não passou nenhum ano!");
        }
        
        
    }
}
