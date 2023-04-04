package ar.edu.unlp.info.oo1.ejercicio13_clienteDeCorreo;

import java.util.LinkedList;
import java.util.List;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.inbox = new Carpeta("Inbox");
		carpetas = new LinkedList<Carpeta>();
	}
	
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public void recibir(Email e) {
		inbox.agregar(e);
	}
	
	public void mover(Email e, Carpeta origen, Carpeta destino) {
		origen.remover(e);
		destino.agregar(e);
	}
	
	public Email buscar(String texto) {
		Email ret = inbox.buscar(texto);
		if (ret == null) {
			for (int i=0; i<carpetas.size() && ret == null; i++) {
				ret = carpetas.get(i).buscar(texto);
			}
		}
		return ret;
	}
	
	public Integer espacioOcupado() {
		return 0;
	}
}
