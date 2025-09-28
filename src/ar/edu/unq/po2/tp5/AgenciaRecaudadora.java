package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;

public class AgenciaRecaudadora implements Agencia{
	private String nombre;
	private List <Factura> facturasPagas;
	
	public List<Factura> getFacturasPagas() {
		return facturasPagas;
	}

	public AgenciaRecaudadora(String nombre) {
		this.nombre = nombre;
		this.facturasPagas = new ArrayList<>();
		
	}
	
	public void registrarPago(Factura factura) {
		facturasPagas.add(factura);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	

}
