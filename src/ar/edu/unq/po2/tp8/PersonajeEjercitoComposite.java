package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class PersonajeEjercitoComposite implements IPersonaje {
    private List<IPersonaje> miembros;

    public PersonajeEjercitoComposite() {
        this.miembros = new ArrayList<>();
    }

    public void agregar(IPersonaje personaje) {
        miembros.add(personaje);
    }

    @Override
    public void caminar(Punto origen, Punto destino) {
        System.out.println("El ejército se moviliza desde " + origen + " hasta " + destino);
        for (IPersonaje p : miembros) {
            p.caminar(origen, destino);
        }
    }
}