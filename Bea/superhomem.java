import java.util.Scanner;


public class Superhomem{
    public static void main(String[] args){
        int dias, i;
        double forcaFinal,visao;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias que o super-homem esta na terra:");
        dias = ler.nextInt();
        forcaFinal = 1;

        visao = 10;

        if(dias > 365){
            dias = dias - 365;
            for(i=1;i<=dias;i=i+1){
                forcaFinal = forcaFinal + (forcaFinal*0.03);
                if(forcaFinal > 10){
                    visao = visao +(visao*0.02);
                }

            }
            System.out.printf("Sua forca e: %.2f humanos\n" , forcaFinal );
            System.out.printf("Sua distancia da visao de raio-x e: %.2f cm\n" ,visao);
        }else{

        
            System.out.printf("Sua forca e: %.2f humanos\n" , forcaFinal );
            System.out.printf("Sua distancia da visao de raio-x e: 0 cm" );
        }
  
        

          
        }


    }
