package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTestCase {
	
	Punto punto1;
	Punto punto2;
	
	@BeforeEach
	
	public void setUp() throws Exception {
		punto1 = new Punto(3,8);
		punto2 = new Punto();
	}
	
	

	@Test
	void testMover() {
		Punto nuevoPunto = new Punto(5,2);
		punto1.moverHacia(5,2);
		
		assertEquals(nuevoPunto.getX(), punto1.getX());
		assertEquals(nuevoPunto.getY(), punto1.getY());
	}
	
	@Test
	void testSumarPuntos() {
		Punto puntoASumar = new Punto(3,2);
		punto1.sumarPuntos(puntoASumar);
		
		assertEquals(6, punto1.getX());
		assertEquals(10, punto1.getY());
	}

}
