package ar.edu.unlp.info.oo1.ejercicio5_genealogiaSalvaje;
import java.time.LocalDate;

import java.time.LocalDate;

public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaDeNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	
	public Mamifero(String identificador) { this.identificador = identificador; }
	public Mamifero() {}
	
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	
	public Mamifero getAbueloMaterno() { 
		if (getMadre() != null) { return getMadre().getPadre(); }
		return null;
	}
	public Mamifero getAbuelaMaterna() { 
		if (getMadre() != null) return getMadre().getMadre(); 
		return null;
	}
	public Mamifero getAbueloPaterno() { 
		if (getPadre() != null) return getPadre().getPadre(); 
		return null;
	}
	public Mamifero getAbuelaPaterna() { 
		if (getPadre() != null) return getPadre().getMadre(); 
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		boolean res = false;
		if ((this.getPadre() == unMamifero) || (this.getMadre() == unMamifero)) { return true; }
		if (this.getPadre() != null) { res = this.getPadre().tieneComoAncestroA(unMamifero); }
		if ((!res) & (this.getMadre() != null)) { res = this.getMadre().tieneComoAncestroA(unMamifero); }
		
		return res;
		
	}
	
}
