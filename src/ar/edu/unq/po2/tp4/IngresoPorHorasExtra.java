package ar.edu.unq.po2.tp4;

import java.time.LocalDate;

public class IngresoPorHorasExtra extends Ingreso{
	private int cantHorasExtra;
	
	@Override
	public int getCantHorasExtra() {
		return cantHorasExtra;
	}

	public IngresoPorHorasExtra(LocalDate mesDePercepcion, String concepto, double montoPercibido, int cantHorasExtra) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantHorasExtra = cantHorasExtra; 
	}

}
