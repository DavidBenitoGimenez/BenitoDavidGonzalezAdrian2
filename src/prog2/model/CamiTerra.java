package prog2.model;

import java.util.ArrayList;

public abstract class CamiTerra extends AccesTerra {
    public CamiTerra(String nom, boolean estat, double longitud) {
        super(nom, false, estat, new ArrayList<>(), longitud);

    }
    @Override
    public boolean isAccessibilitat(){
        return false;
    }
}
