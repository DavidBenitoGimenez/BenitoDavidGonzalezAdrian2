package prog2.model;

import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LlistaAccessos implements InLlistaAccessos {
    private final ArrayList<Acces> llistaAccessos;

    public LlistaAccessos(ArrayList<Acces> llistaAccessos) {
        this.llistaAccessos = llistaAccessos;
    }

    public void afegirAcces(Acces acc) throws ExcepcioCamping {
        try {
            llistaAccessos.add(acc);
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en afegir l'accés: " + e.getMessage());
        }
    }

    public void buidar() {
        llistaAccessos.clear();
    }

    public String llistarAccessos(boolean estat) throws ExcepcioCamping {
        try {
            StringBuffer solucio = new StringBuffer();
            for (Acces acc : llistaAccessos) {
                if (acc.isEstat() == estat) {
                    solucio.append("Nom " + acc.getNom())
                            .append(" Accessible: " + acc.isAccessibilitat())
                            .append("\n");
                }
            }
            if(solucio.isEmpty()) {
                throw new ExcepcioCamping("No hi ha accessos disponibles");
            }
            return solucio.toString();
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en llistar accessos: " + e.getMessage());
        }
    }


    // Revisar
    public void actualitzaEstatAccessos() throws ExcepcioCamping {

    }

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