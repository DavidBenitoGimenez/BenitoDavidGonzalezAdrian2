package prog2.model;

import java.util.ArrayList;
public abstract class CarreteraTerra extends AccesTerra{
    private double amplada;
    public CarreteraTerra(String nom, boolean accessibilitat, boolean estat, ArrayList<String> llistaAllotjaments, double longitud, double amplada){
        super(nom, accessibilitat, estat, llistaAllotjaments, longitud);
        this.amplada = amplada;
    }
    public double getAmplada() {
        return amplada;
    }
    public void setAmplada(double amplada) {
        this.amplada = amplada;
    }
    @Override
    public boolean isAccessibilitat() {
        return true;
    }
    @Override
    public String toString(){
        return super.toString() + " Amplada = " + amplada;
    }
}
