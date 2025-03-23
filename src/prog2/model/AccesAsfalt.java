package prog2.model;

import java.util.ArrayList;

public abstract class AccesAsfalt extends Acces{
    private double metresQuadrats;

    public AccesAsfalt(String nom, boolean accessibilitat, boolean estat, ArrayList<String> llistaAllotjaments, double metresQuadrats) {
        super(nom, accessibilitat, estat, llistaAllotjaments);
        this.metresQuadrats = metresQuadrats;
    }
    public double getMetresQuadrats() {
        return metresQuadrats;
    }
    public void setMetresQuadrats(double metresQuadrats) {
        this.metresQuadrats = metresQuadrats;
    }
    @Override
    public String toString(){
        return super.toString() + " Metres quadrats = " + metresQuadrats;
    }
}

