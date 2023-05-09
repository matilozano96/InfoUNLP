package ar.edu.unlp.info.oo2.ejercicio20;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

// Patron Type-Object
public class T_Vuelo {
	
	String codigo;
	
	// Hardcodeado porque es irrelevante para la consigna
	String frecuencia = "Diario";
	
	LocalTime hSalida;
	LocalTime hArribo;
	
	String origen;
	String destino;
	
	Double costoBase;

	public T_Vuelo(String codigo, LocalTime hSalida, LocalTime hArribo, String origen,
			String destino, Double costoBase) {
		super();
		this.codigo = codigo;
		this.hSalida = hSalida;
		this.hArribo = hArribo;
		this.origen = origen;
		this.destino = destino;
		this.costoBase = costoBase;
	}
	
	// Genera una instancia de Vuelo basada en este tViaje
	public Vuelo generarVuelo(LocalDate fecha, Avion avion) {
		return new Vuelo(codigo, fecha.atTime(hSalida), fecha.atTime(hArribo), origen, destino, costoBase, avion);
	}
}
