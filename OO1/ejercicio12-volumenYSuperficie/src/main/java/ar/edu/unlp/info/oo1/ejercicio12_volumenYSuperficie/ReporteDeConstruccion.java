package ar.edu.unlp.info.oo1.ejercicio12_volumenYSuperficie;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas = new ArrayList<Pieza>();
	
	public void agregarPieza(Pieza pieza) {
		piezas.add(pieza);
	}
	
	public Double volumenDeMaterial(String material) { 
		return piezas.stream()
				.filter(pieza->pieza.getMaterial().equals(material))
				.mapToDouble(pieza->pieza.getVolumen())
				.sum();
		}
	public Double superficieDeColor(String color) { 
		return piezas.stream()
				.filter(pieza->pieza.getColor().equals(color))
				.mapToDouble(pieza->pieza.getSuperficie())
				.sum();
	}
}
