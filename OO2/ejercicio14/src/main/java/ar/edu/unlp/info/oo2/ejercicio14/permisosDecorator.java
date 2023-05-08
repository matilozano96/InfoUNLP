package ar.edu.unlp.info.oo2.ejercicio14;

public class permisosDecorator extends FileDecorator {

	public permisosDecorator(IFile file) {
		super(file);
		this.setMsg(file.getPermisos() + " ");
	}

}
