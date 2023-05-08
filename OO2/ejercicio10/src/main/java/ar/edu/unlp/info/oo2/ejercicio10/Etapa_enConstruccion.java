package ar.edu.unlp.info.oo2.ejercicio10;

public class Etapa_enConstruccion extends Etapa {
	
	public Etapa_enConstruccion() {
		super("En Construccion", 0.08, 0.1);
	}
	
	public void aprobarEtapa(Proyecto p) {
		if (p.getPrecio() > 0) {
			p.setEtapa(new Etapa_enEvaluacion());
		}
		
		throw new RuntimeException("El precio " + p.getPrecio() + " del proyecto es inválido.");
	}
}
