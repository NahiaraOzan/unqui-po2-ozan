package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Punto verticeSurOeste;
	private Punto verticeNorEste;
	private Punto verticeNorOeste;
	private Punto verticeSurEste;
	
	
	public Punto getVerticeSurOeste() {
		return verticeSurOeste;
	}

	public void setVerticeSurOeste(Punto verticeSurOeste) {
		this.verticeSurOeste = verticeSurOeste;
	}

	public Punto getVerticeNorEste() {
		return verticeNorEste;
	}

	public void setVerticeNorEste(Punto verticeNorEste) {
		this.verticeNorEste = verticeNorEste;
	}

	public Punto getVerticeNorOeste() {
		return verticeNorOeste;
	}

	public void setVerticeNorOeste(Punto verticeNorOeste) {
		this.verticeNorOeste = verticeNorOeste;
	}

	public Punto getVerticeSurEste() {
		return verticeSurEste;
	}

	public void setVerticeSurEste(Punto verticeSurEste) {
		this.verticeSurEste = verticeSurEste;
	}

	

	public Rectangulo(Punto verticeSurOeste, Punto verticeNorEste) {
		super();
		this.verticeSurOeste = verticeSurOeste;
		this.verticeNorEste = verticeNorEste;
		this.verticeNorOeste = new Punto(verticeSurOeste.getX(), verticeNorEste.getY());
		this.verticeSurEste = new Punto(verticeNorEste.getX(), verticeSurOeste.getY());
	}
	
	public float area() {
		return this.base() * this.altura();
	}
	
	public float perimetro() {
		return 2*(this.base() + this.altura());
	}
	
	public boolean esHorizontal() {
		return this.base() > this.altura();
	}
	
	public boolean esVertical() {
		return this.altura() > this.base();
	}
	
	
	private float base() {
		return verticeSurEste.getX() - verticeSurOeste.getX();
	}
	
	private float altura() {
		return verticeNorOeste.getY() - verticeSurOeste.getY();
	}
	
	

}
