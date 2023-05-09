package ar.edu.unlp.info.oo2.ejercicio20;
import java.time.DayOfWeek;
import java.util.LinkedList;
import java.util.List;

public class Pasaje {
	String nombrePasajero;
	String dniPasajero;
	
	Double rateRoundTrip = 1.0;
	Double rateMultiHop = 1.0;
	
	// Lo hago con ints por simpleza, aunque un avión real usa una combinacion de Letras y Numeros
	List<Vuelo> vuelos = new LinkedList<Vuelo>();
	List<Integer> asientos = new LinkedList<Integer>();
	
	public Pasaje(String nombre, String dni) {
		this.nombrePasajero = nombre;
		this.dniPasajero = dni;
	}
	
	public Double calcularValor() {
		Double suma = vuelos.stream().mapToDouble(vuelo -> vuelo.calcularValor()).sum();
		return suma * rateRoundTrip * rateMultiHop;
	}
	
	public boolean esRoundTrip() {
		return ( vuelos.get(0).getOrigen().equals(vuelos.get(-1).getDestino()) ) ;
	}
	
	public boolean esMultiHop() {
		return ( vuelos.size() >= 3 );
	}
	
	public void updateRates() {
		Rates rates = Rates.getInstance();
		
		if ( esMultiHop() ) {
			rateMultiHop = rates.multihop();
		}
		else {
			rateMultiHop = 1.0;
		}
		
		if ( esRoundTrip() ) {
			rateRoundTrip = rates.roundtrip();
		}
		else {
			rateRoundTrip = 1.0;
		}
	}
	
	public void addVuelo (Vuelo v, Integer asiento) {
		vuelos.add(v);
		asientos.add(asiento);
		
		updateRates();
	}
	
	public void removeVuelo(Vuelo v) {
		if ( vuelos.contains(v) ) {
			asientos.remove(vuelos.indexOf(v));
			vuelos.remove(v);
			
			updateRates();
		}
	}
}
