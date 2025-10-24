package ar.edu.unq.po2.tp7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {

	public PokerStatus() {
		// TODO Auto-generated constructor stub
	}
	
	public Carta comparar(Carta carta1, Carta carta2) {
		if (this.laPrimeraEsMayor(carta1, carta2)) {
			 return carta1;
		} else {
			return carta2;
		}
	}
	
	public boolean algunaEsSuperiorYSonDelMismoPalo(Carta carta1, Carta carta2) {
		return (this.laPrimeraEsMayor(carta1, carta2) || this.laPrimeraEsMayor(carta2, carta1)) &&
				this.sonDelMismoPalo(carta1, carta2);	
	}
	
	public String verificar(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		List<Carta> cartas = List.of(c1, c2, c3, c4, c5);
	    Map<String, Boolean> jugadas = new HashMap<>();
	    jugadas.put("poquer", this.esPoquer(cartas));
	    jugadas.put("color", this.esColor(cartas));
	    jugadas.put("trio", this.esTrio(cartas));

	    for (var elemento : jugadas.entrySet()) { // en variables locales se puede poner var para abreviar el tipo
	        if (elemento.getValue()) {     
	            return elemento.getKey();
	        }
	    }
	    return "";
	}
	
	private boolean esPoquer(List<Carta> cartas) {
		List<Integer> valores = cartas.stream().map(carta -> carta.getValor()).toList();
		return algunoApareceNVeces(valores, 4);
	
    }
	
	private boolean esTrio(List<Carta> cartas) {
		List<Integer> valores = cartas.stream().map(carta -> carta.getValor()).toList();
		return algunoApareceNVeces(valores, 3);
	}
	
	private boolean esColor(List<Carta> cartas) {
		String primerPalo = cartas.get(0).getPalo();
        return cartas.stream()
                     .map(carta -> carta.getPalo())
                     .allMatch(palo -> palo.equals(primerPalo));
	}
	
	private boolean algunoApareceNVeces(List<Integer> valores, int n) {
		Map<Integer, Integer> contador = new HashMap<>();
		for (Integer num : valores) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }
		return  contador.values().stream().anyMatch(cantidad -> cantidad == n);
	}
	
	
	private boolean laPrimeraEsMayor(Carta carta1, Carta carta2) {
		return carta1.getValor() > carta2.getValor();
	}
	
	private boolean sonDelMismoPalo(Carta carta1, Carta carta2) {
		return carta1.getPalo() == carta2.getPalo();
	}
	
	
}	
	
	
	
	
	
	
	
	/*public String verificar(String c1, String c2, String c3, String c4, String c5) {
		List<String> cartas = List.of(c1, c2, c3, c4, c5);
	    Map<String, Boolean> jugadas = new HashMap<>();
	    jugadas.put("poquer", this.esPoquer(cartas));
	    jugadas.put("color", this.esColor(cartas));
	    jugadas.put("trio", this.esTrio(cartas));

	    for (var elemento : jugadas.entrySet()) { // en variables locales se puede poner var para abreviar el tipo
	        if (elemento.getValue()) {     
	            return elemento.getKey();
	        }
	    }
	    return "";
	}
	
	
    private boolean esPoquer(List<String> cartas) {
        Map<String, Integer> conteo = contarValores(cartas);
        return conteo.containsValue(4);
    }

    private boolean esTrio(List<String> cartas) {
        Map<String, Integer> conteo = contarValores(cartas);
        return conteo.containsValue(3);
    }

    private boolean esColor(List<String> cartas) {
        String primerPalo = obtenerPalo(cartas.get(0));
        return cartas.stream()
                     .map(this::obtenerPalo)
                     .allMatch(p -> p.equals(primerPalo));
    }
  

    // ----------------------------
    // Herramientas de apoyo
    // ----------------------------

    private Map<String, Integer> contarValores(List<String> cartas) {
        Map<String, Integer> conteo = new HashMap<>();

        for (String carta : cartas) {
            String valor = obtenerValor(carta);
            conteo.put(valor, conteo.getOrDefault(valor, 0) + 1);
        }

        return conteo;
    }

    private String obtenerValor(String carta) {
        // El valor es todo excepto la última letra (palo)
        return carta.substring(0, carta.length() - 1);
    }

    private String obtenerPalo(String carta) {
        // El palo es la última letra del string
        return carta.substring(carta.length() - 1);
    }*/

	
	

