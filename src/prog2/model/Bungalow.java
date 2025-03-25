package prog2.model;

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
    public boolean correcteFuncionament(){
        return isAireFred() & isTv();
    }
}
