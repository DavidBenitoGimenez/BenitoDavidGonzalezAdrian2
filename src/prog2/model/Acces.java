package prog2.model;
import java.util.ArrayList;

public abstract class Acces implements InAcces {
    private String nom;
    private boolean accesibilitat;
    private boolean estat;
    private ArrayList<String> LlistaAllotjaments;

    public Acces(String nom, boolean accesibilitat, boolean estat, ArrayList<String> LlistaAllotjaments) {
        this.nom = nom;
        this.accesibilitat = accesibilitat;
        this.estat = estat;
        this.LlistaAllotjaments = LlistaAllotjaments;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isAccesibilitat() {
        return accesibilitat;
    }
    public void setAccesibilitat(boolean accesibilitat) {
        this.accesibilitat = accesibilitat;
    }
    public boolean isEstat() {
        return estat;
    }
    public void setEstat(boolean estat) {
        this.estat = estat;
    }
    public ArrayList<String> getLlistaAllotjaments() {
        return LlistaAllotjaments;
    }
    public void setLlistaAllotjaments(ArrayList<String> LlistaAllotjaments) {
        this.LlistaAllotjaments = LlistaAllotjaments;
    }

}
