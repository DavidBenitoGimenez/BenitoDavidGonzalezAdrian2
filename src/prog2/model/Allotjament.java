package prog2.model;

public abstract class Allotjament implements InAllotjament {
    private String nom_;
    private String idAllotjament_;
    private boolean estatAllotjament;
    private String iluminacio;

    // Constructor
    public Allotjament(String nom, String id, boolean estatAllotjament, String iluminacio) {
        this.nom_ = nom;
        this.idAllotjament_ = id;
        this.estatAllotjament = estatAllotjament;
        this.iluminacio = iluminacio;
    }

    // Getters i Setters
    public String getNom() {
        return nom_;
    }

    public void setNom(String nom) {
        this.nom_ = nom;
    }

    public String getId() {
        return idAllotjament_;
    }
    public void setId(String idAllotjament) {
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


    // Métode toString
    @Override
    public String toString() {
        return "Nom = " + nom_ + ", Id = " + idAllotjament_ + "Estat allotjament: " + estatAllotjament + ", Iluminacio = " + iluminacio;    }
    public void obrirAllotjament(){
        estatAllotjament = true;
        iluminacio = "100%";
    }
}
