package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InversorTest {
	
	protected Inversor inversor;
	protected PlazoFijo plazofijo;
	protected InversionEnAcciones acciones;
	
	private void initialize() {
		
		inversor = new Inversor("Testo Testi");
		plazofijo = new PlazoFijo(LocalDate.parse("2022-09-30"), 2000, 0.01);
		acciones = new InversionEnAcciones("Gamestop", 900, 15);
	}

	@BeforeEach
	void setUp() {
		this.initialize();
	}
	
	@Test
	void testAcciones() {
		assertEquals(acciones.valorActual(), 900*15);
	}
	
	@Test
	void testPlazoFijo() {
		assertEquals(plazofijo.valorActual(), (2000 + 2000 * 0.01 * 2));
	}
	
	@Test
	void testInversor() {
		inversor.agregarInversion(acciones);
		inversor.agregarInversion(plazofijo);
		assertEquals(inversor.valorActual(), 900*15 + 2000 + 2000 * 0.01 * 2);
	
	}


}