package ar.edu.unlp.info.oo2.ejercicio4;

public class TopografiaSimple extends Topografia{
	private Double proporcion;
	
	public TopografiaSimple(boolean esAgua) {
		if ( esAgua ) proporcion = 1.0;
		else proporcion = 0.0;
	}
	
	public Double getProporcion() {
		return this.proporcion;
	}
	
	public Topografia getParte(int n) {
		return this;
	}
	
	public boolean esIgual(Topografia t) {
		return (this.getProporcion() == t.getProporcion());
	}
	
	public boolean esIgualAMixta(TopografiaMixta t) {
		return (this.getProporcion() == t.getProporcion());
	}
}
