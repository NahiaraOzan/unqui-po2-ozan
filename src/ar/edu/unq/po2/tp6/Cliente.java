package ar.edu.unq.po2.tp6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double saldo;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.saldo = 0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getEdad() {
		return edad;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public double getIngresoAnual() {
		return getSueldoNetoMensual() * 12;
	}
	
	public void recibirDeposito(double monto) {
		saldo += monto;
	}

}
