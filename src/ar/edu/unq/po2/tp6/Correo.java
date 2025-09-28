package ar.edu.unq.po2.tp6;

public class Correo {
	private String asunto;
	private String destinatario;
	private String cuerpo;
	
	public Correo(String asunto, String destinatario, String cuerpo) {
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}
	
	public String getAsunto() {
		return asunto;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public String getCuerpo() {
		return cuerpo;
	}

}
