package ar.edu.unq.po2.tp3;

public class Punto {
	private float x;
	private float y;
	
	public Punto(float x, float y) {
		super();
		this.setXY(x,y);
	}
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public Punto() {
		this.setXY(0,0);
	}
	
	public void sumarPuntos(Punto punto) {
		float nuevoX = punto.getX() + this.x ;
		float nuevoY = punto.getY() + this.y ;
		this.setXY(nuevoX, nuevoY);
	}
	
	public void moverHacia(float x, float y) {
		this.setXY(x, y);
	}
}
