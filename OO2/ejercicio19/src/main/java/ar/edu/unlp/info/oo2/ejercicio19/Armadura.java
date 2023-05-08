package ar.edu.unlp.info.oo2.ejercicio19;

public abstract class Armadura {
	private String nombre;
	private int id;
	
	public Armadura(String n, int id) {
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
