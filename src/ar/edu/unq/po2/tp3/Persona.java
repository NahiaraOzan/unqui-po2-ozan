package ar.edu.unq.po2.tp3;
import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
		private String nombre;
		private LocalDate fecDeNacimiento;
		
		
		public String getNombre() {
			return nombre;
		}
	
		public LocalDate getFecDeNacimiento() {
			return fecDeNacimiento;
		}
	
		public Persona(String nombre, LocalDate fecDeNacimiento) {
			this.nombre = nombre;
			this.fecDeNacimiento = fecDeNacimiento;
		}
	   
		public int edad() {
			return Period.between(fecDeNacimiento, LocalDate.now()).getYears();
		}
		
		public boolean menorQue(Persona persona) {
			return this.edad() < persona.edad();
		}
}
