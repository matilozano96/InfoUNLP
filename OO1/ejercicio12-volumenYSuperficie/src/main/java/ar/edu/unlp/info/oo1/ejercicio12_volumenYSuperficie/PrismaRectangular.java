package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficie;

public class PrismaRectangular extends Pieza {
	private Integer ladoMayor;
	private Integer ladoMenor;
	private Integer altura;
	
	public PrismaRectangular(
			String material, 
			String color, 
			Integer ladoMayor, 
			Integer ladoMenor, 
			Integer altura) 
	{
		super(material, color);
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
		this.altura = altura;
	}
	@Override
	public Double getVolumen() {
		return (double) (ladoMayor * ladoMenor * altura);
	}
	@Override
	public Double getSuperficie() {
		return (double) (2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura));
	}
}
