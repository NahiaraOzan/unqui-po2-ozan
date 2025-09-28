package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class BandejaDeEntrada {
	private List<Correo> inbox;
	private List<Correo> borrados;
	
	public BandejaDeEntrada() {
		this.inbox = new ArrayList<>();
		this.borrados = new ArrayList<>();
	}
	
	public void borrarCorreo(Correo correo){
		this.borrados.add(correo);
		this.inbox.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	
}
