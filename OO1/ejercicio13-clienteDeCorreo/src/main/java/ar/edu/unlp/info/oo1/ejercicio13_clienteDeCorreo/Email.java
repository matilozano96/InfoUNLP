package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.LinkedList;
import java.util.List;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos;
	
	public Email() {
		adjuntos = new LinkedList<Archivo>();
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public void adjuntarArchivo(Archivo a) {
		adjuntos.add(a);
	}
	
	public void eliminarArchivo(String nombre) {
		for (int i=0; i < adjuntos.size(); i++) {
			if (adjuntos.get(i).getNombre().equals(nombre)) adjuntos.remove(i);
		}
	}
	
	public double tamaño() {
		return titulo.length() + 
				cuerpo.length() + 
				adjuntos.
				stream().
				mapToDouble(archivo->archivo.tamaño()).
				sum();
	}
	
	
}
