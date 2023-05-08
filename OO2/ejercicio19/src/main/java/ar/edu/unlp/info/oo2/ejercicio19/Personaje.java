package ar.edu.unlp.info.oo2.ejercicio19;

import java.util.LinkedList;
import java.util.List;

public class Personaje {
	Arma arma;
	Armadura armadura;
	List<Habilidad> habilidades;
	
	String nombre;
	int vida = 100;
	
	public Personaje(String n) {
		this.nombre = n;
		habilidades = new LinkedList<Habilidad>();
	}
	
	public void recibirDaño(int n) {
		this.vida -= n;
	}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setArma(Arma a) {
		this.arma = a;
	}
	
	public void setArmadura(Armadura a) {
		this.armadura = a;
	}
	
	public void addHabilidad(Habilidad h) {
		this.habilidades.add(h);
	}
	
	public Arma getArma() {
		return this.arma;
	}
	
	public Armadura getArmadura() {
		return this.armadura;
	}
	
	public void atacar(Personaje p) {
		return;
	}
}
