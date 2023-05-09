package ar.edu.unlp.info.oo2.ejercicio20;

import java.time.LocalDateTime;

public class Vuelo {
	
	// Hay mucho overlap con T_Vuelo. Hay que ver cómo se soluciona.
	String codigo;
	String frecuencia = "Diario";
	
	LocalDateTime salida;
	LocalDateTime arribo;
	
	String origen;
	String destino;
	
	Double rateDiario;
	Double costoBase;
	
	Avion avion;
	
	
	
	public Vuelo(String codigo,LocalDateTime salida, LocalDateTime arribo, String origen, String destino, Double costoBase, Avion a) {
		super();
		this.codigo = codigo;
		this.salida = salida;
		this.arribo = arribo;
		this.origen = origen;
		this.destino = destino;
		this.costoBase = costoBase;
		this.avion = a;
		
		Rates rates = Rates.getInstance();
		rateDiario = rates.rateDiario(salida.getDayOfWeek());
	}

	public Double calcularValor() {
		Rates rates = Rates.getInstance();
		return costoBase * this.rateDiario;
	}
	
	public String getOrigen() {
		return "";
	}
	
	public String getDestino() {
		return "";
	}
}
