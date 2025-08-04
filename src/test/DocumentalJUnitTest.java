package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import uni1a.Documental;
import modified.Investigador;
import util.DuracionInvalidaException;

public class DocumentalJUnitTest {

    @Test
    void testAgregarInvestigador() throws DuracionInvalidaException {
        Documental documental = new Documental("Planeta Tierra", 60, "Naturaleza", "Ecosistemas");
        Investigador investigador = new Investigador("Jane", "Goodall", "Primatóloga", "NatGeo", 50, "PhD");
        documental.agregarInvestigador(investigador);
        assertEquals(1, documental.getInvestigadores().size());
        assertTrue(documental.getInvestigadores().contains(investigador));
    }

    @Test
    void testEliminarInvestigador() throws DuracionInvalidaException {
        Documental documental = new Documental("Planeta Tierra", 60, "Naturaleza", "Ecosistemas");
        Investigador investigador = new Investigador("Jane", "Goodall", "Primatóloga", "NatGeo", 50, "PhD");
        documental.agregarInvestigador(investigador);
        documental.eliminarInvestigador(investigador);
        assertEquals(0, documental.getInvestigadores().size());
        assertFalse(documental.getInvestigadores().contains(investigador));
    }

    @Test
    void testGetTema() throws DuracionInvalidaException {
        Documental documental = new Documental("Océanos", 45, "Naturaleza", "Mar");
        assertEquals("Mar", documental.getTema());
    }

    @Test
    void testSetTema() throws DuracionInvalidaException {
        Documental documental = new Documental("Océanos", 45, "Naturaleza", "Mar");
        documental.setTema("Fondo marino");
        assertEquals("Fondo marino", documental.getTema());
    }

    @Test
    void testMultiplesInvestigadores() throws DuracionInvalidaException {
        Documental documental = new Documental("Espacio", 50, "Ciencia", "Astronomía");
        Investigador inv1 = new Investigador("Neil", "Tyson", "Astrofísico", "NASA", 40, "PhD");
        Investigador inv2 = new Investigador("Carl", "Sagan", "Divulgador", "Cornell", 45, "PhD");
        Investigador inv3 = new Investigador("Valentina", "Tereshkova", "Cosmonauta", "URSS", 30, "Ingeniería");
        
        documental.agregarInvestigador(inv1);
        documental.agregarInvestigador(inv2);
        documental.agregarInvestigador(inv3);
        
        assertEquals(3, documental.getInvestigadores().size());
        assertTrue(documental.getInvestigadores().contains(inv1));
        assertTrue(documental.getInvestigadores().contains(inv2));
        assertTrue(documental.getInvestigadores().contains(inv3));
    }
}