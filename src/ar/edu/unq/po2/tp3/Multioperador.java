package ar.edu.unq.po2.tp3;
import java.util.ArrayList;
import java.util.List;

public class Multioperador {

		private List<Integer> numeros;
		
		public Multioperador() {
			this.numeros = new ArrayList<>();
		}
		
		public void agregarNumero(int numero) {
	        this.numeros.add(numero);
	    }
	
		public int sumar() {
			int totalSumadoHastaAhora = 0;
			for(int numero : this.numeros) {
				totalSumadoHastaAhora += numero;
			}
			return totalSumadoHastaAhora;
		}
		
		public int restar() {
			int totalRestadoHastaAhora = numeros.get(0);
			for(int i=1; i< numeros.size(); i++) {
				totalRestadoHastaAhora -= numeros.get(i);
			}
			return totalRestadoHastaAhora;
			
		}
		
		public int multiplicacion() {
			int totalMultiplicadoHastaAhora = 1;
			for(int numero: this.numeros) {
				totalMultiplicadoHastaAhora *= numero;
			}
			return totalMultiplicadoHastaAhora;
		}
}
