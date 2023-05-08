package ar.edu.unlp.info.oo2.ejercicio14;

public class creacionDecorator extends FileDecorator {

	public creacionDecorator(IFile file) {
		super(file);
		this.setMsg(file.getCreacion().toString() + " ");
	}

}
