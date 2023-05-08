package ar.edu.unlp.info.oo2.ejercicio10;

public class Etapa_enEvaluacion extends Etapa {
	
	public Etapa_enEvaluacion() {
		super("En Evaluacion", 0.11, 0.15);
	}
	
	public void aprobarEtapa(Proyecto p) {
		p.setEtapa(new Etapa_confirmada());
	}
}
