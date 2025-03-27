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

    public String llistarAllotjaments(String estat) throws ExcepcioCamping {
        StringBuffer solucio = new StringBuffer();
        for (Allotjament allotjament : LlistaAllotjament) {
            if(allotjament.getEstatAllotjament() == estat) {
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
            throw new ExcepcioCamping("Error en llistar allotjaments " + e.getMessage());
        }
    }

    public boolean containsAllotjamentOperatiu() {
        for (Allotjament allotjament : LlistaAllotjament) {
            if (allotjament.getEstatAllotjament().equals("Operatiu")) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Allotjament allotjament) {
        return LlistaAllotjament.contains(allotjament);
    }

    public Allotjament getAllotjament(String idAllotjament_) throws ExcepcioCamping {
        for (Allotjament allotjament : LlistaAllotjament) {
            if (allotjament.getId().equals(idAllotjament_)) {
                return allotjament;
            }
        }
        throw new ExcepcioCamping("No s'ha trobat l'allotjament amb Id " + idAllotjament_);
    }

    public void add(Allotjament allotjament) {
        LlistaAllotjament.add(allotjament);
    }
}