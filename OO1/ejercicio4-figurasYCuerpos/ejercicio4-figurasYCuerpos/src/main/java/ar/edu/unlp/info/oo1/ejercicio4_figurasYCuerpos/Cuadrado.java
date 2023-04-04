package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Cuadrado extends Figura {
	private double lado;
	
	public void setLado(double longitud) { this.lado = longitud; }
	public double getLado( ) { return lado; }
	public double getPerimetro() { return lado*4; }
	public double getArea( ) { return lado*lado; }
	

}
