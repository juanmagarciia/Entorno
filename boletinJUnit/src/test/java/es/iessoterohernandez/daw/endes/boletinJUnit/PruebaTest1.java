package es.iessoterohernandez.daw.endes.boletinJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class PruebaTest1 {
	OperadorAritmetico o = new OperadorAritmetico();

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({"1, 2, 3", "-23, 23, 0", "-2147483648, 2147483647, -1"})
	void testSuma(int a, int b, int c) {
	    assertThat(OperadorAritmetico.suma(a, b), is(c));
	}

	
	void testDivision(int a, int b, int c) throws Exception {
		assertThat(OperadorAritmetico.division(a, b), is(c));
	}
	
	@ParameterizedTest(name = "{0} / 0 = NaN")
	@ValueSource(ints = {5, -10, Integer.MIN_VALUE})
	void testDivisionPorCero(int num) {
		assertThrows(Exception.class, () -> OperadorAritmetico.division(num, 0));
	}
	    Subscripcion s;
		
		@BeforeEach
		void init() {
			s = new Subscripcion(12, 12);
		}
		
		@AfterEach
		void finish() {
			s = null;
		}
		
		@Test
		void testPrecioEnteroPositivo() {
			assertEquals(s.precioPorMes(), 1);
		}
		
		
		@Test
		void testPrecioNoEntero() {
			s = new Subscripcion(1, 12);
			assertTrue(s.precioPorMes() > 0);
		}
		
		@Test
		void testCancelarSubscripcion() {
			s.cancel();
			assertEquals(s.precioPorMes(), 0);
		}

	}

