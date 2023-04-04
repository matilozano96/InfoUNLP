package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Balanza {
	private int cantidadDeProductos = 0;
	private double precioTotal = 0;
	private double pesoTotal = 0;
	
	public Balanza() {  }
	
	public double getPesoTotal() { return pesoTotal; }
	public double getPrecioTotal() { return precioTotal; }
	public int getCantidadDeProductos() { return cantidadDeProductos; }
	
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;		
	}
	
	public void agregarProducto (Producto producto) {
		pesoTotal += producto.getPeso();
		precioTotal += producto.getPrecio();
		cantidadDeProductos++;
	}
	
	public Ticket emitirTicket() 
	{
		Ticket t = new Ticket(cantidadDeProductos, pesoTotal, precioTotal);
		return t;
	}

}

