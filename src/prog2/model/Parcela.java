package prog2.model;

public class Parcela extends Allotjament {
    private float metres;
    private boolean connexioElectrica;

    // Constructor
    public Parcela(String nom_, String idAllotjament_, float metres, boolean connexioElectrica) {
        super(nom_, idAllotjament_); // Ejemplo de estada mínima
        this.metres = metres;
        this.connexioElectrica = connexioElectrica;

    }

    // Getter
    public float getMetres() {
        return metres;
    }
    public boolean isConnexioElectrica() {
        return connexioElectrica;
    }
    public void setMetres(float metres) { this.metres = metres; }
    public void setConnexioElectrica(boolean connexioElectrica) { this.connexioElectrica = connexioElectrica; }

    // Metode
    @Override
    public boolean correcteFuncionament() {
        // Una Parcela funciona correctamente si tiene conexión eléctrica
        return connexioElectrica;
    }
}