package ar.edu.unlp.info.oo2.ejercicio14;

import java.time.LocalDate;

public interface IFile {
	
	public String prettyPrint();
	
	public String getNombre();

	public void setNombre(String nombre);

	public String getExtension();

	public void setExtension(String extension);

	public double getTamaño();

	public void setTamaño(double tamaño);

	public String getPermisos();

	public void setPermisos(String permisos);

	public LocalDate getCreacion();

	public LocalDate getModificacion();

}
