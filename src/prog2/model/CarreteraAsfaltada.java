package prog2.model;

import java.util.ArrayList;

/**
 * Classe que representa una carretera asfaltada dins del càmping
 */
public class CarreteraAsfaltada extends AccesAsfalt {
    private double pesMaxim;

    /**
     * Constructor de la carretera asfaltada
     * @param nom Nom de la carretera
     * @param estat Estat de la carretera (obert/tancat)
     * @param metresQuadrats Metres quadrats de la carretera
     * @param pesMaxim Pes màxim permès
     */
    public CarreteraAsfaltada(String nom, boolean estat, float metresQuadrats, double pesMaxim) {
        super(nom, estat, estat, metresQuadrats);
        this.pesMaxim = pesMaxim;
    }

    /**
     * Obté el pes màxim permès
     * @return Pes màxim permès
     */
    public double getPesMaxim() {
        return pesMaxim;
    }

    /**
     * Estableix el pes màxim permès
     * @param pesMaxim Nou pes màxim permès
     */
    public void setPesMaxim(double pesMaxim) {
        this.pesMaxim = pesMaxim;
    }

    /**
     * Comprova l'accessibilitat de la carretera
     * @return Sempre retorna true (accessible)
     */
    @Override
    public boolean isAccessibilitat() {
        return true;
    }

    /**
     * Retorna una representació en String de la carretera
     * @return String amb la informació de la carretera
     */
    @Override
    public String toString() {
        return super.toString() + " Pes màxim = " + pesMaxim;
    }
}