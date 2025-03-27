package prog2.model;

import java.io.Serializable;

public class MobilHome extends Casa implements Serializable {
    private boolean terrassaBarbacoa;

    // Constructor
    public MobilHome(String nom_, String idAllotjament_, String estatAllotjament_, String iluminacio_, float mida_, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        super(nom_, idAllotjament_, estatAllotjament_, iluminacio_, mida_, habitacions, placesPersones);
        this.terrassaBarbacoa = terrassaBarbacoa;
    }

    // Getter
    public boolean isTerrassaBarbacoa() {
        return terrassaBarbacoa;
    }

}

