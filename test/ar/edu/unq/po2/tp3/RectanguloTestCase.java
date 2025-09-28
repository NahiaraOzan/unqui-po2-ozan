package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	Rectangulo rectangulo;

	@BeforeEach
	public void setUp() throws Exception {
		
		Punto punto1 = new Punto(5,3);
		Punto punto2 = new Punto(12,8);
		rectangulo = new Rectangulo(punto1, punto2);
				
	}
	
	@Test
	public void testArea() {
			
		float area = rectangulo.area();
		assertEquals(35, area);
	}
	
	@Test 
	public void testPerimetro() {
			
		float perimetro = rectangulo.perimetro();
		assertEquals(24, perimetro);
	}
	
	@Test 
	public void testEsHorizontal() {
			
		boolean esHorizontal = rectangulo.esHorizontal();
		assertTrue(esHorizontal);
	}
	
	@Test 
	public void testEsVertical() {
			
		boolean esVertical = rectangulo.esVertical();
		assertFalse(esVertical);
	}
	
}
