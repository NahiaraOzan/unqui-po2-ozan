package ar.edu.unq.po2.tp6;

public class SolicitudPersonal implements ISolicitudDeCredito {
	private Cliente cliente;
	private double montoSolicitado;
	private int plazo;
	
	
	public SolicitudPersonal(Cliente cliente, double montoSolicitado, int plazo) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
		
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public int getPlazo() {
		return plazo;
	}
	
	public double getMontoCuotaMensual() {
		return montoSolicitado / plazo;
	}
	
	public boolean esAceptable() {
		return this.getMontoCuotaMensual() <= cliente.getSueldoNetoMensual() * 0.7
			   && cliente.getIngresoAnual() >= 15000; 
	}
	

	
}
