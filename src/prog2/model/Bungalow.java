package prog2.model;

import java.io.Serializable;

// Que es eso de serializable??
public class Bungalow extends Casa {
    private int placesParquing;
    private boolean terrassa;
    private static boolean tv;
    private static boolean aireFred;

    // Constructor
    public Bungalow(String nom_, String idAllotjament_, boolean estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_, mida_, habitacions, placesPersones);
        this.placesParquing = placesParquing;
        this.terrassa = terrassa;
        this.tv = tv;
        this.aireFred = aireFred;
    }

    // Getters
    public int getPlacesParquing() {
        return placesParquing;
    }
    public boolean isTerrassa() {
        return terrassa;
    }
    public static boolean isTv() {
        return tv;
    }
    public static boolean isAireFred() {
        return aireFred;
    }

    // Metodes
    @Override
    public String toString() {
        return super.toString() + "Plaçes pàrquing " + placesParquing + "Terrassa " + terrassa + " Tv " + tv + " AireFred " + aireFred;
    }
}
