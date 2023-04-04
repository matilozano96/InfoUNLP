package ar.edu.unlp.info.oo1.ejercicio15_alquilerDePropiedades;

import java.time.LocalDate;

public class DateLapse_v2 extends DateLapse {
	
	private LocalDate from;
	private int sizeInDays;
	
	public DateLapse_v2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	public LocalDate getFrom() {
		return this.from;
	}

	public LocalDate getTo() {
		return this.from.plusDays(this.sizeInDays);
	}

	@Override
	public int sizeInDays() {
		return this.sizeInDays;
	}

	@Override
	public boolean includesDate(LocalDate date) {
		return ((date.isAfter(from)) && (date.isBefore(this.getTo())));
	}
}
