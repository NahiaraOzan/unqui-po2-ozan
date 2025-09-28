package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo{

	public Cuadrado(Punto verticeSurOeste, float lado) {
        
        super(verticeSurOeste, 
              new Punto(verticeSurOeste.getX() + lado, verticeSurOeste.getY() + lado));
    }

	
}
