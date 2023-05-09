package ar.edu.unlp.info.oo2.biblioteca;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class main {

	public static void main(String args[] ) {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		biblioteca.agregarSocio(new Socio("TESTO TESTI", "test@jojo.com",  "ffff.ff"));
		
		biblioteca.setExporter(new jsonExporter());
		
		System.out.println(biblioteca.exportarSocios());
	}
}
