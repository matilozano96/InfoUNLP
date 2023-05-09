package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class VoorheesTest {
	private VoorheesExporter exporter= new VoorheesExporter(); 
	private List<Socio> socios;
	
	@BeforeEach
	public void setUp() {
		socios.add(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		socios.add(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
	}
	
	@Test
	public void testSocio() {
		
		
	}
}
