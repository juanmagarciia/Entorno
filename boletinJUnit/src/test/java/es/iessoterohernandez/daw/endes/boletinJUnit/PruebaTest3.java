package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PruebaTest3 {
Boa b;
	
	@BeforeEach
	void init() {
        b = new Boa("enroskada", 13, "granola bars");
	}
	
	@AfterEach
	void finish() {
		b = null;
	}
	
    void init(String name, int length, String favoriteFood) {
        b = new Boa(name, length, favoriteFood);
    }
	 
    @Test
    void testBoaCabe() {
    	assertTrue(b.fitsInCage(20));
    }
    
    @Test
    void testBoaNoCabe() {
    	assertFalse(b.fitsInCage(10));
    }
    
    @Test  
 
    void testBoaSana(String name, int length, String favoriteFood, boolean boaSana) {
    	init(name, length, favoriteFood);
    	assertEquals(b.isHealthy(), boaSana);
    }
}
