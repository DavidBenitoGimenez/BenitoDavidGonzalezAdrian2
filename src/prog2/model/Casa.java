package prog2.model;

import java.io.Serializable;

public abstract class Casa extends Allotjament {
    float mida;
    private int habitacions;
    private int placesPersones;

    // Constructor
    public Casa(String nom_, String idAllotjament_, String estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_);
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
        this.mida = mida_;
    }

    // Getters
    public int getHabitacions() {return habitacions;}
    public int setHabitacions(int habitacions) {
        this.habitacions = habitacions;
        return habitacions;
    }
    public int getPlacesPersones() {return placesPersones;}
    public int setPlacesPersones(int placesPersones) {
        this.placesPersones = placesPersones;
        return placesPersones;
    }
    public float getMida() {return mida;}
    public void setMida(float mida) {this.mida = mida;}

    // Metodes

    @Override
    public String toString() {
        return super.toString() + "Mida " + mida + ", habitacions " + habitacions + ", placesPersones " + placesPersones;
    }
}
