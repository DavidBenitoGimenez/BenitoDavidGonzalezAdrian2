package prog2.model;

import java.util.ArrayList;
public class CarreteraTerra extends AccesTerra {
    private float amplada;

    public CarreteraTerra(String nom, boolean estat, float longitud, float amplada) {
        super(nom, estat, longitud);
        this.amplada = amplada;
    }

    public double getAmplada() {
        return amplada;
    }

    public void setAmplada(float amplada) {
        this.amplada = amplada;
    }

    @Override
    public String toString() {
        return super.toString() + " Amplada = " + amplada;
    }

    @Override
    public boolean isAccessiblitat() {
        return true;
    }
}
