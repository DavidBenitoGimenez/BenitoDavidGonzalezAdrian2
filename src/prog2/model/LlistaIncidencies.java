package prog2.model;

import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;

/**
 * Classe que gestiona una llista d'incidències del càmping
 */
public class LlistaIncidencies implements InLlistaIncidencies {
    private ArrayList<Incidencia> llistaIncidencies;

    /**
     * Constructor de la classe LlistaIncidencies
     * @param llistaIncidencies Llista d'incidències inicial
     */
    public LlistaIncidencies(ArrayList<Incidencia> llistaIncidencies) {
        this.llistaIncidencies = llistaIncidencies;
    }

    /**
     * Afegeix una incidència a la llista
     * @param num Número d'identificació de la incidència
     * @param tipus Tipus d'incidència
     * @param allotjament Allotjament afectat
     * @param data Data de l'incidència
     * @throws ExcepcioCamping Si la incidència ja existeix o el tipus no és vàlid
     */
    public void afegirIncidencia(int num, String tipus, Allotjament allotjament, String data) throws ExcepcioCamping {
        try {
            Incidencia in = new Incidencia(num, tipus, allotjament, data);
            for (Incidencia incidencia : llistaIncidencies) {
                if (in.getNumeroIncidencia() == (incidencia.getNumeroIncidencia())) {
                    throw new ExcepcioCamping("La incidencia ja existeix");
                }
            }
            llistaIncidencies.add(in);
            allotjament.setEstatAllotjament(false);

            if (tipus.equals("Reparacio")) {
                allotjament.setIluminacio("100%");
            }
            else if (tipus.equals("Neteja")) {
                allotjament.setIluminacio("50%");
            }
            else if (tipus.equals("Tancament")) {
                allotjament.setIluminacio("0%");
            }
            else {
                throw new ExcepcioCamping("No existeix aquesta incidencia");
            }
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en afegir incidencia: " + e.getMessage());
        }
    }

    /**
     * Elimina una incidència de la llista
     * @param in Incidència a eliminar
     * @throws ExcepcioCamping Si hi ha un error en eliminar l'incidència
     */
    public void eliminarIncidencia(Incidencia in) throws ExcepcioCamping {
        try {
            llistaIncidencies.remove(in);
            in.getAllotjament().obrirAllotjament();
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en eliminar incidencia: " + e.getMessage());
        }
    }

    /**
     * Llista totes les incidències
     * @return String amb la informació de les incidències
     * @throws ExcepcioCamping Si no hi ha incidències registrades
     */
    public String llistarIncidencies() throws ExcepcioCamping {
        try {
            if (llistaIncidencies.isEmpty()) {
                throw new ExcepcioCamping("No hi ha incidències registrades");
            }
            StringBuilder incidencies = new StringBuilder();
            for (Incidencia incidencia : llistaIncidencies) {
                incidencies.append("Numero: " + incidencia.getNumeroIncidencia() +
                        ", Allotjament: " + incidencia.getAllotjament().getNom() +
                        ", Id: " + incidencia.getAllotjament().getId() +
                        ", Iluminació: " + incidencia.getAllotjament().getIluminacio() +
                        ", Data: " + incidencia.getDataIncidencia() +
                        ", Tipus: " + incidencia.getTipusIncidencia() + "\n");
            }
            return incidencies.toString();
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en llistar incidencies: " + e.getMessage());
        }
    }

    /**
     * Obté una incidència pel seu número
     * @param num Número d'incidència
     * @return L'incidència trobada
     * @throws ExcepcioCamping Si no es troba l'incidència
     */
    public Incidencia getIncidencia(int num) throws ExcepcioCamping {
        try {
            for (Incidencia incidencia : llistaIncidencies) {
                if (incidencia.getNumeroIncidencia() == num) {
                    return incidencia;
                }
            }
            throw new ExcepcioCamping("No s'ha trobat la incidencia amb número " + num);
        } catch (ExcepcioCamping e) {
            throw new ExcepcioCamping("Error en trobar la incidencia: " + e.getMessage());
        }
    }
}