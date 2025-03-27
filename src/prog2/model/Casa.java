package prog2.model;

public abstract class Casa extends Allotjament {
    float mida;
    private int habitacions;
    private int placesPersones;

    /**
     * Constructor de la casa
     * @param nom_ Nom de la casa
     * @param idAllotjament_ Identificador de la casa
     * @param estatAllotjament_ Estat de la casa (operatiu/no operatiu)
     * @param iluminacio_ Il·luminació de la casa
     * @param mida_ Mida de la casa
     * @param habitacions Nombre d'habitacions
     * @param placesPersones Capacitat de persones
     */
    public Casa(String nom_, String idAllotjament_, boolean estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_);
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.mida = mida_;
    }

    /**
     * Obté el nombre d'habitacions
     * @return Nombre d'habitacions
     */
    public int getHabitacions() {
        return habitacions;
    }

    /**
     * Estableix el nombre d'habitacions
     * @param habitacions Nou nombre d'habitacions
     * @return Nombre d'habitacions establert
     */
    public int setHabitacions(int habitacions) {
        this.habitacions = habitacions;
        return habitacions;
    }

    /**
     * Obté la capacitat de persones
     * @return Capacitat de persones
     */
    public int getPlacesPersones() {
        return placesPersones;
    }

    /**
     * Estableix la capacitat de persones
     * @param placesPersones Nova capacitat de persones
     * @return Capacitat de persones establerta
     */
    public int setPlacesPersones(int placesPersones) {
        this.placesPersones = placesPersones;
        return placesPersones;
    }

    /**
     * Obté la mida de la casa
     * @return Mida de la casa
     */
    public float getMida() {
        return mida;
    }

    /**
     * Estableix la mida de la casa
     * @param mida Nova mida de la casa
     */
    public void setMida(float mida) {
        this.mida = mida;
    }

    /**
     * Retorna una representació en String de la casa
     * @return String amb la informació de la casa
     */
    @Override
    public String toString() {
        return super.toString() + "Mida " + mida + ", habitacions " + habitacions + ", placesPersones " + placesPersones;
    }
}