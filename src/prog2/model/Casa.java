package prog2.model;

public abstract class Casa extends Allotjament{
    private String mida;
    private int habitacions;
    private int placesPersones;

    // Constructor
    public Casa(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones) {
        super(nom_, idAllotjament_);
        this.mida = mida;
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
