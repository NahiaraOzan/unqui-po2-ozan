package ar.edu.unq.po2.tp8;

public class PersonajeCaballeroLeaf implements IPersonaje {

    @Override
    public void caminar(Punto origen, Punto destino) {
        System.out.println("Caballero avanza en zigzag de " + origen + " a " + destino + " vigilando la zona");
    }
}
