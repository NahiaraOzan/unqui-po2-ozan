package ar.edu.unq.po2.tp5;

public class Producto implements Registrable{
	private String nombre;
	private double precioBasico;
	private double stock;
	
	
	public Producto(String nombre, double precioBasico, double stock) {
		this.nombre = nombre;
		this.precioBasico = precioBasico;
		this.stock = stock;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecioBasico() {
		return precioBasico;
	}
	
	public double getMontoAPagar() {
		return precioBasico;
	}
		
	public double getStock() {
		return stock;
	}

	public void actualizarEstado() {
		stock -= 1;
	}

	
}
