package es.iessoterohernandez.daw.endes.Persona;


import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class PersonaTest {

    private Persona persona;

    @BeforeEach
    void iniciar() {
    	persona = new Persona("Juanma", 18, 'H', 79, 1.69);
    }
    
    @AfterEach
    void finalizar() {
    	persona = null;
    }
    
    @Test
    void testpesoIdeal() {
    	assertThat(persona.calcularIMC(), is(Persona.PESO_IDEAL));
    }
    
    
    @Test
    void testmayorEdad() {
        assertTrue(persona.esMayorDeEdad());
    }

    @Test
    void testmenorEdad() {
    	persona.setEdad(9);
        assertFalse(persona.esMayorDeEdad());
    }
    
    
    

    
}