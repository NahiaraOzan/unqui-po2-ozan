package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CounterTestCase {
	private Counter counter;
	/**
	 * Crea un escenario de test básico, que consiste en un contador
	 * con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		
		//Se agregan los numeros. Un solo par y nueve impares
		counter.agregarNumero(1);
		counter.agregarNumero(3);
		counter.agregarNumero(5);
		counter.agregarNumero(7);
		counter.agregarNumero(9);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(4);
	}
	/** 
	 * Verifica la cantidad de pares
	 */
	@Test
	public void testOddNumbers() {
		
			int amount = counter.contarImpares();	
			assertEquals(amount, 9);
	}
	
	@Test
	public void testEvenNumbers() {
	        int amount = counter.contarPares();
	        assertEquals(1, amount);
	}

	 @Test
	 public void testMultiplesOf3() {
	        int amount = counter.contarMultiplosDe(3);
	        assertEquals(2, amount); // 3 y 9
	 }
	 
	 @Test
	 public void testElDeMasDigitosPares() {
	     int[] numeros = {248, 135, 120};

	     assertEquals(248, counter.elDeMasDigitosPares(numeros));
	 }
	
	 
	
}
