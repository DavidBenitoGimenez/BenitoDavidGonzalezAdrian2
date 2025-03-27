package prog2.model;

import java.io.Serializable;

public class Parcela extends Allotjament implements Serializable {
    private boolean connexioElectrica;
    private float metres;

    // Constructor ola caracola hola pisha
    public Parcela(String nom, String idAllotjament, boolean estatAllotjament, String iluminacio, float mida, boolean connexioElectrica) {
        super(nom, idAllotjament, estatAllotjament, iluminacio);
        this.connexioElectrica = connexioElectrica;
        this.metres = mida;

    }

    // Getter
    public boolean isConnexioElectrica() {
        return connexioElectrica;
    }
    public void setConnexioElectrica(boolean connexioElectrica) { this.connexioElectrica = connexioElectrica; }
    public float getMetres() {
        return metres;
    }
    public void setMetres(float metres) {
        this.metres = metres;
    }
}