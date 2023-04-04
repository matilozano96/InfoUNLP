package ar.edu.unlp.info.oo1.ej8_distribuidora;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Consumo> consumos = new ArrayList<>();
	private List<Factura> facturas = new ArrayList<Factura>();
	
	public Usuario() {  }
	
	public Usuario(String nombre, String domicilio) {
		this.nombre = nombre;
		this.domicilio = domicilio;
	}
	
	public Consumo ultimoConsumo() {
		return this.consumos
				.stream()
				.max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha())).orElse(null);
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void agregarMedicion(Consumo medicion) { consumos.add(medicion); }
	
	public double ultimoConsumoActiva() { 
		if (consumos.isEmpty()) return 0.0;
		return ultimoConsumo().getConsumoEnergiaActiva(); 
	}
	
	public Factura facturarEnBaseA(double precioKWh) {
		if (consumos.isEmpty()) return new Factura(0, 0, this);
		
		double descuento = 0;
		if (ultimoConsumo().factorDePotencia() > 0.8) { descuento = 10; }
		
		return new Factura(ultimoConsumo().costoEnBaseA(precioKWh), descuento, this);
	}
	
	public List<Factura> facturas( ) { return this.facturas; }
}
