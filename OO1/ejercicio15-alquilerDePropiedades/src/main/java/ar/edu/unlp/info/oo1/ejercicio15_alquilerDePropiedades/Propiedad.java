package ar.edu.unlp.info.oo1.ejercicio15_alquilerDePropiedades;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Propiedad {
	private Usuario propietario;
	private List<Reserva> reservas;
	private double precioPorNoche;
	private String nombre;
	private String descripcion;
	private String direccion;
	
	
	public Propiedad(Usuario propietario, double precioXNoche, String nombre, String descripcion, String dir) {
		this.propietario = propietario;
		this.precioPorNoche = precioXNoche;
		this.nombre = nombre;
		this.direccion = dir;
		this.descripcion = descripcion;
		this.reservas = new LinkedList<Reserva>();
	}

	public double getIngresosEntre(DateLapse periodo) {
		// Se cuentan los días en común entre el periodo medido y el período de cada reserva. Se asume que se paga en cada día.
		return reservas.stream()
				.mapToDouble(reserva->reserva.getIngresoOverlap(periodo))
				.sum();
	}
	
	public boolean disponibleEntre(DateLapse periodo) {
		return !reservas.stream()
				.anyMatch(reserva->reserva.getPeriodo().overlaps(periodo));
	}
	
	public void agregarReserva(Reserva res) {
			reservas.add(res);
	}
	
	protected void eliminarReserva(Reserva res) {
		// Permanece en la lista de los usuarios porque 
		// A. Pueden reservar con overlap; solo importa que paguen
		// B. Se tiene que mantener todo el historial de usuarios
		// Por cómo es la consigna, sólo se borra si se llegó a la fecha de inicio de la reserva
		
		if (res.getPeriodo().getFrom().isAfter(LocalDate.now())) reservas.remove(res);
	}
	
	
	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public String getDireccion() {
		return direccion;
	}
	
	
}
