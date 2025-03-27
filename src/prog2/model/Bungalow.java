package prog2.model;

public class Bungalow extends Casa {
    private int placesParquing;
    private boolean terrassa;
    private static boolean tv;
    private static boolean aireFred;

    /**
     * Constructor de la classe Bungalow
     * @param nom_ Nom del bungalow
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
     */
    public Bungalow(String nom_, String idAllotjament_, boolean estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_, mida_, habitacions, placesPersones);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    /**
     * Obté les places de pàrquing del bungalow
     * @return Nombre de places de pàrquing
     */
    public int getPlacesParquing() {
        return placesParquing;
    }

    /**
     * Comprova si el bungalow té terrassa
     * @return Cert si té terrassa, fals altrament
     */
    public boolean isTerrassa() {
        return terrassa;
    }

    /**
     * Comprova si el bungalow té televisió
     * @return Cert si té televisió, fals altrament
     */
    public static boolean isTv() {
        return tv;
    }

    /**
     * Comprova si el bungalow té aire condicionat
     * @return Cert si té aire condicionat, fals altrament
     */
    public static boolean isAireFred() {
        return aireFred;
    }

    @Override
    public String toString() {
        return super.toString() + "Plaçes pàrquing " + placesParquing + "Terrassa " + terrassa + " Tv " + tv + " AireFred " + aireFred;
    }
}