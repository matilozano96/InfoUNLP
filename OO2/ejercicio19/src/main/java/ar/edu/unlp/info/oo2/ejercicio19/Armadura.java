package ar.edu.unlp.info.oo2.ejercicio19;

public abstract class Armadura {
	private String nombre;
	private int id;
	
	private int defensa;
	
	public Armadura(String n, int id, int def) {
		this.nombre = nombre;
		this.id = id;
		this.defensa = def;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getDefensa() {
		return this.defensa;
	}
}
