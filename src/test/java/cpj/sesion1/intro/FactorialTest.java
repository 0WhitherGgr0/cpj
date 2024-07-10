package cpj.sesion1.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialSimpleTest {
	@Test
	void testFactorialConNumerosPequeños() {
		
	assertEquals(1, Factorial.factorial(1));
	assertEquals(2, Factorial.factorial(2));
	assertEquals(6, Factorial.factorial(3));
	assertEquals(24, Factorial.factorial(4));
	assertEquals(120, Factorial.factorial(5));
	
	}
	
	@Test
	void testFactorialConNumerosMedianos() {
		
	assertEquals(1307674368000L, Factorial.factorial(19));
	assertEquals(2432902008176640000L, Factorial.factorial(20));
	
	}
	
	@Test
	void testFactorialConNumerosQueExcedeAlRangoPermitido() {
		
	assertThrows(RuntimeException.class, () -> Factorial.factorial(21));
	}
}
