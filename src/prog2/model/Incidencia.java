package prog2.model;

import java.io.Serializable;

/**
 * Classe que representa una incidència al càmping
 */
public class Incidencia implements Serializable {
    public static enum TipusIncidencia {
        REPARACIO, NETEJA, TANCAMENT
    };

    private int numeroIncidencia;
    Allotjament allotjament;
    private String dataIncidencia;
    private String tipusIncidencia;

    /**
     * Constructor de la classe Incidencia
     * @param numeroIncidencia Número d'identificació de la incidència
     * @param tipusIncidencia Tipus d'incidència
     * @param allotjament Allotjament afectat
     * @param dataIncidencia Data de l'incidència
     */
    public Incidencia(int numeroIncidencia, String tipusIncidencia, Allotjament allotjament, String dataIncidencia) {
        this.numeroIncidencia = numeroIncidencia;
        this.dataIncidencia = dataIncidencia;
        this.tipusIncidencia = tipusIncidencia;
        this.allotjament = allotjament;
    }

    /**
     * Obté el nivell d'il·luminació segons el tipus d'incidència
     * @return Nivell d'il·luminació
     */
    public String getIluminacioAllotjament(){
        if (TipusIncidencia.REPARACIO.equals(tipusIncidencia)){
            return "100%";
        }
        else if(TipusIncidencia.NETEJA.equals(tipusIncidencia)){
            return "50%";
        }
        else if(TipusIncidencia.TANCAMENT.equals(tipusIncidencia)){
            return "0%";
        }
        return "";
    }

    /**
     * Obté el número d'incidència
     * @return Número d'incidència
     */
    public int getNumeroIncidencia() {
        return numeroIncidencia;
    }

    /**
     * Estableix el número d'incidència
     * @param numeroIncidencia Nou número d'incidència
     */
    public void setNumeroIncidencia(int numeroIncidencia) {
        this.numeroIncidencia = numeroIncidencia;
    }

    /**
     * Obté l'allotjament afectat
     * @return Allotjament afectat
     */
    public Allotjament getAllotjament() {
        return allotjament;
    }

    /**
     * Estableix l'allotjament afectat
     * @param allotjament Nou allotjament afectat
     */
    public void setAllotjament(Allotjament allotjament) {
        this.allotjament = allotjament;
    }

    /**
     * Obté la data de l'incidència
     * @return Data de l'incidència
     */
    public String getDataIncidencia() {
        return dataIncidencia;
    }

    /**
     * Estableix la data de l'incidència
     * @param dataIncidencia Nova data de l'incidència
     */
    public void setDataIncidencia(String dataIncidencia) {
        this.dataIncidencia = dataIncidencia;
    }

    /**
     * Obté el tipus d'incidència
     * @return Tipus d'incidència
     */
    public String getTipusIncidencia() {
        return tipusIncidencia;
    }

    /**
     * Estableix el tipus d'incidència
     * @param tipusIncidencia Nou tipus d'incidència
     */
    public void setTipusIncidencia(String tipusIncidencia){
        this.tipusIncidencia = tipusIncidencia;
    }

    /**
     * Retorna una representació en String de la incidència
     * @return String amb la informació de la incidència
     */
    @Override
    public String toString() {
        return "Numero incidencia: " + numeroIncidencia +
                " - Allotjament de la incidencia: " + allotjament +
                " - Tipus de la incidencia: " + tipusIncidencia +
                " - Data de la incidencia: " + dataIncidencia +
                " - Iluminacio actual de l'allotjament: " + getIluminacioAllotjament();
    }
}