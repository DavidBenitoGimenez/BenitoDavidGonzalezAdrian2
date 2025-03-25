package prog2.model;

import java.util.ArrayList;

public class CarreteraAsfaltada extends AccesAsfalt{
    private double pesMaxim;
    public CarreteraAsfaltada(String nom, boolean estat, float metresQuadrats, double pesMaxim) {
        super(nom, estat, estat, metresQuadrats);
        this.pesMaxim = pesMaxim;
    }
    public double getPesMaxim() {
        return pesMaxim;
    }
    public void setPesMaxim(double pesMaxim) {
        this.pesMaxim = pesMaxim;
    }
    @Override
    public boolean isAccessibilitat() {
        return true;
    }
    @Override
    public String toString(){
        return super.toString() + " Pes màxim = " + pesMaxim;
    }

}
