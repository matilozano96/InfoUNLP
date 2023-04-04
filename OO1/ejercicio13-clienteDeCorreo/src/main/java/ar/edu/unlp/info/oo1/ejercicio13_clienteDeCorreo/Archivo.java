package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

public class Archivo {
	
	private String nombre;
	private double tamaño;
	
	public Archivo(String nombre, double tamaño) {
		this.nombre = nombre;
		this.tamaño = tamaño;
	}
	
	public double tamaño() {
		return this.tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
