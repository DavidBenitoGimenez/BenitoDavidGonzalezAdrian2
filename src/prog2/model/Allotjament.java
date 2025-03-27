package prog2.model;

import java.io.Serializable;

public abstract class Allotjament implements InAllotjament, Serializable {
    private String nom_;
    private String idAllotjament_;
    private boolean estatAllotjament;
    private String iluminacio;

    /**
     * Constructor de la classe Allotjament
     * @param nom Nom de l'allotjament
     * @param id Identificador de l'allotjament
     * @param estatAllotjament Estat de l'allotjament (operatiu/no operatiu)
     * @param iluminacio Nivell d'il·luminació de l'allotjament
     */
    public Allotjament(String nom, String id, boolean estatAllotjament, String iluminacio) {
        this.nom_ = nom;
        this.idAllotjament_ = id;
        this.estatAllotjament = estatAllotjament;
        this.iluminacio = iluminacio;
    }

    /**
     * Obté el nom de l'allotjament
     * @return El nom de l'allotjament
     */
    public String getNom() {
        return nom_;
    }

    /**
     * Estableix el nom de l'allotjament
     * @param nom El nou nom de l'allotjament
     */
    public void setNom(String nom) {
        this.nom_ = nom;
    }

    /**
     * Obté l'identificador de l'allotjament
     * @return L'identificador de l'allotjament
     */
    public String getId() {
        return idAllotjament_;
    }

    /**
     * Estableix l'identificador de l'allotjament
     * @param idAllotjament El nou identificador de l'allotjament
     */
    public void setId(String idAllotjament) {
        this.idAllotjament_ = idAllotjament;
    }

    /**
     * Comprova l'estat de l'allotjament
     * @return Cert si l'allotjament està operatiu, fals altrament
     */
    public boolean getEstatAllotjament() {
        return estatAllotjament;
    }

    /**
     * Estableix l'estat de l'allotjament
     * @param estatAllotjament Cert per marcar com operatiu, fals altrament
     */
    public void setEstatAllotjament(boolean estatAllotjament) {
        this.estatAllotjament = estatAllotjament;
    }

    /**
     * Obté el nivell d'il·luminació de l'allotjament
     * @return El nivell d'il·luminació
     */
    public String getIluminacio() {
        return iluminacio;
    }

    /**
     * Estableix el nivell d'il·luminació de l'allotjament
     * @param iluminacio El nou nivell d'il·luminació
     */
    public void setIluminacio(String iluminacio) {
        this.iluminacio = iluminacio;
    }

    /**
     * Obre l'allotjament i estableix la il·luminació al 100%
     */
    public void obrirAllotjament(){
        estatAllotjament = true;
        iluminacio = "100%";
    }

    @Override
    public String toString() {
        return "Nom = " + nom_ + ", Id = " + idAllotjament_ + ", Estat allotjament: " + estatAllotjament + ", Iluminacio = " + iluminacio;
    }
}