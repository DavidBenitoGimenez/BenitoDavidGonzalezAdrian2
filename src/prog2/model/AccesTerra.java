package prog2.model;

import java.util.ArrayList;

public abstract class AccesTerra extends Acces {
    private double longitud;

    public AccesTerra(String nom, boolean accessibilitat, boolean estat, ArrayList<String> llistaAllotjaments, double longitud){
        super(nom, accessibilitat, estat, llistaAllotjaments);
        this.longitud = longitud;
    }
    public double getLongitud(){
        return longitud;
    }
    public void setLongitud(double longitud){
        this.longitud = longitud;
    }
    @Override
    public String toString(){
        return super.toString() + "Longitud = " + longitud;
    }

    public abstract boolean isAccessiblitat();
}
