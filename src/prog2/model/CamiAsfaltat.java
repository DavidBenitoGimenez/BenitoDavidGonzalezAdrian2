package prog2.model;

import java.util.ArrayList;

/**
 * Classe que representa un camí asfaltat dins del càmping
 */
public class CamiAsfaltat extends AccesAsfalt {
    /**
     * Constructor del camí asfaltat
     * @param nom Nom del camí
     * @param accessibilitat Si és accessible o no
     * @param metresQuadrats Metres quadrats del camí
     */
    public CamiAsfaltat(String nom, boolean accessibilitat, double metresQuadrats) {
        super(nom, accessibilitat, true, metresQuadrats);
    }

    /**
     * Comprova l'accessibilitat del camí
     * @return Sempre retorna false (no accessible)
     */
    @Override
    public boolean isAccessibilitat() {
        return false;
    }
}