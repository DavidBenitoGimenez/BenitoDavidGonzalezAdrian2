package prog2.model;

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
}