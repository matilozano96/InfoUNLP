package ar.edu.unlp.info.oo2.ejercicio4;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class TopografiaMixta extends Topografia {
	private LinkedList<Topografia> partes = new LinkedList<Topografia>();
	
	public TopografiaMixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4){
		partes.add(t1);
		partes.add(t2);
		partes.add(t3);
		partes.add(t4);
	}
	
	public Double getProporcion() {
		Double sum = partes.stream().mapToDouble(parte->parte.getProporcion()).sum();
		return sum/4;
	}
	
	public boolean esIgual(Topografia t) {
		return t.esIgualAMixta(this);
	}
	
	public boolean esIgualAMixta(TopografiaMixta t) 
	{
		AtomicInteger index = new AtomicInteger();
		return partes.stream().allMatch(parte -> parte.esIgual(t.getParte(index.getAndIncrement())));
	}
	
	
	public Topografia getParte(int index) {
		return partes.get(index);
	}
	
}
