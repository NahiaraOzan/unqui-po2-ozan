package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTestCase {
	
	Cuadrado cuadrado;

	@BeforeEach
	public void setUp() throws Exception {
		
		Punto punto1 = new Punto(5,3);
		cuadrado = new Cuadrado(punto1, 5);			
	}
	
	@Test
	public void testArea() {
			
		float area = cuadrado.area();
		assertEquals(25, area);
	}
	
	@Test 
	public void testPerimetro() {
			
		float perimetro = cuadrado.perimetro();
		assertEquals(20, perimetro);
	}
	
	@Test 
	public void testEsHorizontal() {
		assertFalse(cuadrado.esHorizontal());
	}
	
	@Test 
	public void testEsVertical() {
		assertFalse(cuadrado.esVertical());
	}
	
}