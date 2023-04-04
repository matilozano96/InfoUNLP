package ar.edu.unlp.info.oo1.ejercicio3_presupuesto;

public class Item {
	private String detalle;
	private int cantidad;
	private int costoUnitario;
	
	public Item() {  }
	
	public String getDetalle() { return detalle; }
	public void setDetalle(String detalle) { this.detalle = detalle;}
	public Item detalle(String detalle) { this.detalle = detalle; return this;}
	
	public int getCantidad() { return cantidad; }
	public void setCantidad(int cantidad) { this.cantidad = cantidad; }
	public Item cantidad(int cantidad) { this.cantidad = cantidad; return this; }
	
	public int getCostoUnitario() { return costoUnitario; }
	public void setCostoUnitario(int costoUnitario) { this.costoUnitario = costoUnitario; }
	public Item costoUnitario(int costoUnitario) { this.costoUnitario = costoUnitario; return this;}
	
	public double costo() { return costoUnitario * cantidad; }
	
}
