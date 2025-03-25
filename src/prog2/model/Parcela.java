package prog2.model;

public class Parcela extends Allotjament {
    private boolean connexioElectrica;

    // Constructor
    public Parcela(String nom, String idAllotjament, boolean estatAllotjament, String iluminacio, float mida, boolean connexioElectrica) {
        super(nom, idAllotjament, estatAllotjament, iluminacio, mida);
        this.connexioElectrica = connexioElectrica;

    }

    // Getter
    public boolean isConnexioElectrica() {
        return connexioElectrica;
    }
    public void setConnexioElectrica(boolean connexioElectrica) { this.connexioElectrica = connexioElectrica; }

    // Metode
    public boolean correcteFuncionament() {
        // Una Parcela funciona correctamente si tiene conexión eléctrica
        return connexioElectrica;
    }
}