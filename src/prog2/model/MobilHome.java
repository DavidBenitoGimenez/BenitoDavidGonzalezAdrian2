package prog2.model;

public class MobilHome extends Casa {
    private boolean terrassaBarbacoa;

    // Constructor
    public MobilHome(String nom_, String idAllotjament_, boolean estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_, mida_, habitacions, placesPersones);
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    // Getter
    public boolean isTerrassaBarbacoa() {
        return terrassaBarbacoa;
    }

    // Metode
    @Override
    public boolean correcteFuncionament() {
        return terrassaBarbacoa;
    }
}

