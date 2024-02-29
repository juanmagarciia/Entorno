package es.iessoterohernandez.daw.endes.JUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDebito {
	private Debito d;
    private Cuenta c;

    @BeforeEach
    public void setUp() {
        c = new Cuenta("3334", "TitularCuenta");
        d = new Debito("6345", "TitularTarjeta", new Date());
        d.setCuenta(c);
    }
    
    @AfterEach
    public void tearDown() {
    	c = null;
    	d = null;	
    }

    @Test
    public void testRetirar() throws Exception {
        c.ingresar(800.0);
        d.retirar(500.0);
        assertEquals(300.0, c.getSaldo(), 0.01);
    }

    @Test
    public void testIngresar() throws Exception {
        d.ingresar(900.0);
        assertEquals(100.0, c.getSaldo(), 0.01);
    }

    @Test
    public void testPagoEnEstablecimiento() throws Exception {
        c.ingresar(200.0);
        d.pagoEnEstablecimiento("Tienda", 100.0);
        assertEquals(100.0, c.getSaldo());
    }

    @Test
    public void testGetSaldo() throws Exception {
        c.ingresar(100.0);
        assertEquals(100.0, d.getSaldo());
    }

    @Test
    public void testSetCuenta() {
        Cuenta nuevaCuenta = new Cuenta("1232", "NuevoTitular");
        d.setCuenta(nuevaCuenta);
        assertEquals(nuevaCuenta.getSaldo(), d.getSaldo());
    }
}
