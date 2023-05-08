package ar.edu.unlp.info.oo2.ejercicio19;

public abstract class A_Arma {
	private String nombre;
	private int id;
	
	private int fuerza;
	
	public A_Arma(String n, int id, int str) {
		this.nombre = nombre;
		this.id = id;
		this.fuerza = str;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getFuerza() {
		return this.fuerza;
	}
}
