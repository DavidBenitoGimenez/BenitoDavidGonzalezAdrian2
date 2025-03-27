package prog2.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;

public class LlistaIncidenciesTest {

    @Test
    public void testAfegirIncidencia() throws ExcepcioCamping {
        LlistaIncidencies llista = new LlistaIncidencies(new ArrayList<>());
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);

        llista.afegirIncidencia(1, "Reparacio", allotjament, "2023-10-01");
        assertEquals(1, llista.llistarIncidencies().split("\n").length);
        assertEquals("100%", allotjament.getIluminacio());
    }

    @Test
    public void testEliminarIncidencia() throws ExcepcioCamping {
        LlistaIncidencies llista = new LlistaIncidencies(new ArrayList<>());
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);
        llista.afegirIncidencia(1, "Reparacio", allotjament, "2023-10-01");

        Incidencia incidencia = llista.getIncidencia(1);
        llista.eliminarIncidencia(incidencia);
        assertThrows(ExcepcioCamping.class, () -> llista.llistarIncidencies());
    }

    @Test
    public void testLlistarIncidencies() throws ExcepcioCamping {
        LlistaIncidencies llista = new LlistaIncidencies(new ArrayList<>());
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);
        llista.afegirIncidencia(1, "Reparacio", allotjament, "2023-10-01");

        String resultat = llista.llistarIncidencies();
        assertTrue(resultat.contains("ALL1") && resultat.contains("Reparacio"));
    }

    @Test
    public void testGetIncidencia() throws ExcepcioCamping {
        LlistaIncidencies llista = new LlistaIncidencies(new ArrayList<>());
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);
        llista.afegirIncidencia(1, "Reparacio", allotjament, "2023-10-01");

        Incidencia incidencia = llista.getIncidencia(1);
        assertEquals(1, incidencia.getNumeroIncidencia());
    }

    @Test
    public void testIncidenciaNoExistent() {
        LlistaIncidencies llista = new LlistaIncidencies(new ArrayList<>());
        assertThrows(ExcepcioCamping.class, () -> llista.getIncidencia(1));
    }
}