package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{
	private double costoPorUnidadConsumida;
	private int cantUnidadesConsumidas;
	
	public Servicio(String nombre, AgenciaRecaudadora agenteRecaudador, double costoPorUnidadConsumida, int cantUnidadesConsumidas) {
		super(nombre, agenteRecaudador);
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
	}
	
	public double getMontoAPagar() {
		return costoPorUnidadConsumida * cantUnidadesConsumidas;
	}
	
}
