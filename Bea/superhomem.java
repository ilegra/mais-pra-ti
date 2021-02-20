import java.util.Scanner;


public class superhomem{
    public static void main(String[] args){
        int dias, i;
        double forcaFinal,visao;
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias que o super-homem esta na terra:");
        dias = ler.nextInt();
        forcaFinal = 1;

        visao = 10;
        System.out.println(dias);

        if(dias > 365){
            dias = dias - 365;
            for(i=1;i<=dias;i=i+1){
                forcaFinal = forcaFinal + (forcaFinal*0.03);
                if(forcaFinal > 10){
                    visao = visao +(visao*0.02);
                }

            }
            System.out.println("Sua forca e: " + forcaFinal +" humanos");
            System.out.println("Sua distância da visao de raio-x e: " + visao+" cm");
        }else{

        
            System.out.println("Sua forca e: " + forcaFinal+" humanos");
            System.out.println("Sua distância da visao de raio-x e: 0 cm" );
        }
  
        

          
        }


    }
