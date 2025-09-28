package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class TrabajadorTestCase {
	private Trabajador trabajador;
	private Ingreso ingresoEnero;
	private Ingreso ingresoFebrero;
	private Ingreso ingresoMarzo;
	private Ingreso ingresoAbril;
	private Ingreso ingresoMayo;
	private Ingreso ingresoJunio;
	private Ingreso ingresoJulio;
	private Ingreso ingresoAgosto;
	private Ingreso ingresoSeptiembre;
	private Ingreso ingresoOctubre;
	private Ingreso ingresoNoviembre;
	private Ingreso ingresoDiciembre;
	private IngresoPorHorasExtra ingresoExtraEnero;
	private IngresoPorHorasExtra ingresoExtraFebrero;
	private IngresoPorHorasExtra ingresoExtraMarzo;
	private IngresoPorHorasExtra ingresoExtraAbril;
	private IngresoPorHorasExtra ingresoExtraMayo;
	private IngresoPorHorasExtra ingresoExtraJunio;
	private IngresoPorHorasExtra ingresoExtraJulio;
	private IngresoPorHorasExtra ingresoExtraAgosto;
	private IngresoPorHorasExtra ingresoExtraSeptiembre;
	private IngresoPorHorasExtra ingresoExtraOctubre;
	private IngresoPorHorasExtra ingresoExtraNoviembre;
	private IngresoPorHorasExtra ingresoExtraDiciembre;
	
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador("Luis", "23949494");
		ingresoEnero = new Ingreso(LocalDate.of(2025,01,01), "blablabla", 1000);
		ingresoFebrero = new Ingreso(LocalDate.of(2025,02,01), "blablabla", 1000);
		ingresoMarzo = new Ingreso(LocalDate.of(2025,03,01), "blablabla", 1000);
		ingresoAbril = new Ingreso(LocalDate.of(2025,04,01), "blablabla", 1000);
		ingresoMayo = new Ingreso(LocalDate.of(2025,05,01), "blablabla", 1000);
		ingresoJunio = new Ingreso(LocalDate.of(2025,06,01), "blablabla", 1000);
		ingresoJulio = new Ingreso(LocalDate.of(2025,07,01), "blablabla", 1000);
		ingresoAgosto = new Ingreso(LocalDate.of(2025,8,01), "blablabla", 1000);
		ingresoSeptiembre = new Ingreso(LocalDate.of(2025,9,01), "blablabla", 1000);
		ingresoOctubre = new Ingreso(LocalDate.of(2025,10,01), "blablabla", 1000);
		ingresoNoviembre = new Ingreso(LocalDate.of(2025,11,01), "blablabla", 1000);
		ingresoDiciembre = new Ingreso(LocalDate.of(2025,12,01), "blablabla", 1000);
		ingresoExtraEnero = new IngresoPorHorasExtra(LocalDate.of(2025,01,01), "blablabla", 100, 10);
		ingresoExtraFebrero = new IngresoPorHorasExtra(LocalDate.of(2025,02,01), "blablabla", 100, 10);
		ingresoExtraMarzo = new IngresoPorHorasExtra(LocalDate.of(2025,03,01), "blablabla", 100, 10);
		ingresoExtraAbril = new IngresoPorHorasExtra(LocalDate.of(2025,04,01), "blablabla", 100, 10);
		ingresoExtraMayo = new IngresoPorHorasExtra(LocalDate.of(2025,05,01), "blablabla", 100, 10);
		ingresoExtraJunio = new IngresoPorHorasExtra(LocalDate.of(2025,06,01), "blablabla", 100, 10);
		ingresoExtraJulio = new IngresoPorHorasExtra(LocalDate.of(2025,07,01), "blablabla", 100, 10);
		ingresoExtraAgosto = new IngresoPorHorasExtra(LocalDate.of(2025,8,01), "blablabla", 100, 10);
		ingresoExtraSeptiembre = new IngresoPorHorasExtra(LocalDate.of(2025,9,01), "blablabla", 100, 10);
		ingresoExtraOctubre = new IngresoPorHorasExtra(LocalDate.of(2025,10,01), "blablabla", 100, 10);
		ingresoExtraNoviembre = new IngresoPorHorasExtra(LocalDate.of(2025,11,01), "blablabla", 100, 10);
		ingresoExtraDiciembre = new IngresoPorHorasExtra(LocalDate.of(2025,12,01), "blablabla", 100, 10);
		trabajador.agregarIngreso(ingresoEnero);
		trabajador.agregarIngreso(ingresoFebrero);
		trabajador.agregarIngreso(ingresoMarzo);
		trabajador.agregarIngreso(ingresoAbril);
		trabajador.agregarIngreso(ingresoMayo);
		trabajador.agregarIngreso(ingresoJunio);
		trabajador.agregarIngreso(ingresoJulio);
		trabajador.agregarIngreso(ingresoAgosto);
		trabajador.agregarIngreso(ingresoSeptiembre);
		trabajador.agregarIngreso(ingresoOctubre);
		trabajador.agregarIngreso(ingresoNoviembre);
		trabajador.agregarIngreso(ingresoDiciembre);
		trabajador.agregarIngreso(ingresoExtraEnero);
		trabajador.agregarIngreso(ingresoExtraFebrero);
		trabajador.agregarIngreso(ingresoExtraMarzo);
		trabajador.agregarIngreso(ingresoExtraAbril);
		trabajador.agregarIngreso(ingresoExtraMayo);
		trabajador.agregarIngreso(ingresoExtraJunio);
		trabajador.agregarIngreso(ingresoExtraJulio);
		trabajador.agregarIngreso(ingresoExtraAgosto);
		trabajador.agregarIngreso(ingresoExtraSeptiembre);
		trabajador.agregarIngreso(ingresoExtraOctubre);
		trabajador.agregarIngreso(ingresoExtraNoviembre);
		trabajador.agregarIngreso(ingresoExtraDiciembre);
		
		
	}
	
	@Test
	void testGetTotalPercibido() {
		assertEquals(13200, trabajador.getTotalPercibido());
	}
	
	@Test
	void testGetMontoImponible() {
		assertEquals(12000, trabajador.getMontoImponible());
	}
	
	@Test
	void testGetImpuestoAPagar() {
		assertEquals(240, trabajador.getImpuestoAPagar());
	}
	
}
