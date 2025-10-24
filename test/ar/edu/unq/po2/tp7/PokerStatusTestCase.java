package ar.edu.unq.po2.tp7;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;

class PokerStatusTestCase {
	private Carta dosDePicas;
	private Carta dosDeCorazones;
	private Carta dosDeDiamantes;
	private Carta dosDeTreboles;
	private Carta tresDeTreboles;
	private Carta cincoDePicas;
	private Carta diezDeCorazones;
	private Carta cincoDeCorazones;
	private Carta cuatroDePicas;
	private Carta unoDeTreboles;
	private Carta cuatroDeTreboles;
	private Carta cincoDeTreboles;
	private Carta unoDePicas;
	private Carta unoDeDiamantes;
	
	private PokerStatus manoDePoker;
	
	/*
	@BeforeEach
	public void setUp() {
		manoDePoker = new PokerStatus();		
	}
	
	@Test
	void testVerificarPoker() {
		// Setup
		dosDePicas = new Carta (2, "pica");
		dosDeCorazones = new Carta (2, "corazon");
		dosDeDiamantes = new Carta (2, "diamante");
		dosDeTreboles = new Carta (2, "trebol");
		tresDeTreboles = new Carta (3, "trebol");
		
		// Exercise
		String resultado = manoDePoker.verificar(dosDePicas, dosDeCorazones, dosDeDiamantes, dosDeTreboles, tresDeTreboles);
		
		// Verify
		assertEquals(resultado ,"poquer");
		
		// Teardown (no necesario en este caso)	
	}
	
	@Test
	void testVerificarColor() {
		// Setup
		unoDeTreboles = new Carta (1, "trebol");
		dosDeTreboles = new Carta (2, "trebol");
		tresDeTreboles = new Carta (3, "trebol");
		cuatroDeTreboles = new Carta (4, "trebol");
		cincoDeTreboles = new Carta (5, "trebol");
		
		// Exercise
		String resultado = manoDePoker.verificar(unoDeTreboles, dosDeTreboles, tresDeTreboles, cuatroDeTreboles, cincoDeTreboles);
		
		// Verify
		assertEquals(resultado ,"color");
		
		// Teardown (no necesario en este caso)	
	}
	
	@Test
	void testVerificarTrio() {
		// Setup
		unoDePicas = new Carta (1, "pica");
		dosDeCorazones = new Carta (2, "corazon");
		unoDeDiamantes = new Carta (1, "diamante");
		dosDeTreboles = new Carta (2, "trebol");
		tresDeTreboles = new Carta (2, "trebol");
		
		// Exercise
		String resultado = manoDePoker.verificar(unoDePicas, dosDeCorazones, unoDeDiamantes, dosDeTreboles, tresDeTreboles);
		
		// Verify
		assertEquals(resultado ,"trio");
		
		// Teardown (no necesario en este caso)	
	}
	
	@Test
	void testVerificarFalse() {
		
		// Setup
		dosDePicas = new Carta (2, "pica");
		dosDeCorazones = new Carta (2, "corazon");
		dosDeDiamantes = new Carta (2, "diamante");
		cincoDePicas = new Carta (5, "pica");
		tresDeTreboles = new Carta (2, "trebol");
		
		// Exercise
		String resultado = manoDePoker.verificar(dosDePicas, dosDeCorazones, dosDeDiamantes, cincoDePicas, tresDeTreboles);
		
		// Verify
		assertEquals(resultado ,"poquer");
		
		// Teardown (no necesario en este caso)
	}
	
	@Test 
	void testComparar() {
		// Setup
		diezDeCorazones = new Carta (10, "corazon");
		dosDePicas = new Carta (2, "pica");
		
		// Exercise
		Carta resultado = manoDePoker.comparar(diezDeCorazones, dosDePicas);
		
		// Verify
		assertEquals(resultado , diezDeCorazones);
		
		// Teardown (no necesario en este caso)
		
	}
	
	@Test 
	void testAlgunaEsSuperiorYSonDelMismoPaloVerdadero() {
		// Setup
		cincoDeCorazones = new Carta (5, "corazon");
		dosDePicas = new Carta (2, "corazon");
		
		// Exercise
		boolean resultado = manoDePoker.algunaEsSuperiorYSonDelMismoPalo(cincoDeCorazones, dosDePicas);
		
		// Verify
		assertTrue(resultado);
		
		// Teardown (no necesario en este caso)
	}
	
	@Test 
	void testAlgunaEsSuperiorYSonDelMismoPaloFalsoUno() {
		// Setup
		cuatroDePicas = new Carta (4, "pica");
		dosDeCorazones = new Carta (2, "corazon");
				
		// Exercise
		boolean resultado = manoDePoker.algunaEsSuperiorYSonDelMismoPalo(cuatroDePicas, dosDeCorazones);
				
		// Verify
		assertFalse(resultado);
				
		// Teardown (no necesario en este caso)
	}
	
	@Test 
	void testAlgunaEsSuperiorYSonDelMismoPaloFalsoDos() {
		// Setup
		cuatroDePicas = new Carta (2, "pica");
		dosDeCorazones = new Carta (2, "corazon");
				
		// Exercise
		boolean resultado = manoDePoker.algunaEsSuperiorYSonDelMismoPalo(cuatroDePicas, dosDeCorazones);
				
		// Verify
		assertFalse(resultado);
				
		// Teardown (no necesario en este caso)
	}
	*/
	@Test
	void testVerificarPokerConMockito() {
		Carta carta1 = mock(Carta.class);
	    Carta carta2 = mock(Carta.class);
	    Carta carta3 = mock(Carta.class);
	    Carta carta4 = mock(Carta.class);
	    Carta carta5 = mock(Carta.class);
		
		when(carta1.getValor()).thenReturn(2);
	    when(carta2.getValor()).thenReturn(2);
	    when(carta3.getValor()).thenReturn(2);
	    when(carta4.getValor()).thenReturn(2);
	    when(carta5.getValor()).thenReturn(3);
	    
	    when(carta1.getPalo()).thenReturn("pica");
	    when(carta2.getPalo()).thenReturn("corazon");
	    when(carta3.getPalo()).thenReturn("diamante");
	    when(carta4.getPalo()).thenReturn("trebol");
	    when(carta5.getPalo()).thenReturn("trebol");
	    
	    PokerStatus manoDePoker = new PokerStatus();
		String resultado = manoDePoker.verificar(carta1, carta2, carta3, carta4, carta5);
		
		assertEquals("poquer", resultado);
	}
	
	@Test
    void testVerificarColorConMockito() {
        // Setup
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);

        when(carta1.getValor()).thenReturn(1);
        when(carta2.getValor()).thenReturn(2);
        when(carta3.getValor()).thenReturn(3);
        when(carta4.getValor()).thenReturn(4);
        when(carta5.getValor()).thenReturn(5);

        when(carta1.getPalo()).thenReturn("corazon");
        when(carta2.getPalo()).thenReturn("corazon");
        when(carta3.getPalo()).thenReturn("corazon");
        when(carta4.getPalo()).thenReturn("corazon");
        when(carta5.getPalo()).thenReturn("corazon");

        PokerStatus manoDePoker = new PokerStatus();

        // Exercise
        String resultado = manoDePoker.verificar(carta1, carta2, carta3, carta4, carta5);

        // Verify
        assertEquals("color", resultado);
    }
    
    @Test
    void testVerificarTrioConMockito() {
        // Setup
        Carta carta1 = mock(Carta.class);
        Carta carta2 = mock(Carta.class);
        Carta carta3 = mock(Carta.class);
        Carta carta4 = mock(Carta.class);
        Carta carta5 = mock(Carta.class);

        when(carta1.getValor()).thenReturn(1);
        when(carta2.getValor()).thenReturn(3);
        when(carta3.getValor()).thenReturn(3);
        when(carta4.getValor()).thenReturn(4);
        when(carta5.getValor()).thenReturn(3);

        when(carta1.getPalo()).thenReturn("pica");
        when(carta2.getPalo()).thenReturn("corazon");
        when(carta3.getPalo()).thenReturn("diamante");
        when(carta4.getPalo()).thenReturn("corazon");
        when(carta5.getPalo()).thenReturn("trebol");

        PokerStatus manoDePoker = new PokerStatus();

        // Exercise
        String resultado = manoDePoker.verificar(carta1, carta2, carta3, carta4, carta5);

        // Verify
        assertEquals("trio", resultado);
    }

}
