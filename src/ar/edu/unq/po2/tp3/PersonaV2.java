package ar.edu.unq.po2.tp3;

public class PersonaV2 {
	
	private String nombre;
	private String apellido;
	private double edad;
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}


	public double getEdad() {
		return edad;
	}

	
	public PersonaV2(String nombre, String apellido, double edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
}
