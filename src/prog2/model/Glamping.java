package prog2.model;

public class Glamping extends Casa {
    private String material;
    private boolean casaMascota;

    // Constructor
    public Glamping(String nom_, String idAllotjament_, String estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones, String material, boolean casaMascota) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_, mida_, habitacions, placesPersones);
        this.material = material;
        this.casaMascota = casaMascota;
    }

    // Getters
    public String getMaterial() {
        return material;
    }
    public boolean isCasaMascota() {
        return casaMascota;
    }

}