package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Producto {
	private double peso = 0;
	private double precioPorKilo = 0;
	private String descripcion = "";
	
	public Producto() {  }
	public Producto(double peso, double precioPorKilo, String descripcion) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}
	
	public void setPeso(double p) { 
		peso = p;
	}
	public double getPeso() { return peso; }
	
	public void setPrecioPorKilo(double p) { precioPorKilo = p; }
	public double getPrecioPorKilo() { return precioPorKilo; }
	
	public void setDescripcion(String d) { descripcion = d; }
	public String getDescripcion() { return descripcion; }
	
	public double getPrecio() { return peso * precioPorKilo; }
}
