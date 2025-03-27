package prog2.model;

import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;

/**
 * Classe que gestiona una llista d'allotjaments del càmping
 */
public class LlistaAllotjaments implements InLlistaAllotjaments {
    private ArrayList<Allotjament> LlistaAllotjament;

    /**
     * Constructor de la classe LlistaAllotjaments
     */
    public LlistaAllotjaments() {
        this.LlistaAllotjament = new ArrayList<>();
    }

    /**
     * Afegeix un allotjament a la llista
     * @param allotjament Allotjament a afegir
     * @throws ExcepcioCamping Si hi ha un error en afegir l'allotjament
     */
    public void afegirAllotjament(Allotjament allotjament) throws ExcepcioCamping {
        LlistaAllotjament.add(allotjament);
    }

    /**
     * Buida la llista d'allotjaments
     */
    public void buidar() {
        LlistaAllotjament.clear();
    }

    /**
     * Llista els allotjaments segons l'estat
     * @param estat Estat dels allotjaments a llistar
     * @return String amb la llista d'allotjaments
     * @throws ExcepcioCamping Si no hi ha allotjaments amb l'estat especificat
     */
    public String llistarAllotjaments(String estat) throws ExcepcioCamping {
        StringBuffer solucio = new StringBuffer();
        boolean operatiu = operatiu(estat);
        for (Allotjament allotjament : LlistaAllotjament) {
            if(allotjament.getEstatAllotjament() == operatiu) {
                solucio.append("Allotjament " + allotjament.getId())
                        .append(" Amb ID: " + allotjament.getId())
                        .append(" Amb estat: " + allotjament.getEstatAllotjament())
                        .append("\n");
            }
        }
        if(solucio.isEmpty()) {
            throw new ExcepcioCamping("No hi ha allotjaments amb l'estat " + estat);
        }
        return solucio.toString();
    }

    /**
     * Llista tots els allotjaments
     * @return String amb la llista d'allotjaments
     * @throws ExcepcioCamping Si no hi ha allotjaments
     */
    public String llistarAllotjaments() throws ExcepcioCamping {
        try {
            StringBuffer solucio = new StringBuffer();
            for (Allotjament allotjament : LlistaAllotjament) {
                solucio.append("Allotjament " + allotjament.getId())
                        .append(" Amb ID: " + allotjament.getId())
                        .append(" Amb estat: " + allotjament.getEstatAllotjament())
                        .append("\n");
            }
            if (solucio.isEmpty()) {
                throw new ExcepcioCamping("No hi ha allotjaments");
            }
            return solucio.toString();
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en llistar allotjaments: " + e.getMessage());
        }
    }

    /**
     * Comprova si hi ha allotjaments operatius
     * @return Cert si hi ha allotjaments operatius
     */
    public boolean containsAllotjamentOperatiu() {
        for (Allotjament allotjament : LlistaAllotjament) {
            if (allotjament.getEstatAllotjament()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Comprova si un allotjament existeix a la llista
     * @param allotjament Allotjament a comprovar
     * @return Cert si l'allotjament existeix
     */
    public boolean contains(Allotjament allotjament) {
        return LlistaAllotjament.contains(allotjament);
    }

    /**
     * Obté un allotjament pel seu ID
     * @param idAllotjament_ ID de l'allotjament
     * @return L'allotjament trobat
     * @throws ExcepcioCamping Si no es troba l'allotjament
     */
    public Allotjament getAllotjament(String idAllotjament_) throws ExcepcioCamping {
        for (Allotjament allotjament : LlistaAllotjament) {
            if (allotjament.getId().equals(idAllotjament_)) {
                return allotjament;
            }
        }
        throw new ExcepcioCamping("No s'ha trobat l'allotjament amb Id " + idAllotjament_);
    }

    /**
     * Afegeix un allotjament a la llista
     * @param allotjament Allotjament a afegir
     */
    public void add(Allotjament allotjament) {
        LlistaAllotjament.add(allotjament);
    }

    /**
     * Converteix l'estat de String a booleà
     * @param estat Estat en format String
     * @return Estat en format booleà
     * @throws ExcepcioCamping Si l'estat no és vàlid
     */
    private boolean operatiu(String estat) throws ExcepcioCamping {
        if (estat.equals("Obert")) {
            return true;
        }
        else if (estat.equals("Tancat")) {
            return false;
        }
        else {
            throw new ExcepcioCamping("Estat no existeix " + estat);
        }
    }
}