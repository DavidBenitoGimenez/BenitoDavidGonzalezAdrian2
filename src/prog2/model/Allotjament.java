package prog2.model;
import java.time.LocalDate;

public abstract class Allotjament {
    private String nom_;
    private String idAllotjament_;

    // Constructor
    public Allotjament(String nom, String id) {
        this.nom_ = nom;
        this.idAllotjament_ = id;
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

    // Métode toString
    @Override
    public String toString() {
        return "Nom=" + nom_ + ", Id=" + idAllotjament_;
    }

    // Métode abstracto
    public abstract boolean correcteFuncionament();
}
