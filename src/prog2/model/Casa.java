package prog2.model;

public abstract class Casa extends Allotjament{
    private int habitacions;
    private int placesPersones;

    // Constructor
    public Casa(String nom_, String idAllotjament_, boolean estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_, mida_);
        this.habitacions = habitacions;
        this.placesPersones = placesPersones;
    }

    // Getters
    public String getMida() {return mida;}
    public int getHabitacions() {return habitacions;}
    public int getPlacesPersones() {return placesPersones;}

    // Metodes
    @Override
    public abstract boolean correcteFuncionament();
}
