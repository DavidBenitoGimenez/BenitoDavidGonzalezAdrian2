package prog2.model;

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
}