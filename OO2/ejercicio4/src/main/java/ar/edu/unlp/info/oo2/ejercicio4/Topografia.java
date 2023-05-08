package ar.edu.unlp.info.oo2.ejercicio4;

public abstract class Topografia {
	
	public abstract Double getProporcion();
	
	public abstract boolean esIgual(Topografia t);
	
	public abstract boolean esIgualAMixta(TopografiaMixta t);
	
	public abstract Topografia getParte(int n);
	
}
