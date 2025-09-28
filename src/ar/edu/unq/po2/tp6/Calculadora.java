package ar.edu.unq.po2.tp6;

import java.util.List;

public class Calculadora  implements ICalculadoraBanco{
	
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getMontoADesembolsar(List<ISolicitudDeCredito> solicitudes) {
		return solicitudes.stream()
				.filter(ISolicitudDeCredito :: esAceptable)
				.mapToDouble(ISolicitudDeCredito :: getMontoSolicitado)
				.sum();
	}

}
