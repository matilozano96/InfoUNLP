package ar.edu.unlp.info.oo2.ejercicio20;
import java.util.Dictionary;
import java.util.Hashtable;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Rates {
	Dictionary<DayOfWeek, Double> ratesDiarios = new Hashtable<>();
	static Double rateMultihop = 0.93;
	static Double rateRoundtrip = 0.95;
	
	// SINGLETON
	// Probablemente no hace falta que sea un Singleton, pero ya está implementado asi que lo dejo
	private static Rates instance = new Rates();
	
	private Rates() {
		ratesDiarios.put( DayOfWeek.valueOf("MONDAY"), 1.0 );
		ratesDiarios.put( DayOfWeek.valueOf("TUESDAY"), 1.01 );
		ratesDiarios.put( DayOfWeek.valueOf("WEDNESDAY"), 0.99 );
		ratesDiarios.put( DayOfWeek.valueOf("THURSDAY"), 0.95 );
		ratesDiarios.put( DayOfWeek.valueOf("FRIDAY"), 1.0 );
		ratesDiarios.put( DayOfWeek.valueOf("SATURDAY"), 1.01 );
		ratesDiarios.put( DayOfWeek.valueOf("SUNDAY"), 1.01 );
	}
	
	public static Rates getInstance() {
		return instance;
	}
	
	public Double multihop() {
		return rateMultihop;
	}
	
	public Double roundtrip() {
		return rateRoundtrip;
	}
	
	public Double rateDiario(DayOfWeek day) {
		return ratesDiarios.get(day);
	}
	
	// Hipoteticamente, se deberian poder cambiar los rates si se quiere,
	// pero la consigna no lo pide: 
	// [ (RE)-SETTERS ]
	
}
