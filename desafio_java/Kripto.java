public class Kripto {

    private int dias;
    private double forca = 1.0;
    private double visao = 0;
    private int diasVisao = 0;

    public Kripto(int dias) {
        this.dias = dias;
    }

    public double getForca() {
        return forca;
    }

    public double getVisao() {
        return visao;
    }

    public int getDias() {
        return dias;
    }

    public void calculaForca(){
        for(int i = 366; i <= dias; i++){
            forca += forca*0.03;
            if(forca >= 10){
                diasVisao++;
            }
        }
    }

    public void calculaVisao(){
        if(diasVisao > 0){
            visao = 10.0;
            for(int i = 1; i < diasVisao; i++){
                visao += visao * 0.02;
            }
        }
    }
}
