package prog2.model;
import java.time.LocalDate;

public abstract class Allotjament implements InAllotjament {
    private String nom_;
    private String idAllotjament_;
    private boolean estatAllotjament;
    private String iluminacio;
    private float mida;


    // Constructor
    public Allotjament(String nom, String id, boolean estatAllotjament, String iluminacio, float mida) {
        this.nom_ = nom;
        this.idAllotjament_ = id;
        this.estatAllotjament = estatAllotjament;
        this.iluminacio = iluminacio;
        this.mida = mida;

    }

    // Getters i Setters
    public String getNom() {
        return nom_;
    }

    public void setNom(String nom) {
        this.nom_ = nom;
    }

    public String getIdAllotjament_() {
        return idAllotjament_;
    }
    public void setIdAllotjament_(String idAllotjament) {
        this.idAllotjament_ = idAllotjament;
    }
    public boolean isEstatAllotjament() {
        return estatAllotjament;
    }
    public void setEstatAllotjament(boolean estatAllotjament) {
        this.estatAllotjament = estatAllotjament;
    }
    public String getIluminacio() {
        return iluminacio;
    }
    public void setIluminacio(String iluminacio) {
        this.iluminacio = iluminacio;
    }
    public float getMida() { return mida; }
    public void setMida(float mida) { this.mida = mida; }

    // Métode toString
    @Override
    public String toString() {
        return "Nom = " + nom_ + ", Id = " + idAllotjament_ + "Estat allotjament: " + estatAllotjament + ", Iluminacio = " + iluminacio + ", Mida = " + mida;
    }
}
