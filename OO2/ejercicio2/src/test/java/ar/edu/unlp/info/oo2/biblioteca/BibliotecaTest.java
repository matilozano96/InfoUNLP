package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class BibliotecaTest {

	Biblioteca biblioteca = new Biblioteca();
	
	@BeforeEach
	public void setUp() {
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		biblioteca.agregarSocio(new Socio("TESTO TESTI", "test@jojo.com",  "ffff.ff"));
	}
	
	@Test
	public void testSocios() {
		
		
	}
}

