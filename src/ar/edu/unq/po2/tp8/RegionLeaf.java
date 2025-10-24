package ar.edu.unq.po2.tp8;

public class RegionLeaf implements IRegion {
	private String tipo;
	private double ganancia;

	public RegionLeaf(String tipo, double ganancia) {
		this.tipo = tipo;
		this.ganancia = ganancia;	
	}
	
	public double gananciasAnuales() {
		return ganancia;
	}

}
