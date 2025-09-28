package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	private Propiedad casaDeAzul;
	private Propiedad casaDeAnymus;
	private Cliente azul;
	private Cliente atlas;
	private Cliente anymus;
	private Cliente walter;
	private SolicitudHipotecaria solicitudAzul;
	private SolicitudPersonal solicitudAtlas;
	private SolicitudHipotecaria solicitudAny;
	private SolicitudPersonal solicitudWalter;
	private Calculadora calculadoraBanco;
	private Banco banco;
	
	@BeforeEach
	public void setUp() {
		casaDeAzul = new Propiedad("casa de 5 pisos", "avenida siempre viva", 50000);
		casaDeAnymus = new Propiedad("casa matusita", "avenida del terror", 10000);
		azul = new Cliente("Azul", "Azulada", "avenida siempre viva", 25, 1500);
		atlas = new Cliente("Atlas", "Atlante", "desausiados de dios", 21, 5000);
		anymus = new Cliente("Anymus", "Hainz", "avenida del terror", 27, 1500);
		walter = new Cliente("Walter", "Mendieta", "lanus", 33, 1000);
		solicitudAzul = new SolicitudHipotecaria(azul, 5000, 12, casaDeAzul);
		solicitudAtlas = new SolicitudPersonal(atlas, 20000, 12);
		solicitudAny = new SolicitudHipotecaria(anymus, 100000, 12, casaDeAnymus);
		solicitudWalter = new SolicitudPersonal(walter, 50000, 12);
		calculadoraBanco = new Calculadora();
		banco = new Banco("El Padrino", calculadoraBanco);
		
		banco.agregarCliente(azul);
		banco.agregarCliente(atlas);
		banco.agregarCliente(anymus);
		banco.agregarCliente(walter);
		banco.registrarSolicitud(solicitudAzul);
		banco.registrarSolicitud(solicitudAtlas);
		banco.registrarSolicitud(solicitudAny);
		banco.registrarSolicitud(solicitudWalter);
		banco.procesarSolicitudes();
		
	}
	
	@Test
	void testAgregarClientes() {
		List<Cliente> clientes = Arrays.asList(azul, atlas, anymus, walter);
		assertEquals(clientes , banco.getClientes());
	}
	
	@Test
	void testAgregarSolicitudes() {
		List<ISolicitudDeCredito> solicitudes = Arrays.asList(solicitudAzul, solicitudAtlas, solicitudAny, solicitudWalter);
		assertEquals(solicitudes, banco.getSolicitudes());
	}
	
	@Test
	void testMontoTotalADesembolsar() {
		assertEquals(25000, banco.getMontoADesembolsar());
	}
	
	@Test 
	void testSaldoDeAzul() {
		assertEquals(5000, azul.getSaldo());
	}
}
