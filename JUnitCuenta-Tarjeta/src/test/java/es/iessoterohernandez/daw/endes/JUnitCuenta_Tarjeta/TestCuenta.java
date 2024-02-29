package es.iessoterohernandez.daw.endes.JUnitCuenta_Tarjeta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCuenta {
	private Cuenta c;

    @BeforeEach
     void setUp() throws Exception {
        c = new Cuenta("23", "Juanma");
    }

    @Test
     void testIngresar() throws Exception {
        c.ingresar(70.0);
        assertEquals(70.0, c.getSaldo());
    }

    @Test
     void testIngresarCantidadNegativa() throws Exception {
        try {
            c.ingresar(-30.0);
        } catch (Exception ex) {
            assertEquals("No se puede ingresar una cantidad negativa", ex.getMessage());
            throw ex;
        }
    }

    @Test
     void testRetirar() throws Exception {
        c.ingresar(400.0);
        c.retirar(120.0);
        assertEquals(280.0, c.getSaldo());
    }

    @Test
     void testRetirarCantidadNegativa() throws Exception {
        try {
            c.retirar(-70.0);
        } catch (Exception ex) {
            assertEquals("No se puede retirar una cantidad negativa", ex.getMessage());
            throw ex;
        }
    }

    @Test
     void testRetirarSaldoInsuficiente() throws Exception {
        try {
            c.retirar(40.0);
        } catch (Exception ex) {
            assertEquals("Saldo insuficiente", ex.getMessage());
            throw ex;
        }
    }

    @Test
     void testIngresarConConcepto() throws Exception {
        c.ingresar("Venta", 150.0);
        assertEquals(150.0, c.getSaldo());
    }

    @Test
     void testRetirarConConcepto() throws Exception {
        c.ingresar(1000.0);
        c.retirar("Compra", 70.0);
        assertEquals(930.0, c.getSaldo());
    }
    
}
