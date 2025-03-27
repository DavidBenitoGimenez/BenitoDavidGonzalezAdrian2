package prog2.model;
import java.util.ArrayList;

public abstract class AccesAsfalt extends Acces{
    private double metresQuadrats;

    /**
     * Constructor de la classe AccesAsfalt
     * @param nom Nom de l'accés
     * @param accessibilitat Si és accessible o no
     * @param estat Estat de l'accés (obert/tancat)
     * @param metresQuadrats Metres quadrats de l'accés
     */
    public AccesAsfalt(String nom, boolean accessibilitat, boolean estat, double metresQuadrats) {
        super(nom, accessibilitat, estat);
        this.metresQuadrats = metresQuadrats;
    }

    /**
     * Aquest mètode retorna els metres quadrats de l'accés asfaltat
     * @return Els metres quadrats de l'accés
     */
    public double getMetresQuadrats() {
        return metresQuadrats;
    }

    /**
     * Aquest mètode estableix els metres quadrats de l'accés asfaltat
     * @param metresQuadrats Els nous metres quadrats de l'accés
     */
    public void setMetresQuadrats(double metresQuadrats) {
        this.metresQuadrats = metresQuadrats;
    }

    @Override
    public String toString(){
        return super.toString() + " Metres quadrats = " + metresQuadrats;
    }
}