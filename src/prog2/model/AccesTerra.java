package prog2.model;

import java.util.ArrayList;

public abstract class AccesTerra extends Acces {
    private float longitud;

    public AccesTerra(String nom, boolean estat, float longitud){
        super(nom, false, estat);
        this.longitud = longitud;
    }
    public double getLongitud(){
        return longitud;
    }
    public void setLongitud(float longitud){
        this.longitud = longitud;
    }
    @Override
    public String toString(){
        return super.toString() + "Longitud = " + longitud;
    }

    public abstract boolean isAccessiblitat();
}
