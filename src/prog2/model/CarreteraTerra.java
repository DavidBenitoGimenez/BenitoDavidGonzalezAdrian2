
package prog2.model;

import java.util.ArrayList;

/**
 * Classe que representa una carretera de terra dins del càmping
 */
public class CarreteraTerra extends AccesTerra {
    private float amplada;

    /**
     * Constructor de la carretera de terra
     * @param nom Nom de la carretera
     * @param estat Estat de la carretera (obert/tancat)
     * @param longitud Longitud de la carretera
     * @param amplada Amplada de la carretera
     */
    public CarreteraTerra(String nom, boolean estat, float longitud, float amplada) {
        super(nom, estat, longitud);
        this.amplada = amplada;
    }

    /**
     * Obté l'amplada de la carretera
     * @return Amplada de la carretera
     */
    public double getAmplada() {
        return amplada;
    }

    /**
     * Estableix l'amplada de la carretera
     * @param amplada Nova amplada de la carretera
     */
    public void setAmplada(float amplada) {
        this.amplada = amplada;
    }

    /**
     * Retorna una representació en String de la carretera
     * @return String amb la informació de la carretera
     */
    @Override
    public String toString() {
        return super.toString() + " Amplada = " + amplada;
    }
}