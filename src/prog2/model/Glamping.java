package prog2.model;

/**
 * Classe que representa un allotjament tipus Glamping al càmping
 */
public class Glamping extends Casa {
    private String material;
    private boolean casaMascota;

    /**
     * Constructor de la classe Glamping
     * @param nom_ Nom del glamping
     * @param idAllotjament_ Identificador de l'allotjament
     * @param estatAllotjament_ Estat de l'allotjament (operatiu/no operatiu)
     * @param iluminacio_ Nivell d'il·luminació
     * @param mida_ Mida de l'allotjament
     * @param habitacions Nombre d'habitacions
     * @param placesPersones Capacitat de persones
     * @param material Material del glamping
     * @param casaMascota Si admet mascotes o no
     */
    public Glamping(String nom_, String idAllotjament_, boolean estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones, String material, boolean casaMascota) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_, mida_, habitacions, placesPersones);
        this.material = material;
        this.casaMascota = casaMascota;
    }

    /**
     * Obté el material del glamping
     * @return Material del glamping
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Comprova si admet mascotes
     * @return Cert si admet mascotes, fals altrament
     */
    public boolean isCasaMascota() {
        return casaMascota;
    }
}