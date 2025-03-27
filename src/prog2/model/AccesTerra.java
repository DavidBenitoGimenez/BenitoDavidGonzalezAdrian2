package prog2.model;
import java.util.ArrayList;

public abstract class AccesTerra extends Acces {
    private float longitud;

    /**
     * Constructor de la classe AccesTerra
     * @param nom Nom de l'accés
     * @param estat Estat de l'accés (obert/tancat)
     * @param longitud Longitud de l'accés
     */
    public AccesTerra(String nom, boolean estat, float longitud){
        super(nom, false, estat);
        this.longitud = longitud;
    }

    /**
     * Aquest mètode retorna la longitud de l'accés de terra
     * @return La longitud de l'accés
     */
    public double getLongitud(){
        return longitud;
    }

    /**
     * Aquest mètode estableix la longitud de l'accés de terra
     * @param longitud La nova longitud de l'accés
     */
    public void setLongitud(float longitud){
        this.longitud = longitud;
    }

    @Override
    public String toString(){
        return super.toString() + "Longitud = " + longitud;
    }

    public abstract boolean isAccessiblitat();
}