package ar.edu.unq.po2.tp3;
import java.util.Set;

public class EquipoDeTrabajo {
	
	private String nombre;
	private Set<PersonaV2> integrantes;
	
	public EquipoDeTrabajo(String nombre, Set<PersonaV2> integrantes) {
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void agregarIntegrante(PersonaV2 persona) {
		this.integrantes.add(persona);
	}
	
	public double promedioDeEdad() {
		double sumaDeEdades = this.sumaDeLasEdades();
		double cantDeIntegrantes = integrantes.size();
		if (integrantes.isEmpty()) {
	        return 0; 
	    }
	    return sumaDeEdades / cantDeIntegrantes;
	}
	
	private double sumaDeLasEdades() {
		double totalSumadoPorAhora = 0;
		for(PersonaV2 persona : integrantes) {
			totalSumadoPorAhora += persona.getEdad();
		}
		return totalSumadoPorAhora;
	}
	
}
