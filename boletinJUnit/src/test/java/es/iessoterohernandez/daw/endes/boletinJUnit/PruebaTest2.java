package es.iessoterohernandez.daw.endes.boletinJUnit;



import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.is;


public class PruebaTest2 {

	public Pila p;
	
	@BeforeEach
	void init() {
		p = new Pila();
	}
	
	@AfterEach
	void finish() {
		p = null;
	}
	
	@Test
	void testQuitarPilaVacia() {
		assertThat(p.pop(), nullValue());
	}
	
	@Test
	void testUltimoPilaVacia() {
		assertThat(p.top(), nullValue());
	}
	@Test
	void testPilaVacia() {
		assertTrue(p.isEmpty());
	}
	
	@Test
	void testPilaNoVacia() {
		int n=10;
		p.push(n);
		assertThat(p.pop(), is(n));
	}
	
	@Test
	void testUltimoDePilaNoVacia() {
		int n=10;
		p.push(n);
		assertThat(p.top(), is(n));
	}
}
