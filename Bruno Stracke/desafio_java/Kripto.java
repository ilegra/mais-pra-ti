public class Kripto {

    private int dias;

    private int diasVisao = 0;

    public Kripto(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public double calculaForca(){
        double forca = 1.0;
        for(int i = 366; i <= dias; i++){
            forca += forca*0.03;
            if(forca >= 10){
                diasVisao++;
            }
        }
        return forca;
    }

    public double calculaVisao(){
        double visao = 0;
        if(diasVisao > 0){
            visao = 10.0;
            for(int i = 1; i < diasVisao; i++){
                visao += visao * 0.02;
            }
        }
        return visao;
    }
}
