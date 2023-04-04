package ar.edu.unlp.info.oo1.ejercicio11_inversor;

public class InversionEnAcciones implements Inversion {
	String nombre;
	int cantidad = 0;
	double valorUnitario;
	
	public InversionEnAcciones(String nombre, double valorUnitario, int cantidad) {
		this.nombre = nombre;
		this.valorUnitario = valorUnitario;
		this.cantidad = cantidad;
	}
	
	public void comprarAccion() {
		cantidad++;
	}
	
	public void venderAccion() {
		if (cantidad > 0) cantidad--;
	}
	
	public int getCantidad() { return cantidad; }
	public double getValorUnitario() { return valorUnitario; }
	public void setValorUnitario(double valorUnitario) { this.valorUnitario = valorUnitario; }
	
	public double valorActual() {
		return cantidad * valorUnitario;
	}
}
