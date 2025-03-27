package prog2.model;
import java.io.Serializable;
import java.util.ArrayList;

public abstract class Acces implements InAcces, Serializable {
    private String nom;
    private boolean accesibilitat;
    private boolean estat; // obert = true, tancat = false
    private ArrayList<Allotjament> LlistaAllotjaments;

    /**
     * Constructor de la classe Accés
     * @param nom Nom de l'accés
     * @param accesibilitat Si és accessible o no
     * @param estat Estat de l'accés (obert/tancat)
     */
    public Acces(String nom, boolean accesibilitat, boolean estat) {
        this.nom = nom;
        this.accesibilitat = accesibilitat;
        this.estat = estat;
        this.LlistaAllotjaments = new ArrayList<>();
    }

    /**
     * Aquest mètode retorna el nom de l'accés
     * @return El nom de l'accés
     */
    public String getNom() {
        return nom;
    }

    /**
     * Aquest mètode estableix el nom de l'accés
     * @param nom El nom a establir per a l'accés
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Aquest mètode comprova si l'accés és accessible
     * @return Cert si l'accés és accessible, fals altrament
     */
    public boolean isAccessibilitat() {
        return accesibilitat;
    }

    /**
     * Aquest mètode estableix l'accessibilitat de l'accés
     * @param accesibilitat Cert per marcar l'accés com accessible, fals altrament
     */
    public void setAccesibilitat(boolean accesibilitat) {
        this.accesibilitat = accesibilitat;
    }

    /**
     * Aquest mètode comprova l'estat de l'accés
     * @return Cert si l'accés està obert, fals si està tancat
     */
    public boolean isEstat() {
        return estat;
    }

    /**
     * Aquest mètode estableix l'estat de l'accés
     * @param estat Cert per obrir l'accés, fals per tancar-lo
     */
    public void setEstat(boolean estat) {
        this.estat = estat;
    }

    /**
     * Aquest mètode retorna la llista d'allotjaments de l'accés
     * @return La llista d'allotjaments associats a aquest accés
     */
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return LlistaAllotjaments;
    }

    /**
     * Aquest mètode estableix la llista d'allotjaments de l'accés
     * @param LlistaAllotjaments La nova llista d'allotjaments per a aquest accés
     */
    public void setLlistaAllotjaments(ArrayList<Allotjament> LlistaAllotjaments) {
        this.LlistaAllotjaments = LlistaAllotjaments;
    }

    /**
     * Afegeix un allotjament rebut com a paràmetre a la llista d'allotjaments de l'accés
     * @param allotjament
     */
    public void afegirAllotjament(Allotjament allotjament) {
        LlistaAllotjaments.add(allotjament);
    }

    /**
     * Canvia l'estat de l'accés a tancat
     */
    public void tancarAcces() {
        estat = false;
    }

    /**
     * Canvia l'estat de l'accés a obert
     */
    public void obrirAcces() {
        estat = true;
    }
}