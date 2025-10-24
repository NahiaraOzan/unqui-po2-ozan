package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonajeTestCase {


private ByteArrayOutputStream output;

@BeforeEach
public void setUp() {
    // Capturamos la salida de consola para verificar los mensajes
    output = new ByteArrayOutputStream();
    System.setOut(new PrintStream(output));
}

@Test
public void testIngenieroCaminaYColocaLajas() {
    PersonajeIngenieroLeaf ing = new PersonajeIngenieroLeaf(2);
    Punto inicio = new Punto(0, 0);
    Punto fin = new Punto(2, 0); // distancia 2

    ing.caminar(inicio, fin);

    String salida = output.toString();
    assertTrue(salida.contains("Ingeniero camina en línea recta"));
    assertTrue(salida.contains("Coloca una laja"));
    assertTrue(salida.contains("Sin lajas") || salida.contains("continúa caminando"));
}

@Test
public void testCaballeroCaminaEnZigZag() {
    PersonajeCaballeroLeaf cab = new PersonajeCaballeroLeaf();
    Punto inicio = new Punto(0, 0);
    Punto fin = new Punto(3, 4);

    cab.caminar(inicio, fin);

    String salida = output.toString();
    assertTrue(salida.contains("Caballero avanza en zigzag"));
    assertTrue(salida.contains("vigilando la zona"));
}

@Test
public void testEjercitoCaminaYCoordinaMiembros() {
	PersonajeIngenieroLeaf ing = new PersonajeIngenieroLeaf(1);
    PersonajeCaballeroLeaf cab = new PersonajeCaballeroLeaf();
    PersonajeEjercitoComposite ejercito = new PersonajeEjercitoComposite();
    ejercito.agregar(ing);
    ejercito.agregar(cab);

    Punto inicio = new Punto(0, 0);
    Punto fin = new Punto(1, 1);

    ejercito.caminar(inicio, fin);

    String salida = output.toString();
    assertTrue(salida.contains("El ejército se moviliza"));
    assertTrue(salida.contains("Ingeniero camina en línea recta"));
    assertTrue(salida.contains("Caballero avanza en zigzag"));
}

@Test
public void testEjercitoConSubEjercitos() {
	PersonajeEjercitoComposite sub = new PersonajeEjercitoComposite();
    sub.agregar(new PersonajeIngenieroLeaf(2));
    sub.agregar(new PersonajeCaballeroLeaf());

    PersonajeEjercitoComposite principal = new PersonajeEjercitoComposite();
    principal.agregar(new PersonajeIngenieroLeaf(1));
    principal.agregar(sub);

    Punto inicio = new Punto(0, 0);
    Punto fin = new Punto(2, 2);

    principal.caminar(inicio, fin);

    String salida = output.toString();
    // Verifica que se movilice el ejército y los subejércitos
    assertTrue(salida.contains("El ejército se moviliza"));
    assertTrue(salida.contains("Ingeniero camina"));
    assertTrue(salida.contains("Caballero avanza en zigzag"));
}


}

