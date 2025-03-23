package prog2.model;

import java.util.ArrayList;

public abstract class CamiTerra extends AccesTerra {
    public CamiTerra(String nom, boolean accessibilitat, boolean estat, ArrayList<String> llistaAllotjaments, double longitud) {
        super(nom, accessibilitat, estat, llistaAllotjaments, longitud);
    }
    @Override
    public boolean isAccessiblitat(){
        return false;
    }
}
