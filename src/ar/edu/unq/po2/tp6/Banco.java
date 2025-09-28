package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco{
	private String nombre;
	private List<Cliente> clientes;
	private List<ISolicitudDeCredito> solicitudes;
	private Calculadora calculadora;
	
	
	public Banco(String nombre, Calculadora calculadora) {
		this.nombre = nombre;
		this.clientes = new ArrayList<>();
		this.solicitudes = new ArrayList<>();
		this.calculadora = calculadora;
	}
	
	
	public double getMontoADesembolsar() {
		return calculadora.getMontoADesembolsar(solicitudes);
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> getClientes() {
		return clientes;
	}
	
	public List<ISolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void registrarSolicitud(ISolicitudDeCredito solicitud) {
		solicitudes.add(solicitud);
	}
	
	public void procesarSolicitudes() {
		for (ISolicitudDeCredito solicitud : solicitudes) {
			if ( solicitud.esAceptable() ) {
				solicitud.getCliente().recibirDeposito(solicitud.getMontoSolicitado());
			}
		}
	}
	
	
	
	

	
	

}
