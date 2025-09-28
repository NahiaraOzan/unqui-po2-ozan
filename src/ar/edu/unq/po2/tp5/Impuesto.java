package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{
	private double tasaDelServicio;
	
	public Impuesto(String nombre, AgenciaRecaudadora agenteRecaudador, double tasaDelServicio) {
		super(nombre, agenteRecaudador);
		this.tasaDelServicio = tasaDelServicio;
	}
	
	public double getMontoAPagar() {
		return tasaDelServicio;
	}

}
