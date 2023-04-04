package ar.edu.unlp.info.oo1.ejercicio14_intervaloDeTiempo;

import java.time.LocalDate;

public abstract class DateLapse {
	public abstract LocalDate getFrom();
	public abstract LocalDate getTo();
	public abstract int sizeInDays();
	public abstract boolean includesDate(LocalDate date);
	public boolean overlaps(DateLapse otherDateLapse) {
		return (this.includesDate(otherDateLapse.getFrom()) | this.includesDate(otherDateLapse.getTo()));
	}
}
