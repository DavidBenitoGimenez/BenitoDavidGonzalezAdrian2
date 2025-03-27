package prog2.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;

public class LlistaAllotjamentsTest {

    @Test
    public void testAfegirAllotjament() throws ExcepcioCamping {
        LlistaAllotjaments llista = new LlistaAllotjaments();
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);

        llista.afegirAllotjament(allotjament);
        assertEquals(1, llista.llistarAllotjaments().split("\n").length);
    }

    @Test
    public void testBuidar() throws ExcepcioCamping {
        LlistaAllotjaments llista = new LlistaAllotjaments();
        llista.afegirAllotjament(new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true));

        llista.buidar();
        assertThrows(ExcepcioCamping.class, () -> llista.llistarAllotjaments());
    }

    @Test
    public void testLlistarAllotjaments() throws ExcepcioCamping {
        LlistaAllotjaments llista = new LlistaAllotjaments();
        llista.afegirAllotjament(new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true));

        String resultat = llista.llistarAllotjaments();
        assertTrue(resultat.contains("ALL1"));
    }

    @Test
    public void testLlistarAllotjamentsPerEstat() throws ExcepcioCamping {
        LlistaAllotjaments llista = new LlistaAllotjaments();
        llista.afegirAllotjament(new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true));

        String resultat = llista.llistarAllotjaments("Obert");
        assertTrue(resultat.contains("ALL1"));
    }

    @Test
    public void testContainsAllotjamentOperatiu() throws ExcepcioCamping {
        LlistaAllotjaments llista = new LlistaAllotjaments();
        llista.afegirAllotjament(new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true));

        assertTrue(llista.containsAllotjamentOperatiu());
    }

    @Test
    public void testGetAllotjament() throws ExcepcioCamping {
        LlistaAllotjaments llista = new LlistaAllotjaments();
        Allotjament allotjament = new Parcela("Parcela Nord", "ALL1", true, "100%", 64, true);
        llista.afegirAllotjament(allotjament);

        assertEquals(allotjament, llista.getAllotjament("ALL1"));
    }
}