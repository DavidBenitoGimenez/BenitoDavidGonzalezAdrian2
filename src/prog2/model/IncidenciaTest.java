package prog2.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IncidenciaTest {

    @Test
    public void testConstructorIGetters() {
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);
        Incidencia incidencia = new Incidencia(1, "REPARACIO", allotjament, "2023-10-01");

        assertEquals(1, incidencia.getNumeroIncidencia());
        assertEquals("REPARACIO", incidencia.getTipusIncidencia());
        assertEquals(allotjament, incidencia.getAllotjament());
        assertEquals("2023-10-01", incidencia.getDataIncidencia());
    }

    @Test
    public void testSetters() {
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);
        Incidencia incidencia = new Incidencia(1, "REPARACIO", allotjament, "2023-10-01");

        Allotjament nouAllotjament = new Parcela("Parcela Sud", "ALL2", true, "100%", 64, true);

        incidencia.setNumeroIncidencia(2);
        incidencia.setTipusIncidencia("NETEJA");
        incidencia.setAllotjament(nouAllotjament);
        incidencia.setDataIncidencia("2023-10-02");

        assertEquals(2, incidencia.getNumeroIncidencia());
        assertEquals("NETEJA", incidencia.getTipusIncidencia());
        assertEquals(nouAllotjament, incidencia.getAllotjament());
        assertEquals("2023-10-02", incidencia.getDataIncidencia());
    }

    @Test
    public void testGetIluminacioAllotjament() {
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);

        Incidencia incidenciaReparacio = new Incidencia(1, "REPARACIO", allotjament, "2023-10-01");
        assertEquals("100%", incidenciaReparacio.getIluminacioAllotjament());

        Incidencia incidenciaNeteja = new Incidencia(2, "NETEJA", allotjament, "2023-10-01");
        assertEquals("50%", incidenciaNeteja.getIluminacioAllotjament());

        Incidencia incidenciaTancament = new Incidencia(3, "TANCAMENT", allotjament, "2023-10-01");
        assertEquals("0%", incidenciaTancament.getIluminacioAllotjament());
    }

    @Test
    public void testToString() {
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);
        Incidencia incidencia = new Incidencia(1, "REPARACIO", allotjament, "2023-10-01");

        String expected = "Numero incidencia: 1 - Allotjament de la incidencia: Nom = Parcela Nord, Id = ALL1, Estat allotjament: true, Iluminacio = 100% - Tipus de la incidencia: REPARACIO - Data de la incidencia: 2023-10-01 - Iluminacio actual de l'allotjament: 100%";
        assertEquals(expected, incidencia.toString());
    }
}