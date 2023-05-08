package ar.edu.unlp.info.oo2.ejercicio10;

public abstract class Etapa {
	
	private double margenInferior;
	private double margenSuperior;
	private String nombre;
	
	public Etapa (String n) {
		this.nombre = n;
	}
	
	public Etapa (String n, double mI, double mS) {
		this.nombre = n;
		this.margenInferior = mI;
		this.margenSuperior = mS;
	}
	
	public Double calcularPrecio(Proyecto p) {
		return (p.getCosto() * ( 1 + p.getMargen() ));
	}
	
	public void cancelar(Proyecto p) {
		p.setObjetivo(p.getObjetivo() + "( CANCELADO )");
		p.setEtapa(new Etapa_cancelado());
	}
	
	public void AprobarEtapa() {
		return;
	}
	
	public void modificarMargen(Proyecto p, Double nuevoMargen) {
		if (( margenInferior < nuevoMargen ) && ( nuevoMargen < margenSuperior )) p.setMargen(nuevoMargen); 
	}
	
	public String getNombre() {
		return nombre;
	}
}
