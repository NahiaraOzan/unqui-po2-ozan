package ar.edu.unq.po2.tp6;


public class ClienteEMail {
	
	 private ServidorPop servidor;
	 private String nombreUsuario;
	 private String passusuario;
	 private BandejaDeEntrada bandejaDeEntrada;
	 
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.bandejaDeEntrada = new BandejaDeEntrada();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}
	
	public void borrarCorreo(Correo correo) {
		bandejaDeEntrada.borrarCorreo(correo);
	}
	
	public int contarBorrados() {
		return bandejaDeEntrada.contarBorrados();
	}
	
	public int contarInbox() {
		return bandejaDeEntrada.contarInbox();
	}
	
	public void eliminarBorrado(Correo correo) {
		bandejaDeEntrada.eliminarBorrado(correo);
	}
 
}





