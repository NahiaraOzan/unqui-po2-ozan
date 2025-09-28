package ar.edu.unq.po2.tp5;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CajaTestCase {
	private ProductoCooperativa arroz;
	private Producto detergente;
	private ProductoCooperativa jabon;
	private Producto paneton;
	private Caja caja1;
	private AgenciaRecaudadora azulaCobros;
	private Servicio aysa;
	private Impuesto arqui;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoCooperativa("arroz", 18.9, 50, 10);
		detergente = new Producto("detergente", 75, 20);
		jabon = new ProductoCooperativa("jabon", 17, 100, 10);
		paneton = new Producto("paneton", 23, 45);
		azulaCobros = new AgenciaRecaudadora("azulaCobrosSRL");
		aysa = new Servicio("aysaDeJulieta", azulaCobros, 5, 100);
		arqui = new Impuesto("municipalidad", azulaCobros, 20000);
		
		caja1 = new Caja(1);
		caja1.registrarCobro(arroz);
		caja1.registrarCobro(arroz);
		caja1.registrarCobro(arroz);
		caja1.registrarCobro(detergente);
		caja1.registrarCobro(jabon);
		caja1.registrarCobro(jabon);
		caja1.registrarCobro(jabon);
		caja1.registrarCobro(jabon);
		caja1.registrarCobro(paneton);
		caja1.registrarCobro(paneton);
		caja1.registrarCobro(aysa);
		caja1.registrarCobro(arqui);
		
	}
	
	@Test
	void testMontoTotalAPagar() {
		assertEquals(20733.23000000000005, caja1.montoTotalAPagar());
	}
	
	@Test
	void testDecrementarStock() {
		assertEquals(47, arroz.getStock());
		assertEquals(19, detergente.getStock());
		assertEquals(96, jabon.getStock());
		assertEquals(43, paneton.getStock());
	}
	
	@Test 
	void testPagosRegistrados() {
		List<Factura> facturas = Arrays.asList(aysa, arqui);
		assertEquals(facturas, azulaCobros.getFacturasPagas());
	}
}





