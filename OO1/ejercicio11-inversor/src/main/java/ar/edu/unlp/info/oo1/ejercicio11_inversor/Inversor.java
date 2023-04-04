package ar.edu.unlp.info.oo1.ejercicio11_inversor;
import java.util.ArrayList;
import java.util.List;

public class Inversor {
	String nombre;
	List<Inversion> inversiones;
	
	public Inversor(String nombre) {
		this.nombre = nombre;
		inversiones = new ArrayList<Inversion>();
	}
	
	public double valorActual() {
		return inversiones.stream()
				.mapToDouble(inv->inv.valorActual())
				.sum();
	}
	
	public void agregarInversion(Inversion i) {
		inversiones.add(i);
	}
}
