package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.LinkedList;
import java.util.List;

public class Carpeta {
	private String nombre;
	private List<Email> emails;
	
	public Carpeta(String nombre) {
		this.nombre = nombre;
		this.emails = new LinkedList<Email>();
	}
	
	public void agregar(Email e) {
		emails.add(e);
	}
	public void remover(Email e) {
		emails.remove(e);
	}
	public Email buscar(String texto) {
		for (int i=0; i < emails.size(); i++ ) {
			if ( emails.get(i).getTitulo().equals(texto) ) return emails.get(i);
			if ( emails.get(i).getCuerpo().equals(texto) ) return emails.get(i);
		}
		return null;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
}
