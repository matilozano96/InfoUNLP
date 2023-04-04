package ar.edu.unlp.info.oo1.ej8_distribuidora;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distribuidora {
	private double precioKWh;
	private List<Usuario> usuarios = new ArrayList<Usuario>();
			
	public Distribuidora(double precioKWh) { this.precioKWh = precioKWh; }
	
	public void agregarUsuario(Usuario usuario) { usuarios.add(usuario); }
	public List<Usuario> getUsuarios() { return usuarios; }
	public List<Factura> facturar() { 
		return this.usuarios.stream().
				map(usuario -> usuario.facturarEnBaseA(precioKWh)).
				collect(Collectors.toList());
	}
	
	public double consumoTotalActiva() {
		return this.usuarios.stream().
				mapToDouble((Usuario u) -> u.ultimoConsumoActiva()).
				sum();
	}
	public void precioKWh(double precio) { this.precioKWh = precio; }

	public double getPrecioKW() {
		return precioKWh;
	}

	public void setPrecioKWh(double precioKWh) {
		this.precioKWh = precioKWh;
	}

	
	
}
