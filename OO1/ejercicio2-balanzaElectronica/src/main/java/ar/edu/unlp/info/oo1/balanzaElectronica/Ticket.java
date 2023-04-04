package ar.edu.unlp.info.oo1.balanzaElectronica;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private double impuesto = 0.21;
	
	public double getPesoTotal() { return pesoTotal; }
	public double getPrecioTotal() { return precioTotal; }
	public int getCantidadDeProductos() { return cantidadDeProductos; }
	
	public Ticket (int c, double pesoT, double precioT) {
		cantidadDeProductos = c;
		pesoTotal = pesoT;
		precioTotal  = precioT; 
		fecha = LocalDate.now();
	}
	
	public LocalDate getFecha() { return fecha; }
	
	public double impuesto() { return precioTotal * impuesto; }
		
}
