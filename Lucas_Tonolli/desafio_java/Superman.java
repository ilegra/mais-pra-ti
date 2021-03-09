public class Superman {
    //propriedades da classe
    public double forca;
    public double distanciaVisaoCalor;
    public int dias;
    public float forcaHumana;
    public boolean desbloqueioVisao;

    //Construtor
    public Superman(int dias, int forcaHumano) {
        this.forca = 1.0;
        this.distanciaVisaoCalor = 0.0;
        //variável que faz só haver 1 acréscimo de +10 na distância da visão
        this.desbloqueioVisao = false;
        this.dias = dias;
        this.forcaHumana = forcaHumano;
    }

    public void superPowerCalculator() {
        if (dias <= 365) {
            System.out.println("O Superman não teve tempo suficiente para se adaptar!");
        } else {
            distanciaVisaoCalor = visaoDeCalor();
            forca = forcaSuperman();
        }
        System.out.println("A força do Superman é "+forca);
        System.out.println("A a distância máxima da visão de calor do Superman é "+ distanciaVisaoCalor +" cm");
}

    public double forcaSuperman() {
        for (int i = dias - 365; i > 0; i--) {
            forca += (forca * 0.03);
        }
        return forca;
    }

    public double visaoDeCalor() {
        for (int i = dias - 365; i > 0; i--) {
            forca += (forca * 0.03);
            if(forca>=(forcaHumana*10)&& !desbloqueioVisao){
                distanciaVisaoCalor = 10.0;
                desbloqueioVisao = true;
            }else if(forca>=(forcaHumana*10)&& desbloqueioVisao){
                distanciaVisaoCalor+=(distanciaVisaoCalor*0.02);
            }
        }
        forca = 1.0;
        return distanciaVisaoCalor;
    }

 //modificadores
    public double getForca(){
        return forca;
    }

    public double getDistanciaVisaoCalor(){
        return distanciaVisaoCalor;
    }

    public void setForca(double forca){
        this.forca = forca;
    }

    public void setDistanciaVisaoCalor(double distanciaVisaoCalor){
        this.distanciaVisaoCalor = distanciaVisaoCalor;
    }
}
