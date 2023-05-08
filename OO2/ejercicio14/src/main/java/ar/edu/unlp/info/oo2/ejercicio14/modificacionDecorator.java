package ar.edu.unlp.info.oo2.ejercicio14;

public class modificacionDecorator extends FileDecorator {

	public modificacionDecorator(IFile file) {
		super(file);
		this.setMsg(file.getModificacion().toString() + " ");
	}

}
