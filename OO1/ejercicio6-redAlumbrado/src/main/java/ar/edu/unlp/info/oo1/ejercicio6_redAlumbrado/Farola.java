package ar.edu.unlp.info.oo1.ejercicio6_redAlumbrado;
import java.util.ArrayList;
import java.util.List;

public class Farola extends Object{
	private ArrayList<Farola> neighbors = new ArrayList();
	private boolean isOn = false;
	
	public Farola() {  }
	
	public boolean isOn() { return this.isOn; }
	
	public void pairWithNeighbor(Farola farola) { 
		if (!neighbors.contains(farola)) {
			this.neighbors.add(farola); 
			farola.pairWithNeighbor(this);
		}
	}
	public List<Farola> getNeighbors() { return this.neighbors; }
	public void turnOn() { 
		if (!this.isOn()) {
			this.isOn = true;
			for (int i=0; i < neighbors.size(); i++) {
				neighbors.get(i).turnOn();
			}
		}
	}
	public void turnOff() { 
		if (this.isOn()) {
			this.isOn = false;
			for (int i=0; i < neighbors.size(); i++) {
				neighbors.get(i).turnOff();
			}
		}
	}

}
