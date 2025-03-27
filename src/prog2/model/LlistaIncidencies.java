package prog2.model;

import prog2.vista.ExcepcioCamping;

import java.util.ArrayList;

public class LlistaIncidencies implements InLlistaIncidencies {
    private ArrayList<Incidencia> llistaIncidencies;

    public LlistaIncidencies(ArrayList<Incidencia> llistaIncidencies) {
        this.llistaIncidencies  = llistaIncidencies;
    }

    /**
     * Aquest mètode crea una incidència amb la informació passada com a paràmetres
     * (número d'identificador, tipus, l'allotjament on s'ha produït i la data) i l'afegeix a la llista.
     * A més, s'ha de comprovar que aquest allotjament no té ja una incidència si ja té una incidència s'ha de llançar una excepció.
     * Una vegada creada la incidència s'ha de tancar (no operatiu) l'allotjament corresponent.
     * @param num Número d'identificació de la incidència.
     * @param tipus Aquest String permet crear el enum TipusIncidencia
     * @param allotjament Allotjament on es produeix la incidència
     * @param data Data quan es produeix la incidència.
     * @throws ExcepcioCamping Per comprovar i avisar si l'allotjament ja té una incidència o si el tipus d’incidència que es vol afegir no existeix.
     */
    public void afegirIncidencia(int num, String tipus, Allotjament allotjament, String data) throws ExcepcioCamping {
        try {
            Incidencia in = new Incidencia(num, tipus, allotjament, data);
            for (Incidencia incidencia : llistaIncidencies) {
                if (in.equals(incidencia)) {
                    throw new ExcepcioCamping("La incidencia ja existeix ");
                }
            }
            llistaIncidencies.add(in);
            allotjament.setEstatAllotjament("No operatiu");
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en afegir incidencia " + e.getMessage());
        }
    }
    // voy a revisar el de actualizar accessos que hay que llamarlo en este metodo para cuando se añada la incidencia OWO
    /**
     * Aquest mètode elimina una incidència de la llista i actualitza l'estat de l'allotjament mitjançant el mètode obrirAllotjament de la classe Allotjament.
     * @param in Objecte de tipus Incidència
     * @throws ExcepcioCamping
     */
    public void eliminarIncidencia(Incidencia in) throws ExcepcioCamping {
        try {
            llistaIncidencies.remove(in);
            in.getAllotjament().obrirAllotjament();
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en eliminar incidencia " + e.getMessage());
        }
    }

    /**
     * Itera sobre la llista d'incidències i retorna un String amb la informació de totes les incidències.
     * En cas que no hi hagi cap incidència llança una excepció.
     * @return String
     * @throws ExcepcioCamping
     */
    public String llistarIncidencies() throws ExcepcioCamping{
        try {
            if (llistaIncidencies.isEmpty()) {
                throw new ExcepcioCamping("No hi ha incidències registrades");
            }
            StringBuilder incidencies = new StringBuilder();
            for (Incidencia incidencia : llistaIncidencies) {
                incidencies.append("Numero: " + incidencia.getNumeroIncidencia() +
                        ", Allotjament: " + incidencia.getAllotjament() +
                        ", Data: " + incidencia.getDataIncidencia() +
                        ", Tipus: " + incidencia.getTipusIncidencia() + "\n");
            }
            return incidencies.toString();
        } catch (Exception e) {
            throw new ExcepcioCamping("Error en llistar incidencies " + e.getMessage());
        }
    }

    /**
     * Busca la incidència amb el número rebut per paràmetre i la retorna.
     * En cas que no existeixi llança una excepció.
     * @param num Número d'identificació de la incidència.
     * @return Objecte de tipus Incidència
     * @throws ExcepcioCamping Aquest mètode llança una excepció si no existeix cap incidència amb el número passat per paràmetre.
     */
    public Incidencia getIncidencia(int num) throws ExcepcioCamping {
        try {
            for (Incidencia incidencia : llistaIncidencies) {
                if (incidencia.getNumeroIncidencia() == num) {
                    return incidencia;
                }
            }
        } catch (ExcepcioCamping e) {
            throw new ExcepcioCamping("Error en trobar la incidencia " + e.getMessage());
        }
        return null;
    }
}
