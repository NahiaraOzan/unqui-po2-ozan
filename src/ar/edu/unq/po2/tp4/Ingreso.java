package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class Ingreso {
	private LocalDate mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	public double getMontoPercibido() {
		return montoPercibido;
	}

	public Ingreso(LocalDate mesDePercepcion, String concepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public int getCantHorasExtra() {
		return 0;
	}
	
	public double montoSiNoTieneHorasExtra() {
		if(this.getCantHorasExtra() == 0) {
			return montoPercibido; } else {
			return 0;
		 }
	}
	
}
