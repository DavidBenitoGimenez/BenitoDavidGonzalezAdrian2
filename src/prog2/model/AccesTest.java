package prog2.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AccesTest {

    @Test
    public void testConstructorIGetters() {
        Acces acces = new CamiAsfaltat("A1", false, 200);

        assertEquals("A1", acces.getNom());
        assertFalse(acces.isAccessibilitat());
        assertTrue(acces.isEstat());
        assertTrue(acces.getLlistaAllotjaments().isEmpty());
    }

    @Test
    public void testSetters() {
        Acces acces = new CamiAsfaltat("A1", false, 200);

        acces.setNom("A1-MOD");
        acces.setAccesibilitat(true);
        acces.setEstat(false);

        assertEquals("A1-MOD", acces.getNom());
        assertTrue(acces.isAccessibilitat());
        assertFalse(acces.isEstat());
    }

    @Test
    public void testAfegirAllotjament() {
        Acces acces = new CamiAsfaltat("A1", false, 200);
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);

        acces.afegirAllotjament(allotjament);

        assertEquals(1, acces.getLlistaAllotjaments().size());
        assertEquals(allotjament, acces.getLlistaAllotjaments().get(0));
    }

    @Test
    public void testTancarIObrirAcces() {
        Acces acces = new CamiAsfaltat("A1", false, 200);

        acces.tancarAcces();
        assertFalse(acces.isEstat());

        acces.obrirAcces();
        assertTrue(acces.isEstat());
    }
}