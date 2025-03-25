package prog2.model;

import java.util.ArrayList;

public class CamiAsfaltat extends AccesAsfalt {
    public CamiAsfaltat(String nom, boolean accessibilitat, double metresQuadrats) {
        super(nom, accessibilitat, true, metresQuadrats);
    }

    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}