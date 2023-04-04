package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;
import java.time.LocalDate;


public class Presupuesto {
	private LocalDate fecha = LocalDate.now();
	private String cliente;
	private int dimL = 0;
	private Item[] items = new Item[100];
	
	public Presupuesto() {}
	
	public LocalDate getFecha() { return fecha; }
	
	public String getCliente() { return cliente; }
	public void setCliente(String cliente) { this.cliente = cliente; }
	public Presupuesto cliente(String cliente) { this.cliente = cliente; return this;}
	
	public void agregarItem(Item i) {
		if (dimL < 100) {
			items[dimL] = i;
			dimL++;
		}
	}
	
	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < dimL; i++) {
			  total += items[i].costo();
			}
		return total;
	}

}
