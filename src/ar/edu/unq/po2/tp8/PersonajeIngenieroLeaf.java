package ar.edu.unq.po2.tp8;

public class PersonajeIngenieroLeaf implements IPersonaje {
    private int lajasDisponibles;

    public PersonajeIngenieroLeaf(int lajas) {
        this.lajasDisponibles = lajas;
    }

    @Override
    public void caminar(Punto origen, Punto destino) {
        System.out.println("Ingeniero camina en línea recta de " + origen + " a " + destino);
        double distancia = origen.distanciaA(destino);
        for (int i = 0; i < distancia; i++) {
            if (lajasDisponibles > 0) {
                System.out.println("Coloca una laja en el suelo");
                lajasDisponibles--;
            } else {
                System.out.println("Sin lajas, continúa caminando...");
            }
        }
    }
}