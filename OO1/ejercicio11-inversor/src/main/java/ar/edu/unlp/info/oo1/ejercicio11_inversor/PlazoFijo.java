package ar.edu.unlp.info.oo1.ejercicio11_inversor;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion {
	LocalDate fechaDeConstitucion;
	double montoDepositado = 0;
	double porcentajeDeInteresDiario;
	
	public PlazoFijo(LocalDate fecha, double monto, double interesDiario) {
		this.fechaDeConstitucion = fecha;
		this.montoDepositado = monto;
		this.porcentajeDeInteresDiario = interesDiario;
	}
	
	public double valorActual() {
		long dias = ChronoUnit.DAYS.between(fechaDeConstitucion, LocalDate.now());
		return (montoDepositado + dias * porcentajeDeInteresDiario * montoDepositado);
	}
	
	
	public double getMontoDepositado() { return montoDepositado; }
	public void setInteresDiario(double interes) { porcentajeDeInteresDiario = interes; } 
}
