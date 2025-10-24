package ar.edu.unq.po2.tp8;

public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanciaA(Punto otro) {
        return Math.sqrt(Math.pow(otro.x - x, 2) + Math.pow(otro.y - y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}