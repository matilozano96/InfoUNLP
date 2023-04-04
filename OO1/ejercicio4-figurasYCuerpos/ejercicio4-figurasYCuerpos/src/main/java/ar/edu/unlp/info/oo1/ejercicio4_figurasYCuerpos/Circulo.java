package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Circulo extends Figura {
	private double diametro;
	private double radio;
	
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.diametro = radio * 2;
		this.radio = radio;
	}
	public double getPerimetro() { return Math.PI * radio * 2; }
	public double getArea() { return Math.PI * radio * radio; }
	

}
