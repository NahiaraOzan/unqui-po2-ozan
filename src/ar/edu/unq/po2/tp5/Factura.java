package ar.edu.unq.po2.tp5;

abstract class Factura implements Registrable{
	private String nombre;
	private AgenciaRecaudadora agenteRecaudador;
	
	public Factura(String nombre, AgenciaRecaudadora agenteRecaudador) {
		this.nombre = nombre;
		this.agenteRecaudador = agenteRecaudador;
	}
	
	public abstract double getMontoAPagar();
	
	public void actualizarEstado() {
		agenteRecaudador.registrarPago(this);
	}

	public String getNombre() {
		return nombre;
	}

	
}


