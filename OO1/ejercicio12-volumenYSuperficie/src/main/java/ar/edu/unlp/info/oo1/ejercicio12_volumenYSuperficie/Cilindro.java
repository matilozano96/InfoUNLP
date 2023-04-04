package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficie;

public class Cilindro extends Pieza {
	private Integer radio;
	private Integer altura;
	
	public Cilindro(String material, String color, Integer radio, Integer altura) {
		super(material, color);
		this.radio = radio;
		this.altura = altura;
	}

	@Override
	public Double getVolumen() {
		return Math.PI * Math.pow(radio, 2) * altura;
	}

	@Override
	public Double getSuperficie() {
		return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
	}
}
