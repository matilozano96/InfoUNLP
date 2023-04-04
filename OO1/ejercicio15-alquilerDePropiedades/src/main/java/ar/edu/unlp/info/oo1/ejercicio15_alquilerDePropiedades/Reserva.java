package ar.edu.unlp.info.oo1.ejercicio15_alquilerDePropiedades;

import java.time.LocalDate;

public class Reserva {
	private Usuario inquilino;
	private Propiedad propiedad;
	private DateLapse periodo;
	private double precioPorNoche;
	
	public Reserva ( Usuario inquilino, Propiedad propiedad, DateLapse periodo ) {
		this.inquilino = inquilino;
		this.propiedad = propiedad;
		this.periodo = periodo;
		
		// Se hace el llamado acá para que no se pueda cambiar el precio después de una reserva
		this.precioPorNoche = this.propiedad.getPrecioPorNoche();
	}
	
	protected void eliminar() {
		// Solo funcionaría si la fecha ya pasó
		this.getPropiedad().eliminarReserva(this);
	}

	public Usuario getInquilino() {
		return inquilino;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	public DateLapse getPeriodo() {
		return periodo;
	}
	
	public double getDias() {
		return periodo.sizeInDays();
	}
	
	public double getIngreso() {
		return getDias() * this.precioPorNoche;
	}
	
	public double getIngresoOverlap(DateLapse query) {
		if (!periodo.overlaps(query)) return 0;
		LocalDate overFrom;
		LocalDate overTo;
		
		if (periodo.getFrom().isAfter(query.getFrom())) overFrom = periodo.getFrom();
		else overFrom = query.getFrom();
		
		if (periodo.getFrom().isAfter(query.getFrom())) overTo = query.getFrom();
		else overTo = periodo.getFrom();
		
		DateLapse overlap = new DateLapse_v1(overFrom,overTo);
		
		return overlap.sizeInDays() * this.precioPorNoche;
	}
	
}
