package ar.edu.unlp.info.oo2.ejercicio19;

import java.util.LinkedList;
import java.util.List;

public class A_Personaje {
	A_Arma arma;
	A_Armadura armadura;
	List<A_Habilidad> habilidades;
	
	String nombre;
	int vida = 100;
	
	public A_Personaje(String n) {
		this.nombre = n;
		habilidades = new LinkedList<A_Habilidad>();
	}
	
	public void recibirDaño(int n) {
		this.vida -= n;
		if (vida < 0) { vida = 0;}
		}
	
	public int getVida() {
		return this.vida;
	}
	
	public void setArma(A_Arma a) {
		this.arma = a;
	}
	
	public void setArmadura(A_Armadura a) {
		this.armadura = a;
	}
	
	public void addHabilidad(A_Habilidad h) {
		this.habilidades.add(h);
	}
	
	public A_Arma getArma() {
		return this.arma;
	}
	
	public A_Armadura getArmadura() {
		return this.armadura;
	}
	
	public void atacar(A_Personaje p) {
		int atk = arma.getFuerza();
		double reduccion = p.getArmadura().getDefensa()/10;
		
		p.recibirDaño((int) (atk * reduccion));
	}
}
