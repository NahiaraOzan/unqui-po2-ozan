package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    
    private List<Integer> numeros;

    public Counter() {
        this.numeros = new ArrayList<>();
    }

    public void agregarNumero(int numero) {
        this.numeros.add(numero);
    }

    
    public int contarPares() {
        int contador = 0;
        for (int numero : this.numeros) {
            contador = contarSiEsPar(numero, contador);
        }
        return contador;
    }

    
    public int contarImpares() {
        int contador = 0;
        for (int numero : this.numeros) {
            contador = contarSiEsImpar(numero, contador);
        }
        return contador;
    }

    
    public int contarMultiplosDe(int divisor) {
        int contador = 0;
        for (int numero : this.numeros) {
            contador = contarSiEsMultiploDe(numero, divisor, contador);
        }
        return contador;
    }
    
    public int elDeMasDigitosPares(int[] numeros) {
    	int maxCantDeDigitosParesPorAhora = -1;
    	int elDeMasDigitosParesPorAhora = 0;
    	for (int numero : numeros) {
    		elDeMasDigitosParesPorAhora = actualizarASiEsMayor(numero, maxCantDeDigitosParesPorAhora, elDeMasDigitosParesPorAhora);
    		maxCantDeDigitosParesPorAhora = Math.max(maxCantDeDigitosParesPorAhora, cantDeDigitosPares(numero));
    	}
    	return elDeMasDigitosParesPorAhora;
    }
    
    private int actualizarASiEsMayor(int numero, int maxCantActualDeDigitosPares, int maxNumeroActual) {
    	if (cantDeDigitosPares(numero) > maxCantActualDeDigitosPares) {
    		return numero;
    		
    	}else{
    		return maxNumeroActual;
    	}
    }
    
    private int cantDeDigitosPares(int numero) {
    	int valorAbsoluto = Math.abs(numero);
    	if (esCero(valorAbsoluto)) {
            return 1;
        }

        return contarDigitosPares(valorAbsoluto);
    }
    
    private int contarDigitosPares(int numero) {
        int cantidad = 0;
        int numeroActual = numero;

        while (leQuedanMasDigitos(numeroActual)) {
            cantidad = sumarSiUltimoDigitoEsPar(numeroActual, cantidad);
            numeroActual = eliminarUltimoDigito(numeroActual);
        }

        return cantidad;
    }
    
    private int sumarSiUltimoDigitoEsPar(int numero, int cantidad) {
        if (esPar(obtenerUltimoDigito(numero))) {
            return cantidad + 1;
        } else {
        	return cantidad;
        }
    }
    
    
    private boolean esCero(int numero) {
        return numero == 0;
    }
    
    private boolean leQuedanMasDigitos(int numero) {
        return numero != 0;
    }
    
    private int obtenerUltimoDigito(int numero) {
        return numero % 10;
    }
    
    private int eliminarUltimoDigito(int numero) {
        return numero / 10;
    }
   
    private boolean esPar(int numero) {
    	return numero % 2 == 0;
    }
    
    
    private int contarSiEsPar(int numero, int contador) {
        if (esPar(numero)) {
            contador++;
        }
        return contador;
    }

    private int contarSiEsImpar(int numero, int contador) {
        if ( !esPar(numero)) {
            contador++;
        }
        return contador;
    }

    private int contarSiEsMultiploDe(int numero, int divisor, int contador) {
        if (numero % divisor == 0) {
            contador++;
        }
        return contador;
    }
}
