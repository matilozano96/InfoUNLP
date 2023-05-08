package ar.edu.unlp.info.oo2.ejercicio14;

import java.time.LocalDate;

public abstract class FileDecorator implements IFile{
	
	private IFile file;
	private String msg;
	
	public FileDecorator(IFile file) {
		this.file = file;
	}
	
	public String prettyPrint() {
		return msg + file.prettyPrint();
	}
	
	public String getNombre() {
		return file.getNombre();
	}

	public void setNombre(String nombre) {
		file.setNombre(nombre);
	}

	public String getExtension() {
		return file.getExtension();
	}

	public void setExtension(String extension) {
		file.setExtension(extension);
	}

	public double getTamaño() {
		return file.getTamaño();
	}

	public void setTamaño(double tamaño) {
		file.setTamaño(tamaño);
	}

	public String getPermisos() {
		return file.getPermisos();
	}

	public void setPermisos(String permisos) {
		file.setPermisos(permisos);
	}

	public LocalDate getCreacion() {
		return file.getCreacion();
	}

	public LocalDate getModificacion() {
		return file.getModificacion();
	}
	
	protected void setMsg(String s) {
		this.msg = s;
	}
}
