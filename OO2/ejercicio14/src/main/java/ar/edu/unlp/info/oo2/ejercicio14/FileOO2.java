package ar.edu.unlp.info.oo2.ejercicio14;

import java.time.LocalDate;

public class FileOO2 implements IFile{
	private String nombre;
	private String extension;
	private double tamaño;
	private LocalDate creacion;
	private LocalDate modificacion;
	private String permisos;
	
	public FileOO2(String n, String e, double t, String p) {
		this.nombre = n;
		this.extension = e;
		this.tamaño = t;
		this.creacion = LocalDate.now();
		this.modificacion = this.creacion;
		this.permisos = p;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
		this.modificacion = LocalDate.now();
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
		this.modificacion = LocalDate.now();
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
		this.modificacion = LocalDate.now();
	}

	public String getPermisos() {
		return permisos;
	}

	public void setPermisos(String permisos) {
		this.permisos = permisos;
		this.modificacion = LocalDate.now();
	}

	public LocalDate getCreacion() {
		return creacion;
	}

	public LocalDate getModificacion() {
		return modificacion;
	}
	
	public String prettyPrint() {
	 return "";	
	}
}
