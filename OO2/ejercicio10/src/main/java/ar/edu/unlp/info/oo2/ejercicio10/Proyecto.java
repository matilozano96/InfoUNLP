package ar.edu.unlp.info.oo2.ejercicio10;

import java.time.Duration;
import java.time.LocalDate;

public class Proyecto {
	
	private String nombre;
	private LocalDate inicio, fin;
	private String objetivo;
	private int integrantes;
	private double margen;
	private double monto;
	
	private Etapa etapa;
	
	public Proyecto(String nombre, 
			LocalDate inicio, 
			LocalDate fin, 
			String objetivo, 
			int integrantes,
			double monto ) {
		
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.margen = 0.07;
		this.monto = monto;
		this.etapa = new Etapa_enConstruccion();
		
	}
	
	protected void setEtapa(Etapa e) {
		this.etapa = e;
	}
		
	public String getObjetivo() {
		return this.objetivo;
	}
	
	protected void setObjetivo(String s) {
		this.objetivo = s;
	}
		
	public Double getMargen() {
		return this.margen;
	}
	
	public void nuevoMargen(Double nuevo) {
		etapa.modificarMargen(this, nuevo);
	}
	
	protected void setMargen(Double nuevo) {
		this.margen = nuevo;
	}
	
	public Double getCosto() {
		return this.integrantes * this.monto * this.duracion();
	}
	
	public Double getPrecio() {
		return etapa.calcularPrecio(this);
	}
	
	public Integer getIntegrantes() {
		return integrantes;
	}
	
	public Double getMonto() {
		return monto;
	}
	
	public Integer duracion() {
		return (int) Duration.between(inicio, fin).toDays();
	}
	
	public String getEstado() {
		return etapa.getNombre();
	}
	
}
