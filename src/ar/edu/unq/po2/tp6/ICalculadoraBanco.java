package ar.edu.unq.po2.tp6;

import java.util.List;

public interface ICalculadoraBanco {
	
	public double getMontoADesembolsar(List<ISolicitudDeCredito> solicitudes);
}
