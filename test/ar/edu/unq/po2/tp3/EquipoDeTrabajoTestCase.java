package ar.edu.unq.po2.tp3;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class EquipoDeTrabajoTestCase {
	
	EquipoDeTrabajo equipoDeTrabajo;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		Set<PersonaV2> integrantes = new HashSet<>(); 
		
		integrantes.add(new PersonaV2("Nahi", "García", 25));
		integrantes.add(new PersonaV2("Luis", "Pérez", 30));
		integrantes.add(new PersonaV2("Sharif", "Ozan", 35));
		integrantes.add(new PersonaV2("Lucia", "Cardozo", 22));
		integrantes.add(new PersonaV2("Azul", "Atuna", 10));
		
		equipoDeTrabajo = new EquipoDeTrabajo("AzulaTeam", integrantes);			
	}
	
	
	@Test
	void testPromedio() {
		double promedio = equipoDeTrabajo.promedioDeEdad();
		
		 System.out.println("El promedio de edad es: " + promedio);
	}

}
