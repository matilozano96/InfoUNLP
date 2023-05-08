package ar.edu.unlp.info.oo2.ejercicio19;

public abstract class Arma {
	private String nombre;
	private int id;
	
	public Arma(String n, int id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getId() {
		return this.id;
	}
}
