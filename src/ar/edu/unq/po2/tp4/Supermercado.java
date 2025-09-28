package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<>();
	}
	
	public double getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public double getPrecioTotal() {
		double counter = 0;
		for ( Producto producto : productos) {
			counter += producto.getPrecio();
		}
		return counter;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
		
}
