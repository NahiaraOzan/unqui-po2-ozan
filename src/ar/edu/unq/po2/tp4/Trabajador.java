package ar.edu.unq.po2.tp4;
import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private String nombre;
	private String dni;
	private List<Ingreso> ingresosAnuales;
	
	public Trabajador(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.ingresosAnuales = new ArrayList<>();
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosAnuales.add(ingreso);
	}
	
	public double getTotalPercibido() {
		double totalPorAhora = 0;
		for(Ingreso ingreso : ingresosAnuales) {
			totalPorAhora += ingreso.getMontoPercibido();
		}
		return totalPorAhora;
	}
	
	public double getMontoImponible() {
		double totalPorAhora = 0;
		for(Ingreso ingreso : ingresosAnuales) {
			totalPorAhora += ingreso.montoSiNoTieneHorasExtra();
		}
		return totalPorAhora;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
}
