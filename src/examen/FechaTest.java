package examen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FechaTest {
	Fecha miTest= new Fecha();

	@Test
	void test() {
		assertFalse(miTest.validarFecha(2004,7,-5));
		
	}
	@Test
	void test1() {
		assertFalse(miTest.validarFecha(2004,4,40));
	}
	
	@Test
	void test2() {
		assertTrue(miTest.validarFecha(2004,2,12));
	}
  
	@Test
	void test3() {
		assertTrue(miTest.validarFecha(2004,5,31));
	}
	/*void test4() {
		assertFalse(miTest.validarFecha(30,2,2004));
	}*/
	  

}
