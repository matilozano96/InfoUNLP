package ar.edu.unlp.info.oo2.ejercicio14;

public class tamDecorator extends FileDecorator {

	public tamDecorator(IFile file) {
		super(file);
		this.setMsg(file.getTamaño() + " ");
	}

}
