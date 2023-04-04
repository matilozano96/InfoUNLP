package ar.edu.unlp.info.oo1.ejercicio4_figurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public double getAltura() { return altura; }
	public void setAltura(double altura) { this.altura = altura; }
	public double getVolumen( ) { return caraBasal.getArea() * altura; }
	public double getSuperficieExterior( ) { return caraBasal.getArea() * 2 + caraBasal.getPerimetro() * altura; }
	
	public void setCaraBasal(Figura caraBasal) { this.caraBasal = caraBasal; }
}
