package prog2.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class AllotjamentTest {

    @Test
    public void testConstructorIGetters() {
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);

        assertEquals("Parcela Nord", allotjament.getNom());
        assertEquals("ALL1", allotjament.getId());
        assertTrue(allotjament.getEstatAllotjament());
        assertEquals("100%", allotjament.getIluminacio());
    }

    @Test
    public void testSetters() {
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);

        allotjament.setNom("Parcela Nord Modificada");
        allotjament.setId("ALL2");
        allotjament.setEstatAllotjament(false);
        allotjament.setIluminacio("50%");

        assertEquals("Parcela Nord Modificada", allotjament.getNom());
        assertEquals("ALL2", allotjament.getId());
        assertFalse(allotjament.getEstatAllotjament());
        assertEquals("50%", allotjament.getIluminacio());
    }

    @Test
    public void testObrirAllotjament() {
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", false, "0%", 64, true);

        allotjament.obrirAllotjament();

        assertTrue(allotjament.getEstatAllotjament());
        assertEquals("100%", allotjament.getIluminacio());
    }

    @Test
    public void testToString() {
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);

        String expected = "Nom = Parcela Nord, Id = ALL1, Estat allotjament: true, Iluminacio = 100%";
        assertEquals(expected, allotjament.toString());
    }
}