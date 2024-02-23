package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PruebaTest6 {
	private Account a;



    @BeforeEach

    public void setUp() {

        a = new Account("Lucas", 123456, 1000.0f);

    }




    @Test

    public void TestDepositarCantidadValida() {

        assertTrue(a.deposit(500.0f));

        assertEquals(1500.0f, a.getBalance());

    }



    @Test

    public void TestDepositarCantidadNegativa() {

        assertFalse(a.deposit(-500.0f));

        assertEquals(1000.0f, a.getBalance());

    }



    @Test

    public void TestRetirar() {

        assertTrue(a.withdraw(500.0f, 0.0f));

        assertEquals(500.0f, a.getBalance());

        assertFalse(a.withdraw(-500.0f, 0.0f));

        assertFalse(a.withdraw(1500.0f, 0.0f));

        assertEquals(1000.0f, a.getBalance());

        assertFalse(a.withdraw(-500.0f, 20.0f));

    }



    @Test

    public void TestAñadirInteres() {

        a.addInterest();

        assertEquals(1045.0f, a.getBalance(), 0.001);

    }



    @Test

    public void testConstructor() {

        assertEquals("Lucas", a.name);

        assertEquals(123456, a.getAccountNumber());

        assertEquals(1000.0f, a.getBalance());

    }



    @Test

    public void TestRetirarCantidadInvalida() {

        assertFalse(a.withdraw(-500.0f, 20.0f));

        assertEquals(1000.0f, a.getBalance());

    }



    @Test

    public void TestRetirarSaldo() {

        assertFalse(a.withdraw(1500.0f, 20.0f));

        assertEquals(1000.0f, a.getBalance());

    }

    @Test

    public void testToString() {

        assertEquals("123456\tLucas\t$1,000.00", a.toString());

    }

}

   



