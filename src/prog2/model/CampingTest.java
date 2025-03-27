package prog2.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import prog2.vista.ExcepcioCamping;
import java.io.File;
import java.util.ArrayList;

class CampingTest {

    @Test
    void testConstructorIGetters() {
        Camping camping = new Camping("Camping Green");

        assertEquals("Camping Green", camping.getNomCamping());
        assertNotNull(camping.getLlistaAllotjaments());
        assertNotNull(camping.getLlistaAccessos());
        assertNotNull(camping.getLlistaIncidencies());
    }

    @Test
    void testSetters() {
        Camping camping = new Camping("Camping Green");

        camping.setNomCamping("Camping Blue");
        assertEquals("Camping Blue", camping.getNomCamping());

        LlistaAllotjaments novaLlistaAllotjaments = new LlistaAllotjaments();
        camping.setLlistaAllotjaments(novaLlistaAllotjaments);
        assertEquals(novaLlistaAllotjaments, camping.getLlistaAllotjaments());
    }

    @Test
    void testLlistarAllotjaments() throws ExcepcioCamping {
        Camping camping = new Camping("Camping Green");
        camping.inicialitzaDadesCamping();

        String resultat = camping.llistarAllotjaments();
        assertTrue(resultat.contains("ALL1") && resultat.contains("ALL6"));
    }

    @Test
    void testLlistarAccessos() throws ExcepcioCamping {
        Camping camping = new Camping("Camping Green");
        camping.inicialitzaDadesCamping();

        String resultat = camping.llistarAccessos("Obert");
        assertTrue(resultat.contains("A1") && resultat.contains("A12"));
    }

    @Test
    void testAfegirIncidencia() throws ExcepcioCamping {
        Camping camping = new Camping("Camping Green");
        camping.inicialitzaDadesCamping();

        camping.afegirIncidencia(1, "Reparacio", "ALL1", "2023-10-01");
        String resultat = camping.llistarIncidencies();
        assertTrue(resultat.contains("ALL1") && resultat.contains("Reparacio"));
    }

    @Test
    void testEliminarIncidencia() throws ExcepcioCamping {
        Camping camping = new Camping("Camping Green");
        camping.inicialitzaDadesCamping();
        camping.afegirIncidencia(1, "Reparacio", "ALL1", "2023-10-01");

        camping.eliminarIncidencia(1);
        assertThrows(ExcepcioCamping.class, () -> camping.llistarIncidencies());
    }

    @Test
    void testCalculaAccessosAccessibles() throws ExcepcioCamping {
        Camping camping = new Camping("Camping Green");
        camping.inicialitzaDadesCamping();

        assertEquals(6, camping.calculaAccessosAccessibles());
    }

    @Test
    void testCalculaMetresQuadratsAsfalt() throws ExcepcioCamping {
        Camping camping = new Camping("Camping Green");
        camping.inicialitzaDadesCamping();

        assertEquals(3050, camping.calculaMetresQuadratsAsfalt());
    }

    @Test
    void testInicialitzaDadesCamping() throws ExcepcioCamping {
        Camping camping = new Camping("Camping Green");
        camping.inicialitzaDadesCamping();

        assertEquals(6, camping.getLlistaAllotjaments().llistarAllotjaments().split("\n").length);
        assertEquals(12, camping.getLlistaAccessos().llistarAccessos(true).split("\n").length);
    }
}