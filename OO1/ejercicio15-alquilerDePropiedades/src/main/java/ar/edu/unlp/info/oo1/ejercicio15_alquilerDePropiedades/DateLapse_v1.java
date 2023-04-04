package ar.edu.unlp.info.oo1.ejercicio15_alquilerDePropiedades;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse_v1 extends DateLapse {
	LocalDate from;
	LocalDate to;
	
	public DateLapse_v1(LocalDate from, LocalDate to) {
		// Invierte fechas en caso de que se introduzcan los datos al reves
		if (from.isAfter(to)) {
			this.from = to;
			this.to = from;
			return;
		}
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
		return from;
	}
	public LocalDate getTo() {
		return to;
	}
	
	public int sizeInDays() {
		return (int) ChronoUnit.DAYS.between(from, to);
	}
	
	public boolean includesDate(LocalDate date) {
		return ((this.from.isBefore(date)) && (to.isAfter(date)));
	}
}
