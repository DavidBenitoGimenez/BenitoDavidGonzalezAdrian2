package prog2.model;

import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;

public class LlistaAllotjaments implements InLlistaAllotjaments {
    private ArrayList<Allotjament> LlistaAllotjament;

    public LlistaAllotjaments() {
        this.LlistaAllotjament = new ArrayList<>();
    }

    public void afegirAllotjament(Allotjament allotjament) throws ExcepcioCamping {
        LlistaAllotjament.add(allotjament);
    }

    public void buidar() {
        LlistaAllotjament.clear();
    }

    // Revisar, es raro que estat sea un String
    public String llistarAllotjaments(String estat) throws ExcepcioCamping {
        StringBuffer solucio = new StringBuffer();
        for (Allotjament allotjament : LlistaAllotjament) {
            if(allotjament.isEstatAllotjament() == Boolean.parseBoolean(estat)) {
                solucio.append("Allotjament " + allotjament.getId())
                        .append(" Amb ID: " + allotjament.getId())
                        .append(" Amb estat: " + allotjament.isEstatAllotjament())
                        .append("\n");
            }
        }
        if(solucio.isEmpty()) {
            throw new ExcepcioCamping("No hi ha allotjaments amb l'estat " + estat);
        }
        return solucio.toString();
    }

    public boolean containsAllotjamentOperatiu() {
        for (Allotjament allotjament : LlistaAllotjament) {
            if (allotjament.isEstatAllotjament()) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Allotjament allotjament) {
        return LlistaAllotjament.contains(allotjament);
    }

    public Allotjament getAllotjament(String nom) throws ExcepcioCamping {
        for (Allotjament allotjament : LlistaAllotjament) {
            if (allotjament.getNom().equals(nom)) {
                return allotjament;
            }
        }
        throw new ExcepcioCamping("No s'ha trobat l'allotjament amb nom " + nom);
    }

    public void add(Allotjament allotjament) {
        LlistaAllotjament.add(allotjament);
    }
}