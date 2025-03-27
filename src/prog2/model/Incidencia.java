package prog2.model;

import java.io.Serializable;

public class Incidencia implements Serializable {
    public static enum TipusIncidencia {
        REPARACIO, NETEJA, TANCAMENT
    };

    private int numeroIncidencia;
    Allotjament allotjament;
    private String dataIncidencia;
    private String tipusIncidencia;

    public Incidencia(int numeroIncidencia, String tipusIncidencia, Allotjament allotjament, String dataIncidencia) {
        this.numeroIncidencia = numeroIncidencia;
        this.dataIncidencia = dataIncidencia;
        this.tipusIncidencia = tipusIncidencia;
        this.allotjament = allotjament;
    }
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
    public int getNumeroIncidencia() {
        return numeroIncidencia;
    }
    public void setNumeroIncidencia(int numeroIncidencia) {
        this.numeroIncidencia = numeroIncidencia;
    }
    public Allotjament getAllotjament() {
        return allotjament;
    }
    public void setAllotjament(Allotjament allotjament) {
        this.allotjament = allotjament;
    }
    public String getDataIncidencia() {
        return dataIncidencia;
    }
    public void setDataIncidencia(String dataIncidencia) {
        this.dataIncidencia = dataIncidencia;
    }
    public String getTipusIncidencia() {
        return tipusIncidencia;
    }
    public void setTipusIncidencia(String tipusIncidencia){
        this.tipusIncidencia = tipusIncidencia;
    }
    @Override
    public String toString() {
        return "Numero incidencia: " + numeroIncidencia +
                " - Allotjament de la incidencia: " + allotjament +
                " - Tipus de la incidencia: " + tipusIncidencia +
                " - Data de la incidencia: " + dataIncidencia +
                " - Iluminacio actual de l'allotjament: " + getIluminacioAllotjament();
    }

}
