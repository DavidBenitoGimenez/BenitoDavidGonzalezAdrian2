package prog2.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import prog2.vista.ExcepcioCamping;
import java.util.ArrayList;

public class LlistaAccessosTest {

    @Test
    public void testAfegirAcces() throws ExcepcioCamping {
        LlistaAccessos llista = new LlistaAccessos(new ArrayList<>());
        Acces acces = new CamiAsfaltat("A1", true, 200);

        llista.afegirAcces(acces);
        assertEquals(1, llista.calculaAccessosAccessibles());
    }

    @Test
    public void testBuidar() throws ExcepcioCamping {
        LlistaAccessos llista = new LlistaAccessos(new ArrayList<>());
        llista.afegirAcces(new CamiAsfaltat("A1", false, 200));

        llista.buidar();
        assertEquals(0, llista.calculaAccessosAccessibles());
    }

    @Test
    public void testLlistarAccessos() throws ExcepcioCamping {
        LlistaAccessos llista = new LlistaAccessos(new ArrayList<>());
        llista.afegirAcces(new CamiAsfaltat("A1", false, 200));
        llista.afegirAcces(new CarreteraAsfaltada("A2", true, 800, 10000));

        String resultat = llista.llistarAccessos(true);
        assertTrue(resultat.contains("A1") && resultat.contains("A2"));
    }

    @Test
    public void testActualitzaEstatAccessos() throws ExcepcioCamping {
        LlistaAccessos llista = new LlistaAccessos(new ArrayList<>());
        Acces acces = new CamiAsfaltat("A1", false,200);
        llista.afegirAcces(acces);

        llista.actualitzaEstatAccessos();
        assertFalse(acces.isEstat());
    }

    @Test
    public void testCalculaAccessosAccessibles() throws ExcepcioCamping {
        LlistaAccessos llista = new LlistaAccessos(new ArrayList<>());
        llista.afegirAcces(new CamiAsfaltat("A1", false, 200));
        llista.afegirAcces(new CarreteraAsfaltada("A2", true, 800, 10000));

        assertEquals(1, llista.calculaAccessosAccessibles());
    }

    @Test
    public void testCalculaMetresQuadratsAsfalt() throws ExcepcioCamping {
        LlistaAccessos llista = new LlistaAccessos(new ArrayList<>());
        llista.afegirAcces(new CamiAsfaltat("A1", false, 200));
        llista.afegirAcces(new CarreteraAsfaltada("A2", true, 800, 10000));

        assertEquals(1000, llista.calculaMetresQuadratsAsfalt());
    }
}