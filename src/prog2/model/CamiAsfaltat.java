package prog2.model;

import java.util.ArrayList;

public abstract class CamiAsfaltat extends AccesAsfalt {
    
    public CamiAsfaltat(String nom, boolean accessibilitat, boolean estat, ArrayList<String> llistaAllotjaments, double metresQuadrats) {
        super(nom,accessibilitat, estat, llistaAllotjaments, metresQuadrats);
    }
    @Override
    public boolean isAccessibilitat(){
        return false;
    }
}
