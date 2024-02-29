package es.iessoterohernandez.daw.endes.JUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 class TestMovimiento {
	  private Movimiento M;

		    @BeforeEach
		     void setUp() throws Exception {
		    	M = new Movimiento();

		    }
		    	
    	  
	    	@Test
	 	     void testGetImporte() {
	 	        assertEquals(0.0, M.getImporte(), 0.001);
	 	    }
	    	   @Test
		 	     void testGetFecha() {
		 	        assertNotNull(M.getFecha());
		 	    }

	 	    @Test
	 	     void testGetConcepto() {
	 	        assertNull(M.getConcepto());
	 	    }

	 	    @Test
	 	     void testSetConcepto() {
	 	        M.setConcepto("Compra");
	 	        assertEquals("Compra", M.getConcepto());
	 	    }

	 	 

	 	    @Test
	 	     void testSetFecha() {
	 	        Date fecha = new Date();
	 	        M.setFecha(fecha);
	 	        assertEquals(fecha, M.getFecha());
	 	    }

	 	    @Test
	 	     void testSetImporte() {
	 	        M.setImporte(90.0);
	 	        assertEquals(90.0, M.getImporte(), 0.001);
	 	    
	    }
	    } 

	    

	   

