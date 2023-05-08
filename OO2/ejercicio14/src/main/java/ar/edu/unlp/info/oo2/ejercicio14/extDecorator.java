package ar.edu.unlp.info.oo2.ejercicio14;

public class extDecorator extends FileDecorator {

	public extDecorator(IFile file) {
		super(file);
		this.setMsg(file.getExtension() + " ");
	}

}
