package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean precioCuidado, double descuento) {
		super(nombre, precio, false);
		this.descuento = descuento;
	}
	
	@Override
	public double getPrecio() {
		return this.getPrecioConDescuentoDel(descuento);
	}
	
	private double getPrecioConDescuentoDel(double numero) {
		return super.getPrecio() * (1 - ( numero / 100));
	}
}