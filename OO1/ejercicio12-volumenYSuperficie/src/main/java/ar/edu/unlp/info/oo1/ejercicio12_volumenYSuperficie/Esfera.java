package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficie;

public class Esfera extends Pieza {
	private Integer radio;
	public Esfera(String material, String color, Integer radio) {
		super(material, color);
		this.radio = radio;
	}

	@Override
	public Double getVolumen() {
		return 4/3 * Math.PI * Math.pow(radio, 3);
	}

	@Override
	public Double getSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}
	
	
}
