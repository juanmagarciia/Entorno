package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PruebaTest7 {
	Account a;



	@BeforeEach

	void init() {
		a = new Account("Lucas", 123456789101112L, 820F);

	}
	
	@AfterEach
	
	void finish() {
		a = null;
	}
	
	@Test
	public void testPruebaFalloDecimal() {

		float balance = a.getBalance();
		for (int i = 0; i < 100; i++) {
			balance += 0.23F;
		}
		assertNotEquals(balance, 773F);
		assertEquals(balance, 772.99805F);
	}

}

