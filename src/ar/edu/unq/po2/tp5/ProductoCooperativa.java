package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	private double descuento;
	
	public ProductoCooperativa(String nombre, double precioBasico, double stock, double descuento) {
		super(nombre, precioBasico, stock);
		this.descuento = descuento;
	}
	
	public double getMontoAPagar() {
		return this.getPrecioBasico() - descuentoDelProducto();
	}
	
	public double descuentoDelProducto() {
		return getPrecioBasico() * descuento / 100;
	}
}
