package ar.edu.unlp.info.oo1.ej8_distribuidora;
import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha = LocalDate.now();
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate fecha, double consumoActiva, double consumoReactiva) {
		this.fecha = fecha;
		this.consumoEnergiaActiva = consumoActiva;
		this.consumoEnergiaReactiva = consumoReactiva;
	}
	
	public double costoEnBaseA(double precioKWh) { return consumoEnergiaActiva * precioKWh; }
	public double factorDePotencia() { 		
		return this.consumoEnergiaActiva /  
				Math.sqrt(Math.pow(this.consumoEnergiaActiva, 2) + Math.pow(this.consumoEnergiaReactiva, 2)); }

	public double getConsumoEnergiaActiva() {
		return consumoEnergiaActiva;
	}
	public double getConsumoEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}

	public LocalDate getFecha() {
		// TODO Auto-generated method stub
		return fecha;
	}

}
