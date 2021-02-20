public class Superman {
    //propriedades da classe
    private double forca;
    private double distanciaVisaoCalor;
    public int dias;
    public float forcaHumana;

//Recebe o quantos dias e força base do humano comum(construtor)
    public Superman(int dias,int forca_humano){
            this.forca = 1.0;
            this.distanciaVisaoCalor = 0.0;
        //variavél que faz só haver 1 acréscimo de +10 na distância da visão
        boolean desbloqueioVisao = false;
            this.dias = dias;
            this.forcaHumana = forca_humano;

        if(dias<=365){
            System.out.println("O Superman não teve tempo suficiente para se adaptar!");
        }else{
            for(int i =dias-365; i>0;i--){
                forca+=(forca*0.03);
                    if(forca>=(forcaHumana*10)&& !desbloqueioVisao){
                        distanciaVisaoCalor = 10.0;
                        desbloqueioVisao = true;
                    }else if(forca>=(forcaHumana*10)&& desbloqueioVisao){
                        distanciaVisaoCalor+=(distanciaVisaoCalor*0.02);
                    }
                }
            }
        System.out.println("A força do Superman é  " + forca);
        System.out.println("A a distância máxima da visão de calor do Superman é  " + distanciaVisaoCalor + "cm");
    }
 //modificadores
    public double getforca(){
        return forca;
    }

    public double getdistancia_visao_calor(){
        return distanciaVisaoCalor;
    }

    public void setforca(double forca){
        this.forca = forca;
    }

    public void setdistancia_visao_calor(double distancia_visao_calor){
        this.distanciaVisaoCalor = distancia_visao_calor;
    }
}
