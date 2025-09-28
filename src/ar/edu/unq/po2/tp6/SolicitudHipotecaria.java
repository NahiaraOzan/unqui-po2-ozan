package ar.edu.unq.po2.tp6;

public class SolicitudHipotecaria implements ISolicitudDeCredito{
		private Cliente cliente;
		private double montoSolicitado;
		private int plazo;
		private Propiedad garantia;
		
		
		public SolicitudHipotecaria(Cliente cliente, double montoSolicitado, int plazo, Propiedad garantia) {
			this.cliente = cliente;
			this.montoSolicitado = montoSolicitado;
			this.plazo = plazo;
			this.garantia = garantia;	 
		}
		
		public double getMontoSolicitado() {
			return montoSolicitado;
		}
		
		public Cliente getCliente() {
			return cliente;
		}

		public int getPlazo() {
			return plazo;
		}

		public Propiedad getGarantia() {
			return garantia;
		}
		
		public double getMontoCuotaMensual() {
			return montoSolicitado / plazo;
		}

		public boolean esAceptable() {
			return this.getMontoCuotaMensual() <= cliente.getSueldoNetoMensual() * 0.5
					&& montoSolicitado <= garantia.getValorFiscal() * 0.7
					&& (cliente.getEdad() + plazo / 12) <= 65;
		}
		
		

 }
