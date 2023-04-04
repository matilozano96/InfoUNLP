package ar.edu.unlp.info.oo1.ejercicio15_alquilerDePropiedades;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private int dni;
	
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	protected Usuario(String nombre, String direccion, int dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
	}
	
	protected void agregarReserva(Reserva res) {
		if ( reservas == null ) reservas = new LinkedList<Reserva>();
		reservas.add(res);
	}
	
	protected void agregarPropiedad(Propiedad p) {
		if ( propiedades == null ) propiedades = new LinkedList<Propiedad>();
		propiedades.add(p);
	}
	
	protected List<Reserva> getReservas(){
		// Retorno una copia por motivos de seguridad
		return reservas.stream().toList();
	}
	
	public double calcularIngresos(DateLapse periodo) {
		if ( propiedades == null ) return 0;
		return propiedades.stream().mapToDouble(propiedad->propiedad.getIngresosEntre(periodo)).sum();
	}
}
