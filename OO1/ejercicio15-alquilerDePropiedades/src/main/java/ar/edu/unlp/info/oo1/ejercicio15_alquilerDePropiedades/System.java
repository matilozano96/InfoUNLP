package ar.edu.unlp.info.oo1.ejercicio15_alquilerDePropiedades;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class System {
	private List<Usuario> usuarios;
	private List<Propiedad> propiedadesListadas;
	
	public System() {
		usuarios = new LinkedList<Usuario>();
	}
	
	public Usuario registrarUsuario(String nombre, String direccion, int dni) {
		Usuario nuevo = new Usuario(nombre, direccion, dni);
		usuarios.add(nuevo);
		return nuevo;
	}
	
	public void registrarPropiedad(String nombre, String descripcion, double precioPorNoche, String direccion, Usuario propietario) {
		Propiedad prop = new Propiedad(propietario, precioPorNoche, nombre, descripcion, direccion); 
		propietario.agregarPropiedad(prop);
		propiedadesListadas.add(prop);
	}
	
	public List<Propiedad> buscarDisponibles(DateLapse periodo){
		return propiedadesListadas.stream()
				.filter(propiedad->propiedad.disponibleEntre(periodo))
				.collect(Collectors.toList());
	}
	
	public void hacerReserva(Propiedad prop, DateLapse periodo, Usuario inquilino) {
		if (prop.disponibleEntre(periodo)) {
			Reserva res = new Reserva(inquilino, prop, periodo);
			prop.agregarReserva(res);
			inquilino.agregarReserva(res);
		}
	}
	
	public void eliminarReserva(Reserva res) {
		res.eliminar();
	}
	
	public List<Reserva> obtenerReservas(Usuario usuario){
		return usuario.getReservas();
	}
	
	public double calcularIngresos(Usuario propietario, DateLapse periodot) {
		return propietario.calcularIngresos(periodo);
	}
	
}
