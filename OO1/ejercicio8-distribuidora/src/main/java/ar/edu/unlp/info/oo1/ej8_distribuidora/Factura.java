package ar.edu.unlp.info.oo1.ej8_distribuidora;
import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha = LocalDate.now();
	private Usuario usuario;
	
	public Factura(double energia, double descuento, Usuario usuario) { 
		this.montoEnergiaActiva = energia;
		this.descuento = descuento;
		this.usuario = usuario;
	}
	
	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}

	public double getDescuento() {
		return descuento;
	}

	public LocalDate getFecha() {
		return fecha;
	}
	public Usuario getUsuario() { return usuario; }
	
	public double montoTotal() { return this.montoEnergiaActiva * (1 - descuento / 100); }
}
