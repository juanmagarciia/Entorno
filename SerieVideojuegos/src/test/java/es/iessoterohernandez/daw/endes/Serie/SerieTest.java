package es.iessoterohernandez.daw.endes.Serie;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class SerieTest {
	private Serie serie;

    @BeforeEach
    void iniciar() {
        serie = new Serie("aida", 5, "comedia", "pacoleon");
    }

    @AfterEach
    void finalizar() {
        serie = null;
    }

    @Test
    void testEntregar() {
        serie.entregar();
        assertTrue(serie.isEntregado());
    }

    @Test
    void testDevolver() {
        serie.devolver();
        assertFalse(serie.isEntregado());
    }

  

	
}


