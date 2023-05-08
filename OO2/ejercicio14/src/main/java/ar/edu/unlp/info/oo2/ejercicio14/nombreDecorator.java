package ar.edu.unlp.info.oo2.ejercicio14;

public class nombreDecorator extends FileDecorator {

	public nombreDecorator(IFile file) {
		super(file);
		this.setMsg(file.getNombre() + " ");
	}

}
