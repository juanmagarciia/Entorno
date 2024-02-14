package es.iessoterohernandez.daw.endes.Serie;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class VideojuegosTests {

    private Videojuego videojuego;
    
    @BeforeEach
    void iniciar() {
    	videojuego = new Videojuego("fortnite", 12, "pvp", "ubisoft");
    }

    @AfterEach
    void finalizar() {
    	videojuego = null;
    }
    
    
    @Test
    void testEntregar() {
        videojuego.entregar();
        assertTrue(videojuego.isEntregado());
    }

    @Test
    void testDevolver() {
        videojuego.devolver();
        assertFalse(videojuego.isEntregado());
    }

    @Test
    void testIsEntregado() {
        assertFalse(videojuego.isEntregado());
    }
}
