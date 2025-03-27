package prog2.model;

import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Classe que gestiona una llista d'accessos al càmping
 */
public class LlistaAccessos implements InLlistaAccessos {
    private final ArrayList<Acces> llistaAccessos;

    /**
     * Constructor de la classe LlistaAccessos
     * @param llistaAccessos Llista d'accessos inicial
     */
    public LlistaAccessos(ArrayList<Acces> llistaAccessos) {
        this.llistaAccessos = llistaAccessos;
    }

    /**
     * Afegeix un accés a la llista
     * @param acc Accés a afegir
     * @throws ExcepcioCamping Si hi ha un error en afegir l'accés
     */
    public void afegirAcces(Acces acc) throws ExcepcioCamping {
        try {
            llistaAccessos.add(acc);
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en afegir l'accés: " + e.getMessage());
        }
    }

    /**
     * Buida la llista d'accessos
     */
    public void buidar() {
        llistaAccessos.clear();
    }

    /**
     * Llista els accessos segons l'estat
     * @param estat Estat dels accessos a llistar
     * @return String amb la llista d'accessos
     * @throws ExcepcioCamping Si no hi ha accessos disponibles
     */
    public String llistarAccessos(boolean estat) throws ExcepcioCamping {
        try {
            StringBuffer solucio = new StringBuffer();
            for (Acces acc : llistaAccessos) {
                if (acc.isEstat() == estat) {
                    solucio.append("Nom " + acc.getNom())
                            .append(" Estat " + acc.isEstat())
                            .append(" Accessible: " + acc.isAccessibilitat())
                            .append("\n");
                }
            }
            if (solucio.isEmpty()) {
                throw new ExcepcioCamping("No hi ha accessos disponibles");
            }
            return solucio.toString();
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en llistar accessos: " + e.getMessage());
        }
    }

    /**
     * Actualitza l'estat dels accessos segons l'estat dels allotjaments
     * @throws ExcepcioCamping Si hi ha un error en actualitzar els estats
     */
    public void actualitzaEstatAccessos() throws ExcepcioCamping {
        try {
            for (Acces acc : llistaAccessos) {
                acc.tancarAcces();
            }
            for (Acces acc : llistaAccessos) {
                for (Allotjament allotjament : acc.getLlistaAllotjaments()) {
                    if (allotjament.getEstatAllotjament()) {
                        acc.obrirAcces();
                    }
                }
            }
        } catch (ExcepcioCamping e) {
            throw new ExcepcioCamping("Error en actualitzar els estat dels accessos: " + e.getMessage());
        }
    }

    /**
     * Calcula el nombre d'accessos accessibles
     * @return Nombre d'accessos accessibles
     * @throws ExcepcioCamping Si hi ha un error en el càlcul
     */
    public int calculaAccessosAccessibles() throws ExcepcioCamping {
        try {
            int accessos = 0;
            for (Acces acc : llistaAccessos) {
                if (acc.isAccessibilitat()) {
                    accessos++;
                }
            }
            return accessos;
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en calcular accessos accessibles: " + e.getMessage());
        }
    }

    /**
     * Calcula els metres quadrats d'asfalt totals
     * @return Metres quadrats d'asfalt
     * @throws ExcepcioCamping Si hi ha un error en el càlcul
     */
    public float calculaMetresQuadratsAsfalt() throws ExcepcioCamping {
        try {
            float metresQuadrats = 0;
            if (llistaAccessos != null) {
                for (Acces acc : llistaAccessos) {
                    if (acc instanceof AccesAsfalt) {
                        AccesAsfalt accesAsfalt = (AccesAsfalt) acc;
                        if (accesAsfalt.getMetresQuadrats() > 0) {
                            metresQuadrats += accesAsfalt.getMetresQuadrats();
                        }
                    }
                }
            }
            return metresQuadrats;
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en calcular metres quadrats d'asfalt: " + e.getMessage());
        }
    }
}