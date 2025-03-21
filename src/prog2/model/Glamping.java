package prog2.model;

public class Glamping extends Casa {
    private String material;
    private boolean casaMascota;

    // Constructor
    public Glamping(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        super(nom_, idAllotjament_, mida, habitacions, placesPersones);
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

    // Metodes
    @Override
    public boolean correcteFuncionament() {
        // Un Glamping funciona correctamente si tiene casa para mascotas
        return casaMascota;
    }
}