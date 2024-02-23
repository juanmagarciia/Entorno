package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PruebaTest4 {
	Fridge f;
	String comida = "hamburguesa";
	
	@BeforeEach
	void init() {
		f = new Fridge();
		f.put(comida);
	}
	
	@AfterEach
	void finish() {
		f = null;
	}
	
	@Test
	void testAnadirVariosAlimentos(String alimento) {
		assertTrue(f.put(alimento));
	}
	
	@Test
	void testAlimento() {
		assertFalse(f.put(comida));
	}
	
	@Test
	void testBuscarAlimentoAusente() throws NoSuchItemException {
		f.take(comida);
		assertFalse(f.contains(comida));
	}
	
	@Test
    public void testSacarAlimentoAusente() throws NoSuchItemException {
		f.take(comida);
        assertThrows(NoSuchItemException.class, () -> f.take(comida));
    }
}
