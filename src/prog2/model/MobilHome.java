package prog2.model;

public class MobilHome extends Casa {
    private boolean terrassaBarbacoa;

    // Constructor
    public MobilHome(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        super(nom_, idAllotjament_, mida, habitacions, placesPersones);
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

