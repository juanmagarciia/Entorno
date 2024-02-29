package es.iessoterohernandez.daw.endes.JUnitCuenta_Tarjeta;

import java.util.Date;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCredito {
	 private Credito cr;

	    @BeforeEach
	    public void setUp() {
	        cr = new Credito("3225", "Juanma", new Date(), 2000.0);
	    }

	    @Test
	    public void testRetirarConCreditoSuficiente() throws Exception {
	        cr.retirar(700.0);

	        assertEquals(35.0, cr.getSaldo());
	        assertEquals(1965.0, cr.getCreditoDisponible());
	    }

	    @Test
	    public void testRetirarConCreditoInsuficiente() {
	        assertThrows(Exception.class, () -> cr.retirar(2000.0));
	    }

	    @Test
	    public void testIngresar() throws Exception {
	        cr.ingresar(1200.0);

	        assertEquals(400.0, cr.getSaldo());
	        assertEquals(1200.0, cr.getCreditoDisponible());
	    }

	    @Test
	    public void testPagoEnEstablecimiento() throws Exception {
	        cr.pagoEnEstablecimiento("Local", 300.0);

	        assertEquals(300.0, cr.getSaldo());
	        assertEquals(1700.0, cr.getCreditoDisponible());
	    }

	    @Test
	    public void testLiquidarConMovimientos() {
	        cr.liquidar(4, 2024);
	        assertEquals(2000.0, cr.getCreditoDisponible());
	    }

	    @Test
	    public void testLiquidarSinMovimientos() {
	        cr.liquidar(5, 2024);

	        assertEquals(2000.0, cr.getCreditoDisponible());
	    }

	
}
