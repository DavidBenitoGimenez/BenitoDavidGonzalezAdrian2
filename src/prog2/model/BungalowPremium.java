package prog2.model;

import java.io.Serializable;

public class BungalowPremium extends Bungalow {
    private boolean serveisExtra;
    private String codiWifi;

    /**
     * Constructor de la classe BungalowPremium
     * @param nom_ Nom del bungalow premium
     * @param idAllotjament_ Identificador del bungalow
     * @param estatAllotjament_ Estat del bungalow
     * @param iluminacio_ Il·luminació del bungalow
     * @param mida_ Mida del bungalow
     * @param habitacions Nombre d'habitacions
     * @param placesPersones Capacitat de persones
     * @param placesParquing Places de pàrquing
     * @param terrassa Si té terrassa o no
     * @param tv Si té televisió o no
     * @param aireFred Si té aire condicionat o no
     * @param serveisExtra Si té serveis extra o no
     * @param codiWifi Codi WiFi de l'allotjament
     */
    public BungalowPremium(String nom_, String idAllotjament_, boolean estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_, mida_, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    /**
     * Comprova si el bungalow premium té serveis extra
     * @return Cert si té serveis extra, fals altrament
     */
    public boolean isServeisExtra() {
        return serveisExtra;
    }

    /**
     * Obté el codi WiFi del bungalow premium
     * @return El codi WiFi
     */
    public String getCodiWifi() {
        return codiWifi;
    }

    /**
     * Estableix els serveis extra del bungalow premium
     * @param serveisExtra Cert per habilitar serveis extra, fals altrament
     */
    public void setServeisExtra(boolean serveisExtra) {
        this.serveisExtra = serveisExtra;
    }
}