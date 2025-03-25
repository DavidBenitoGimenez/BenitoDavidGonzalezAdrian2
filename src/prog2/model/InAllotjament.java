package prog2.model;

/**
 * Interfície que defineix les operacions bàsiques per als allotjaments.
 */
public interface InAllotjament {

    /**
     * Obté el nom de l'allotjament.
     * @return el nom de l'allotjament.
     */
    String getNom();

    /**
     * Estableix el nom de l'allotjament.
     * @param nom el nom a assignar.
     */
    void setNom(String nom);

    /**
     * Obté l'identificador únic de l'allotjament.
     * @return l'identificador únic de l'allotjament.
     */
    String getId();

    /**
     * Estableix l'identificador únic de l'allotjament.
     * @param id l'identificador a assignar.
     */
    void setId(String id);

    void obrirAllotjament();
}