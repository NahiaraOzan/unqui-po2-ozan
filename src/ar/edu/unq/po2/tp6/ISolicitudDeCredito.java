package ar.edu.unq.po2.tp6;

public interface ISolicitudDeCredito {
	
	public double getMontoCuotaMensual();
	public boolean esAceptable();
	public double getMontoSolicitado();
	public Cliente getCliente();
	public int getPlazo();
	
	
}
