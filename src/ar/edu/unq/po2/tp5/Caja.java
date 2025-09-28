package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private int nroDeCaja;
	private List<Registrable> registrables;
	
	public Caja(int nroDeCaja) {
		this.nroDeCaja = nroDeCaja;
		this.registrables = new ArrayList<>();
	}
	
	public int getNroDeCaja() {
		return nroDeCaja;
	}
	
	public double montoTotalAPagar() {
		double totalPorAhora = 0;
		for (Registrable registrable : registrables) {
			totalPorAhora += registrable.getMontoAPagar();
		}
		return totalPorAhora;
	}
	
	
	public void registrarCobro(Registrable registrable) {
		registrables.add(registrable);
		registrable.actualizarEstado();
	}
}

