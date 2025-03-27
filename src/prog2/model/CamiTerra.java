package prog2.model;

import java.util.ArrayList;

/**
 * Classe que representa un camí de terra dins del càmping
 */
public class CamiTerra extends AccesTerra {
    /**
     * Constructor del camí de terra
     * @param nom Nom del camí
     * @param estat Estat del camí (obert/tancat)
     * @param longitud Longitud del camí
     */
    public CamiTerra(String nom, boolean estat, float longitud) {
        super(nom, estat, longitud);
    }

    /**
     * Comprova l'accessibilitat del camí
     * @return Sempre retorna false (no accessible)
     */
    @Override
    public boolean isAccessiblitat() {
        return false;
    }
}